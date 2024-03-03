package entities;

public class VarargsDemo {

	public static void main(String[] args) {

		Calc obj = new Calc();
		
		int res = obj.add(6,4,8,5);
		System.out.println(res);
		
	}

}

class Calc{
	public int add(int ... nums) {
		int sum = 0;
		for(int i:nums) {
			sum = sum + i;
		}
		return sum;
	}
	
}