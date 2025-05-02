/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;
import java.util.*;


public class MazeGenerator {
     public static Tile[][] generateMaze(int rows, int cols, Perceptron perceptron) {
        Tile[][] maze = new Tile[rows][cols];
        Random rand = new Random();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int terrain = rand.nextInt(2);
                int elevation = rand.nextInt(11);
                 boolean isObstacle = rand.nextDouble() < 0.1;
                                 maze[i][j] = new Tile(terrain, elevation, isObstacle);
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j].obstacleDistance = computeManhattanDistanceToNearestObstacle(maze, i, j);
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Tile t = maze[i][j];
                if (t.isObstacle) {
                    t.label = 0;
                } else {
                    int[] input = {t.terrain, t.elevation, t.obstacleDistance};
                    t.label = perceptron.predict(input);
                }
            }
        }

        return maze;
    }
     
     
     private static int computeManhattanDistanceToNearestObstacle(Tile[][] maze, int row, int col) {
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j].isObstacle) {
                    int dist = Math.abs(i - row) + Math.abs(j - col);
                    if (dist < minDist) minDist = dist;
                }
            }
        }
        return minDist == Integer.MAX_VALUE ? 10 : minDist;
    }
    
}
