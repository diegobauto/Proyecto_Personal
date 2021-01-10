package InterfazGrafica.Oyentes;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class OyenteRaton extends JFrame {
    JPanel panel;
    JButton boton;
    JTextArea areaTexto;

    public OyenteRaton() {
        setTitle("Eventos");
        setBounds(50, 50, 500, 500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void crearPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }

    private void crearTextArea() {
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 10, 450, 200);
        panel.add(areaTexto);
    }

    private void crearBoton() {
        boton = new JButton();
        boton.setBounds(200, 250, 80, 40);
        boton.setText("Enviar");
        panel.add(boton);

        eventoOyenteRaton();
    }

    private void eventoOyenteRaton() {
        // Agregar oyente de raton
        MouseListener oyenteRaton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //Cada vez que se presione y se suelte dentro del botón
                areaTexto.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //Solamente cuando presiono
                areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //Cuando presiono y soltar afuera o adentro
                areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //Solamente con pasar el cursor en el botón sin presionar
                areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //Cuando salgo del boton sin presionar
                areaTexto.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteRaton);
    }

    private void iniciarComponentes(){
        crearPanel();
        crearTextArea();
        crearBoton();
    }
}
