
package proyectotriangulografico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/*******************************************************************************
 * Clase PanelTriangulo
 * @author Anggy Arguello - Holmes Ayala
 */
public class PanelTriangulo extends JPanel{
    //  Guarda el color de la linea de la figura
    Color colorLinea = Color.RED;
    //  Guarda el color del fondo de la figura
    Color colorFondo = Color.WHITE;
    
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
        
        planoCartesiano(g);
                        
        Polygon polygon = new Polygon();
        // polygon.addPoint(getHeight() / 2 + 1, getWidth() / 2 + 1);
        polygon.addPoint(d.width / 2 + 5*(-10), d.height /2 + -1*5*(0));
        polygon.addPoint(d.width / 2 + 5*(10), d.height /2 + -1*5*(0));
        polygon.addPoint(d.width /2 + 5*(0), d.height /2 + -1*5*(20));
        
        
        g.setColor(colorLinea);
        g.drawPolygon(polygon);
        g.setColor(colorFondo);
        g.fillPolygon(polygon);
        
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
}
