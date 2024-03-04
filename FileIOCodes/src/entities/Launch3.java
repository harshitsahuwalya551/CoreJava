import java.io.File;
import java.io.IOException;

public class Launch3 {
    public static void main(String[] args) throws IOException {
        File f = new File("Harshit", "Launch4.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());

    }
}
