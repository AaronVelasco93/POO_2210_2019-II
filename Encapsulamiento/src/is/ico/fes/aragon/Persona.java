/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.aragon;

/**
 *
 * @author Usuario-16
 */
public class Persona {

    private String nombre;
    private float estatura;

    public Persona() {

    }

    public void setNombre(String n) {
        if (n.length() < 100) {
            this.nombre = n;
        } else {
            System.out.println("Error");
        }
    }
    
    public void setEstatura(float e){
        if(e<3.0f){
            this.estatura=e;
        }else{
            System.out.println("Estatura fuera de rango");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public float getEstatura() {
        return estatura;
    }
    



    
}
