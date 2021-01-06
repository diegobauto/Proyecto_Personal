package POO.sobreEscritura;

//Heredo de Animal
public class Persona extends Animal{    
    @Override //Anotación para saber que estoy sobreescribiendo el metodo comer
    public void comer(){
        System.out.println("Estoy comiendo como una persona");
    }    
}
