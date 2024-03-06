import java.io.*;

class Dog implements Serializable{
	String name = "Tommy";
	int age = 20;
}
class Cat implements Serializable{
	String name = "Catty";
	int age = 22;
}
class Rat implements Serializable{
	String name = "Ratu";
	int age = 3;
}


public class MultipleObjectSerialization{
	public static void main(String args[])throws Exception{
		Dog d = new Dog();
		Cat c = new Cat();
		Rat r = new Rat();

		System.out.println("Serilazation Started");
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		System.out.println("Serilazation Ended");

		System.out.println("De-Serilazation Started");
		FileInputStream fi = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fi);

		//This can perofrm issue beacuse the deserialization order is not same as we have serialized the objects
//		Dog d1 = (Dog)ois.readObject();
//		Rat r1 = (Rat)ois.readObject();
//		Cat c1 = (Cat)ois.readObject();

		//This is the correct way deserialized as we have serialzed the objects
//		Dog d1 = (Dog)ois.readObject();
//		Rat r1 = (Rat)ois.readObject();
//		Cat c1 = (Cat)ois.readObject();

	    //There is a another way to deserialized the data where order doesnt matter;
		
		try{
		while(true){
		Object obj = ois.readObject();
		if(obj instanceof Cat){
			Cat c1 = (Cat)obj;
			System.out.println(c1.name+"====>"+c1.age);
		}
		if(obj instanceof Rat){
			Rat r1 = (Rat)obj;
			System.out.println(r1.name+"====>"+r1.age);
		}
		if(obj instanceof Dog){
			Dog d1 = (Dog)obj;
			System.out.println(d1.name+"====>"+d1.age);
		}
		}
		}
		catch(Exception e){
		System.out.println("De-Serilazation Ended");
		}
		//System.out.println(d1.name+"====>"+d1.age);
		//System.out.println(c1.name+"====>"+c1.age);
		//System.out.println(r1.name+"====>"+r1.age);
		
	}
}