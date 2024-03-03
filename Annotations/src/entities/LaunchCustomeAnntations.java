package entities;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
	String gameName() default "Cricket";
	int runs() default 20000 ;
} 	


@CricketPlayer
class Virat{
	private String name;
	private int age;
	@CricketPlayer
	public void disp() {
		System.out.println("Virat is Indian");
	}
}

public class LaunchCustomeAnntations {
	public static void main(String[] args) {
		Virat v = new Virat();
		v.disp();
        Class c = v.getClass();
  
	}
}
