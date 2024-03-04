import java.io.IOException;
import java.io.File;

public class Launch2 {
    public static void main(String[] args) throws IOException {
        File f = new File("Harshit");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
