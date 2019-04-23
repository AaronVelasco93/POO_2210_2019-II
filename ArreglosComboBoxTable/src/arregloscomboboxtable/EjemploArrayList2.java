/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloscomboboxtable;

import java.util.ArrayList;

/**
 *
 * @author Usuario-16
 */
public class EjemploArrayList2 {
    public static void main(String[] args) {
        ArrayList<Perro> lista=new ArrayList<Perro>();
        int i;
        for ( i = 0; i < 10; i++) {
            lista.add(new Perro("French Poddle", 3, 'H'));
        }
        
        for ( i = 0; i < 10; i++) {
            System.out.println("Raza:"
                    + lista.get(i).getRaza() );
        }
        
    }
}
