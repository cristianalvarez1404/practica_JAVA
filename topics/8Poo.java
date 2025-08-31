public class Poo {
    public static void main(String[] args) throws Exception {

        // Carrera carrera1 = new Carrera("Ingenieria en computación",7,false);
        // Carrera carrera2 = new Carrera("Ingenieria en sistemas",6,true);

        // Persona persona1 = new Persona("cristian", "Álvarez", 29);
        // Persona persona2 = new Persona("Mariana", "Perez", 45);

        // persona1.setNombre("Ricardo");
        // persona1.setApellido("Darin");

        // System.out.println(persona1.darNombreCompleto());
        // System.out.println(persona2.darNombreCompleto());
        // System.out.println(persona1.enviarSaludo("Sergie"));
        // System.out.println(persona2.enviarSaludo("Sergie"));

        Animal animal = new Animal("Bestia",200);
        Gato gato = new Gato("Glottis", 15);
        Perro perro = new Perro("Forilais", 3);

        System.out.println(animal.hacerSonido());
        System.out.println(gato.hacerSonido());
        System.out.println(perro.hacerSonido());
        System.out.println(Animal.getCantAnimales());
        System.out.println(Veterinaria.nombre);
    }
}