import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {
        
        System.out.println("' ' is blank? " + " ".isBlank());
        System.out.println("'' is blank? " + "".isBlank());
        System.out.println("' aa' is blank? " + " aa".isBlank());

        String multilinedString = "One\nTwo\nThree lines";
        System.out.println("String: " + multilinedString);
        System.out.println("String lines method: " + multilinedString.lines().collect(Collectors.toList()));

        System.out.println("String repeat: " + "na".repeat(12) + "BATMAN");
    }

}