package InterfazGrafica.Oyentes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OyenteAccion extends JFrame{
    JPanel panel;
    JTextField cajaNombre;

    public OyenteAccion(){
        setTitle("Eventos");
        setBounds(50,50,500,500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }


    private void crearEtiqueta(){
        JLabel nombre = new JLabel();
        nombre.setText("Ingrese nu nombre: ");
        nombre.setFont(new Font("arial", Font.BOLD, 30));
        nombre.setBounds(10, 10, 400, 35);
        panel.add(nombre);
    }

    private void crearCajaTexto(){
        cajaNombre = new JTextField();
        cajaNombre.setBounds(30, 50, 400, 30);
        panel.add(cajaNombre);
    }

    private void crearBoton(){
        JButton boton = new JButton();
        boton.setBounds(200,100,80,40);
        boton.setText("Enviar");
        panel.add(boton);

        JLabel saludo = new JLabel();
        saludo.setBounds(30,200,400,40);
        saludo.setFont(new Font("arial",Font.ITALIC,20));
        panel.add(saludo);

        //Agregando un evento para el boton
        ActionListener oyente = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                saludo.setText("Hola "+cajaNombre.getText());
                cajaNombre.setText("");
            }
        };
        boton.addActionListener(oyente);
    }

    private void iniciarComponentes(){
        crearPanel();
        crearEtiqueta();
        crearCajaTexto();
        crearBoton();
    }
}
