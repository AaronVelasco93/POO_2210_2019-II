/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionherencia;

import dell.com.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;

/**
 *
 * @author Usuario-16
 */
public class ComposicionHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora miCompu  = new Computadora();
        miCompu.setMarca("Dell México");
        miCompu.setModelo("Alienware Area 51");
        miCompu.setMon(new Monitor("Benq", "Sense 3", 15));
        /* 
        Monitor tempo=new Monitor("Benq", "Sense 3", 15);
        miCompu.setMon(tempo);
        */
        miCompu.setProcesador(new Cpu("Intel", "i9", 4.5f));
        
        
        System.out.println(""+miCompu.getProcesador().getModelo());
        miCompu.getProcesador().setModelo("i11");
        System.out.println(""+miCompu.getProcesador().getModelo());
        
        
    }
    
}
