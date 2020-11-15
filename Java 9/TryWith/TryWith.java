import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class TryWith {

    public static void main(String[] args) throws FileNotFoundException {
    
        BufferedReader readerBefore = new BufferedReader(new FileReader("example.txt"));
        try (BufferedReader readerTry = readerBefore) {
            System.out.println(readerTry.readLine());
        } catch (Exception e) {
            // Do Nothing
        }

        // BufferedReader readerBefore = new BufferedReader(new FileReader("example.txt"));
        // try (readerBefore) {
        //     System.out.println(readerBefore.readLine());
        // } catch (IOException e) {
        //     // Do Nothing
        // }

    }

}