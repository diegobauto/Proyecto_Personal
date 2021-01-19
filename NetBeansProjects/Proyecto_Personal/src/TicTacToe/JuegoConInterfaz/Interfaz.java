package TicTacToe.JuegoConInterfaz;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import java.awt.event.ActionEvent;

public class Interfaz extends JFrame{
    private JPanel panel;
    
    Logica logicaJuego = new Logica();

    //Crear la ventana principal
    public Interfaz(){
        setTitle("Tic Tac Toe");
        setLayout(null);
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Crear el panel
    private void crearPanel(){
        /*class Ventana extends JPanel{
            private JFrame frame;

            public Ventana(JFrame frame){
                this.frame = frame;
            }

            public void paintComponent(Graphics g){
                super.paintComponent(g);
                
            }
        };*/
        panel = new JPanel();
        panel.setSize(300,300);
        int posx = (getWidth()-panel.getWidth())/2-8;
        int posy = (getHeight()-panel.getHeight())/2-20;
        panel.setLocation(posx,posy);
        add(panel);
    }

    //Realizar la grilla de botones
    private void crearBotones(){
        panel.setLayout(new GridLayout(3,3));
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                Boton boton = new Boton(i,j);
                boton.setFont(new Font("arial",Font.BOLD,45));
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //Si ganador == false
                        if(!logicaJuego.ganador){
                            logicaJuego.hacerJugada(boton.getI(),boton.getJ());
                            boton.setText(Character.toString(logicaJuego.matriz[boton.getI()][boton.getJ()]));
                            logicaJuego.verificarMatriz();
                        }
                    }
                });
                panel.add(boton);
            }
        }
    }

    //Metodo principal para ejecutar todos los metodos
    public void iniciarComponentes(){
        crearPanel();
        crearBotones();
    }
}
