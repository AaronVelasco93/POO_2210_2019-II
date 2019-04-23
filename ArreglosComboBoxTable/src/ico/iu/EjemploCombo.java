/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.iu;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario-16
 */
public class EjemploCombo extends JFrame{
    private JPanel panel;
    private JComboBox combo;
    // modelo

    public EjemploCombo() throws HeadlessException {
        setSize(600, 400);
        setTitle("JComboBox ejemplo");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        combo=new JComboBox();
        panel=(JPanel)getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(combo);
        setVisible(true);
    }
    
    
}








