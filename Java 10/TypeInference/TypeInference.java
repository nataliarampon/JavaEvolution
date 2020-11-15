import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class TypeInference {
    
    public static void main(String[] args) {
        
        // Local variable with initializer
        List<Integer> list = Arrays.asList(1,2,3);
        // var list = Arrays.asList(1,2,3);

        // Index of enhanced for loop
        for (int n : list) {
        // for (var n : list) {
            System.out.println(n);
        }

        // Local declared in a loop
        for (int i = 0; i < list.size(); i++) {
        // for (var i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}