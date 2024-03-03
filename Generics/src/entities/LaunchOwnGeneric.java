package entities;

class Gen<T>{
	T obj;
	Gen(T obj){
		this.obj = obj;
	}
	public void show() {
		System.out.println("The type of pbject is::" + obj.getClass().getName());
	}
	public T getObj() {
		return obj;
	}
}

public class LaunchOwnGeneric {
	public static void main(String[] args) {
		
	}
}
