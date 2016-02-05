/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depsyscw;

import View.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author k1357811
 */
public class CalculatorControl implements ActionListener
{
    public CalculatorViewer calculatorViewer;
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource() == WelcomeButtonPanel.getCalculatorButton())
        {
            calculatorViewer = new CalculatorViewer();
        }
        if(event.getSource() == WelcomeButtonPanel.getLogInButton())
        {
            FileLoader fileLoader = new FileLoader();                    
        }
        if(event.getSource() == CalculatorButtonPanel.getCalculateButton())
        {          
            boolean gender = CalculatorViewer.getGender();
            int age = CalculatorViewer.getAge();
            double totalCholesterol = CalculatorViewer.getTotalCholesterol();
            double hdlCholesterol = CalculatorViewer.getHDLCholesterol();
            double bloodPressure = CalculatorViewer.getBloodPressure();
            boolean diabetes = CalculatorViewer.getDiabetes();
            boolean smoker = CalculatorViewer.getSmoker();
            int cholPoints = calculateCholPoints(gender, age, totalCholesterol, 
                    hdlCholesterol, bloodPressure, diabetes, smoker);
//            int response = JOptionPane.showConfirmDialog(calculatorViewer, 
//                    "Your CHD risk for the next 10 years is:\n" 
//                    + " %\n"
//                    + "Would you like to save your result?",
//                    "Save",
//                    JOptionPane.YES_NO_OPTION,
//                    JOptionPane.QUESTION_MESSAGE);
//            if (response == JOptionPane.NO_OPTION) 
//            {
//                System.out.println("No button clicked");
//            } 
//            else if (response == JOptionPane.YES_OPTION) 
//            {
//                System.out.println("Yes button clicked");
//            } 
//            else if (response == JOptionPane.CLOSED_OPTION) 
//            {
//                System.out.println("JOptionPane closed");
//            }
//            CalculatorViewer.clear();
        }
        if(event.getSource() == CalculatorButtonPanel.getCancelButton())
        {
            CalculatorViewer.clear();
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
            if(totalCholesterol < 160 | totalCholesterol < 4.15)
            {
                points = points - 3;
            }
            else if(totalCholesterol < 200 | totalCholesterol < 5.18)
            {
                points = points + 0;
            }
            else if(totalCholesterol < 240 | totalCholesterol < 6.22)
            {
                points = points + 1;
            }
            else if(totalCholesterol < 280 | totalCholesterol < 7.25)
            {
                points = points + 2;
            }
            else if(280 <= totalCholesterol | 7.25 <= totalCholesterol)
            {
                points = points + 3;
            }
            
            //HDL Cholesterol
            if(hdlCholesterol < 35 | hdlCholesterol < 0.9)
            {
                points = points + 2;
            }
            else if(hdlCholesterol < 45 | hdlCholesterol < 1.17)
            {
                points = points + 1;
            }
            else if(hdlCholesterol < 50 | hdlCholesterol < 1.3)
            {
                points = points + 0;
            }
            else if(hdlCholesterol < 60 | hdlCholesterol < 1.56)
            {
                points = points + 0;
            }
            else if(60 <= hdlCholesterol | 1.56 <= hdlCholesterol)
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
            if(totalCholesterol < 160 | totalCholesterol < 4.15)
            {
                points = points - 2;
            }
            else if(totalCholesterol < 200 | totalCholesterol < 5.18)
            {
                points = points + 0;
            }
            else if(totalCholesterol < 240 | totalCholesterol < 6.22)
            {
                points = points + 1;
            }
            else if(totalCholesterol < 280 | totalCholesterol < 7.25)
            {
                points = points + 1;
            }
            else if(280 <= totalCholesterol | 7.25 <= totalCholesterol)
            {
                points = points + 3;
            }
            
            //HDL Cholesterol
            if(hdlCholesterol < 35 | hdlCholesterol < 0.9)
            {
                points = points + 5;
            }
            else if(hdlCholesterol < 45 | hdlCholesterol < 1.17)
            {
                points = points + 2;
            }
            else if(hdlCholesterol < 50 | hdlCholesterol < 1.3)
            {
                points = points + 1;
            }
            else if(hdlCholesterol < 60 | hdlCholesterol < 1.56)
            {
                points = points + 0;
            }
            else if(60 <= hdlCholesterol | 1.56 <= hdlCholesterol)
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
        if(gender)
        {
            if(1 <= cholPoints)
            {
                chdRisk = "2%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
            else if(cholPoints == 0)
            {
                chdRisk = "3%";
            }
        }
        else
        {
            
        }
        return chdRisk;
    }
    
}
