/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import is.ico.fes.aragon.Persona;



/**
 *
 * @author Usuario-16
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1=new Persona();
        Persona per2=new Persona();
        //per1.nombre="hdkjashdkasjd";
        per1.setNombre("Juanito");
        per1.setEstatura(1.75f);

        per2.setNombre("Pedrito");
        per2.setEstatura(1.85f);
        
        System.out.println("Promedio="+(per1.getEstatura()+per2.getEstatura())/2);
    }
    
}
