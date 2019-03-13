/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.unam;

/**
 *
 * @author usuario-13
 */
public class Cuadrado implements Figura {
    private int lado=0;
        // cree esta clase y enta se le va asignar cuerpo a los metodos

    @Override
    public void decirHola() {
        System.out.println("Hola grupo 2208");
    }

    @Override
    public int calcularArea() {
       return lado*lado;
    }
  
    
}
