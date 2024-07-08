/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.java.dry;

/**
 *
 * @author julian.henao.marin
 */
public class Send {
    // Without DRY Principle
    public void sendEmail(String recipient, String subject, String body) {
        // Code to send email
    }

    public void sendNotification(String recipient, String message) {
        // Code to send notification
    }

    // With DRY Principle
    public void sendMessage(String recipient, String subject, String message) {
        // Code to send message
    }
}
