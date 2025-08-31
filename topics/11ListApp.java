import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class 11ListApp {
    public static void main(String[] args) throws Exception {
        
        List<String> superHeroes = new ArrayList<String>();
        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");
        superHeroes.add("Iron man");

        if(superHeroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        if(superHeroes.contains("Hulk")){
            System.out.println("Hulk se ha ido de la fiesta");
        }

        superHeroes.add("Superman");
        superHeroes.add("Superman");
        superHeroes.add("Superman");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("hola " +superHeroes.get(2));

        superHeroes.set(0,"Tony");

        if(superHeroes.isEmpty()){
            System.out.println("No Hay fiesta");
        }else {
            System.out.println("Hay fiesta y hay " + superHeroes.size() + " superheroes");
        }
        
        System.out.println(superHeroes);

        for(String superheroe : superHeroes){
            System.out.println(superheroe);
        }

    }
}
