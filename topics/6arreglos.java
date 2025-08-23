
public class App {
    public static void main(String[] args) throws Exception {
        //arrays
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
        for(int num : numeros){
            System.out.println(num);
        }
 
        System.out.println("Cantidad de elementos: " + numeros.length);
    
        for(int i = 0; i <= numeros.length - 1; i++){
            System.out.println(numeros[i]);
        }

        int[] numeros2 = {10, 20, 30, 40, 50};
        char[] letras = new char[1];
        letras[0] = 5;

        for(int num : numeros2){
            System.out.println(num);
        }

        String palabra = "Abecedario";

        System.out.println(palabra.length());

    }
}
