
import java.awt.*;
import java.awt.event.*;

public class VentanaFlowLayout extends Frame implements ActionListener {
    private Button boton1;
    private TextField texto;
    private Label etiqueta;

    public VentanaFlowLayout(String titulo, int ancho, int alto) {
        super(titulo);
        setSize(ancho, alto);
        setLayout(new FlowLayout());

        boton1 = new Button("Procesar");
        texto = new TextField(15);
        etiqueta = new Label("Resultado aparecerá aquí");

        boton1.addActionListener(this);

        this.add(texto);
        this.add(boton1);
        this.add(etiqueta);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String contenido = texto.getText();
        etiqueta.setText("Dato capturado: " + contenido);
    }

    public static void main(String[] args) {
        new VentanaFlowLayout("Ejemplo FlowLayout", 350, 200);
    }
}