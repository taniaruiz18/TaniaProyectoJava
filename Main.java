public class Main {
    public static void main(String[] args) {

        Camion volvoFH16 = new Camion("Volvo", "FH16", "Azul", 2022, 20000, 4, true, 75500, "Diésel", false);
        Camion scaniaR500 = new Camion("Scania", "R500", "Rojo", 2020, 18000, 3, false, 120300, "Diésel", false);
        Camion hino700 = new Camion("Hino", "700 Series", "Blanco", 2021, 15000, 2, false, 45200, "Diésel", true);

        // Volvo FH16
        volvoFH16.encender(); //estaba encendido
        volvoFH16.acelerar();
        volvoFH16.frenar();
        volvoFH16.cargarMercancia();
        volvoFH16.mostrarDetalles();
        volvoFH16.imprimirMarca();
        volvoFH16.mostrarColor();
        volvoFH16.cargarCombustible("Diésel");
        volvoFH16.acelerar();
        volvoFH16.frenar();
        volvoFH16.apagar();

        System.out.println();

        // Scania R500
        System.out.println("El Camion estaba apagado");
        scaniaR500.encender();
        scaniaR500.acelerar();
        scaniaR500.frenar();
        scaniaR500.cargarMercancia();
        scaniaR500.mostrarDetalles();
        scaniaR500.imprimirMarca();
        scaniaR500.mostrarColor();
        scaniaR500.cargarCombustible("Diésel");
        System.out.println("El camion sigue encendido");
        scaniaR500.apagar();

        System.out.println();

        // Hino 700 Series
        hino700.encender();
        hino700.acelerar();
        hino700.frenar();
        hino700.cargarMercancia();
        hino700.mostrarDetalles();
        hino700.imprimirMarca();
        hino700.mostrarColor();
        System.out.println("El camión se apaga mientras se carga el combustible...");
        hino700.cargarCombustible("Diésel");
        System.out.println("Se enciende nuevamente el camion");
        hino700.acelerar();
        hino700.frenar();
        hino700.apagar();
    }
}
