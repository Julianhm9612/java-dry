/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.java.dry;

/**
 *
 * @author julian.henao.marin
 */
public class SalaryCalculator {
    // With DRY Principle
    public static double calculateNetSalary(double basicSalary, double deductions) {
        return basicSalary - deductions;
    }
}
