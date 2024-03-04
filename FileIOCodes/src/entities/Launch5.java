package entities;
import java.io.File;
public class Launch5
{
	public static void main(String args[]){
		File f = new File("C:\\Users\\Harshit Kumar\\eclipse-workspace\\FileIOCodes");
		String[] filee = f.list();
		int fileCount = 0;
		int dirCount = 0;
		for(String value: filee){
			File f1 = new File(f,value);
			if(f1.isDirectory()){
				dirCount++;
			}else if(f1.isFile()){
				fileCount++;
			}
		}
			System.out.println("Number of directories present::" +dirCount);
			System.out.println("Number of files present::" +fileCount);

	}
}
