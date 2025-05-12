/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;

/**
 *
 * @author hp
 */
public class Node implements Comparable<Node> {
     public int row, col;
    public int g, h, f;
    public Node parent;
    
    
    public Node(int row, int col, Node parent, int g, int h) {
        this.row = row;
        this.col = col;
        this.parent = parent;
        this.g = g;
        this.h = h;
        this.f = g + h;
    }
    
    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.f, other.f);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Node)) return false;
        Node other = (Node) obj;
        return this.row == other.row && this.col == other.col;
    }

    @Override
    public int hashCode() {
        return row * 31 + col;
    }
    
}
