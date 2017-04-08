
package figurasgeometricasherencia;

/**
 * @author Holmes Ayala - Anggy Arguello
 */
public class Circulo extends Figura {

    /**
     * Constructor de la clase Circulo
     * @param punto1
     * @param punto2 
     */
    public Circulo(Punto punto1, Punto punto2) {
        super(punto1, punto2);
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Calcular area de un circulo
     */
    public void calcularArea(){
        this.area = Math.PI * Math.pow(darLado1(),2);
    }
    
    /**
     * Calcular perimetro de un circulo
     */
    public void calcularPerimetro(){
        this.perimetro = 2 * Math.PI * darLado1();
    }
    
    /**
     * Validar puntos para un circulo
     * @return validar
     */
    public boolean validar(){
        boolean validar = false;
        if(darLado1() != 0){
            validar = true;
        }
        return validar;
    }
    
}
