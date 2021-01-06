package Basica;

import Basica.Kardex;
import java.util.Scanner;

public class KardexMain {
    public static void main(String[] args) {  
        Kardex producto = new Kardex(0, "", "", 0);
        Scanner entrada = new Scanner(System.in);
        producto.IngresarDatos();
        //Menú
        int menu=0;
        while(menu !=3){
            System.out.println("\n------ MENU ------");
            System.out.println("1.Ver Productos\n2.Actualizar Datos\n3.Salir");
            System.out.println("-------------------");
            System.out.print("Digite la opcion:");
            menu = entrada.nextInt();
            switch(menu){
                case 1:
                    producto.Imprimir();
                    break;
                case 2:
                    producto.ActualizarDatos();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
}