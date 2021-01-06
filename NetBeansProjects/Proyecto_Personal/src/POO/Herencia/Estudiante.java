package POO.Herencia;

public class Estudiante extends Persona{
    private int codEstudiante;
    private float notaFinal;
    
    public Estudiante(String nombre,String apellido,int edad, int codEstudiante,float notaFinal){
        super(nombre, apellido, edad);
        this.codEstudiante = codEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+
                           "\nApellido: "+getApellido()+
                           "\nEdad: "+getEdad()+
                           "\nCodigo: "+codEstudiante+
                           "\nNota Final: "+ notaFinal);    
    }
}
