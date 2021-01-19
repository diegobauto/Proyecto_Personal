package TicTacToe;

import java.util.Scanner;

public class Juego {
    private Scanner entrada = new Scanner(System.in);
    private char matriz[][] = new char [3][3];
    private boolean turno = false;
    private int fila, columna;
    private char valor;
    private boolean ganador = false;
    private int casillasDisponibles;

    public Juego(){
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++) {
                matriz[i][j] = '-';
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        juegoPrincipal();
    }

    public void imprimirMatriz(){
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    //Comprobar si gano o empate
    public void verificarMatriz(){
        //Verificar en horizontal
        for (int i=0; i<3; i++) {
            if(matriz[i][0]==matriz[i][1] &&  matriz[i][0]==matriz[i][2] && matriz[i][0]!='-'){
                ganador = true;
                System.out.println("GANO EN HORIZONTAL CON: ( "+valor+" )");
            }            
        }
        //Verificar en vertical
        for (int j=0; j<3; j++) {
            if(matriz[0][j]==matriz[1][j] &&  matriz[0][j]==matriz[2][j] && matriz[0][j] != '-'){
                ganador = true;
                System.out.println("GANO EN VERTICAL CON: ( "+valor+" )");
            }
        }

        //Verificar en diagonal
        if(matriz[0][0]==matriz[1][1] && matriz[0][0]==matriz[2][2] && matriz[0][0]!='-'){
            ganador = true;
            System.out.println("GANO EN DIAGONAL CON: ( "+valor+" )");
        }

        //Verificar en diagonal
        if(matriz[0][2]==matriz[1][1] && matriz[0][2]==matriz[2][0] && matriz[0][2]!='-'){
            ganador = true;
            System.out.println("GANO EN DIAGONAL ad CON: ( "+valor+" )");
        }

        //Verificar empate
        if(casillasDisponibles == 0){
            System.out.println("Empate");
        }
    }

    public void juegoPrincipal(){
        casillasDisponibles = 9;
        while(casillasDisponibles>0 && !ganador){
            System.out.println("\nDigite la posicion a marcar:");

            //Validar el nuero digitado, entre 1 y 3 por filas
            do{
                System.out.print("[i]: ");
                fila = entrada.nextInt();
            }while(fila<1 || fila>3);

            //Validar el nuero digitado, entre 1 y 3 por columnas
            do{
                System.out.print("[j]: ");
                columna = entrada.nextInt();
            }while(columna<1 || columna>3);
            
            //Verificar si en la posición esta vacío
            if(matriz[fila-1][columna-1] == '-'){
                if( !turno ){
                    valor = 'X';
                }
                else{
                    valor = 'O';
                }
                matriz[fila-1][columna-1] = valor;
                casillasDisponibles--;
                turno = !turno;
                System.out.println();

                imprimirMatriz();
                verificarMatriz();
            }
            else{
                System.out.print("Ya esta marcada esa casilla");
            }
        } 
    }
}