package Basica;
//Arreglos, LLENARLOS DE DOS FORMAS
public class Arreglo {
    public static void main(String[] args) {
        int[] numeros  = new int[4];
        //Primera Forma:
        System.out.println("*****");
        numeros[0] = 1;
        numeros[1] = 7;
        numeros[2] = 9;
        numeros[3] = 4;
        
        for (int i = 0; i<numeros.length; i++) {
            System.out.println(numeros[i]);    
        }
               
        System.out.println("*****");
        //Segunda Forma:
        int[] numeros1 = {4,8,6,2};
        for (int i = 0; i<numeros1.length; i++) {
            System.out.println(numeros1[i]);    
        }
        
    }
}
