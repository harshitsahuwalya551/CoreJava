import java.io.*;

class Sachin implements Serializable{
	String name = "Sachin";
	transient String password = "tendulkar";

	private void writeObject(ObjectOutputStream oos)throws Exception{
		
		oos.defaultWriteObject();//All the properties will be written

		String enpswd = 123+password;

		oos.writeObject(enpswd);//Writing the encrypted data
	}
	private void readObject(ObjectInputStream ois)throws Exception{
		ois.defaultReadObject();//All the properties will be written

		String enpwd = (String)ois.readObject();
		password = enpwd.substring(3);
	}

}
public class CustomSerialization{
	public static void main(String args[])throws Exception{
		Sachin s = new Sachin();
		
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serialization Ended");
		
		System.out.println("De-Serialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sachin s1 = (Sachin)ois.readObject();
		System.out.println("De-Serialization Ended");

		System.out.println(s1.name+"========"+s1.password);
	}
}