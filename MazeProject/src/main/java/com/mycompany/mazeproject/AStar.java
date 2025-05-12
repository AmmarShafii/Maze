/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author hp
 */
public class AStar {
    
    public static List<Node> findPath(Tile[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;

        Node start = null, end = null;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j].isStart) {
                    start = new Node(i, j, null, 0, 0);
                }
                if (maze[i][j].isEnd) {
                    end = new Node(i, j, null, 0, 0);
                }
            }
        }
        
        
        if (start == null || end == null) return null;

        PriorityQueue<Node> openSet = new PriorityQueue<>();
        Set<Node> closedSet = new HashSet<>();

        start.h = manhattan(start, end);
        start.f = start.g + start.h;
        openSet.add(start);
        
         while (!openSet.isEmpty()) {
            Node current = openSet.poll();

            if (current.row == end.row && current.col == end.col) {
                return reconstructPath(current);
            }

            closedSet.add(current);
            
            for (int[] dir : new int[][] { {0,1}, {1,0}, {0,-1}, {-1,0} }) {
                int newRow = current.row + dir[0];
                int newCol = current.col + dir[1];

                if (newRow < 0 || newCol < 0 || newRow >= rows || newCol >= cols)
                    continue;

                Tile neighborTile = maze[newRow][newCol];
                if (neighborTile.isObstacle || neighborTile.label != 1)
                    continue;

                Node neighbor = new Node(newRow, newCol, current, current.g + 1, 0);

                if (closedSet.contains(neighbor)) continue;

                neighbor.h = manhattan(neighbor, end);
                neighbor.f = neighbor.g + neighbor.h;
                
                boolean inOpenSet = openSet.stream().anyMatch(n -> n.equals(neighbor) && n.f <= neighbor.f);
                if (!inOpenSet) {
                    openSet.add(neighbor);
                }
            }
        }

        return null; 
    }
    
     private static int manhattan(Node a, Node b) {
        return Math.abs(a.row - b.row) + Math.abs(a.col - b.col);
    }
     
     
     
      private static List<Node> reconstructPath(Node endNode) {
        List<Node> path = new ArrayList<>();
        Node current = endNode;
        while (current != null) {
            path.add(current);
            current = current.parent;
        }
        Collections.reverse(path);
        return path;
    }
     
    
}
