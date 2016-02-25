/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author k1357811
 */
public class LogInPanel extends JPanel
{
    private JLabel emailLabel = new JLabel("Email:");
    private JLabel passwordLabel = new JLabel("Password:");
    
    private static JTextField emailTextField = new JTextField();
    private static JTextField passwordTextField = new JTextField();
    
    private LogInButtonPanel logInButtonPanel = new LogInButtonPanel();
    
    public LogInPanel()
    {
        this.setLayout(new GridLayout(3,2));
        
        this.add(emailLabel);
        this.add(emailTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(logInButtonPanel);
    }
    
    public static String getEmail()
    {
        String email = emailTextField.getText();
        return email;
    }
    
    public static String getPassword()
    {
        String password = emailTextField.getText();
        return password;
    }
}
