package TP2;

public class Ex3_2_1 {
    public static void main(String[] args) {
        countdown();
    }
    public static void countdown()  {
        for (int i = 10; i != -1; i--) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (java.lang.InterruptedException count) {
                System.out.println(count);
            }
        }
        System.out.println("BOOM !");
    }
}
