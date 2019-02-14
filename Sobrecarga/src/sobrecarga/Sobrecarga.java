/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import is.ico.fes.aragon.unam.Aritmetica;
import javax.swing.JFrame;

/**
 *
 * @author Usuario-16
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Aritmetica calculadora=new Aritmetica();
        calculadora.setOperando1(5);
        calculadora.setOperando2(4);
        calculadora.sumar();
        System.out.println("5+4="+calculadora.getResultado());
        
        Aritmetica calculadora2=new Aritmetica(5, 4);
        calculadora2.sumar();
        System.out.println("5+4="+calculadora2.getResultado());
        
        
        calculadora.sumar(6, 7);
        System.out.println("6+7"+ calculadora.getResultado());
        
        int res=calculadora.sumar("El resultado es: ");
        System.out.println(res);
        
        JFrame ventana=new JFrame("Hola mundo windows swing");
        ventana.setSize(400, 300);
        ventana.setVisible(true);
        
    }
    
}
