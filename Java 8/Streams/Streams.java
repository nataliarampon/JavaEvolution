import java.util.LinkedList;
import java.util.List;
import java.lang.Runnable;
import java.lang.Override;

public class Streams {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Manga");
        list.add("Maçã");

        for(String product : list) {
            System.out.println("Produto: " + product);
        }

        // list.stream().forEach( product -> System.out.println("Produto: " + product) );

        // System.out.println("**** MAP ****");
        // list.stream().map( product -> product + "//////" ).forEach( result -> System.out.println(result) );

        // System.out.println("**** FILTER ****");
        // list.stream().filter( product -> product.length() > 4).forEach( result -> System.out.println(result) );
    }

}