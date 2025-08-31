import intefaces.IAlimentable;
import intefaces.IComunicable;

public class Delfin extends CriaturasMarinas implements IComunicable,IAlimentable{
  public Delfin(String nombre){
    super(nombre);
  }

  @Override
  public void nadar(){
    System.out.println(this.nombre + " esta nadando");
  }

  @Override
  public void comunicar(){
    System.out.println(this.nombre + " emite sonidos");
  }

  @Override
  public void alimentar(){
    System.out.println(this.nombre + " esta alimentandose");
  }

}
