/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;

public class Tile {
     int terrain;
     int elevation;
     int obstacleDistance;
     boolean isObstacle;
     int label;
     public boolean isStart = false;
     public boolean isEnd = false;
     public boolean isPath;
      
      public Tile(int terrain, int elevation, boolean isObstacle) {
        this.terrain = terrain;
        this.elevation = elevation;
        this.isObstacle = isObstacle;
    }
}
