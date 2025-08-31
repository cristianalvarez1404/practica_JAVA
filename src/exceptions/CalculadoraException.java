package exceptions;

public class CalculadoraException extends Exception{

  String description;

  public CalculadoraException(String description){
    this.setDescription(description);
  }

  @Override
  public String getMessage(){
    return this.getDescription();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  


}
