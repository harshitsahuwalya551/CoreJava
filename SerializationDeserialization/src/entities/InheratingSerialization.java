import java.io.*;

class Animal implements Serializable{
	int i = 10;
}
class Dog1 extends Animal{
	int j  = 20;
}
public class InheratingSerialization{
	public static void main(String args[])throws Exception{
		Dog1 d = new Dog1();

		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization Ended");

		System.out.println("De-Serialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d1 = (Dog1)ois.readObject();
		System.out.println("De-Serialization Ended");
		System.out.println("Accesing inherted class data -> j:"+d1.j);
	}
}