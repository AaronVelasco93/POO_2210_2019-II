/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.aragon.unam;

/**
 *
 * @author Usuario-16
 */
public class Automovil {
    public String marca;
    public String subMarca;
    public int modelo;
    public String color;
    
    
    
    public Automovil(){
        this.marca="Sin marca";
        this.subMarca="Sin submarca";
        this.modelo=0;
        this.color="Sin color";
        System.out.println("NAda");
    }

       
    
    public void encender(){
        System.out.println("Encendiendo el " + marca);
    }
    
    public void avanzar(){
        System.out.println("Avanzando el " + marca);
    }
    
    public void apagar(){
        System.out.println("Apagando el "+marca);
    }
}
