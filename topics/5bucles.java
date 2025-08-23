import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 10 ; i++){
            System.out.println("Estamos en i: " + i);
            for(int j = 1; j <= 5; j++){
                System.out.println("Estamos en J: "+ j);
            }
        }
        
        int num = 10;
        while(num > 1){
            System.out.println("Buble while");
            num--;
        }

        do {
            System.out.println("Se ejecuta minimo 1 vez");
        }while(num < 10);
    }
}
