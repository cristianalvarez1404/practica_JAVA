import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int edad = 19;

        if (edad > 60) {
            System.out.println("Eres un viejo");
        } else if (edad > 18) {
            System.out.println("Eres adulto");
        } else if (edad > 15) {
            System.out.println("Eres un Joven");
        } else {
            System.out.println("Eres un@ niñ@");
        }

        // Qué tipo de bebida te gusta
        String bebida = "cafe";

        switch (bebida) {
            case "cafe": {
                System.out.println("Lo mejor!");
                break;
            }
            case "mate": {
                System.out.println("Eres argentino o uruguayo");
                break;
            }
            default: {
                System.out.println("No sé que tomas!");
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elegí una opción: ");
        System.out.println("1: Café");
        System.out.println("2: Mate");
        System.out.println("3: Vino");
        System.out.println("4: Gaseosa");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Te gusta el café");
                break;
            case 2:
                System.out.println("Te gusta el Mate");
                break;
            case 3:
                System.out.println("Te gusta el Vino");
                break;
            case 4:
                System.out.println("Te gusta la gaseosa");
                break;
            default:
                System.out.println("No te gusta nada");
                break;
        }
        scanner.close();
    }
}

