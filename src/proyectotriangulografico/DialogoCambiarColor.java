
package proyectotriangulografico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*******************************************************************************
 * Clase que cambia el color de fondo o de linea de la figura
 * @author Anggy Arguello - Holmes Ayala
 */
public class DialogoCambiarColor extends JDialog implements ActionListener{
    //  Atributo Color que cambia dependiendo de los botones
    private Color colorGeneral;
    //  Guarda el tipo de llamado 1-cambiar linea, 2-cambiar fondo
    private byte tipo = 0;
    //  Boton que cambia el color a amarillo
    private JButton btnAmarillo;
    //  Boton que cambia el color a azul
    private JButton btnAzul;
    //  Boton que cambia el color a verde
    private JButton btnVerde;
    //  Boton que cambia el color a rojo
    private JButton btnRojo;
    //  Boton que cambia el color a naranja
    private JButton btnNaranja;
    //  Boton que cambia el color a rosado
    private JButton btnRosado;
    //  Boton que cambia el color a magenta
    private JButton btnMagenta;
    //  Boton que cambia el color a cyan
    private JButton btnCyan;
    //  Guarda la Interfaz
    private InrterfazTriangulo interfaz;
    
    /***************************************************************************
     * Constructor
     * @param interfaz 
     */
    public DialogoCambiarColor(InrterfazTriangulo interfaz) {
        this.interfaz = interfaz;
        configuracionPanel();
        agregarBoton();
    }
    
    /***************************************************************************
     * Metodo que configura el panel
     */
    public void configuracionPanel(){
        //  Cambiar color de fondo del panel
        setBackground(Color.WHITE);
        //  Tamaño de la ventana
        setSize(300, 300);
        //  Localizacion en pantalla
        setLocationRelativeTo(null);
        //  Evitar que redimencionen la ventana
        setResizable(false);
        //  Que hacer al cerrar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //  Configurar disposicion de botones en la ventana
        setLayout(new GridLayout(4, 2));
    }
    
    /***************************************************************************
     * Metodo que Agrega los botones al panel
     */
    public void agregarBoton(){
        btnAmarillo = new JButton("Amarillo");
        btnAmarillo.setActionCommand("amarillo");
        btnAmarillo.addActionListener(this);
        add(btnAmarillo);
        btnAzul = new JButton("Azul");
        btnAzul.setActionCommand("azul");
        btnAzul.addActionListener(this);
        add(btnAzul);
        btnVerde = new JButton("Verde");
        btnVerde.setActionCommand("verde");
        btnVerde.addActionListener(this);
        add(btnVerde);
        btnRojo = new JButton("Rojo");
        btnRojo.setActionCommand("rojo");
        btnRojo.addActionListener(this);
        add(btnRojo);
        btnNaranja = new JButton("Naranja");
        btnNaranja.setActionCommand("naranja");
        btnNaranja.addActionListener(this);
        add(btnNaranja);
        btnRosado = new JButton("Rosado");
        btnRosado.setActionCommand("rosado");
        btnRosado.addActionListener(this);
        add(btnRosado);
        btnMagenta = new JButton("Magenta");
        btnMagenta.setActionCommand("magenta");
        btnMagenta.addActionListener(this);
        add(btnMagenta);
        btnCyan = new JButton("Cyan");
        btnCyan.setActionCommand("cyan");
        btnCyan.addActionListener(this);
        add(btnCyan);
    }
    
    /***************************************************************************
     * Metodo que esta a la espera por si se presiona un boton y cambia el valor
     * del color general
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "amarillo":    colorGeneral = Color.YELLOW;
                break;
            case "azul":        colorGeneral = Color.BLUE;
                break;
            case "verde":       colorGeneral = Color.GREEN;
                break;
            case "rojo":        colorGeneral = Color.RED;
                break;
            case "naranja":     colorGeneral = Color.ORANGE;
                break;
            case "rosado":      colorGeneral = Color.PINK;
                break;
            case "magenta":     colorGeneral = Color.MAGENTA;
                break;
            case "cyan":        colorGeneral = Color.CYAN;
                break;
        }
        cambiarColor();
    }
    
    /***************************************************************************
     * Metodo que dependiendo el tipo de solicitud hace el cambio de color
     */
    public void cambiarColor(){
        if(tipo == 1){
            interfaz.getPanelTriangulo().setColorLinea(colorGeneral);
        }
        else{
            interfaz.getPanelTriangulo().setColorFondo(colorGeneral);
        }
        interfaz.getPanelTriangulo().repaint();
    }
    
    /***************************************************************************
     * Metodo que Muestra la ventana y cambia el titulo
     * dependiendo el tipo de solicitud
     */
    public void mostrar(){
        setVisible(true);
        if(tipo == 1){
            setTitle("Cambiar Color de Linea");
        }
        else{
            setTitle("Cambiar Color de Fondo");
        }
    }

    /***************************************************************************
     * Obtener el valor del tipo de solicitud
     * @return tipo
     */
    public byte getTipo() {
        return tipo;
    }

    /***************************************************************************
     * Modificar el valor del tipo de solicitud
     * @param tipo 
     */
    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
}
