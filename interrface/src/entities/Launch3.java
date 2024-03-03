package entities;

interface myCalc{
	void add();
}

class calc{
	void sub() {
		int a = 20;
		int b = 30;
		int c = a - b;
		System.out.println(c);
	}
}

class calculaor extends calc implements myCalc{
	public void add(){
		
	}
	
}

public class Launch3 {
	
}
