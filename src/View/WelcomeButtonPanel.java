/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.CalculatorControl;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author k1357811
 */
public class WelcomeButtonPanel extends JPanel
{
    private static JButton registerButton = new JButton("Register");
    private static JButton logInButton = new JButton("Log In");
    
    public WelcomeButtonPanel()
    {
        this.setLayout(new GridLayout(1,2));
        
        this.add(registerButton);
        registerButton.addActionListener(new CalculatorControl());
        
        this.add(logInButton);
        logInButton.addActionListener(new CalculatorControl());
    }
    
    public static JButton getRegisterButton()
    {
        return registerButton;
    }
    
    public static JButton getLogInButton()
    {
        return logInButton;
    }
    
}
