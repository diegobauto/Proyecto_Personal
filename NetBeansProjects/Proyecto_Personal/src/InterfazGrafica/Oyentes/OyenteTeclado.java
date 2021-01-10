package InterfazGrafica.Oyentes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class OyenteTeclado extends JFrame{
    JPanel panel;
    JButton boton;
    JTextArea areaTexto;
    JTextField caja;
    public OyenteTeclado() {
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

    private void crearCajaTexto(){
        caja = new JTextField();
        caja.setBounds(30, 20, 150, 30);
        caja.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1, true));
        panel.add(caja);

        eventoTeclado();
    }

    private void eventoTeclado(){
        KeyListener teclado = new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                //Al mantener presionada una tecla, pero solo letras, numeros y simbolos
                //areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Al mantener presionada una tecla
                //areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //Al mantener presionada una tecla, y soltarla
                //areaTexto.append("keyReleased\n");
                if (e.getKeyChar() == 'W' || e.getKeyChar() == 'w') {
                    areaTexto.append("Letra W\n");
                }
                if (e.getKeyChar() == 'S' || e.getKeyChar() == 's') {
                    areaTexto.append("Letra S\n");
                }
                if (e.getKeyChar() == '\n') {
                    areaTexto.append("ENTER\n");
                }
                if (e.getKeyChar() == ' ') {
                    areaTexto.append("SPACE\n");
                }
            }
        };
        caja.addKeyListener(teclado);
    }

    private void crearTextArea() {
        areaTexto = new JTextArea();
        areaTexto.setBounds(200, 10, 250, 250);
        areaTexto.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1, true));
        panel.add(areaTexto);

        /*JScrollPane scroll = new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,1);
        scroll.setBounds(230, 30, 200, 300);
        panel.add(scroll);*/
    }

    private void iniciarComponentes(){
        crearPanel();
        crearCajaTexto();
        crearTextArea();
    }
}
