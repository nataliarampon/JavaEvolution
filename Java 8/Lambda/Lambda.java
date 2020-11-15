import java.lang.Runnable;
import java.lang.Thread;

public class Lambda {

    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Function");
            }
        };

        Thread thread = new Thread(run);
        thread.start();

        // Thread thread = new Thread( () -> System.out.println("My Lambda"));
        // thread.start();
    }
}