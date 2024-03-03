package entities;


enum Gender{
	MALE,FEMALE,OTHERS;
}
public class LaunchEnum3 {
	public static void main(String[] args) {
		Gender gender = Gender.MALE;
		System.out.println(gender);
		
		Gender[] gr =  Gender.FEMALE.values();
		for(Gender g : gr) {
			System.out.println(g+" "+g.ordinal());
		} 
	}
} 