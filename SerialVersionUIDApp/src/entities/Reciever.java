package entities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reciever {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("DeSerialization Started");
		FileInputStream fileInputStream = new FileInputStream("abc.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student s1 = (Student)objectInputStream.readObject();
		System.out.println("DeSerialization Ended");
		System.out.println(s1.i+"=========="+s1.j);
	}
}
