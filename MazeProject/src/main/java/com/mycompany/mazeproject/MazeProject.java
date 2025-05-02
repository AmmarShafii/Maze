/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mazeproject;
import java.util.*;
import javax.swing.JFrame;


public class MazeProject {

    public static void main(String[] args) {
              
                List<TileData> dataset = new ArrayList<>();
           dataset.add(new TileData(0, 1, 10, 1));
           dataset.add(new TileData(1, 9, 8, 0));
           dataset.add(new TileData(0, 1, 4, 1));
           dataset.add(new TileData(0, 9, 0, 1));
           dataset.add(new TileData(0, 3, 2, 1));
           dataset.add(new TileData(1, 7, 9, 0));
           dataset.add(new TileData(0, 6, 7, 1));
           dataset.add(new TileData(0, 8, 10, 1));  
           dataset.add(new TileData(0, 7, 5, 1));
           dataset.add(new TileData(1, 4, 7, 0));
           dataset.add(new TileData(0, 1, 8, 1));
           dataset.add(new TileData(0, 4, 3, 1));
           dataset.add(new TileData(0, 7, 0, 1));
           dataset.add(new TileData(0, 9, 0, 1));
           dataset.add(new TileData(1, 8, 9, 0));
           dataset.add(new TileData(0, 8, 3, 1));
           dataset.add(new TileData(1, 0, 6, 0));
           dataset.add(new TileData(1, 8, 1, 0));
           dataset.add(new TileData(1, 6, 2, 0));    // this is number 20
           dataset.add(new TileData(0, 8, 0, 1));
           dataset.add(new TileData(1, 7, 4, 0));
           dataset.add(new TileData(0, 0, 0, 0));
           dataset.add(new TileData(1, 7, 7, 0));
           dataset.add(new TileData(1, 7, 0, 0));
           dataset.add(new TileData(1, 10, 10, 0));
           dataset.add(new TileData(1, 2, 0, 0));
           dataset.add(new TileData(1, 0, 1, 0));
           dataset.add(new TileData(1, 7, 1, 0));
           dataset.add(new TileData(1, 2, 5, 0)); // this is number 30   
           dataset.add(new TileData(1, 2, 6, 0));
           dataset.add(new TileData(0, 0, 4, 1));
           dataset.add(new TileData(0, 10, 0, 1));
           dataset.add(new TileData(1, 4, 0, 0));
           dataset.add(new TileData(1, 9, 2, 0));
           dataset.add(new TileData(1, 6, 1, 0));
           dataset.add(new TileData(0, 9, 4, 1));
           dataset.add(new TileData(1, 8, 9, 0));
           dataset.add(new TileData(0, 6, 5, 1));
           dataset.add(new TileData(0, 8, 6, 1)); // this is number 40
           dataset.add(new TileData(0, 7, 3, 1));
           dataset.add(new TileData(0, 1, 6, 1));
           dataset.add(new TileData(0, 0, 10, 1));
           dataset.add(new TileData(1, 6, 7, 0));
           dataset.add(new TileData(1, 6, 10, 0));
           dataset.add(new TileData(1, 7, 0, 0));
           dataset.add(new TileData(1, 4, 5, 0));
           dataset.add(new TileData(1, 2, 7, 0));
           dataset.add(new TileData(0, 7, 4, 1));
           dataset.add(new TileData(1, 5, 3, 0)); // this is number 50
           dataset.add(new TileData(1, 10, 1, 0));
           dataset.add(new TileData(0, 2, 5, 1));
           dataset.add(new TileData(1, 0, 5, 0));
           dataset.add(new TileData(0, 2, 10, 1));
           dataset.add(new TileData(1, 4, 0, 0));
           dataset.add(new TileData(0, 2, 8, 1));
           dataset.add(new TileData(1, 0, 10, 0));
           dataset.add(new TileData(1, 4, 5, 0));
           dataset.add(new TileData(0, 9, 2, 1));
           dataset.add(new TileData(0, 6, 3, 1)); // this is number 60
           dataset.add(new TileData(0, 6, 10, 1));
           dataset.add(new TileData(0, 10, 3, 1));
           dataset.add(new TileData(0, 8, 2, 1));
           dataset.add(new TileData(0, 9, 9, 1));
           dataset.add(new TileData(0, 9, 2, 1)); // this is number 65
           dataset.add(new TileData(0, 2, 2, 0));
           dataset.add(new TileData(1, 6, 3, 0));
           dataset.add(new TileData(1, 0, 6, 0));
           dataset.add(new TileData(0, 3, 3, 1));
           dataset.add(new TileData(1, 3, 8, 0)); // this is 70
           dataset.add(new TileData(1, 4, 0, 0));
           dataset.add(new TileData(1, 6, 7, 0));
           dataset.add(new TileData(1, 6, 6, 0));
           dataset.add(new TileData(0, 10, 1, 1));
           dataset.add(new TileData(1, 3, 7, 0)); // this is 75
           dataset.add(new TileData(0, 6, 0, 1));  
           dataset.add(new TileData(1, 10, 10, 0));
           dataset.add(new TileData(1, 2, 8, 0));
           dataset.add(new TileData(1, 5, 8, 0));
           dataset.add(new TileData(0, 1, 1, 0)); // this is 80
           dataset.add(new TileData(1, 9, 6, 0)); 
           dataset.add(new TileData(0, 8, 9, 1));
           dataset.add(new TileData(1, 4, 2, 0));
           dataset.add(new TileData(0, 5, 6, 1));
           dataset.add(new TileData(1, 3, 9, 0)); // this is 85
           dataset.add(new TileData(0, 10, 8, 1));
           dataset.add(new TileData(0, 9, 3, 1));
           dataset.add(new TileData(1, 6, 0, 0));
           dataset.add(new TileData(0, 8, 1, 1));
           dataset.add(new TileData(1, 6, 0, 0)); // this is 90
           dataset.add(new TileData(1, 0, 4, 0));
           dataset.add(new TileData(1, 0, 4, 0));
           dataset.add(new TileData(1, 8, 10, 0));
           dataset.add(new TileData(1, 10, 6, 0));
           dataset.add(new TileData(1, 8, 8, 0)); // this is 95 
           dataset.add(new TileData(1, 3, 8, 0));
           dataset.add(new TileData(1, 8, 2, 0));
           dataset.add(new TileData(1, 2, 2, 0));
           dataset.add(new TileData(1, 6, 2, 0));
           dataset.add(new TileData(1, 5, 3, 0)); // this is 100
           dataset.add(new TileData(0, 7, 7, 1));
           
           int[][] inputs = new int[dataset.size()][3];
           int[] labels = new int[dataset.size()];
           
            for (int i = 0; i < dataset.size(); i++) {
            TileData tile = dataset.get(i);
            inputs[i][0] = tile.terrain;
            inputs[i][1] = tile.elevation;
            inputs[i][2] = tile.obstacleDistance;
            labels[i] = tile.label;
        }
           
            
            Perceptron p = new Perceptron(3, 0.1,0.5);
            p.train(inputs, labels, 100); // we train perceptron here
            
            // this is for testing the perecpton
        // int[] testTile = {0, 3, 6};
         // int prediction = p.predict(testTile); 
        // System.out.println("the prediction for test tile: " + (prediction == 1 ? "safe" : "unsafe"));
           JFrame frame = new JFrame("Maze Visualization");
     
        Tile[][] maze = MazeGenerator.generateMaze(11,11, p);

        MazePanel mazePanel = new MazePanel(maze);
        frame.add(mazePanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
           
                
            
           
           
    }

