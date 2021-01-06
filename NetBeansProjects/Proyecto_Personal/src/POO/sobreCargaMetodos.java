package POO;
/*
La sobre carga de metodos es repetir el metodo 
con diferentes parametros

En este caso sobrecarga de constructores y el metodo correr
*/
public class sobreCargaMetodos {
    //Atributos
    String nombre;
    int edad;
    String ID;
    
    //Contructor1
    public sobreCargaMetodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
        
    //Constructor2
    public sobreCargaMetodos(String ID) {
        this.ID = ID;
    }
    
    public void correr(){
        System.out.println(nombre+" esta corriendo");
    }
    
    public void correr(int km){
        System.out.println(nombre+" esta corriendo "+km+" kilometros");
    }
    
    public static void main(String[] args) {
        sobreCargaMetodos ob1 = new sobreCargaMetodos("Diego");
        ob1.correr();
        ob1.correr(50);
        
    }
}
