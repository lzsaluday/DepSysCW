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
public class LogInButtonPanel extends JPanel
{
    private static JButton logInButton = new JButton("Log In");
    private static JButton cancelButton = new JButton("Cancel");
    
    public LogInButtonPanel()
    {
        this.setLayout(new GridLayout(1,2));
        
        this.add(logInButton);
        this.add(cancelButton);
        
        logInButton.addActionListener(new CalculatorControl());
        cancelButton.addActionListener(new CalculatorControl());
    }
    
    public static JButton getLogInButton()
    {
        return logInButton;
    }
    
    public static JButton getCancelButton()
    {
        return cancelButton;
    }
}
