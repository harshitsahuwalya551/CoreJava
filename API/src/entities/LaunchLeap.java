package entities;
import java.time.*;

public class LaunchLeap {
 public static void main(String[] args) {
	 
//	Integer data=Integer.parseInt(args[0]);
//	 LocalDateTime localDateTime = LocalDateTime.now();
//	 
//	 int data = localDateTime.getYear();
//	 
	 Year year = Year.now();
	 if(year.isLeap())
		 System.out.println("Leap year");
	 else
		 System.out.println("Not a leap year");
 }
}