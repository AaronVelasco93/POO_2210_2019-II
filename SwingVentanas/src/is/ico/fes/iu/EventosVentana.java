/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.iu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Usuario-16
 */
public class EventosVentana extends WindowAdapter{

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando...");
        System.exit(0);
    }
   
}
