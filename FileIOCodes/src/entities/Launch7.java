import java.io.IOException;
import java.io.FileReader;
public class Launch7{
	public static void main(String args[])throws IOException{
		FileReader f = new FileReader("abcd.txt");
		int i = f.read();
		while(i!=-1){
			System.out.print((char)i);
			i = f.read();
		}
		f.close();
	}
}