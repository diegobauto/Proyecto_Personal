package POO.Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Arreglo Dinamico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
        //Mostrar Datos
        mostrarDatos();
    }
    

    public static void llenarPoligono(){
        int opcion = 0;
        char respuesta;
        do {
            do {
                System.out.println("Digite que poligono desea: ");
                System.out.println("1.Triangulo");
                System.out.println("2.Rectangulo ");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();
            } while (opcion<1 || opcion>2);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }
            System.out.print("Desea digitar otro Poligono (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta=='s' || respuesta=='S');
    }


    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.print("Digite lado1:");
        lado1 = entrada.nextDouble();
        System.out.print("Digite lado2:");
        lado2 = entrada.nextDouble();
        System.out.print("Digite lado3:");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Guarda en el arreglo
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1, lado2;

        System.out.print("Digite lado1:");
        lado1 = entrada.nextDouble();
        System.out.print("Digite lado2:");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        //Guarda en el arreglo
        poligono.add(rectangulo);
    }
    

    public static void mostrarDatos(){
        //Recorriendo el arreglo de Poligonos
        for (Poligono i:poligono) {
            System.out.println(i.toString());
            System.out.println("Area: "+i.area());
            System.out.println();
        }
    }
}
