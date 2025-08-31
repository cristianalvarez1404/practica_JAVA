import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class 12Maps {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra verduleria");
        
        Map<String,Double> inventarios = new LinkedHashMap<String,Double>();

        inventarios.put("Banana", 0.89); 
        inventarios.put("Tomate", 0.75); 
        inventarios.put("Palta", 0.95); 
        inventarios.put("Frutilla", 0.65); 
        inventarios.put("Pimiento", 0.77);
        
        System.out.println("Este es el inventario de frutas y verduras: ");
        System.err.println(inventarios);

        for(String fruta : inventarios.keySet()){
            System.out.println(fruta + ": $" + inventarios.get(fruta));
        }

        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: ");
        String frutaBuscada = "Frutilla";

        if(inventarios.containsKey(frutaBuscada)){
            System.out.println("Hay en el inventario");
        }else{
            System.out.println("No hay en el inventario");
        }

        inventarios.remove(frutaBuscada);
        System.err.println(inventarios.size());
       
    }
}
