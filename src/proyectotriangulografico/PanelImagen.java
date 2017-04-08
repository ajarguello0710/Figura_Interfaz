
package proyectotriangulografico;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Clase PanelImagen
 * @author Anggy Arguello - Holmes Ayala
 */
public class PanelImagen extends JPanel{
    // Guarda la imagen que se desea
    private JLabel imagen;
    // Guarda los nombres
    private JLabel Nombre1 = new JLabel("Holmes Ayala         -         Anggy Arguello");
    
    /**
     * Constructor
     */
    public PanelImagen() {
        
        setBackground(Color.WHITE);
        
        setLayout(new GridLayout(1, 2));
        
        
        ImageIcon icon = new ImageIcon("imagenes/logo.JPG");        
        imagen = new JLabel();
        imagen.setIcon(icon);
        add(imagen);
        add(Nombre1);
        setBackground(Color.WHITE);
        setBorder(new LineBorder(Color.GRAY));
    }
    
}
