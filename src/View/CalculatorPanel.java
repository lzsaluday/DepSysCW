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
public class CalculatorPanel extends JPanel
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
    
    public CalculatorPanel()
    {       
        this.setLayout(new GridLayout(8,3));

        ageLabel = new JLabel("Age:");       
        this.add(ageLabel);
        
        ageTextField = new JTextField();
        this.add(ageTextField);
        
        JLabel emptyLabel1 = new JLabel("Years");
        this.add(emptyLabel1);
        
        genderLabel = new JLabel("Gender:");
        this.add(genderLabel);
        
        genderButtonGroup = new ButtonGroup();
        addRadioToGroup(genderButtonGroup, "Male").setSelected(true);
        addRadioToGroup(genderButtonGroup, "Female");
        
        totalCholesterolLabel = new JLabel("Total Cholesterol:");
        this.add(totalCholesterolLabel);
        
        totalCholesterolTextField = new JTextField();
        this.add(totalCholesterolTextField);
        
        JLabel emptyLabel2 = new JLabel("mg/dL");
        this.add(emptyLabel2);
        
        hdlCholesterolLabel = new JLabel("HDL Cholesterol:");
        this.add(hdlCholesterolLabel);
        
        hdlCholesterolTextField = new JTextField();
        this.add(hdlCholesterolTextField);
        
        JLabel emptyLabel3 = new JLabel("mg/dL");
        this.add(emptyLabel3);
        
        bloodPressureLabel = new JLabel("SYSTOLIC Blood Pressure:");
        this.add(bloodPressureLabel);
        
        bloodPressureTextField = new JTextField();
        this.add(bloodPressureTextField);
        
        JLabel emptyLabel4 = new JLabel("mm/Hg");
        this.add(emptyLabel4);
        
        smokerLabel = new JLabel("Smoker:");
        this.add(smokerLabel);
        
        smokerButtonGroup = new ButtonGroup();
        addRadioToGroup(smokerButtonGroup, "Yes").setSelected(true);
        addRadioToGroup(smokerButtonGroup, "No");
        
        diabetesLabel = new JLabel("Diabetes:");
        this.add(diabetesLabel);
        
        diabetesButtonGroup = new ButtonGroup();
        addRadioToGroup(diabetesButtonGroup, "Yes").setSelected(true);
        addRadioToGroup(diabetesButtonGroup, "No");
        
        this.setVisible(true);        
    }
    
    private JRadioButton addRadioToGroup(ButtonGroup group, String text) 
    {
        JRadioButton b = new JRadioButton(text);
        group.add(b);
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
        int age = 0;
        if(ageTextField.getText() != null)
        {
            try
            {
                age = Integer.parseInt(ageTextField.getText());
                if(age < 30 || 74 < age)
                {
                    System.out.println("Please enter age between 30 and 74.");
                    age = 0;
                }
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Please enter age.");
        }
        return age;
    }
    
    public static double getTotalCholesterol()
    {
        double totalCholesterol = 0;
        if(totalCholesterolTextField.getText() != null)
        {
            try
            {
                totalCholesterol = Double.parseDouble(totalCholesterolTextField.getText());
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Please enter total cholesterol.");
        }
        return totalCholesterol;
    }
    
    public static double getHDLCholesterol()
    {
        double hdlCholesterol = 0;
        if(hdlCholesterolTextField.getText() != null)
        {
            try
            {
                hdlCholesterol = Double.parseDouble(hdlCholesterolTextField.getText());
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Please enter HDL cholesterol.");
        }
        return hdlCholesterol;
    }
    
    public static double getBloodPressure()
    {
        double bloodPressure = 0;
        if(bloodPressureTextField.getText() != null)
        {
            try
            {
                bloodPressure = Double.parseDouble(bloodPressureTextField.getText());
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Please enter blood pressure.");
        }
        return bloodPressure;
    }
    
    //Method to re-initialise form.
    public static void clear()
    {
        ageTextField.setText("");
        totalCholesterolTextField.setText("");
        hdlCholesterolTextField.setText("");
        bloodPressureTextField.setText("");
    }
    
}
