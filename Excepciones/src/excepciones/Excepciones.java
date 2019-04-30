/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario-16
 */
public class Excepciones {

    public static void main(String[] args) {
        int x=10;
        int y=0;
        
        try{
            String val=JOptionPane.showInputDialog("Ingresa un numero");
            int ival=Integer.parseInt(val);
            y=10/ival;
        }catch(ArithmeticException e){
            System.out.println("Ocurrio una excepción!!");
            String mensaje=e.toString();
            System.out.println("Error:"+mensaje);
            e.printStackTrace();
        }catch(NumberFormatException nfe){
            System.out.println("Error:"+nfe.toString());
        }catch(Exception eg){
            System.out.println("Error"+eg.toString());
        }finally{
            System.out.println("Limpieza...");
        }
        
        System.out.println("Y="+y);
        
        try {
            Taxi t = new Taxi(3232, 1500.0f, "Nissan");
            t.incrementarGanancia();
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        
        Taxi t2=null;
        t2.incrementarGanancia();
        
        
        System.out.println("El programa hace otras cosas");
        System.out.println("Fin");
        
    }
    
}
