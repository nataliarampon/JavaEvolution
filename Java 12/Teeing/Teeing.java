import java.util.stream.Collectors;
import java.util.List;
import java.lang.Double;

public class Teeing {

    public static void main(String[] args) {
        
        List<Double> grades = List.of(6.7, 7.8, 9.4, 3.6, 4.5);

        long quantity = grades.stream().count();
        double sum = grades.stream().collect(Collectors.summingDouble(d -> d));

        System.out.println(sum/quantity);

        // double average = grades.stream()
        //                         .collect(Collectors.teeing(
        //                             Collectors.summingDouble(d -> d),
        //                             Collectors.counting(),
        //                             (sumTee, quantityTee) -> sumTee / quantityTee
        //                         ));
        
        // System.out.println(average);                      
    }

}