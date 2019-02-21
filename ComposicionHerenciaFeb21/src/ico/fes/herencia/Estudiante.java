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
public class Estudiante extends Persona {
    private int semestre;
    private String numeroCuenta;
    private float creditos;
    private String Carrera;
    
    public Estudiante() {
       
    }

    public Estudiante(int semestre, String numeroCuenta, float creditos, String Carrera) {
        this.semestre = semestre;
        this.numeroCuenta = numeroCuenta;
        this.creditos = creditos;
        this.Carrera = Carrera;
    }

    public Estudiante(int semestre, String numeroCuenta, float creditos, String Carrera, float estatura, String nombre, float peso, int edad) {
        super(estatura, nombre, peso, edad);
        this.semestre = semestre;
        this.numeroCuenta = numeroCuenta;
        this.creditos = creditos;
        this.Carrera = Carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    public void hacerTarea(){
        System.out.println(super.getNombre()+
                " esta haciendo tarea, no lo invitena fiestas");
    }
    
    public void tomarClase(){
        System.out.println(super.getNombre() + "Esta en clase");
    }
    
    public void estudiar(){
        System.out.println(super.getNombre() + " Esta estudiando en el Shine!!!");
    }
    
 
}
