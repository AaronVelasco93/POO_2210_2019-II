/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicionherencia;

import dell.com.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.herencia.Estudiante;

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
        
        
        //System.out.println(""+miCompu.getProcesador().getModelo());
        System.out.println(miCompu.toString());
        miCompu.getProcesador().setModelo("i11");
        //System.out.println(""+miCompu.getProcesador().getModelo());
        System.out.println(miCompu.toString());
        
        Estudiante estudiambre=new Estudiante(2, "3123123", 20.0f,
                                    "ICO", 1.83f, "Juan Perez", 100.0f, 20);
        estudiambre.dormir();
        estudiambre.estudiar();
        
    }
    
}
