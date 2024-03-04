package entites;

public class Outer19 {
    public void m1(){
        class Inner19{
            public void m2(){
                System.out.println("Hi");
            }
        }
        Inner19 in = new Inner19();
        in.m2();
    }
    public static void main(String[] args) {
        new Outer19().m1();
    }
}