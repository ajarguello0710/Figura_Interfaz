package proyectotriangulografico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import figurasgeometricasherencia.*;

/**
 *
 * @author Anggy Arguello - Holmes Ayala
 */
public class DialogoPuntos extends JDialog implements ActionListener{
    
    private JButton btnAceptar;
    
    private JTextField campoX1;
        
    private JTextField campoY1;

    private JTextField campoX2;

    private JTextField campoY2;

    private JTextField campoX3;

    private JTextField campoY3;

    private JTextField campoX4;

    private JTextField campoY4;

    private JLabel Punto1 = new JLabel("Punto1");

    private JLabel Punto2 = new JLabel("Punto2");

    private JLabel Punto3 = new JLabel("Punto3");

    private JLabel Punto4 = new JLabel("Punto4");

    private String campo1X;

    private String campo1Y;

    private String campo2X;

    private String campo2Y;

    private String campo3X;

    private String campo3Y;

    private String campo4X;

    private String campo4Y;
    
    private int tipo;
    
    //private PanelOpciones panelOpciones;
    
    private InrterfazTriangulo interfaz;
    
    public DialogoPuntos(InrterfazTriangulo interfaz) {
        this.interfaz = interfaz;
        setBackground(Color.WHITE);
        //Definimos sus dimensiones
        setTitle("Ingresar puntosXY");
        setBounds(15, 15, 350, 200);
        setLocationRelativeTo(null);
        
        setLayout(new GridLayout(3, 3));
        crearCuadros();
        
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        setVisible(true);
        
    }
    
    public void crearCuadros() {
        add(Punto1);
        campoX1 = new JTextField(10);
        add(campoX1);
        campoY1 = new JTextField(10);
        add(campoY1);

        add(Punto2);
        campoX2 = new JTextField(10);
        add(campoX2);
        campoY2 = new JTextField(10);
        add(campoY2);
        
        //add(Punto3);
        campoX3 = new JTextField(10);
        //add(campoX3);
        campoY3 = new JTextField(10);
        //add(campoY3);
        
        //add(Punto4);
        campoX4 = new JTextField(10);
        //add(campoX4);
        campoY4 = new JTextField(10);
        //add(campoY4);
    }
        
    public void recibeTipo(){
        System.out.println(tipo);
        if((tipo == 1) || (tipo == 2)) {
            setLayout(new GridLayout(4, 3));
            add(Punto3);
            add(campoX3);
            add(campoY3);
        }
        if(tipo == 2) {
            setLayout(new GridLayout(5, 3));
            add(Punto4);
            add(campoX4);
            add(campoY4);
        }
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setActionCommand("Aceptar");
        btnAceptar.addActionListener(this);
        add(btnAceptar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Aceptar") {
            campo1X = campoX1.getText();
            campo1Y = campoY1.getText();
            campo2X = campoX2.getText();
            campo2Y = campoY2.getText();
            campo3X = campoX3.getText();
            campo3Y = campoY3.getText();
            campo4X = campoX4.getText();
            campo4Y = campoY4.getText();
            System.out.println("Asigne Valores");
            //setVisible(false);
        }
        if(tipo == 1){
            
            iniciarTriangulo();
        }
        else if(tipo == 2){
            iniciarCuadrado();
        }
        else{
            iniciarCirculo();
        }
    }
    
    public void iniciarTriangulo(){
        double x = Double.parseDouble(campo1X);
        double y = Double.parseDouble(campo1Y);
        Punto punto1 = new Punto(x, y);
        x = Double.parseDouble(campo2X);
        y = Double.parseDouble(campo2Y);
        Punto punto2 = new Punto(x, y);
        x = Double.parseDouble(campo3X);
        y = Double.parseDouble(campo3Y);
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        boolean validar = triangulo.validarPuntos();
        if(validar != false){
            interfaz.getPanelTriangulo().setPunto1(punto1);
            interfaz.getPanelTriangulo().setPunto2(punto2);
            interfaz.getPanelTriangulo().setPunto3(punto3);
            interfaz.getPanelTriangulo().setTipoFigura((short)1);
            interfaz.getPanelTriangulo().repaint();
            setVisible(false);
        }
        else{
            
        }
    }
    
    public void iniciarCuadrado(){
        double x = Double.parseDouble(campo1X);
        double y = Double.parseDouble(campo1Y);
        Punto punto1 = new Punto(x, y);
        x = Double.parseDouble(campo2X);
        y = Double.parseDouble(campo2Y);
        Punto punto2 = new Punto(x, y);
        x = Double.parseDouble(campo3X);
        y = Double.parseDouble(campo3Y);
        Punto punto3 = new Punto(x, y);
        x = Double.parseDouble(campo4X);
        y = Double.parseDouble(campo4Y);
        Punto punto4 = new Punto(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        boolean validar = cuadrado.validarPuntos();
        if(validar != false){
            interfaz.getPanelTriangulo().setPunto1(punto1);
            interfaz.getPanelTriangulo().setPunto2(punto2);
            interfaz.getPanelTriangulo().setPunto3(punto3);
            interfaz.getPanelTriangulo().setPunto4(punto4);
            interfaz.getPanelTriangulo().setTipoFigura((short)2);
            interfaz.getPanelTriangulo().repaint();
            setVisible(false);
        }
    }

    public void iniciarCirculo(){
        
    }
    
    public String getCampo1X() {
        return campo1X;
    }

    public void setCampo1X(String campo1X) {
        this.campo1X = campo1X;
    }

    public String getCampo1Y() {
        return campo1Y;
    }

    public void setCampo1Y(String campo1Y) {
        this.campo1Y = campo1Y;
    }

    public String getCampo2X() {
        return campo2X;
    }

    public void setCampo2X(String campo2X) {
        this.campo2X = campo2X;
    }

    public String getCampo2Y() {
        return campo2Y;
    }

    public void setCampo2Y(String campo2Y) {
        this.campo2Y = campo2Y;
    }

    public String getCampo3X() {
        return campo3X;
    }

    public void setCampo3X(String campo3X) {
        this.campo3X = campo3X;
    }

    public String getCampo3Y() {
        return campo3Y;
    }

    public void setCampo3Y(String campo3Y) {
        this.campo3Y = campo3Y;
    }

    public String getCampo4X() {
        return campo4X;
    }

    public void setCampo4X(String campo4X) {
        this.campo4X = campo4X;
    }

    public String getCampo4Y() {
        return campo4Y;
    }

    public void setCampo4Y(String campo4Y) {
        this.campo4Y = campo4Y;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        recibeTipo();
    }
    
}
