/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import is.ico.fes.aragon.unam.Automovil;
/**
 *
 * @author Usuario-16
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Automovil auto1=new Automovil();
        auto1.encender();
        auto1.marca="Volks Wagen";
        auto1.encender();*/
        
        //Bocho
        Automovil miBocho = new Automovil();
        miBocho.marca="VW";
        miBocho.subMarca="Sedan";
        miBocho.modelo=1970;
        miBocho.color="Azul";
       
        //MiBocho Metodos
        miBocho.encender();
        miBocho.avanzar();
        miBocho.apagar();
        
        System.out.println("-----------------------------");
   
        //Mustang
        Automovil miMustang = new Automovil();
        miMustang.marca="Ford";
        miMustang.subMarca="Mustang";
        miMustang.modelo=2010;
        miMustang.color="Amarillo";
        //Mustang
        miMustang.encender();
        miMustang.avanzar();
        miMustang.apagar();

        System.out.println("-----------------------------");

        //Akura
        Automovil miAkura = new Automovil();
        miAkura.marca="Akura";
        miAkura.subMarca="NSX";
        miAkura.modelo=2013;
        miAkura.color="Gris";
       
        
        //Akura
        miAkura.encender();
        miAkura.avanzar();
        miAkura.apagar();
        
        
    }
    
}
