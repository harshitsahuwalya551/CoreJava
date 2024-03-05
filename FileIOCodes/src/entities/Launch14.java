import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Launch14{
	public static void main(String args[])throws IOException{
			
		//try with resources
		try(FileWriter fw = new FileWriter("new2.txt");PrintWriter pw = new PrintWriter(fw);){
		pw.println(34);
		pw.println(34.4);
		pw.println('A');
		pw.println("Hi i am harshit sauwalya");
		
		}
	}
}