/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Usuario-16
 */
public class EventosRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic del raton");
        System.out.print("Clic en coordenada: ");
        System.out.println("X="+e.getX());
        System.out.println("Y="+e.getY());
        System.out.println("Boton:"+e.getButton());
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("raton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("raton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      System.out.println("Cursor entra en foco");
     }

    @Override
    public void mouseExited(MouseEvent e) {
         System.out.println("cursor sale del foco");
    }

}
