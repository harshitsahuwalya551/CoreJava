package entites;
public class Outer22 {
    class Inner22{
        public static void m1(){
            System.out.println("Hi");
        }
    }
    public static void main(String[] args) {
        new Outer22().new Inner22().m1();
    }
}
