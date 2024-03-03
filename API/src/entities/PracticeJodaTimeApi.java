package entities;
import java.time.*;
public class PracticeJodaTimeApi {
    public static void main(String[] args) {
        //To get the current Date we use .now()
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //To get the user defined date we have to use of()
        LocalDate date1 = LocalDate.of(2002,11,12);
        System.out.println(date1);
    }
}
