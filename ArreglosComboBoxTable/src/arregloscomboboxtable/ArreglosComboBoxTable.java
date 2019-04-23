/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloscomboboxtable;

/**
 *
 * @author Usuario-16
 */
public class ArreglosComboBoxTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[10];
        numeros[0] = 20;
        System.out.println("Valor 0:" + numeros[0]);
        System.out.println("Valor 1:" + numeros[1]);
        int i;
        for ( i = 0; i < 10; i++) {
            numeros[i]=20;
        }
        for ( i = 0; i < 10; i++) {
            System.out.println("elem "+i+":"+numeros[i]);
        }
        
        Perro[] lista;
        lista= new Perro[10];
        
        for ( i = 0; i < 10; i++) {
            lista[i]= new Perro("Chihuahua", 2, 'M');
         }
   
        for ( i = 0; i < 10; i++) {
            System.out.print("Raza:"+lista[i].getRaza());
            System.out.print(" Edad:"+lista[i].getEdad());
            System.out.println(" Genero:"+lista[i].getGenero());
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

}
