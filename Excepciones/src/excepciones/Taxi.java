/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario-16
 */
public class Taxi extends Automovil{
    private int numero;
    private float ganancias;

    public Taxi() {
    }

    public Taxi(int numero, float ganancias, String marca) {
        super(marca);
        this.numero = numero;
        this.ganancias = ganancias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public float incrementarGanancia(){
        float nuevaGanancia=0.0f;
        float ingreso=Float.valueOf(JOptionPane.showInputDialog("Ing. monto"));
        this.ganancias += ingreso; 
        return this.ganancias;
    }
}
