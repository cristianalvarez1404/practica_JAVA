public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {}

    public Persona(String nombre, String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String darNombreCompleto(){
        return this.getApellido() + ", " + this.getNombre() + " tiene " + this.getEdad() + " años.";
    }

    public String enviarSaludo(String saludado){
        if(this.edad > 40 )
            return "Buenos días querido: " + saludado;
        
        return "Hola, ¿Cómo estás " + saludado + "?";
    }

    public String getNombre(){
        return this.nombre.toUpperCase();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido.toUpperCase();
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }



}
