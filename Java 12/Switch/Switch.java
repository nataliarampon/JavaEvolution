import java.lang.IllegalArgumentException;

public class Switch {

    public static void main(String[] args) {
        
        String color = "blue";

        switch (color) {
            case "blue":
            case "green":
            case "cyan":
                        color = "blue";
                        break;

            case "purple":
            case "magenta":
            case "violet": 
                        color = "purple";
                        break;
            default:
                break;
        }

        System.out.println("Color: " + color);
        color = "magenta";

        String result = switch(color) {
            case "blue", "green", "cyan" -> "blue";
            case "purple", "magenta", "violet" -> "purple";
            default -> {
                throw new IllegalArgumentException("Provide a valid value.");
            }
        };

        System.out.println("Result: " + result);

    }

}