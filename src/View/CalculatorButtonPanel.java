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
public class CalculatorButtonPanel extends JPanel
{
    //Buttons
    private static JButton calculateButton = new JButton("Calculate");
    private static JButton cancelButton = new JButton("Cancel");
    
    public CalculatorButtonPanel()
    {
        this.setLayout(new GridLayout(1,2));
        
        this.add(calculateButton);
        calculateButton.addActionListener(new CalculatorControl());
        
        this.add(cancelButton);
        cancelButton.addActionListener(new CalculatorControl());
    }
    
    public static JButton getCalculateButton()
    {
        return calculateButton;
    }
    
    public static JButton getCancelButton()
    {
        return cancelButton;
    }
}
