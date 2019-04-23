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
public class Cliente {
    private int numCuenta;
    private String nombre;
    private String paterno;
    private String materno;
    private float balance;

    public Cliente() {
    }

    public Cliente(int numCuenta, String nombre, String paterno, String materno, float balance) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.balance = balance;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
  
}
