package entites;

public class Outer21 {
    int i = 10;
    static int j = 20;

    public static void msg() {
        int k = 50;
        final int I = 40;
        class Inner21 {
            public void m2() {
                // System.out.println(i);
                System.out.println(j);
                System.out.println(k);
                System.out.println(I);
            }
        }
        Inner21 inner21 = new Inner21();
        inner21.m2();
    }
    public static void main(String[] args) {
        Outer21.msg();
    }
}
