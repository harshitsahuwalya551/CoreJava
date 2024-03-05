import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Launch10{
	public static void main(String args[])throws IOException{
		
		File f = new File("new1.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		FileWriter f1 = new FileWriter(f);
		f1.write("I am harshit Sahuwalyaa");
		
		f1.flush();
		f1.close();
	}
}