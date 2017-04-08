
package proyectotriangulografico;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Clase panel de opciones
 * @author Anggy Arguello - Holmes Ayala
 */
public class PanelOpciones extends JPanel implements ActionListener{
    //  Boton para ingresar los puntos del triangulo
    private JButton btnPuntosTriangulo;
    //  Boton para ingresar los puntos del cuadrado
    private JButton btnPuntosCuadrado;
    //  Boton para ingresar los puntos del circulo
    private JButton btnPuntosCirculo;   
    //  Guarda la interfaz
    private InrterfazTriangulo interfaz;
    
    /**
     * Constructor
     */
    public PanelOpciones(InrterfazTriangulo interfaz) { 
        this.interfaz = interfaz;
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Ingresar Puntos"));
        setLayout(new GridLayout(1, 3));
        
        btnPuntosTriangulo = new JButton("Triangulo");
        btnPuntosTriangulo.setActionCommand("triangulo");
        btnPuntosTriangulo.addActionListener(this);
        add(btnPuntosTriangulo);
        
        btnPuntosCuadrado = new JButton("Cuadrado");
        btnPuntosCuadrado.setActionCommand("cuadrado");
        btnPuntosCuadrado.addActionListener(this);
        add(btnPuntosCuadrado);
        
        btnPuntosCirculo = new JButton("Circulo");
        btnPuntosCirculo.setActionCommand("circulo");
        btnPuntosCirculo.addActionListener(this);
        add(btnPuntosCirculo);
    }

    /**
     * Metodo que esta a la espera de un evento
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DialogoPuntos dialogoPuntos = new DialogoPuntos(interfaz);
        int tipo = 0;
        switch (e.getActionCommand()) {
            case "triangulo":
                System.out.println("Puntos Triangulo");
                tipo = 1;
                
                break;
            case "cuadrado":
                System.out.println("Puntos Cuadrado");
                tipo = 2;
                
                break;
            case "circulo":
                System.out.println("Puntos Circulo");
                tipo = 3;
                
                break;
        }
        dialogoPuntos.setTipo(tipo);
    }
}
