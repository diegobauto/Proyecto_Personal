package Basica;

public class AAA {
    public static void main(String[] args) {
        int i=2,j=3,k=0;
        String cadena = " ";
        while (j<=3000) {
            if(k<2000){
                k=k+4;
                cadena = " "+k;
            }
            else{
                cadena = " ";
            }
            System.out.println(i+" "+j+cadena);
            i=i+2;
            j=j+3;
        }
    }
}
