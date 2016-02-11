/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author k1357811
 */
public class CalculatorControl implements ActionListener
{
    public CalculatorPanel calculatorViewer;
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource() == WelcomeButtonPanel.getRegisterButton())
        {
            calculatorViewer = new CalculatorPanel();
        }
        if(event.getSource() == WelcomeButtonPanel.getLogInButton())
        {
            LogInPanel logInPanel = new LogInPanel();
            ApplicationFrame.changePanel(logInPanel);
        }
        if(event.getSource() == CalculatorButtonPanel.getCalculateButton())
        {          
            boolean gender = CalculatorPanel.getGender();
            int age = CalculatorPanel.getAge();
            double totalCholesterol = CalculatorPanel.getTotalCholesterol();
            double hdlCholesterol = CalculatorPanel.getHDLCholesterol();
            double bloodPressure = CalculatorPanel.getBloodPressure();
            boolean diabetes = CalculatorPanel.getDiabetes();
            boolean smoker = CalculatorPanel.getSmoker();
            int cholPoints = calculateCholPoints(gender, age, totalCholesterol, 
                    hdlCholesterol, bloodPressure, diabetes, smoker);
            String chdRisk = calculateCHDRisk(gender, cholPoints);
                    
            int response = JOptionPane.showConfirmDialog(calculatorViewer, 
                    "Calculation result:\n" 
                    + chdRisk + " for the next 10 years \n"
                    + "Would you like to save your result?",
                    "Save",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) 
            {
                System.out.println("No button clicked");
            } 
            else if (response == JOptionPane.YES_OPTION) 
            {
                System.out.println("Yes button clicked");
            } 
            else if (response == JOptionPane.CLOSED_OPTION) 
            {
                System.out.println("JOptionPane closed");
            }
            CalculatorPanel.clear();
        }
        if(event.getSource() == CalculatorButtonPanel.getCancelButton())
        {
            CalculatorPanel.clear();
        }
    }
    
    //Chol points calculation (Not LDL points!!!)
    public int calculateCholPoints(boolean gender, int age, 
            double totalCholesterol, double hdlCholesterol, 
            double bloodPressure, boolean diabetes, boolean smoker)
    {
        int points = 0;
        //If male
        if(gender)
        {
            //Age
            if(30 <= age && age <35)
            {
                points = points - 1;
            }
            else if(age < 40)
            {
                points = points + 0;
            }
            else if(age < 45)
            {
                points = points + 1;
            }
            else if(age < 50)
            {
                points = points + 2;
            }
            else if(age < 55)
            {
                points = points + 3;
            }
            else if(age < 60)
            {
                points = points + 4;
            }
            else if(age < 65)
            {
                points = points + 5;
            }
            else if(age < 70)
            {
                points = points + 6;
            }
            else if(age < 75)
            {
                points = points + 7;
            }
            
            //Total Cholesterol
            if(totalCholesterol < 160)
            {
                points = points - 3;
            }
            else if(totalCholesterol < 200)
            {
                points = points + 0;
            }
            else if(totalCholesterol < 240)
            {
                points = points + 1;
            }
            else if(totalCholesterol < 280)
            {
                points = points + 2;
            }
            else if(280 <= totalCholesterol)
            {
                points = points + 3;
            }
            
            //HDL Cholesterol
            if(hdlCholesterol < 35)
            {
                points = points + 2;
            }
            else if(hdlCholesterol < 45)
            {
                points = points + 1;
            }
            else if(hdlCholesterol < 50)
            {
                points = points + 0;
            }
            else if(hdlCholesterol < 60)
            {
                points = points + 0;
            }
            else if(60 <= hdlCholesterol)
            {
                points = points - 2;
            }
            
            //SYSTOLIC Blood Pressure
            if(bloodPressure < 120)
            {
                points = points + 0;
            }
            else if(bloodPressure < 130)
            {
                points = points + 0;
            }
            else if(bloodPressure < 140)
            {
                points = points + 1;
            }
            else if(bloodPressure < 160)
            {
                points = points + 2;
            }
            else if(160 <= bloodPressure)
            {
                points = points + 3;
            }
            
            //diabetes
            if(diabetes)
            {
                points = points + 2;
            }
            else
            {
                points = points + 0;
            }
            
            //smoker
            if(smoker)
            {
                points = points + 2;
            }
            else
            {
                points = points + 0;
            }
            
        }
        //If female
        else
        {
            if(30 <= age && age <35)
            {
                points = points -9;
            }
            else if(age < 40)
            {
                points = points -4;
            }
            else if(age < 45)
            {
                points = points + 0;
            }
            else if(age < 50)
            {
                points = points + 3;
            }
            else if(age < 55)
            {
                points = points + 6;
            }
            else if(age < 60)
            {
                points = points + 7;
            }
            else if(age < 65)
            {
                points = points + 8;
            }
            else if(age < 70)
            {
                points = points + 8;
            }
            else if(age < 75)
            {
                points = points + 8;
            }
            
            //Total Cholesterol
            if(totalCholesterol < 160)
            {
                points = points - 2;
            }
            else if(totalCholesterol < 200)
            {
                points = points + 0;
            }
            else if(totalCholesterol < 240)
            {
                points = points + 1;
            }
            else if(totalCholesterol < 280)
            {
                points = points + 1;
            }
            else if(280 <= totalCholesterol)
            {
                points = points + 3;
            }
            
            //HDL Cholesterol
            if(hdlCholesterol < 35)
            {
                points = points + 5;
            }
            else if(hdlCholesterol < 45)
            {
                points = points + 2;
            }
            else if(hdlCholesterol < 50)
            {
                points = points + 1;
            }
            else if(hdlCholesterol < 60)
            {
                points = points + 0;
            }
            else if(60 <= hdlCholesterol)
            {
                points = points - 3;
            }
            
            //SYSTOLIC Blood Pressure
            if(bloodPressure < 120)
            {
                points = points - 3;
            }
            else if(bloodPressure < 130)
            {
                points = points + 0;
            }
            else if(bloodPressure < 140)
            {
                points = points + 0;
            }
            else if(bloodPressure < 160)
            {
                points = points + 2;
            }
            else if(160 <= bloodPressure)
            {
                points = points + 3;
            }
            
            //diabetes
            if(diabetes)
            {
                points = points + 4;
            }
            else
            {
                points = points + 0;
            }
            
            //smoker
            if(smoker)
            {
                points = points + 2;
            }
            else
            {
                points = points + 0;
            }
        }
        
        return points;
    }
    
    public String calculateCHDRisk(boolean gender, int cholPoints)
    {
        String chdRisk = null;
        //Male
        if(gender)
        {
            if(cholPoints <= -1)
            {
                chdRisk = "CHD risk = 2%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "CHD risk = 3%";
            }
            else if(cholPoints == 1)
            {
                chdRisk = "CHD risk = 3%";
            }
            else if(cholPoints == 2)
            {
                chdRisk = "CHD risk = 4%";
            }
            else if(cholPoints == 3)
            {
                chdRisk = "CHD risk = 5%";
            }
            else if(cholPoints == 4)
            {
                chdRisk = "CHD risk = 7%";
            }
            else if(cholPoints == 5)
            {
                chdRisk = "CHD risk = 8%";
            }
            else if(cholPoints == 6)
            {
                chdRisk = "CHD risk = 10%";
            }
            else if(cholPoints == 7)
            {
                chdRisk = "CHD risk = 13%";
            }
            else if(cholPoints == 8)
            {
                chdRisk = "CHD risk = 16%";
            }
            else if(cholPoints == 9)
            {
                chdRisk = "CHD risk = 20%";
            }
            else if(cholPoints == 10)
            {
                chdRisk = "CHD risk = 25%";
            }
            else if(cholPoints == 11)
            {
                chdRisk = "CHD risk = 31%";
            }
            else if(cholPoints == 12)
            {
                chdRisk = "CHD risk = 37%";
            }
            else if(cholPoints == 13)
            {
                chdRisk = "CHD risk = 45%";
            }
            else if(14 <= cholPoints)
            {
                chdRisk = "53% <= CHD risk";
            }
        }
        //Female
        else
        {
            if(cholPoints <= -2)
            {
                chdRisk = "CHD risk = 1%";
            }
            else if(cholPoints == -1)
            {
                chdRisk = "CHD risk = 2%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "CHD risk = 2%";
            }
            else if(cholPoints == 1)
            {
                chdRisk = "CHD risk = 2%";
            }
            else if(cholPoints == 2)
            {
                chdRisk = "CHD risk = 3%";
            }
            else if(cholPoints == 3)
            {
                chdRisk = "CHD risk = 3%";
            }
            else if(cholPoints == 4)
            {
                chdRisk = "CHD risk = 4%";
            }
            else if(cholPoints == 5)
            {
                chdRisk = "CHD risk = 4%";
            }
            else if(cholPoints == 6)
            {
                chdRisk = "CHD risk = 5%";
            }
            else if(cholPoints == 7)
            {
                chdRisk = "CHD risk = 6%";
            }
            else if(cholPoints == 8)
            {
                chdRisk = "CHD risk = 7%";
            }
            else if(cholPoints == 9)
            {
                chdRisk = "CHD risk = 8%";
            }
            else if(cholPoints == 10)
            {
                chdRisk = "CHD risk = 10%";
            }
            else if(cholPoints == 11)
            {
                chdRisk = "CHD risk = 11%";
            }
            else if(cholPoints == 12)
            {
                chdRisk = "CHD risk = 13%";
            }
            else if(cholPoints == 13)
            {
                chdRisk = "CHD risk = 15%";
            }
            else if(cholPoints == 14)
            {
                chdRisk = "CHD risk = 18%";
            }
            else if(cholPoints == 15)
            {
                chdRisk = "CHD risk = 20%";
            }
            else if(cholPoints == 16)
            {
                chdRisk = "CHD risk = 24%";
            }
            else if(17 <= cholPoints)
            {
                chdRisk = "27% <= CHD risk";
            }
        }
        return chdRisk;
    }
    
}
