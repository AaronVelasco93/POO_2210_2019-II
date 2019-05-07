/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.ico.fes.modelo;

/**
 *
 * @author Usuario-16
 */
public class Alumno {
   private String nombre;
   private String paterno;
   private String materno;
   private int edad;
   private String numCta;
   private String carrera;
   private String turno;
   private float promedio;
   private int semestre;

    public Alumno() {
    }

    public Alumno(String nombre, String paterno, String materno, int edad, String numCta, String carrera, String turno, float promedio, int semestre) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.numCta = numCta;
        this.carrera = carrera;
        this.turno = turno;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
   
   
   
}
