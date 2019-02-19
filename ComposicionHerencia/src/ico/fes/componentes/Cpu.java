/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Usuario-16
 */
public class Cpu {
    private String marca;
    private String modelo;
    private float velocidadProcesador;

    public Cpu() {
    }

    public Cpu(String marca, String modelo, float velocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadProcesador(float velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidadProcesador() {
        return velocidadProcesador;
    }
    
    
    
    
    
}
