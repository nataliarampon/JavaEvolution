public class Switch {

    public static void main(String[] args) {
        
        String color = "blue";

        switch (color) {
            case "blue", "green",  "cyan":
                        color = "blue";
                        break;

            case "purple",  "magenta", "violet": 
                        color = "purple";
                        break;
            default:
                break;
        }

        System.out.println("Color: " + color);

    }

}