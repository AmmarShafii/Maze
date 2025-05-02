/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazeproject;

public class Perceptron {
    private double[] weights; 
    private double threshold;
    private double learningRate;
    
    
    public Perceptron(int inputSize, double learningRate,double threshold) {
        this.weights = new double[inputSize];
        this.threshold= threshold;
        this.learningRate = learningRate;
        
        for (int i = 0; i < inputSize; i++) {
            weights[i] = Math.random() - 0.5;
        }
    }
    
    
      public int predict(int[] inputs) {
        double sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i] * inputs[i];
        }
        return (sum >= threshold) ? 1 : 0;
    }
    
    
      
      public void train(int[][] inputs, int[] labels, int epochs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                int prediction = predict(inputs[i]);
                int error = labels[i] - prediction;
                
                 for (int j = 0; j < weights.length; j++) {
                    weights[j] += learningRate * error * inputs[i][j];
                }
                 
                 
            }
        }
      }
      
      
      
      
}
