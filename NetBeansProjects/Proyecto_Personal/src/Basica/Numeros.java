package Basica;

public class Numeros {
    public static void main(String[] args) {
        int i=2,j=3,k=0;

        while (j<=3000) {
            if(k<2000){
                k=k+4;
            }
            System.out.println(i+" "+j+" "+k);
            i=i+2;
            j=j+3;
        }
    }
}
