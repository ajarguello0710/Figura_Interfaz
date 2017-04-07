
package proyectotriangulografico;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/*******************************************************************************
 * Clase Interfaz de las figuras
 * @author Anggy Arguello - Holmes Ayala
 */
public class InrterfazTriangulo extends JFrame{
    //  Panel que guarda la Imagen y los nombres
    private PanelImagen panelImagen;
    //  Panel de opciones para ingresar los puntos
    private PanelOpciones panelOpciones;
    //  Panel de botones de cambio de color
    private PanelBotones panelBotones;
    //  Panel que imprime la figura
    private PanelTriangulo panelTriangulo;
    
    /***************************************************************************
     * Constructor
     */
    public InrterfazTriangulo() {
        
        configurarVentana();
        
        agregarPaneles();
    }

    /***************************************************************************
     * Metodo que confugura las propiedades de la ventana
     */
    public void configurarVentana(){
        setTitle("Figuras");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
    }
    
    /***************************************************************************
     * Metodo que agrega los paneles a la ventana
     */
    public void agregarPaneles(){
        panelImagen = new PanelImagen();
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(this);
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones(this);
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo ();
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        
        setVisible(true);
    }

    /***************************************************************************
     * Metodo que obtiene el valor del panelTriangulo
     * @return panelTriangulo
     */
    public PanelTriangulo getPanelTriangulo() {
        return panelTriangulo;
    }

    /***************************************************************************
     * Metodo que cambia el valor del panelTriangulo
     * @param panelTriangulo 
     */
    public void setPanelTriangulo(PanelTriangulo panelTriangulo) {
        this.panelTriangulo = panelTriangulo;
    }
}
