import java.io.IOException;
import java.io.FileWriter;

public class Launch9{
	public static void main(String args[])throws IOException {
		FileWriter f = new FileWriter("abcde.txt");
		f.write("I am harshit Sahuwalya");
		f.flush();
		f.close();
		
	}
}