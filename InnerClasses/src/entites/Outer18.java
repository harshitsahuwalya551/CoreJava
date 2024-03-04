package entites;

public class Outer18 {
    static int x = 18;

    static class Inner18 {
        public static void msg() {
            System.out.println(x);
        }
    }

    /*
     * class Inner18{
     * static void msg(){
     * System.out.println(x);
     * }
     * }
     */

    // static classs Inner18
    // {

    // }

    public static void main(String[] args) {
        // new Outer18().new Inner18().msg();
        // new Outer18().new Inner18().msg();
        Inner18.msg();
    }
}

