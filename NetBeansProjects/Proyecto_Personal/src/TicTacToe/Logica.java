package TicTacToe;

import java.util.Scanner;

public class Logica {
    Scanner entrada = new Scanner(System.in);
    char matriz[][]=new char [3][3];
    boolean turno = false;
    int fila, columna;
    char valor;
    boolean ganador = false;

    public char[][] matrizInicial(){
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++) {
                valor = '-';
                matriz[i][j] = valor;
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println(" ");
        }
        return matriz;
    }

    public char[][] imprimirMatriz(char matriz[][]){
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        return matriz;
    }

    public void Principal(){
        matrizInicial();
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                while(matriz[i][j] == '-' && ganador == false){
                    System.out.println("\nDigite la posicion a marcar:");
                    fila = 0;
                    columna = 0;
                    //Validar el nuero digitado, entre 1 y 3 por filas
                    while(fila<1 || fila>3){
                        System.out.print("[i]: ");
                        fila = entrada.nextInt();
                    }
                    //Validar el nuero digitado, entre 1 y 3 por columnas
                    while(columna<1 || columna>3){
                        System.out.print("[j]: ");
                        columna = entrada.nextInt();
                    }
                    //Verificar si en la posición esta vacío
                    if(matriz[fila-1][columna-1] == '-'){
                        if(turno == false){
                            valor = 'X';
                            matriz[fila-1][columna-1] = valor;
                            turno = true;
                        }
                        else{
                            valor = 'O';
                            matriz[fila-1][columna-1] = valor;
                            turno = false;
                        }
                        System.out.println("");
                        imprimirMatriz(matriz);
                        verificarMatriz(matriz);
                    }
                    else{
                        System.out.print("Ya esta marcada esa casilla");
                    }
                } 
            }
        }
    }

    public char[][] verificarMatriz(char matriz[][]){
        //Comprobar si gano o empate
        int contador = 0;
        for (int i=0; i<3; i++) {
            for (int j=0; j <3 ; j++) {
                //Verificar en vertical
                if(j<1 && matriz[i][j]==matriz[i][j+1] &&  matriz[i][j]==matriz[i][j+2] && matriz[i][j] != '-'){
                    ganador = true;
                    System.out.println("GANO EN HORIZONTAL CON: ( "+valor+" )");
                }
                //Verificar en horizontal
                if(i<1 && matriz[i][j]==matriz[i+1][j] &&  matriz[i][j]==matriz[i+2][j] && matriz[i][j] != '-'){
                    ganador = true;
                    System.out.println("GANO EN VERTICAL CON: ( "+valor+" )");
                }
                //Verificar en diagonal
                if(i<1 && j<1 && matriz[i][j]==matriz[i+1][j+1] && matriz[j][j]==matriz[i+2][j+2] && matriz[i][j]!='-'){
                    ganador = true;
                    System.out.println("GANO EN DIAGONAL CON: ( "+valor+" )");
                }
                //Verificar en diagonal
                if(i<1 && j<1 && matriz[i+2][j]==matriz[i+1][j+1] && matriz[i+2][j]==matriz[i][j+2] && matriz[i+2][j]!='-'){
                    ganador = true;
                    System.out.println("GANO EN DIAGONAL ad CON: ( "+valor+" )");
                }
                if(matriz[i][j] == 'X'){
                    contador += 1;
                }
                if(contador == 5){
                    System.out.println("EMPATE");
                }
            }
        }
        return matriz;
    }

}