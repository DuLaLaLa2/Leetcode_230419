import java.util.Scanner;

/***
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */

public class question2 {
    public static void main(String[] args) {
        boolean res;
        int va = 1221;
        res = isPalindrome(va);
        System.out.println(res);
    }
    public static boolean isPalindrome(int x) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        char[] ca = String.valueOf(x).toCharArray();
        for (int i = 0; i < ca.length/2; i++) {
            if(ca[i]!=ca[ca.length-i-1]){
                return false;
            }
        }
        return true;
    }
}

