import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] ss = s.split(",");

        int[]  arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }

         int sum = so.maxSumAfterPartitioning(arr,3);
         System.out.println(sum);
    }
}