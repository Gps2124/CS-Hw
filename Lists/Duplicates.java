import java.util.*;

public class Duplicates {
    public static void main(String[] args) {

    }

    public static int countDuplicates(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }

        }
        return count;
    }
}