import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Launch13{
	public static void main(String args[])throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("new2.txt"));
		String line = br.readLine();
		while(line!=null){
		System.out.println(line);
		line=br.readLine();
		}
		br.close();
	}
}