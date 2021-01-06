package Basica;

import java.util.Scanner;

public class llenarArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero de elementos del arreglo:");
        int nElementos = entrada.nextInt();
        
        String[] nombres = new String[nElementos];
        
        for (int i=0; i<nombres.length; i++) {
            System.out.println("Inserte el "+(i+1)+" nombre:");
            String nombre = entrada.next();
            nombres[i] = nombre;
        }
        System.out.println("");
        for (int i=0; i<nombres.length; i++) {
            System.out.print(nombres[i]+" ");
        }
        System.out.println("");
    }
    
}
