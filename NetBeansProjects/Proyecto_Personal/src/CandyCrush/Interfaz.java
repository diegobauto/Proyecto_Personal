package CandyCrush;

import	java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;	

public class Interfaz extends JFrame implements ActionListener {
    Movimientos intmov = new Movimientos();
    
    private Estructura estructura;
    public JFrame frame = new JFrame("Candy Crush");
    
    private JPanel contenedor;

    private JButton boton;
    String num = "";
    int s1,s2 ;
    static int num1;
    static int num2;
    
    //Declarar un 
    enum Dato{
        POSICION,DIRECCION
    }
    Dato TipoDato = Dato.POSICION;
    
    
    public Interfaz(Estructura estructura){
        this.estructura = estructura;
    }
       
    ActionListener oyenteEvento =  new ActionListener() {
        @Override
        public void  actionPerformed(ActionEvent e) {
            num = (e.getActionCommand());
            s1 = Integer.parseInt(num.substring(0,1))+1;
            s2 = Integer.parseInt(num.substring(1,2))+1;

            if(TipoDato == Dato.POSICION){
                num1 = s1;
                num2 = s2;
                TipoDato = Dato.DIRECCION;
                //System.out.println(num1+""+num2);
            }
            else{
                if((s1-num1) == 1 && (s2-num2) == 0){
                    estructura.proceso(num1,num2,2);
                }
                else if((s1-num1) == -1 && (s2-num2) == 0){
                    estructura.proceso(num1,num2,1);
                }
                else if((s1-num1) == 0 && (s2-num2)==1){
                    estructura.proceso(num1,num2,4);
                }
                else if((s1-num1) == 0 && (s2-num2)==-1){
                    estructura.proceso(num1,num2,3);
                }
                else{
                    JOptionPane.showMessageDialog(null,"¡¡¡ POSICIÓN INVALIDA !!!");
                }
                TipoDato = Dato.POSICION;
            }
            //System.out.println(((JButton)e.getSource()).getText()));
            //System.out.println("("+num1+","+num2+")");
        }
    };
    
    public void Interfaz(String matriz[][]){
        frame.setVisible(false);
        frame = new JFrame();
        frame.setSize(800,700);
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(9,9));
        JPanel menu = new JPanel();
        
        JLabel datos = new JLabel(estructura.getDatos());
        datos.setFont(new Font("Arial", Font.PLAIN, 18));
        menu.setPreferredSize(new Dimension(10,25));
        menu.add(datos);
        frame.add(menu,BorderLayout.NORTH);
        frame.add(contenedor,BorderLayout.CENTER);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Color color = this.setForma(matriz[i][j]);
                boton = new JButton(i+""+j);
                boton.setPreferredSize(new Dimension(80,50));
                boton.setBackground(color);
                JLabel label = new JLabel(matriz[i][j]);
                boton.add(label);
                boton.setForeground(color);
                label.setAlignmentX(CENTER_ALIGNMENT);
                label.setFont(new Font("Arial", Font.PLAIN, 50));
                contenedor.add(boton);
                boton.addActionListener(oyenteEvento);
            }
        }
        JPanel punt = new JPanel();
        JLabel cad = new JLabel(estructura.getPunt());
        cad.setFont(new Font("Arial", Font.PLAIN, 18));
        punt.setPreferredSize(new Dimension(10,25));
        punt.add(cad);
        frame.add(punt,BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        contenedor.repaint();
        contenedor.updateUI();
    }
    
    public Color setForma(String dulce){
        switch(dulce){
            case "☺":
                return new Color(246, 189, 96); 
            case "☻":
                return new Color(206, 132, 173); 
            case "♥":
                return new Color(215, 255, 171); 
            case "☼":
                return new Color(151, 216, 196); 
            case "♣":
                return new Color(242, 132, 130);   
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
