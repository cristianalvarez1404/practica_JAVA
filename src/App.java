public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "cristian";
        persona1.apellido = "Álvarez";
        persona1.edad = 29;

        Persona persona2 = new Persona();
        persona2.nombre = "Mariana";
        persona2.apellido = "Perez";
        persona2.edad = 24;

       System.out.println( persona1.darNombreCompleto());
       System.out.println( persona2.darNombreCompleto());
       System.out.println( persona1.enviarSaludo("Sergie"));
        
    }
}
