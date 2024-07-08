/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.java.dry;

/**
 *
 * @author julian.henao.marin
 */
public class Manager {
    private double basicSalary;
    private double deductions;

    public Manager(double basicSalary, double deductions) {
        this.basicSalary = basicSalary;
        this.deductions = deductions;
    }
    
    // Without DRY Principle
//    public void printManagerDetails(Manager manager) {
//        System.out.println("Name: " + manager.getName());
//        System.out.println("ID: " + manager.getId());
//        System.out.println("Department: " + manager.getDepartment());
//        System.out.println("Salary: " + manager.getSalary());
//    }

    // Without DRY Principle
//    public double calculateNetSalary() {
//        return basicSalary - deductions;
//    }
    
    // With DRY Principle
    public double calculateNetSalary() {
        return SalaryCalculator.calculateNetSalary(basicSalary, deductions);
    }
    
    public void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager); // Reuse the common method
    }
}
