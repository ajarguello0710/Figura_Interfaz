
package figurasgeometricasherencia;
import java.util.Scanner;
/**
 *
 * @author Cuchurrumi
 */
public class FigurasGeometricasHerencia {
    //  Objeto de la clase Scanner
    Scanner leer = new Scanner(System.in);
    //  Objeto de la clase Triangulo
    private Triangulo triangulo;
    //  Objeto de la clase Cuadrado
    private Cuadrado cuadrado;
    //  Objeto de la Clase Circulo
    private Circulo circulo;
    
    /**
     * Constructor de la clase FigurasGeometricasHerencia
     */
    public FigurasGeometricasHerencia() {
        menu();
    }
    
    /**
     * Menu para escojer la figura a procesar
     */
    private void menu(){
        byte opcion = 0;
        while(opcion != 4){
            System.out.println("Menu de Figuras");
            System.out.println("1- Triangulo");
            System.out.println("2- Cuadrado");
            System.out.println("3- Circulo");
            System.out.println("4- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            switch(opcion){
                case 1:
                    iniciarTriangulo();
                    break;
                case 2:
                    iniciarCuadrado();
                    break;
                case 3:
                    iniciarCirculo();
                    break;
            }
        }
    }
    
    /**
     * Metodo que inicia las operaciones con triangulo
     */
    private void iniciarTriangulo(){
        solicitarPuntosTriangulo();
        menuTriangulo();
    }
    
    /**
     * Metodo para Solicitar y validar los Puntos del triangulo
     */
    private void solicitarPuntosTriangulo(){
        boolean validar = false;
        while(validar == false){
            System.out.print("Punto 1 X: ");
        double x = leer.nextDouble();
        System.out.print("Punto 1 Y: ");
        double y = leer.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.print("Punto 2 X: ");
        x = leer.nextDouble();
        System.out.print("Punto 2 Y: ");
        y = leer.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.print("Punto 3 X: ");
        x = leer.nextDouble();
        System.out.print("Punto 3 Y: ");
        y = leer.nextDouble();
        Punto punto3 = new Punto(x, y);
        triangulo = new Triangulo(punto1, punto2, punto3);  // Le enviamos los puntos al objeto triangulo
        validar = triangulo.validarPuntos();    // valida si los puntos son validos
        if(validar == false)
            System.out.println("Puntos NO validos para un triangulo!");
        }
    }
    
    /**
     * Menu de opciones para un triangulo
     */
    private void menuTriangulo(){
        byte opcion = 0;
        while(opcion != 4){
            System.out.println("Menu de opciones para un Triangulo");
            System.out.println("1- Perimetro");
            System.out.println("2- Area");
            System.out.println("3- Tipo de triangulo por sus lados");
            System.out.println("4- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            imprimirResultadosTriangulo(opcion);
        }
    }
    
    /**
     * Imprime el resultado de la opcion elegida
     * @param opcion 
     */
    private void imprimirResultadosTriangulo(byte opcion){
        switch(opcion){
            case 1:
                triangulo.calcularPerimetro();
                System.out.println("Peimetro Triangulo: "+triangulo.getPerimetro());
                break;
            case 2:
                triangulo.calcularArea();
                System.out.println("Area Triangulo: "+triangulo.getArea());
                break;
            case 3:
                System.out.println("Tipo de Triangulo: "+triangulo.tipoTriangulo());
                break;
        }
    }
    
    /**
     * Inicia las operaciones con un cuadrado o triangulo
     */
    private void iniciarCuadrado(){
        solicitarPuntosCuadrado();
        menuCuadrado();
    }
    
    /**
     * Metodo que solicita los puntos del cuadrado o rectangulo
     */
    private void solicitarPuntosCuadrado(){
        boolean validar = false;
        while(validar == false){
            System.out.print("Punto 1 X: ");
            double x = leer.nextDouble();
            System.out.print("Punto 1 Y: ");
            double y = leer.nextDouble();
            Punto punto1 = new Punto(x, y);
            System.out.print("Punto 2 X: ");
            x = leer.nextDouble();
            System.out.print("Punto 2 Y: ");
            y = leer.nextDouble();
            Punto punto2 = new Punto(x, y);
            System.out.print("Punto 3 X: ");
            x = leer.nextDouble();
            System.out.print("Punto 3 Y: ");
            y = leer.nextDouble();
            Punto punto3 = new Punto(x, y);
            System.out.print("Punto 4 X: ");
            x = leer.nextDouble();
            System.out.print("Punto 4 Y: ");
            y = leer.nextDouble();
            Punto punto4 = new Punto(x, y);
            cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);  // Le enviamos los puntos al objeto Cuadrado
            validar = cuadrado.validarPuntos();    // valida si los puntos son validos
            if(validar == false)
                System.out.println("Puntos NO validos para un cuadrado o rectangulo!");
        }
    }
    
    /**
     * Menu de opciones para un cuadrado o rectangulo
     */
    private void menuCuadrado(){
        byte opcion = 0;
        while(opcion != 4){
            System.out.println("Menu de opciones para un Cuadrado o Rectangulo");
            System.out.println("1- Perimetro");
            System.out.println("2- Area");
            System.out.println("3- Tipo, cuandrado o rectangulo");
            System.out.println("4- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            imprimirResultadosCuadrado(opcion);
        }
    }
    
    /**
     * Imprime los resultados de la opcion escojida
     * @param opcion 
     */
    private void imprimirResultadosCuadrado(byte opcion){
        switch(opcion){
            case 1:
                cuadrado.calcularPerimetro();
                System.out.println("Peimetro Cuadrado: "+cuadrado.getPerimetro());
                break;
            case 2:
                cuadrado.calcularArea();
                System.out.println("Area Cuadrado: "+cuadrado.getArea());
                break;
            case 3:
                System.out.println("Tipo : "+cuadrado.tipo());
                break;
        }
    }
    
    /**
     * Inicia las opecaciones para un circulo
     */
    private void iniciarCirculo(){
        solicitarPuntosCirculo();
        menuCirculo();
    }
    
    /**
     * Solicita los puntos para un circulo
     */
    private void solicitarPuntosCirculo(){
        boolean validar = false;
        while(validar == false){
        System.out.print("Punto 1 X: ");
        double x = leer.nextDouble();
        System.out.print("Punto 1 Y: ");
        double y = leer.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.print("Punto 2 X: ");
        x = leer.nextDouble();
        System.out.print("Punto 2 Y: ");
        y = leer.nextDouble();
        System.out.println("Hola mundo");
        Punto punto2 = new Punto(x, y);
        circulo = new Circulo(punto1, punto2);  // Le enviamos los puntos al objeto Circulo
        validar = circulo.validar();    // valida si los puntos son validos
        if(validar == false)
            System.out.println("Puntos NO validos para un circulo!");
        }
    }
    
    /**
     * Imprime los resultados de la opcion para un circulo
     */
    private void menuCirculo(){
        byte opcion = 0;
        while(opcion != 4){
            System.out.println("Menu de opciones para un Circulo");
            System.out.println("1- Perimetro");
            System.out.println("2- Area");
            System.out.println("3- Radio");
            System.out.println("4- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextByte();
            imprimirResultadosCirculo(opcion);
        }
    }
    
    /**
     * Imprime los resultados de la opcion para un circulo
     * @param opcion 
     */
    private void imprimirResultadosCirculo(byte opcion){
         switch(opcion){
            case 1:
                circulo.calcularPerimetro();
                System.out.println("Peimetro Circulo: "+circulo.getPerimetro());
                break;
            case 2:
                circulo.calcularArea();
                System.out.println("Area Circulo: "+circulo.getArea());
                break;
            case 3:
                System.out.println("Radio : "+circulo.darLado1());
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FigurasGeometricasHerencia figurasGeometricasHerencia = new FigurasGeometricasHerencia();
    }
    
}
