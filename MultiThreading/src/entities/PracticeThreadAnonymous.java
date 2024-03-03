package entities;

public class PracticeThreadAnonymous {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("Hi");
            }
        };
        t.start();
    }
}
