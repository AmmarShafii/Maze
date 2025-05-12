/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class MazePanel extends JPanel {
    private Tile[][] maze;
    private final int tileSize = 50;
    private boolean selectingStart = true;


    public MazePanel(Tile[][] maze) {
        this.maze = maze;
        setPreferredSize(new Dimension(maze[0].length * tileSize, maze.length * tileSize));
        
        
        addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            handleClick(e.getX(), e.getY());
        }
    });
        
        
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
                } else if (tile.isStart) {
                    g.setColor(Color.BLUE);
                } else if (tile.isEnd) {
                    g.setColor(Color.RED);
                    } else if (tile.isPath) {
                    g.setColor(Color.YELLOW);
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
            
                        String terrainStr = "T:" + tile.terrain;


            int textX = j * tileSize + 2;
            int textY = i * tileSize + 12;

            g.drawString(elevationStr, textX, textY);
            g.drawString(manhattanStr, textX, textY + 10);
                        g.drawString(terrainStr, textX, textY + 20);

            }
        }
    }

    public void setMaze(Tile[][] newMaze) {
        this.maze = newMaze;
        repaint();
    }
    
    
    private void handleClick(int x, int y) {
    int col = x / tileSize;
    int row = y / tileSize;

    if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length) return;
    Tile clickedTile = maze[row][col];

    if (clickedTile.isObstacle) return; 

    if (selectingStart) {
        
        for (Tile[] rowTiles : maze)
            for (Tile tile : rowTiles)
                tile.isStart = false;

        clickedTile.isStart = true;
        selectingStart = false;
    
    } else {
        
        for (Tile[] rowTiles : maze)
            for (Tile tile : rowTiles)
                tile.isEnd = false;

        clickedTile.isEnd = true;
        selectingStart = true;
     
    }
    
    repaint();
}
    
}








