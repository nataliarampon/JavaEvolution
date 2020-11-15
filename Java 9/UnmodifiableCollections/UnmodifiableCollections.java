import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class UnmodifiableCollections {

    public static void main(String[] args) {

        List list = Arrays.asList("a","b","c");
        List immutableList = Collections.unmodifiableList(list);
        
        // List list = List.of("a", "b", "c");
        
        list.add("d");
    }

}