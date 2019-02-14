
package is.ico.fes.aragon.unam;

/**
 * Esta clase es para ejemplificar como se implementa sobrecarga de
 * métodos en Java y la POO.
 * Bla bla.... Bla....
 * @author Usuario-16
 */
public class Aritmetica {
    private int operando1;
    private int operando2;
    private int resultado;

    public Aritmetica() {
    }
    
    public Aritmetica(int op1, int op2){
        this.operando1=op1;
        this.operando2=op2;
    }
    

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    /**
     * Método que suma los atributos de clase
     * y establece el resultado en la variable interna resultado
     * 
     */
    public void sumar(){
        this.resultado=this.operando1+this.operando2;
    }
    
    /**
     *  Metodo que suma los valores que se le envian etc.
     * @param x es el valor entero del primer dato a sumar
     * @param y es el segundo dato a sumar
     * 
     */
    public void sumar(int x, int y){
        this.resultado=x+y;
    }
    
    public int sumar(String mensaje){
        System.out.print(mensaje);
        return this.operando1+this.operando2;
    }
    
    
}
