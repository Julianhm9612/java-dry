/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.java.dry;

/**
 *
 * @author julian.henao.marin
 */
public class Shapes {
    // Without DRY Principle
    double area = Math.PI * radius * radius;
    double circumference = 2 * Math.PI * radius;

    // With DRY Principle
    double area = calculateArea(radius);
    double circumference = calculateCircumference(radius);

    // Without DRY Principle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // With DRY Principle
    public double calculateArea(double... dimensions) {
        if (dimensions.length == 1) {
            return Math.PI * dimensions[0] * dimensions[0]; // Circle area
        } else if (dimensions.length == 2) {
            return dimensions[0] * dimensions[1]; // Rectangle area
        }
        return 0; // Handle other shapes
    }
    
    // Without DRY Principle
//    public void calculateAndPrintArea(double radius) {
//        double area = Math.PI * radius * radius;
//        System.out.println("Area: " + area);
//    }
//
//    public void calculateAndPrintArea(double length, double width) {
//        double area = length * width;
//        System.out.println("Area: " + area);
//    }

    // With DRY Principle
    public void calculateAndPrintArea(double... dimensions) {
        double area = calculateArea(dimensions);
        System.out.println("Area: " + area);
    }
}
