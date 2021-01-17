package TicTacToe;

import	java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JPanel panel;
    private JButton boton;

    Logica logicaJuego = new Logica();

    //Crear la ventana principal
    public Interfaz(){
        setTitle("Tic Tac Toe");
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes(logicaJuego.matriz);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Crear el panel
    private void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }

    //Realizar la grilla de botones
    private void crearBotones(char matriz[][]){
        panel.setLayout(new GridLayout(3,3));
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                boton = new JButton();
                String cadenaValor = Character.toString(matriz[i][j]);
                boton.setText(cadenaValor);
                panel.add(boton);
            }
        }
    }

    //Metodo principal para ejecutar todos los metodos
    private void iniciarComponentes(char matriz[][]){
        crearPanel();
        crearBotones(matriz);
    }
    
}
