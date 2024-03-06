import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Dog implements Serializable{
	Cat c = new Cat();
}
class Cat implements Serializable{
	Rat r = new Rat();
}
class Rat implements Serializable{
	int i = 10;
}
public class ObejctGraph{
	public static void main(String args[])throws Exception{
		Dog d = new Dog();
		
		System.out.println("Serialzation Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialzation Ended");

		System.out.println("DeSerialzation Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println("DeSerialzation Started");

		System.out.println("i="+d1.c.r.i);

	}
}