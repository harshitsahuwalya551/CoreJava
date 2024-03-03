package entities;
import java.util.*;
import java.io.*;

public class LaunchProperties {
	public static void main(String[] args)throws Exception {
		Properties p = new Properties();//properites object is created
		
		//creating a fileinputstream to read the data from a file called "database.properties" 
		FileInputStream fis = new FileInputStream("database.properties");
		
		//Data loaded into properties object
		p.load(fis);
		
		System.out.println(p);
		System.out.println("URL IS::"+p.getProperty("url"));
		System.out.println("Username is:"+p.getProperty("username"));
		System.out.println("Password is:"+p.getProperty("password"));
		
		p.setProperty("ineuron", "Harshit");
		FileOutputStream fos = new FileOutputStream("database.properties");
		
		
		
	}
}