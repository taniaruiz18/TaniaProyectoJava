public class Camion {
    String marca;
    String modelo;
    String color;
    int anioFabricacion;
    int capacidadCargaKg;
    int numeroEjes;
    boolean traccion4x4;
    double kilometraje;
    String combustible;
    boolean estado;

    public Camion(String marca, String modelo, String color, int anioFabricacion, int capacidadCargaKg,
                  int numeroEjes, boolean traccion4x4, double kilometraje, String combustible, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.capacidadCargaKg = capacidadCargaKg;
        this.numeroEjes = numeroEjes;
        this.traccion4x4 = traccion4x4;
        this.kilometraje = kilometraje;
        this.combustible = combustible;
        this.estado = estado;
    }

    public void encender() {
        if (!estado) {
            estado = true;
            System.out.println("El camión ha sido encendido.");
        } else {
            System.out.println("El camión ya está encendido.");
        }
    }

    public void apagar() {
        if (estado) {
            estado = false;
            System.out.println("El camión ha sido apagado.");
        } else {
            System.out.println("El camión ya está apagado.");
        }
    }

    public void acelerar() {
        System.out.println("El camión está acelerando...");
    }

    public void frenar() {
        System.out.println("El camión está frenando...");
    }

    public void cargarMercancia() {
        System.out.println("Cargando mercancía...");
    }

    public void mostrarDetalles() {
        System.out.println("----- Detalles del Camión -----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año de Fabricación: " + anioFabricacion);
        System.out.println("Capacidad de Carga: " + capacidadCargaKg + " kg");
        System.out.println("Número de Ejes: " + numeroEjes);
        System.out.println("Tracción 4x4: " + (traccion4x4 ? "Sí" : "No"));
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Combustible: " + combustible);
        System.out.println("Estado: " + (estado ? "Encendido" : "Apagado"));
    }

    public void imprimirMarca() {
        System.out.println("Marca: " + marca);
    }

    public void mostrarColor() {
        System.out.println("Color: " + color);
    }

    public void cargarCombustible(String tipoCombustible) {
        if (this.combustible.equalsIgnoreCase(tipoCombustible)) {
            System.out.println("Se ha tanqueado el camión con " + tipoCombustible + ".");
        } else {
            System.out.println("Tipo de combustible incorrecto. Este camión usa " + this.combustible + ".");
        }
    }
}
