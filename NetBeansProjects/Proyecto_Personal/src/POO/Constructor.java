package POO;

public class Constructor {
    //Atributos
    String nombre;
    int edad;
    
    //Constructor
    public Constructor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo toString(Imprimir mis resultados)
    @Override
    public String toString() {
        return "Constructor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public static void main(String[] args) {
        Constructor ob1 = new Constructor("Diego", 20);
        System.out.println(ob1.toString());
    }
}
