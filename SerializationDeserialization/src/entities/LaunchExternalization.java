

import java.io.*;

class Demo implements Externalizable{
	String s;
	int i;
	int j;

	public Demo(String s,int i,int j){
		this.i=i;
		this.s=s;
		this.j=j;
	}

	public Demo(){
		System.out.println("Zero argument Constructor Called");
	}

	//callback method or magic method
	public void writeExternal(ObjectOutput oo)throws IOException{
		oo.writeObject(i);
		oo.writeObject(s);
	}

	public void readExternal(ObjectInput oi)throws IOException,ClassNotFoundException{
	i = (Integer) oi.readObject(); // Read Integer first
    s = (String) oi.readObject();  // Then read String		
	}
}

public class LaunchExternalization{
	public static void main(String args[])throws Exception{
		
		Demo d = new Demo("Harshit",12,2000);

		System.out.println("Serilazation Started");
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(d);

		System.out.println("Serilazation Ended");

		System.out.println("De-Serilazation Started");
		FileInputStream fi = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fi);
		Demo d1 = (Demo)ois.readObject();
		
		System.out.println("De-Serilazation Ended");

		System.out.println("String="+d1.s+"===>i="+d1.i+"====>j="+d1.j);
		
	}
}