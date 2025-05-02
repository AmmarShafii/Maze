/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;

public class TileData {
    public int terrain; 
    public int elevation;
    public int obstacleDistance;
    public int label;
    
    
     public TileData(int terrain, int elevation, int obstacleDistance, int label) {
           this.terrain = terrain;
        this.elevation = elevation;
        this.obstacleDistance = obstacleDistance;
        this.label = label;
     }
            
}
