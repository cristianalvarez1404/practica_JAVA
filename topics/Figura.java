public abstract class Figura {

  //Este comportamiento sera obligatorio para todas las figuras
  abstract double calcularArea();

  void imprimirInformacion(){
    System.out.println("Esta información viene desde la clase abstracta");
  }
}
