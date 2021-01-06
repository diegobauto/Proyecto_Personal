package CandyCrush;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Movimientos {
    
  Puntuación score = new Puntuación();
  
  
  private String cadena = "";

  public void setCadena(String cadena){
    this.cadena = cadena;
  }

  public String getCadena(){
    return this.cadena;
  }

  public String[][] bajarDulces(String matriz[][]){
    String save = " "; 
    for(int i=0;i<9;i++){ 
      for(int j=0;j<9;j++){
        for(int x=0;x<9;x++){
          if(j>0 && matriz[j][x] == " "){
            matriz[j][x] = matriz[j-1][x];
            matriz[j-1][x] = " ";
          }
        }
      }
    }
    return matriz;
  }

  public String[][] eliminacionFila(String matriz[][]){   
    for(int i=0;i<9;i++){ 
      for(int j=0;j<9;j++){     
        if(j<4 && matriz[i][j].equals(matriz[i][j+1]) && matriz[i][j].equals(matriz[i][j+2]) && matriz[i][j].equals(matriz[i][j+3]) && matriz[i][j].equals(matriz[i][j+4]) && matriz[i][j].equals(matriz[i][j+5])){
          matriz[i][j] = " ";
          matriz[i][j+1] = " ";
          matriz[i][j+2] = " ";
          matriz[i][j+3] = " ";
          matriz[i][j+4] = " ";
          matriz[i][j+5] = " ";
          cadena = ("PERFECT!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          
          break;
        }      
        if(j<5 && matriz[i][j].equals(matriz[i][j+1]) && matriz[i][j].equals(matriz[i][j+2]) && matriz[i][j].equals(matriz[i][j+3]) && matriz[i][j].equals(matriz[i][j+4])){
          matriz[i][j] = " ";
          matriz[i][j+1] = " ";
          matriz[i][j+2] = " ";
          matriz[i][j+3] = " ";
          matriz[i][j+4] = " ";
          cadena = ("AWESOME!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }       
        if(j<6 && matriz[i][j].equals(matriz[i][j+1]) && matriz[i][j].equals(matriz[i][j+2]) && matriz[i][j].equals(matriz[i][j+3])){
          matriz[i][j] = " ";
          matriz[i][j+1] = " ";
          matriz[i][j+2] = " ";
          matriz[i][j+3] = " ";
          cadena = ("EXCELLENT!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }
        if(j<7 && matriz[i][j].equals(matriz[i][j+1]) && matriz[i][j].equals(matriz[i][j+2])){
          matriz[i][j] = " ";
          matriz[i][j+1] = " ";
          matriz[i][j+2] = " ";
          cadena = ("GOOD!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }
      }
    }
    return matriz;
  }

  public String[][] eliminacionColumna(String matriz[][]){
    for(int j=0;j<9;j++){ 
      for(int i=0;i<9;i++){
        if(i<4 && matriz[i][j].equals(matriz[i+1][j]) && matriz[i][j].equals(matriz[i+2][j]) && matriz[i][j].equals(matriz[i+3][j]) && matriz[i][j].equals(matriz[i+4][j]) && matriz[i][j].equals(matriz[i+5][j])){
          matriz[i][j] = " ";
          matriz[i+1][j] = " ";
          matriz[i+2][j] = " ";
          matriz[i+3][j] = " ";
          matriz[i+4][j] = " ";
          matriz[i+5][j] = " ";
          cadena = ("PERFECT!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }      
        if(i<5 && matriz[i][j].equals(matriz[i+1][j]) && matriz[i][j].equals(matriz[i+2][j]) && matriz[i][j].equals(matriz[i+3][j]) && matriz[i][j].equals(matriz[i+4][j])){
          matriz[i][j] = " ";
          matriz[i+1][j] = " ";
          matriz[i+2][j] = " ";
          matriz[i+3][j] = " ";
          matriz[i+4][j] = " ";
          cadena = ("AWESOME!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }       
        if(i<6 && matriz[i][j].equals(matriz[i+1][j]) && matriz[i][j].equals(matriz[i+2][j]) && matriz[i][j].equals(matriz[i+3][j])){
         matriz[i][j] = " ";
          matriz[i+1][j] = " ";
          matriz[i+2][j] = " ";
          matriz[i+3][j] = " ";
          cadena = ("EXCELLENT!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }
        if(i<7 && matriz[i][j].equals(matriz[i+1][j]) && matriz[i][j].equals(matriz[i+2][j])){
          matriz[i][j] = " ";
          matriz[i+1][j] = " ";
          matriz[i+2][j] = " ";
          cadena = ("GOOD!!!");
          System.out.println(cadena);
          score.puntaje(cadena);
          break;
        }
      }
    }
    return matriz;
  }

  public String[][] mover(String matriz[][],int num1,int num2, int p){
    //Scanner teclado = new Scanner(System.in);
    //Verificación
    System.out.println("¿Qué dulce quiere mover?");
    System.out.print("Fila(x)= ");
    int x = Interfaz.num1;
    while(x<-1 || x>9){
      System.out.print("¡ERROR!- Digite nuevamente:");
      x = Interfaz.num1;
    }
    System.out.print("Columna(y)= ");
    int y = Interfaz.num2;
    while(y<-1 || y>9){
      System.out.print("¡ERROR!- Digite nuevamente:");
      y = Interfaz.num2;
    }
    
    //Movimiento
    System.out.println("\n¿A dónde lo quiere mover?");
    System.out.println("*** MENU DE MOVIMIENTO ***");
    System.out.print("Arriba = 1\nAbajo = 2\nIzquierda = 3\nDerecha = 4\n");
    //int p = teclado.nextInt();
    System.out.print("\n");
    String guardar = " ";
    /*while(p<1 || p>4){
      System.out.print("¡ERROR!- Digite nuevamente:");
      p = teclado.nextInt();
    } */   
    switch(p) {
      case 1:
        if (x != 1){
          guardar = matriz[x-2][y-1];
          matriz[x-2][y-1] = matriz[x-1][y-1];
          matriz[x-1][y-1] = guardar;

          matriz = eliminacionFila(matriz);
          matriz = eliminacionColumna(matriz);
          //Verificar movimiento valido
          if(matriz[x-2][y-1] == " " || matriz[x-1][y-1] == " "){
            System.out.println("\n");
          }
          else{
            guardar = matriz[x-1][y-1];
            matriz[x-1][y-1] = matriz[x-2][y-1];
            matriz[x-2][y-1] = guardar;
            JOptionPane.showMessageDialog(null,"¡¡¡ MOVIMIENTO INVALIDO !!!");
          }
        }
        else{
          System.out.println("POSICIÓN INVALIDA!!!\n");
          //matriz = mover(matriz);
        }
        break;
      case 2:
        if(x != 9){
          guardar = matriz[x][y-1];
          matriz[x][y-1] = matriz[x-1][y-1];
          matriz[x-1][y-1] = guardar;

          matriz = eliminacionFila(matriz);
          matriz = eliminacionColumna(matriz);
          
          if(matriz[x][y-1] == " " || matriz[x-1][y-1] == " "){
            System.out.println("\n");
          }
          else{
            guardar = matriz[x-1][y-1];
            matriz[x-1][y-1] = matriz[x][y-1];
            matriz[x][y-1] = guardar;
            JOptionPane.showMessageDialog(null,"¡¡¡ MOVIMIENTO INVALIDO !!!");
            
            
          }
        }
        else {
          System.out.println("POSICIÓN INVALIDA!!!\n");
          //matriz = mover(matriz);
        }
        break;
      case 3:
        if(y != 1){
          guardar = matriz[x-1][y-2];
          matriz[x-1][y-2] = matriz[x-1][y-1];
          matriz[x-1][y-1] = guardar;
          
          matriz = eliminacionFila(matriz);
          matriz = eliminacionColumna(matriz);
          
          if(matriz[x-1][y-2] == " " || matriz[x-1][y-1] == " "){
            System.out.println("\n");
          }
          else{
            guardar = matriz[x-1][y-1];
            matriz[x-1][y-1] = matriz[x-1][y-2];
            matriz[x-1][y-2] = guardar;
            JOptionPane.showMessageDialog(null,"¡¡¡ MOVIMIENTO INVALIDO !!!");
          }
        }
        else{
          System.out.println("POSICIÓN INVALIDA!!!\n");
          //matriz = mover(matriz);
        }
        break;
      case 4:
        if(y != 9){
          guardar = matriz[x-1][y];
          matriz[x-1][y] = matriz[x-1][y-1];
          matriz[x-1][y-1] = guardar;

          matriz = eliminacionFila(matriz);
          matriz = eliminacionColumna(matriz);
          
          if(matriz[x-1][y] == " " || matriz[x-1][y-1] == " "){
            System.out.println("\n");
          }
          else{
            guardar = matriz[x-1][y-1];
            matriz[x-1][y-1] = matriz[x-1][y];
            matriz[x-1][y] = guardar;
            JOptionPane.showMessageDialog(null,"¡¡¡ MOVIMIENTO INVALIDO !!!");
          }
        }
        else {
          System.out.println("POSICIÓN INVALIDA!!!\n");
          //matriz = mover(matriz);
        }
        break;
      default:
    }
    return matriz;
  }
}