package CandyCrush;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Estructura {
  Movimientos movimiento = new Movimientos();
  Interfaz ventana = new Interfaz(this); 
  
  public String getDatos(){
      return String.format("Vidas: %d             Movimientos: %d              Score: %d\n", vidas,movimientos,movimiento.score.puntuación);
  }
  
  
  public String getPunt(){
      return String.format("%s", movimiento.getCadena());
  }
  int movimientos = 50;
  int vidas = 5;
  
  //Declara lista para dulces
  private List<String> dulce = new ArrayList<>();
  
  //Declarar Random
  private Random entrada = new Random();
    
  //Declarar la matriz:
  private String matriz[][]=new String [9][9];
  
  public void setMatriz(String matriz[][]){
    this.matriz = matriz;
  } 
 
  public String[][] getMatriz(){
    return this.matriz;
  }

  public void mensaje(){
    System.out.println("************************");
    System.out.println("**                    **");
    System.out.println("**    CANDY CRUSH     **");
    System.out.println("**                    **");
    System.out.println("************************\n");
    System.out.println("El objetivo del juego es combinar 3 ");
    System.out.println("o mas caramelos e ir sumando puntos\n");
    System.out.println("3 Lineas: 50pts");
    System.out.println("4 Lineas: 100pts");
    System.out.println("5 Lineas: 200pts");
    System.out.println("6 Lineas: 400pts\n");
  }
    
  public String[][] imprimirMatriz(String matriz[][]){
    System.out.println("------------------------------");
    System.out.print("x/y");
    System.out.println(" 1  2  3  4  5  6  7  8  9");
    for(int i=0;i<9;i++){
      System.out.print(i+1+"|");
      for(int j=0;j<9;j++){
        System.out.print("  "+matriz[i][j]); 
      }
      System.out.print("\n"); 
    }
    System.out.println("------------------------------");
    return matriz;
  }
     
  public String[][] verificarMatriz(String matriz[][]){
    //Verificamos que no se repitan dulces
    for(int i=0;i<9;i++){ 
      for(int j=0;j<9;j++){
        if(j<7){
          if(matriz[i][j].equals(matriz[i][j+1])){
          while(matriz[i][j+1].equals(matriz[i][j+2]) ){     
            matriz[i][j+2]=dulce.get(entrada.nextInt(5));
          }
          }  
        }
      } 
    }

    for(int i=0;i<9;i++){ 
      for(int j=0;j<9;j++){
        if(i<8){
          if(matriz[i][j].equals(matriz[i+1][j])){
            int pos = dulce.indexOf(matriz[i+1][j]);
            if(i<7){
              if(j>0 && j<8 && i>0){
                while( (matriz[i+2][j].equals(matriz[i+2][j+1])) || (matriz[i+2][j].equals(matriz[i+2][j-1]))
                || (matriz[i+2][j].equals(matriz[i+1][j]))){
                matriz[i+2][j] = dulce.get(entrada.nextInt(5));
                }
              }
              else{
                while(matriz[i+2][j].equals(matriz[i+1][j])){
                matriz[i+2][j] = dulce.get(entrada.nextInt(5));
                }
              } 
            }
          }
        }
      } 
    }
    return matriz;
  } 

  public String[][] llenarVacios(String matriz[][]){
    for(int i=0;i<9;i++){ 
      for(int j=0;j<9;j++){
        if(matriz[i][j] == " "){
          matriz[i][j] = dulce.get(entrada.nextInt(5));
        }
      }
    }
    return matriz;
  }
  
  public void desarrollo(){
    //Instanciar objetos
    Dulces amarillo = new Dulces();
    Dulces morado = new Dulces();
    Dulces rojo = new Dulces();
    Dulces verde = new Dulces();
    Dulces naranja = new Dulces();
    
    //Declarar atributos a objetos
    amarillo.setColor("☺");
    morado.setColor("☻");
    rojo.setColor("♥");
    verde.setColor("☼");
    naranja.setColor("♣");
       
    dulce.add(amarillo.getColor());
    dulce.add(morado.getColor());
    dulce.add(rojo.getColor());
    dulce.add(verde.getColor());
    dulce.add(naranja.getColor());

    
    //Recorrer la matriz
    for(int i=0;i<9;i++){ 
      for(int j=0;j<9;j++){
        int num=entrada.nextInt(5);
        String caramelo = dulce.get(num);//Dar numero aleatorio
        matriz[i][j]=caramelo;//Guardar el numero en el lugar de la matriz
      }
    }
    //Matriz Inicial
    matriz = verificarMatriz(matriz);
    matriz = imprimirMatriz(matriz);
    ventana.Interfaz(matriz);

  }
  
  public void proceso(int num1,int num2,int p){
    if(movimientos>0){
        matriz = movimiento.mover(matriz,num1,num2,p);
        matriz = movimiento.bajarDulces(matriz);
        matriz = imprimirMatriz(matriz);
        matriz = llenarVacios(matriz);

        matriz = movimiento.eliminacionFila(matriz);
        matriz = movimiento.eliminacionColumna(matriz);
        matriz = movimiento.bajarDulces(matriz);
        matriz = llenarVacios(matriz);
        matriz = verificarMatriz(matriz);

        matriz = imprimirMatriz(matriz);
        ventana.Interfaz(matriz);
        System.out.println("Movimiento:"+movimientos);
        movimientos -= 1;


        System.out.println(p);

        if(movimientos==0 && movimiento.score.puntuación<1000){
            vidas--;
            JOptionPane.showMessageDialog(null,"¡¡¡ GAME OVER !!!");
        }
    }
  }
}