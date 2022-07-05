/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

/**
 *
 * @author alexchristopher
 */

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TemperatureConverterFormatting tempConverter = new TemperatureConverterFormatting();
        tempConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempConverter.setSize(400, 275);
        tempConverter.setVisible(true);
    }
}
