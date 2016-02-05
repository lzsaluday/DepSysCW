/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import javax.swing.*;

/**
 *
 * @author k1357811
 */
public class CalculatorViewer extends JFrame
{
    //JLabels
    private JLabel ageLabel;
    private JLabel genderLabel;
    private JLabel totalCholesterolLabel;
    private JLabel hdlCholesterolLabel;
    private JLabel smokerLabel;
    private JLabel diabetesLabel;
    private JLabel bloodPressureLabel;
    
    //JTextFields
    private static JTextField ageTextField;
    private static JTextField totalCholesterolTextField;
    private static JTextField hdlCholesterolTextField;
    private static JTextField bloodPressureTextField;
    
    //ButtonGroups
    private static ButtonGroup genderButtonGroup;
    private static ButtonGroup smokerButtonGroup;
    private static ButtonGroup diabetesButtonGroup;
    
    //Button Panel
    public CalculatorButtonPanel calculatorButtonPanel; 
    
    public CalculatorViewer()
    {       
        this.setTitle("Alpha Team CHD Risk Calculator");
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(8,3));

        ageLabel = new JLabel("Age:");
        contentPane.add(ageLabel);
        
        ageTextField = new JTextField();
        contentPane.add(ageTextField);
        
        JLabel emptyLabel1 = new JLabel("Years");
        contentPane.add(emptyLabel1);
        
        genderLabel = new JLabel("Gender:");
        contentPane.add(genderLabel);
        
        genderButtonGroup = new ButtonGroup();
        addRadioToGender("Male").setSelected(true);
        addRadioToGender("Female");
        
        totalCholesterolLabel = new JLabel("Total Cholesterol:");
        contentPane.add(totalCholesterolLabel);
        
        totalCholesterolTextField = new JTextField();
        contentPane.add(totalCholesterolTextField);
        
        JLabel emptyLabel2 = new JLabel("mg/dL");
        contentPane.add(emptyLabel2);
        
        hdlCholesterolLabel = new JLabel("HDL Cholesterol:");
        contentPane.add(hdlCholesterolLabel);
        
        hdlCholesterolTextField = new JTextField();
        contentPane.add(hdlCholesterolTextField);
        
        JLabel emptyLabel3 = new JLabel("mg/dL");
        contentPane.add(emptyLabel3);
        
        bloodPressureLabel = new JLabel("SYSTOLIC Blood Pressure:");
        contentPane.add(bloodPressureLabel);
        
        bloodPressureTextField = new JTextField();
        contentPane.add(bloodPressureTextField);
        
        JLabel emptyLabel4 = new JLabel("mm/Hg");
        contentPane.add(emptyLabel4);
        
        smokerLabel = new JLabel("Smoker:");
        contentPane.add(smokerLabel);
        
        smokerButtonGroup = new ButtonGroup();
        addRadioToSmoker("Yes").setSelected(true);
        addRadioToSmoker("No");
        
        diabetesLabel = new JLabel("Diabetes:");
        contentPane.add(diabetesLabel);
        
        diabetesButtonGroup = new ButtonGroup();
        addRadioToDiabetes("Yes").setSelected(true);
        addRadioToDiabetes("No");
        
        calculatorButtonPanel = new CalculatorButtonPanel();
        this.add(calculatorButtonPanel, BorderLayout.SOUTH);
        
        this.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setVisible(true);        
    }
    
    private JRadioButton addRadioToGender(String text) 
    {
        JRadioButton b = new JRadioButton(text);
        genderButtonGroup.add(b);
        add(b);
        return b;
    }
    
    private JRadioButton addRadioToSmoker(String text) 
    {
        JRadioButton b = new JRadioButton(text);
        smokerButtonGroup.add(b);
        add(b);
        return b;
    }
    
    private JRadioButton addRadioToDiabetes(String text) 
    {
        JRadioButton b = new JRadioButton(text);
        diabetesButtonGroup.add(b);
        add(b);
        return b;
    }
    
    //Method to return the selected radioButton values.
    public static String getSelectedButtonText(ButtonGroup buttonGroup) 
    {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) 
        { 
           
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) 
            {
                return button.getText();
            }
        }

        return null;
    }
    
    public static boolean getGender()
    {
        boolean returnValue = true;
        
        switch(getSelectedButtonText(genderButtonGroup)) 
        {
            case "Male":
                returnValue = true;
                break;
            case "Female":
                returnValue = false;
                break;
        }
        
        return returnValue;
    }
    
    public static boolean getSmoker()
    {
        boolean returnValue = true;
        switch(getSelectedButtonText(smokerButtonGroup))
        {
            case "Yes":
                returnValue = true;
                break;
            case "No":
                returnValue = false;
                break;        
        }
        return returnValue;
    }
    
    public static boolean getDiabetes()
    {
        boolean returnValue = true;
        switch(getSelectedButtonText(diabetesButtonGroup))
        {
            case "Yes":
                returnValue = true;
                break;
            case "No":
                returnValue = false;
                break;        
        }
        return returnValue;
    }
    
    
    /**
     * Get methods for textfields:
     * age
     * total cholesterol
     * hdl cholesterol
     * blood pressure
     */
    
    public static int getAge()
    {
        int age = Integer.parseInt(ageTextField.getText());
        return age;
    }
    
    public static double getTotalCholesterol()
    {
        double totalCholesterol = Double.parseDouble(totalCholesterolTextField.getText());
        return totalCholesterol;
    }
    
    public static double getHDLCholesterol()
    {
        double hdlCholesterol = Double.parseDouble(hdlCholesterolTextField.getText());
        return hdlCholesterol;
    }
    
    public static double getBloodPressure()
    {
        double bloodPressure = Double.parseDouble(bloodPressureTextField.getText());
        return bloodPressure;
    }
    
    //Method to re-initilise form.
    public static void clear()
    {
        ageTextField.setText("");
        totalCholesterolTextField.setText("");
        hdlCholesterolTextField.setText("");
        bloodPressureTextField.setText("");
    }
    
}
