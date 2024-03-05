import java.io.*;

public class Launch11{
	public static void main(String[] args)throws IOException{
		FileReader f = new FileReader("new1.txt");
		int i = f.read();
		while(i!=-1){
			
		System.out.print((char)i);
		i = f.read();
		}

	}
}