package entites;

public class Outer20 {
    
    public static void m1() {
        final int x = 10;
        class Inner20 {
            public static void m2() {
                System.out.println(x);
            }
        }
        // Inner20 inner20 = new Inner20();
        Inner20.m2();
    }

    public static void main(String[] args) {
        Outer20.m1();
    }
}