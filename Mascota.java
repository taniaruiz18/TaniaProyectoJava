public class Mascota {
        private String nombre;  // Atributo encapsulado
        private String tipo;
        private String sonido;
                
        // Constructor
        public Mascota(String nombre,String tipo,String sonido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
                       }
                                    
     // 1 Método
        public void saludar() {
           System.out.println("¡Hola, soy " + nombre + " y soy un " +tipo+ "!");
        }

     //2 metodo
        public void Hacersonido() {
            System.out.println("¡Hola, soy " + nombre + " y hago el siguiente sonido " + sonido + "!");
        }
                                                        
           public static void main(String[] args) {
            Mascota miMascotadeTania =new Mascota("Firulais","Lobo siberiano");
            System.out.println("Ahora que ya creamos a mi mascota, llamamos al metodo saludar");
            miMascotadeTania.saludar();
            System.out.println("ahora que se ha creado la mascota la hacemos sonar");
            miMascotadeTania.Hacersonido();
        }
    }