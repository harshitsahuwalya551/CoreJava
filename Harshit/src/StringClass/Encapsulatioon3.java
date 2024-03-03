package StringClass;
    
class Fan{
	private int cost;
	private String brand;
	
	//setter method
	public void setCost(int x) {
		cost = x;
	}
	
	//setter method
	public void setBrand(String x) {
		brand = x;
	}
	
	//getter method
	public int getCost() {
		return cost;
	}
	
	//getter method
	public String getName() {
		return brand;
	}
}
    
public class Encapsulatioon3 {
     
	public static void main(String[] args) {
     
		//making instance of class fan
		Fan f1 = new Fan();
	   
		//acessing cost of f1
		f1.setCost(1000);
		f1.setBrand("Bajaj");
		
	
		System.out.println(f1.getCost());
		System.out.println(f1.getName());
	}
    
}
