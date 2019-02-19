/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dell.com;
import ico.fes.componentes.*;

/**
 *
 * @author Usuario-16
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor mon;
    private Teclado tec;
    private Cpu procesador;
    private Mouse raton;

    public Computadora() {
        this.marca="Dell inc.";
    }

    public Computadora(String marca, String modelo, Monitor mon, Teclado tec, Cpu procesador, Mouse raton) {
        this.marca = marca;
        this.modelo = modelo;
        this.mon = mon;
        this.tec = tec;
        this.procesador = procesador;
        this.raton = raton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getMon() {
        return mon;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public Teclado getTec() {
        return tec;
    }

    public void setTec(Teclado tec) {
        this.tec = tec;
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }
 
    
    
    
}
