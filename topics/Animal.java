public class Animal {
    String nombre;
    int cantPatas;
    int edad;
    static int contadorAnimales = 0;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido(){
        return "Hacer sonido genérico";
    }

    public static int getCantAnimales(){
        return contadorAnimales;
    }
}
