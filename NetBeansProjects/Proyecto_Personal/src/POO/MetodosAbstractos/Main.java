package POO.MetodosAbstractos;
/*
Una clase abstracta no se puede instanciar
Un metodo abstracto solo se define
Una clase abstracta debe ser padre, debe contener hijos
Y cuando creo una clase hija y heredo debo contener el mismo metodo abstracto
 */
public class Main {
    public static void main(String[] args) {
        Planta servivo = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerbivoro animalito = new AnimalHerbivoro();
        servivo.alimentarse();
        animalC.alimentarse();
        animalito.alimentarse();
    }
}
