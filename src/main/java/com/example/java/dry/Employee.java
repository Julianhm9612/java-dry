/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.java.dry;

/**
 *
 * @author julian.henao.marin
 */
public class Employee {
    private double basicSalary;
    private double deductions;

    public Employee(double basicSalary, double deductions) {
        this.basicSalary = basicSalary;
        this.deductions = deductions;
    }

    
    // Without DRY Principle
//    public double calculateNetSalary() {
//        return basicSalary - deductions;
//    }
    
    // Without DRY Principle
//    public void printEmployeeDetails(Employee employee) {
//        System.out.println("Name: " + employee.getName());
//        System.out.println("ID: " + employee.getId());
//        System.out.println("Department: " + employee.getDepartment());
//        System.out.println("Salary: " + employee.getSalary());
//    }
    
    // With DRY Principle
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
    }
    
    // With DRY Principle
    public double calculateNetSalary() {
        return SalaryCalculator.calculateNetSalary(basicSalary, deductions);
    }
}
