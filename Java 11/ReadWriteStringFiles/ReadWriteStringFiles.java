import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.IOException;

public class ReadWriteStringFiles {

    public static void main(String[] args) throws IOException {

        Path newFilePath = Files.createTempFile("example","txt");
        Files.writeString(newFilePath, "This is a written string in a file.");

        System.out.println(Files.readString(newFilePath));

    }

}