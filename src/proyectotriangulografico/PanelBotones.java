
package proyectotriangulografico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*******************************************************************************
 * Clase PanelBotones
 * @author Anggy Arguello - Holmes Ayala
 */
public class PanelBotones extends JPanel implements ActionListener{
    //  Boton para cambiar el color de linea
    private JButton btnColorLinea;
    //  Boton para cambiar el color de fondo
    private JButton btnColorFondo;
    //  Etiqueta que imprime el area
    private JLabel etiquetaArea;
    //  Etiqueta que imprime el perimetro
    private JLabel etiquetaPerimetro;
    //  Etiqueta que imprime la altura
    private JLabel etiquetaAltura;
    //  Guarda la interfaz
    private InrterfazTriangulo interfaz;
    
    /***************************************************************************
     * Constructor
     * @param interfaz 
     */
    public PanelBotones(InrterfazTriangulo interfaz) {
        //  Configuracion de panel
        this.interfaz = interfaz;
        setLayout(new GridLayout(5, 1));
        setBackground(Color.WHITE);
        
        agregarBoton();
        agregarEtiqueta();
    }
    
    /***************************************************************************
     * Metodo que agrega los botones al panel
     */
    public void agregarBoton(){
        btnColorLinea = new JButton("Cambiar Lineas");
        btnColorLinea.setActionCommand("COLOR_LINEA");
        btnColorLinea.addActionListener(this);
        add(btnColorLinea);
        
        btnColorFondo = new JButton("Cambiar Fondo");
        btnColorFondo.setActionCommand("COLOR_FONDO");
        btnColorFondo.addActionListener(this);
        add(btnColorFondo);
    }
    
    /***************************************************************************
     * Metodo que agrega las etiquetas al panel
     */
    public void agregarEtiqueta(){
        etiquetaArea = new JLabel("Area: ");
        add(etiquetaArea);
        
        etiquetaPerimetro = new JLabel("Perimetro: ");
        add(etiquetaPerimetro);

        etiquetaAltura = new JLabel("Altura: ");
        add(etiquetaAltura);
    }
    
    /***************************************************************************
     * Metodo que esta a la espera del boton presionado
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DialogoCambiarColor dialogoCambiarColor = new DialogoCambiarColor(interfaz);
        switch (e.getActionCommand()) {
            case "COLOR_LINEA":
                System.out.println("Imprimio boton color linea");
                dialogoCambiarColor.setTipo((byte) 1);
                break;
            case "COLOR_FONDO":
                System.out.println("Imprimio boton color fondo");
                dialogoCambiarColor.setTipo((byte) 2);
                break;
        }
        dialogoCambiarColor.mostrar();
        interfaz.getPanelTriangulo().repaint();
    }
    
}
