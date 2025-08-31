import intefaces.IAlimentable;
import intefaces.IComunicable;

public class Pulpo extends CriaturasMarinas implements IComunicable, IAlimentable{
  public Pulpo(String nombre){
    super(nombre);
  }  

  @Override
  public void nadar(){
    System.out.println("El pulto " + this.nombre + " esta nadando");
  }

  @Override
  public void comunicar(){
    System.out.println(this.nombre + " emite sonidos");
  }

  @Override
  public void alimentar(){
    System.out.println(this.nombre + " se esta alimentando");
  }

}
