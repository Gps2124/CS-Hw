import java.util.*;
public class SentinelSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("next integer (–1 to quit)? ");
        int number = console.nextInt();
        while (number != -1) {
            sum += number;
            System.out.print("next integer (–1 to quit)? ");
            number = console.nextInt();
        }
        if (number == -1) {
            System.out.println("Sum is " + sum);
        }

    }
}