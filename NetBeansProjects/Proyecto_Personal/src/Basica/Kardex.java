package Basica;

import java.util.ArrayList;
import java.util.Scanner;

public class Kardex {
    
    Scanner entrada = new Scanner(System.in);
    ArrayList<Kardex> productos = new ArrayList<Kardex>();
    
    // Atributos
    int Id;
    String nombre;
    String referencia;
    int existencias;

    //Constructor
    public Kardex(int Id,String nombre, String referencia, int existencias) {
        this.Id = Id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.existencias = existencias;
    }
      
    // Getters
    public int getId() {
        return Id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getExistencias() {
        return existencias;
    }

    // Setters
    public void setId(int Id) {
        this.Id = Id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public void IngresarDatos(){
        //Ingresar Datos
        for (int i=0; i<3; i++) {
            System.out.println("\nPRODUCTO "+(i+1)+":");
            System.out.print("Digite nombre del producto:");
            nombre = entrada.next();
            System.out.print("Digite referencia del producto:");
            referencia = entrada.next();
            System.out.print("Digite existencias del producto:");
            existencias = entrada.nextInt();
            //Crear un nuevo objeto Kardex y añadirlo a la lista
            productos.add(new Kardex(i+1,nombre,referencia,existencias));
        }
    }
    
    public void ActualizarDatos(){
        // Actualizar las existencias del producto
        int modificar = 0;
        Imprimir();
        System.out.print("\nDigite el Id del producto:");
        int id = entrada.nextInt();
        System.out.println("¿Que desea realizar?:");
        System.out.println("1.Comprar\n2.Vender");
        int menu = entrada.nextInt();
        if(menu==1){
            System.out.print("Digite la cantidad comprada:");
            modificar = entrada.nextInt();
            productos.get(id-1).setExistencias(productos.get(id-1).getExistencias()+modificar);
        }
        else if(menu==2){
            System.out.print("Digite la cantidad vendida:");
            modificar = entrada.nextInt();
            productos.get(id-1).setExistencias(productos.get(id-1).getExistencias()-modificar);
        }
        System.out.println("\nInventario actualizado ... ");
        Imprimir();
    }
    
    public void Imprimir(){
        // Imprimir datos
        System.out.println("\nTodos los productos:");
        for(Kardex productoActual : productos){
            System.out.println(productoActual.getId()+") "+productoActual.getNombre() + ", " + 
                    productoActual.getReferencia() + ", " + 
                    productoActual.getExistencias());
        }
    }

}