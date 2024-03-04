package entities;

import java.io.File;
import java.io.IOException;

public class Launch4 {
    public static void main(String[] args)throws IOException {
        File f = new File("Harsh");
        f.mkdir();
        File f1 = new File(f,"abc.txt");
        f1.createNewFile();
    }
}
