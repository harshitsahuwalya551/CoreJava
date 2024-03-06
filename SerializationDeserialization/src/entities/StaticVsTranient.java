import java.io.*;

class Dog implements Serializable{
	 transient String name = "Tommy";
	 transient static int age = 23;
}	
class StaticVsTransient{
	public static void main(String args[])throws Exception{
		Dog d = new Dog();

		System.out.println("Serialization Started");
		FileOutputStream fs = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		oos.writeObject(d);
		System.out.println("Serialization Ended");

		System.out.println("De-Serialization Started");
		FileInputStream os = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(os);
		Dog d1 = (Dog)ois.readObject();
		System.out.println("De-Serialization Ended");
		
		System.out.println("Name:"+d1.name+"\nAge:"+d1.age);
	}
}