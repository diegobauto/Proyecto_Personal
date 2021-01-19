package TicTacToe.JuegoConInterfaz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Logica {
    Scanner entrada = new Scanner(System.in);
    char matriz[][] = new char [3][3];
    boolean ganador = false;
    private boolean turno = false;
    private char valor;
    
    Interfaz juego;

    public Logica(){
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz.length; j++) {
                matriz[i][j] = '-';
            }
        }
    }

    public void hacerJugada(int fila,int columna){
         //Verificar si en la posición esta vacío y no hay ganador
        if(matriz[fila][columna] == '-' && ganador == false){
            if(turno == false){
                valor = 'X';
            }
            else{
                valor = 'O';
            }
            matriz[fila][columna] = valor;
            turno = !turno;
        }
        else{
            JOptionPane.showMessageDialog(null, "Casilla Ocupada");
        }
    }

    //Comprobar si gano o empate
    public void verificarMatriz(){
        //Verificar en horizontal
        for (int i=0; i<3; i++) {
            if(matriz[i][0]==matriz[i][1] &&  matriz[i][0]==matriz[i][2] && matriz[i][0]!='-'){
                ganador = true;
                JOptionPane.showMessageDialog(null, "GANO EN HORIZONTAL CON: ( "+valor+" )");
            }
        }
        
        //Verificar en vertical
        for (int j=0; j <3 ; j++) {
            if(matriz[0][j]==matriz[1][j] &&  matriz[0][j]==matriz[2][j] && matriz[0][j] != '-'){
                ganador = true;
                JOptionPane.showMessageDialog(null, "GANO EN VERTICAL CON: ( "+valor+" )");
            }
        }

        //Verificar en diagonal
        if(matriz[0][0]==matriz[1][1] && matriz[0][0]==matriz[2][2] && matriz[0][0]!='-'){
            ganador = true;
            JOptionPane.showMessageDialog(null, "GANO EN DIAGONAL CON: ( "+valor+" )");
        }

        //Verificar en diagonal
        if(matriz[0][2]==matriz[1][1] && matriz[0][2]==matriz[2][0] && matriz[0][2]!='-'){
            ganador = true;
            JOptionPane.showMessageDialog(null, "GANO EN DIAGONAL CON: ( "+valor+" )");
        }
        
        //Verificar Empate
        int contador = 0;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if(matriz[i][j] == 'X'){
                    contador += 1;
                }
            }
        }
        if(contador == 5){
            ganador = true;
            JOptionPane.showMessageDialog(null, "EMPATE");
        }
    }
}