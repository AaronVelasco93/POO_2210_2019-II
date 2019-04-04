/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario-16
 */
public class EventoSimple implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Accion de evento...");
    }
    
}
