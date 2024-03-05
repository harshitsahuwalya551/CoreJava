import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
class Launch15{
	public static void main(String args[])throws IOException{
		
		PrintWriter pw = new PrintWriter("file3.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while(line!=null){
			pw.println(line);
			line = br.readLine();
		}

		br = new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while(line!=null){
			pw.println(line);
			line = br.readLine();
		}
		br.close();
		pw.flush();
		pw.close();
	}
}