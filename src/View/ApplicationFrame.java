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
public class ApplicationFrame extends JFrame
{
    private WelcomeButtonPanel welcomeButtonPanel = new WelcomeButtonPanel();
    private CalculatorPanel calculatorPanel = new CalculatorPanel();
    private CalculatorButtonPanel calculatorButtonPanel = new CalculatorButtonPanel();
    private static Container contentPane;
    
    public ApplicationFrame()
    {
        contentPane = getContentPane();
        this.setTitle("Alpha Team CVD Risk Calculator");      
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/3-this.getSize().width/2, dim.height/3-this.getSize().height/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane.add(welcomeButtonPanel, BorderLayout.NORTH);
        contentPane.add(calculatorPanel, BorderLayout.CENTER);
        contentPane.add(calculatorButtonPanel, BorderLayout.SOUTH);
        
        this.pack();
        this.setSize(500, 300);
        this.setVisible(true);
    }
    
    public static void changePanel(JPanel panel)
    {
        contentPane.removeAll();
        contentPane.add(panel);
    }
}
