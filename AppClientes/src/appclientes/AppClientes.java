/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclientes;

import is.ico.fes.modelo.Cliente;
import is.ico.fes.vista.VentanaClientes;
import java.util.ArrayList;

/**
 *
 * @author Usuario-16
 */
public class AppClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        ArrayList<Cliente> carteraClientes
                = new ArrayList<Cliente>();

        c.setNumCuenta(1234);
        c.setNombre("Juan");
        c.setPaterno("García");
        c.setMaterno("Pérez");
        c.setBalance(1234567.89f);

        carteraClientes.add(c);
        
        Cliente c2=new Cliente(4321, "José",
                            "Hernández", "Correa", 12345.67f);
        carteraClientes.add(c2);
        
        carteraClientes.add(new Cliente(345, "Jesús", 
                "Hernández", "Cabrera", 98765.43f));
        
        for (int i = 0; i < carteraClientes.size(); i++) {
            System.out.println(
                  "nombre:"+ carteraClientes.get(i).getNombre()  
                  + " Balance:"+carteraClientes.get(i).getBalance());            
        }
        System.out.println("----------------------");
        for (Cliente cli : carteraClientes) {
            System.out.print("Nombre:"+cli.getNombre());
            System.out.println(" Balance:"+cli.getBalance());
        }
        
        VentanaClientes v=new VentanaClientes();
        
    }
    
    
    
    
    
    
    
    
    

}
