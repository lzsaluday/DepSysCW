/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import depsyscw.CalculatorControl;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author k1357811
 */
public class WelcomeButtonPanel extends JPanel
{
    private static JButton calculatorButton = new JButton("Calculate your CVD risk");
    private static JButton logInButton = new JButton("Load User Profile");
    
    public WelcomeButtonPanel()
    {
        this.setLayout(new GridLayout(1,2));
        
        this.add(calculatorButton);
        calculatorButton.addActionListener(new CalculatorControl());
        
        this.add(logInButton);
        logInButton.addActionListener(new CalculatorControl());
    }
    
    public static JButton getCalculatorButton()
    {
        return calculatorButton;
    }
    
    public static JButton getLogInButton()
    {
        return logInButton;
    }
    
}
