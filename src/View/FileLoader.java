/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author k1357811
 */
public class FileLoader extends JFrame
{
    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("csv Files","csv");
    private JFileChooser fileChooser = new JFileChooser();
    
    public FileLoader()
    {        
        fileChooser.setFileFilter(filter);
        this.add(fileChooser);
        this.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setVisible(true);
    }
}
