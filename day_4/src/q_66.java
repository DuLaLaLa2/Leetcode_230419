import java.util.Arrays;
/*
给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

 */
public class q_66 {
    public static void main(String[] args) {
        int[] di = {8,9,9,9};
        int[] ints = plusOne(di);
        for (int i: ints) {
            System.out.println(i);
        }
    }
    public static int[] plusOne(int[] digits) {
        boolean flag = true;
        for (int i = digits.length-1; i >= 0  ; i--) {
            if (digits[i] != 9) {
                flag = false;
                break;
            }
        }
        if(!flag){
            for (int i = digits.length-1; i >= 0 ; i--) {
                if (digits[i] != 9){
                    digits[i]++;
                    for (int j = i+1; j < digits.length; j++) {
                        digits[j] = 0;
                    }
                    break;
                }
            }
            return digits;
        }else {
            int[] new_arr = new int[digits.length+1];
            new_arr[0] = 1;
            for (int i = 1; i < new_arr.length; i++) {
                new_arr[i] = 0;
            }
            return new_arr;
        }
    }
}
