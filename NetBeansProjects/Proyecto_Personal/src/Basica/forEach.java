package Basica;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] letras = new char[4];
        
        for (int i=0; i<letras.length; i++) {
            System.out.print((i+1)+".Digite una letra: ");
            char letra = entrada.next().charAt(0);
            letras[i] = letra;
        }
        
        for(char i:letras){
            System.out.println(i);
        }
        
    }
}
