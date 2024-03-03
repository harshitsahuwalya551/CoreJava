package entities;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class LaunchJoda1 {
	public static void main(String[] args) {
		LocalDateTime llDateTime = LocalDateTime.of(2000, 11,12,12,13);// immutable
		System.out.println(llDateTime);
		System.out.println(llDateTime.plusMonths(6));
		System.out.println(llDateTime.minusMonths(6));
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZonedDateTime timezoneDateTime = ZonedDateTime.now();
		System.out.println(timezoneDateTime);
 
	}
}