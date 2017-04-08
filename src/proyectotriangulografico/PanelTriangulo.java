
package proyectotriangulografico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
import figurasgeometricasherencia.Punto;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Ellipse;

/*******************************************************************************
 * Clase PanelTriangulo
 * @author Anggy Arguello - Holmes Ayala
 */
public class PanelTriangulo extends JPanel{
    //  Guarda el color de la linea de la figura
    private Color colorLinea = Color.RED;
    //  Guarda el color del fondo de la figura
    private Color colorFondo = Color.WHITE;
    //  Guarda las coordenadas del punto 1
    private Punto punto1 = new Punto(0, 0);
    //  Guarda las coordenadas del punto 2
    private Punto punto2 = new Punto(0, 0);
    //  Guarda las coordenadas del punto 3
    private Punto punto3 = new Punto(0, 0);
    //  Guarda las coordenadas del punto 4
    private Punto punto4 = new Punto(0, 0);
    //  Guarda el tipo de figura
    private short tipoFigura = 0;
    //  Guarda el radio del circulo
    private double radio;
    
    /***************************************************************************
     * Metodo Constructor
     */
    public PanelTriangulo () {
        setBackground(Color.GRAY);
        Dimension d = getSize();
        System.out.print(d.getHeight() + "." + d.getWidth());       
    }
    
    /***************************************************************************
     * Metodo que esta a la espera de ser llamado para
     * refrescar el panel o pintar otra figura
     * @param g 
     */
    @Override
    protected void paintComponent (Graphics g) {
        Dimension d = getSize();
        super.paintComponent(g);
        Graphics2D graficar = (Graphics2D)g;
        
        int punto1x = (int) (d.width / 2 + 5*(punto1.getX()));
        int punto1y = (int) (d.height /2 + -1*5*(punto1.getY()));
        int punto2x = (int) (d.width / 2 + 5*(punto2.getX()));
        int punto2y = (int) (d.height /2 + -1*5*(punto2.getY()));
        int punto3x = (int) (d.width / 2 + 5*(punto3.getX()));
        int punto3y = (int) (d.height /2 + -1*5*(punto3.getY()));
        int punto4x = (int) (d.width / 2 + 5*(punto4.getX()));
        int punto4y = (int) (d.height /2 + -1*5*(punto4.getY()));
        
        Polygon polygon = new Polygon();
        
        if(tipoFigura == 1 || tipoFigura == 2){
            polygon.addPoint(punto1x, punto1y);
            polygon.addPoint(punto2x, punto2y);
            polygon.addPoint(punto3x, punto3y);
        }
        if(tipoFigura == 2){
            polygon.addPoint(punto4x, punto4y);
        }
        if(tipoFigura == 1 || tipoFigura == 2){
            g.setColor(colorFondo);
            g.fillPolygon(polygon);
            g.setColor(colorLinea);
            g.drawPolygon(polygon);
        }
        if(tipoFigura == 3){
            Ellipse2D elipse = new Ellipse2D.Double();
            graficar.setColor(colorFondo);
            System.out.println("Pinta elipse");
            graficar.fill(elipse);
            graficar.setColor(colorLinea);
            graficar.draw(elipse);
        }
        planoCartesiano(g);
    }
    
    /***************************************************************************
     * Metodo que imprime el plano cartesiano
     * @param g 
     */
    public void planoCartesiano(Graphics g){
        Dimension d = getSize();
        //  Plano vertical
        Polygon vertical = new Polygon();
        vertical.addPoint(d.width / 2, 0);
        vertical.addPoint(d.width / 2, d.height);
        g.setColor(Color.BLACK);
        g.drawPolygon(vertical);
        //  Plano horizontal
        Polygon horizontal = new Polygon();
        horizontal.addPoint(0 , d.height / 2);
        horizontal.addPoint(d.width , d.height / 2);
        g.setColor(Color.BLACK);
        g.drawPolygon(horizontal);
    }

    /***************************************************************************
     * Metodo que obtiene el color de la linea
     * @return coloLinea
     */
    public Color getColorLinea () {
        return colorLinea;
    }

    /***************************************************************************
     * Metodo que cambia el color de la linea
     * @param colorLinea 
     */
    public void setColorLinea (Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    /***************************************************************************
     * Metodo que obtiene el color del fondo
     * @return colorFondo
     */
    public Color getColorFondo () {
        return colorFondo;
    }

    /***************************************************************************
     * Metodo que cambia el color del fondo
     * @param colorFondo 
     */
    public void setColorFondo (Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    /***************************************************************************
     * Metodo que obtiene el punto1
     * @return punto1
     */
    public Punto getPunto1() {
        return punto1;
    }

    /***************************************************************************
     * Metodo que cambia el punto1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /***************************************************************************
     * Metodo que obtiene el punto2
     * @return punto2
     */
    public Punto getPunto2() {
        return punto2;
    }

    /***************************************************************************
     * Metodo que cambia el punto2
     * @param punto2 
     */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /***************************************************************************
     * Metodo que obtiene el punto3
     * @return punto3
     */
    public Punto getPunto3() {
        return punto3;
    }
    
    /***************************************************************************
     * Metodo que cambia el punto3
     * @param punto3 
     */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    /***************************************************************************
     * Metodo que obtiene el punto4
     * @return punto4
     */
    public Punto getPunto4() {
        return punto4;
    }
    
    /***************************************************************************
     * Metodo que cambia el punto4
     * @param punto4 
     */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
    
    /***************************************************************************
     * Metodo que obtiene el tipo de figura
     * @return tipoFigura
     */
    public short getTipoFigura() {
        return tipoFigura;
    }
    
    /***************************************************************************
     * Metodo que cambia el tipo de figura
     * @param tipoFigura 
     */
    public void setTipoFigura(short tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    /***************************************************************************
     * Metodo que obtiene el radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /***************************************************************************
     * Metodo que cambia el radio
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
