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
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TemperatureConverter extends JFrame {
    private final Container container;
    private final FlowLayout flowLayout;
    private final JPanel mainPanel;
    private final Font titleFont = new Font("Serif", Font.BOLD, 40);
    private final Font bodyFont = new Font("Serif", Font.PLAIN, 15);
    private final Font chooseTypeFont = new Font("Serif", Font.PLAIN, 13);
    private final JLabel applicationTitle;
    private final JPanel selectionPanel;
    private final ButtonGroup tempChoicesButtonGroup;
    private final JLabel chooseType;
    private final JRadioButton toCelsiusRadio;
    private final JRadioButton toFahrenheitRadio;
    private final JPanel bottomPanel;
    private final JPanel inputPanel;
    private final JLabel promptInput;
    private final JTextField inputTemp;
    private final JLabel convertsToText;
    private JLabel convertsToAnswer;
    private final JPanel calculatePanel;
    private final JButton calculateButton;
    
    public TemperatureConverter() {
        super("Temperature Converter");
        
        flowLayout = new FlowLayout();
        container = getContentPane();
        container.setLayout(flowLayout);
        
        mainPanel = new JPanel(new GridLayout(4, 1));
        
        applicationTitle = new JLabel("Temperature Converter");
        applicationTitle.setFont(titleFont);
        applicationTitle.setHorizontalAlignment(SwingConstants.CENTER);
        applicationTitle.setForeground(Color.RED);
        
        mainPanel.add(applicationTitle);
        
        
        chooseType = new JLabel("Choose Conversion Type:");
        chooseType.setHorizontalAlignment(SwingConstants.CENTER);
        chooseType.setFont(chooseTypeFont);
        toCelsiusRadio = new JRadioButton("Fahrenheit to Celsius");
        toCelsiusRadio.setHorizontalAlignment(SwingConstants.CENTER);
        toCelsiusRadio.setFont(bodyFont);
        toCelsiusRadio.setSelected(true);
        toFahrenheitRadio = new JRadioButton("Celsius to Fahrenheit");
        toFahrenheitRadio.setHorizontalAlignment(SwingConstants.CENTER);
        toFahrenheitRadio.setFont(bodyFont);
        
        toCelsiusRadio.addItemListener(new RadioButtonHandler());
        toFahrenheitRadio.addItemListener(new RadioButtonHandler());
        
        tempChoicesButtonGroup = new ButtonGroup();
        tempChoicesButtonGroup.add(toCelsiusRadio);
        tempChoicesButtonGroup.add(toFahrenheitRadio);
        
        selectionPanel = new JPanel(new GridLayout(3, 1));
        selectionPanel.add(chooseType);
        selectionPanel.add(toCelsiusRadio);
        selectionPanel.add(toFahrenheitRadio);
        
        mainPanel.add(selectionPanel);
        
        bottomPanel = new JPanel(new GridLayout(2, 2));
        
        promptInput = new JLabel("Enter the temperature to covert:");
        promptInput.setFont(bodyFont);
        promptInput.setHorizontalAlignment(SwingConstants.LEFT);
        
        inputPanel = new JPanel();
        inputTemp = new JTextField(4);
        inputTemp.setHorizontalAlignment(SwingConstants.LEFT);
        inputPanel.add(inputTemp);
        
        convertsToText = new JLabel();
        convertsToText.setFont(bodyFont);
        convertsToText.setHorizontalAlignment(SwingConstants.LEFT);
        convertsToAnswer = new JLabel();
        convertsToAnswer.setFont(bodyFont);
        convertsToAnswer.setHorizontalAlignment(SwingConstants.LEFT);
       
        bottomPanel.add(promptInput);
        bottomPanel.add(inputPanel);
        bottomPanel.add(convertsToText);
        bottomPanel.add(convertsToAnswer);
        
        mainPanel.add(bottomPanel);
        
        calculateButton = new JButton("Convert Temperature");
        calculateButton.setFont(bodyFont);
        
        calculatePanel = new JPanel();
        calculatePanel.add(calculateButton);
        
        ButtonHandler handler = new ButtonHandler();
        calculateButton.addActionListener(handler);
        
        mainPanel.add(calculatePanel);
        
        add(mainPanel);
    }
    
    private class ButtonHandler implements ActionListener {
        private double textFieldNumb;
        private String text;
        private String formattedAnswer;
        private double conversionCalc;
        @Override
        public void actionPerformed(ActionEvent event) {
            // retrieve input from JTextField
            textFieldNumb = Double.parseDouble(inputTemp.getText());
            
            text = String.format("The tempature converts to:", "");
            convertsToText.setText(text);
            
            if (toFahrenheitRadio.isSelected()) {
                conversionCalc = (textFieldNumb * (9.0/5.0)) +32.0;
                formattedAnswer = String.format("%.1f degrees Fahrenheit", conversionCalc);
                convertsToAnswer.setText(formattedAnswer);
            }
            
            if (toCelsiusRadio.isSelected()) {
                conversionCalc = (textFieldNumb - 32.0) * (5.0/9.0);
                formattedAnswer = String.format("%.1f degrees Celsius", conversionCalc);
                convertsToAnswer.setText(formattedAnswer);
            }
        }
    }
    
   
    private class RadioButtonHandler implements ItemListener {
        public RadioButtonHandler() {
            //initialize
        }
        
        @Override
        public void itemStateChanged(ItemEvent event) {
            // initalize
        }
    }
}
