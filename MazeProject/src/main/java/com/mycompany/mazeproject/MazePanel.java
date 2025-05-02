/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;
import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class MazePanel extends JPanel {
    private Tile[][] maze;
    private final int tileSize = 50;

    public MazePanel(Tile[][] maze) {
        this.maze = maze;
        setPreferredSize(new Dimension(maze[0].length * tileSize, maze.length * tileSize));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (maze == null) return;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                Tile tile = maze[i][j];

                if (tile.isObstacle) {
                    g.setColor(Color.BLACK);
                } else {
                   
                    switch (tile.label) {
                        case 0:
                            g.setColor(Color.pink);
                            break;
                        case 1:
                            g.setColor(Color.GREEN);
                            

                            break;
                        default:
                            g.setColor(Color.LIGHT_GRAY);
                            break;
                    }
                }

                g.fillRect(j * tileSize, i * tileSize, tileSize, tileSize);
                g.setColor(Color.DARK_GRAY);
                g.drawRect(j * tileSize, i * tileSize, tileSize, tileSize); 
                
                 g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 10));

            String elevationStr = "E:" + tile.elevation;
            String manhattanStr = "O:" + tile.obstacleDistance;

            int textX = j * tileSize + 2;
            int textY = i * tileSize + 12;

            g.drawString(elevationStr, textX, textY);
            g.drawString(manhattanStr, textX, textY + 10);
            }
        }
    }

    public void setMaze(Tile[][] newMaze) {
        this.maze = newMaze;
        repaint();
    }
}

