package entities;
import java.time.*;
public class LaunchJodaAPI {
	public static void main(String[] args) {
		LocalDate datee = LocalDate.now();
		System.out.println(datee);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	
		System.out.println(datee.getYear());
		
	}
}