package entities;

@FunctionalInterface
interface Addition{
	void add();
//	int sub(int a); 
}

class Demo{
	void getInfo() {
		System.out.println("Information in parent");
	}
}
class Demo2 extends Demo{
	@Override
	void getInfo() {
		System.out.println("Overridden Sucessfull");
	}
}
public class LaunchAnnotation1 {
	public static void main(String[] args) {
		
	}
}