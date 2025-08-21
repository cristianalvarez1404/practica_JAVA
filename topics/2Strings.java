public class Strings {
    public static void main(String[] args) throws Exception {
        String texto = "     Este es un texto";
        int longitud = texto.length();
        System.out.println(longitud);

        char caracter = texto.charAt(0);
        System.out.println(caracter);

        String subString = texto.substring(2,10);
        System.out.println(subString);

        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int indice = texto.indexOf("es");
        System.out.println(indice);

        String reemplazo = texto.replace("texto","hola");
        System.out.println(reemplazo);

        Boolean contiene = texto.contains("es");
        System.out.println(contiene);
    
        String sinEspacios = texto.trim();
        System.out.println(sinEspacios);
    }
}
