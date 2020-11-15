
public class TypeCast {

    public static void main(String[] args) {
        
        var obj = "haha";

        if(obj instanceof String) {
            String laughter = (String) obj;
            System.out.println(laughter);
        }

        // if(obj instanceof String laughter) {
        //     System.out.println(laughter);
        // }

    }

}