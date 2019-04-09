/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.iu;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario-16
 */
public class MiVentana extends JFrame {

    private JButton boton;
    private JPanel panel;
    private JLabel etiqueta;
    private JTextField caja;
    
    public MiVentana() throws HeadlessException {
        setSize(600, 400);
        addWindowListener(new EventosVentana());        
        
        boton = new JButton("Presioname!!!");
        panel = (JPanel) getContentPane();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(boton);
        //boton.addMouseListener(new EventosRaton());

        etiqueta = new JLabel("Hola");
        panel.add(etiqueta);
        caja=new JTextField("");
        caja.setColumns(30);
        panel.add(caja);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Hola "+ caja.getText());
                JOptionPane.showMessageDialog(null,"Hola "+ caja.getText() );
                //CONECTARSE A BD
                // SELECT ALUIMNO BY ID
                // MOSTRAR EN caja
            }
            
        });

        setVisible(true);
    }
    
}
