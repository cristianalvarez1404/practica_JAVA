public class Carrera {
    public String nombre;
    public int duracion;
    public boolean estaEnCurso;

    public Carrera(String nombre, int duracion, boolean estaEnCurso) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaEnCurso = estaEnCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEstaEnCurso() {
        return estaEnCurso;
    }

    public void setEstaEnCurso(boolean estaEnCurso) {
        this.estaEnCurso = estaEnCurso;
    }

}
