import java.io.*;

class Sachin implements Serializable{
	String name = "Sachin";
	transient String password = "Tendulakr";
}
public class Launch3{
	public static void main(String args[])throws Exception{
		Sachin s = new Sachin();

		System.out.println("Serialization Startes");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serialization Ended");

		System.out.println("De-Serialization Startes");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sachin s1 = (Sachin)ois.readObject();
		System.out.println("De-Serialization Ended");

		System.out.println(s1.name+"<========>"+s1.password);
	}
}