package entities;

class Bound<T extends A>{
	private T obj;
	public Bound(T obj) {
		this.obj = obj;
	}
	public void doRunTest() {
		this.obj.displayClass();
	}
}
class A{
	public void displayClass() {
		System.out.println("Inside super class A");
	}
}
class B extends A{
	public void displayClass() {
		System.out.println("Inside super class B");
	}
}
class C extends A{
	public void displayClass() {
		System.out.println("Inside super class C");
	}
}

public class PracticeBoundedGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bound<C> c = new Bound<>(new C());
		c.doRunTest();
		Bound<B> b = new Bound<B>(new B());
		b.doRunTest();
		Bound<A> a = new Bound<A>(new A());
		a.doRunTest();
	
	}

}
