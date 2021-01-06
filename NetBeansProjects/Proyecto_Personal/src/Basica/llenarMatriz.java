package Basica;
import java.util.Scanner;

public class llenarMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][];
        
        System.out.print("#Filas:");
        int nFilas = entrada.nextInt();
        
        System.out.print("#Columnas:");
        int nColumnas = entrada.nextInt();
        
        matriz = new int[nFilas][nColumnas];
        
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nColumnas; j++) {
                System.out.print("Posicion["+i+","+j+"]:");
                int numero = entrada.nextInt();
                matriz[i][j] = numero;
            }
        }
        
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nColumnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
    }
}
