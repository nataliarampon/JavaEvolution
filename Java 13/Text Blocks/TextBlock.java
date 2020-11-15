public class TextBlock {

    public static void main(String[] args) {
        String string = "Hello\nCruel\nWorld";
        System.out.println(string);

        String textBlock = """
        Hello
        Cruel
        World""";

        System.out.println(textBlock);

        System.out.println(string.equals(textBlock));
    }

}