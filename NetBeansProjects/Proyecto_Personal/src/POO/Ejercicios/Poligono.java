package POO.Ejercicios;

public abstract class Poligono {
    protected int nLados;

    public Poligono(int nLados){
        this.nLados = nLados;
    }
    
    public abstract double area();

    public int getnLados() {
        return nLados;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Numero de Lados: "+nLados;
    }
}
