/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author k1357811
 */
public class WelcomeFrame extends JFrame
{
    private WelcomeButtonPanel welcomeButtonPanel = new WelcomeButtonPanel();
    private JLabel welcomeLabel = new JLabel("Welcome to the 2016 Alpha team CVD risk Calculator!");
    
    public WelcomeFrame()
    {
        this.setTitle("Alpha Team CVD Risk Calculator");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/3-this.getSize().width/2, dim.height/3-this.getSize().height/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(welcomeLabel);
        
        this.add(welcomeButtonPanel, BorderLayout.SOUTH);
        
        this.pack();
        this.setSize(500, 200);
        this.setVisible(true);
    }
}
