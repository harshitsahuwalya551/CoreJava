package entities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Sender {
	public static void main(String[] args) throws IOException {
		Student d = new Student();
		System.out.println("Serialization Started");
		FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(d);
		System.out.println("Serialization Ended");
	}
}
