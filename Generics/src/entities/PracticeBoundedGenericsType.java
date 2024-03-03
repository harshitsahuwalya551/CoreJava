package entities;

class Test<T extends Number>{
	private T value;
	public Test(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
}

public class PracticeBoundedGenericsType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> t = new Test<>(10);
		System.out.println(t.getValue());
	}
}