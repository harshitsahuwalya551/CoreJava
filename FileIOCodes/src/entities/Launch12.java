import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Launch12{
	public static void main(String args[])throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("new2.txt")); 
		bw.write("Hi i am harshit Sahuwalya");
		bw.write(23);
		bw.newLine();
		bw.write("Hello");
		bw.flush();
		bw.close();
	}
}