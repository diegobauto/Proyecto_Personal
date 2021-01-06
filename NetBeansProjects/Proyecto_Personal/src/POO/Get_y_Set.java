package POO;

public class Get_y_Set {
    //Modificadores de acceso
    /*
    Metodos get y set
    */
    private String nombre;
    private int edad;
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public static void main(String[] args) {
        Get_y_Set ob1 = new Get_y_Set();
        ob1.setEdad(20);
        System.out.println("Edad: "+ob1.getEdad());
        ob1.setNombre("Diego");
        System.out.println("Nombre: "+ob1.getNombre());
    }
}
