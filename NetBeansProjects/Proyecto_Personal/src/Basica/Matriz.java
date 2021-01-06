package Basica;

public class Matriz {
    public static void main(String[] args) {
        int matriz[][] = { {9,8,7},
                           {5,6,4},
                           {3,1,2} };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
