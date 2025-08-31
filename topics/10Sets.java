import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class 10Sets {
    public static void main(String[] args) throws Exception {
        
        Set<String> superHeroes = new LinkedHashSet<String>();
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
