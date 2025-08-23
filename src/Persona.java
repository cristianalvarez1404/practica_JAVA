public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    public String darNombreCompleto(){
        return this.apellido + ", " + this.nombre + " tiene " + this.edad + " años.";
    }

    public String enviarSaludo(String saludado){
        return "Hola, ¿Cómo estás " + saludado + "?";
    }

}
