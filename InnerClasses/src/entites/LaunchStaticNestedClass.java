package entites;

public class LaunchStaticNestedClass {
    static int a = 10;

    static class Inner17 {
        public void msg() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        LaunchStaticNestedClass.Inner17 in17 = new LaunchStaticNestedClass.Inner17();
        in17.msg();
    }
}
