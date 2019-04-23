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
public class Perro {
    private String raza;
    private int edad;
    private char genero; // M : Macho y H para Hembra

    public Perro() {
    }

    public Perro(String raza, int edad, char genero) {
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    
}



