import java.io.*;

class Dog implements Serializable{
	int i=10;
	int j=20;
}

public class Launch1{
	public static void main(String args[])throws Exception{
		Dog d = new Dog();

		System.out.println("Serilazation Started");
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(d);

		System.out.println("Serilazation Ended");

		System.out.println("De-Serilazation Started");
		FileInputStream fi = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Dog d1 = (Dog)ois.readObject();
		
		System.out.println("De-Serilazation Ended");

		System.out.println("i="+d1.i+"====>j="+d1.j);
		
	}
}