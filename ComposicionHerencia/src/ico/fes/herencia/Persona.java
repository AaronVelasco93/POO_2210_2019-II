/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Usuario-16
 */
public class Persona {
    private float estatura;
    private String nombre;
    private float peso;
    private int edad;

    public Persona() {
    }

    public Persona(float estatura, String nombre, float peso, int edad) {
        this.estatura = estatura;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void caminar(){
            System.out.println("caminando");
    }
    public void dormir(){
            System.out.println("durmiendo");
    }
    
    
}
