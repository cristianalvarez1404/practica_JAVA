public class Variables {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola mundo!");
        /*
         * Variable => Espacio en memoria que tienen un nombre y puede contener un valor
         * cambiante
         * Declaración => Asignar el tipo de dato y nombre a la variable sin darle valor
         * inicial
         * Definición => Asignar el tipo de dato y el nombre a la variable dandole o no
         * un valor inicial
         * Asignación => Darle un valor a una variable
         */

        /*
         * Tipo de variables
         * Primitivas => Almacenan datos básicos
         * referencia => Almacenan datos en direcciones de memoria que apuntan a objetos
         */

        // Tipo de datos entereros => byte(-128 al 127), short(-32768 al 32767), int,
        // long
        int numero = 5;
        byte tipeByte = 124;
        // Tipo de datos reales: float(6) - doble(16)
        // Float solo tiene 6 decimales, despues de esto hay que ponder la f. Con doble
        // no hay que ponerla
        double flotante = 5.55454454887870;

        // Tipo de dato character
        char letra = 's';

        // Tipo de dato booleano
        boolean v = true;
        boolean f = false;


        /*-------------------------------------------------------------- */

        //Valores de referencia
        String cadena = "Curso de Java";

        System.out.println(numero);
        System.out.println(flotante);
        System.out.println(letra);

    }
}
