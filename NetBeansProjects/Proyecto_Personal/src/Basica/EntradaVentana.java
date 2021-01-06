package Basica;

import javax.swing.JOptionPane;

public class EntradaVentana {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Digite su nombre: ");
        System.out.println("Su nombre es:"+cadena);
    }
}
