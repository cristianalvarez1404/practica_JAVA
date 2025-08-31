public class Rectangulo extends Figura {
  double lado1;
  double lado2;

  public Rectangulo(double l1,double l2){
    this.lado1 = l1;
    this.lado2 = l2;
  } 

  @Override
  double calcularArea() {
    return this.lado1 * lado2;
  }
}
