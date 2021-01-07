package POO.Polimorfismo;

public class main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("ONM38C", "Ferrari", "JTK");
        vehiculos[1] = new VehiculoDeportivo("DBA004", "Lambrghini", "KL7", 500);
        vehiculos[2] = new VehiculoTurismo("AMDF", "Renault", "POC74", 4);
        vehiculos[3] = new VehiculoFurgoneta("AMDF", "Renault", "POC74", 65);

        for (Vehiculo vehiculo:vehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}
