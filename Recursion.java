import java.util.ArrayList;

public class Recursion {
    public static void main(String[] args) {
        count(100);
    }
    public static void count(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        count(n-1);
        System.out.print(n + " ");

    }
}