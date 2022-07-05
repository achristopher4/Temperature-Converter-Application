/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgrammingAssignment5;

/**
 *
 * @author alexchristopher
 */

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter tempConverter = new TemperatureConverter();
        tempConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempConverter.setSize(600, 300);
        tempConverter.setVisible(true);
    }
}
