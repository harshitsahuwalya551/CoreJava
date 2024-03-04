import java.io.IOException;
import java.io.FileReader;
import java.io.File;

public class Launch7{
	public static void main(String args[]){
		File f = new File("abcd.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new Char[(int)f.length()];
		fr.read(ch);
		for(char val : ch){
			System.out.println(val);
		}
		fr.close();
	}
}