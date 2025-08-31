import exceptions.CalculadoraException;
import exceptions.DividirPorCeroException;

public class 9Exceptions {
    public static void mainm(String[] args) throws Exception {
        //Exceptions: eventos que interrumpen el flujo normal de la aplicación
        //Unchecked and checked

        long numero1 = 5;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();
        //System.out.println(numero1 / numero2);
        //System.out.println("Esto va despues del error");

        try{
            resultado = calculadora.dividir((int) numero1, numero2);
            System.out.println(resultado);

        }catch(CalculadoraException error){
            error.printStackTrace();
            // System.out.println("Error al dividir por 0");
        }
        finally{
            System.out.println("Esto va despues del error");
        }


    }
}
