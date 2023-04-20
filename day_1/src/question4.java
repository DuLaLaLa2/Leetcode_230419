/***
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */

public class question4 {
    public static void main(String[] args) {
        String res;
        String[] strs = {"cir","cal"};
        res = longestCommonPrefix(strs);
        System.out.println(res);
    }
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder s = new StringBuilder();
        char[] ca = strs[0].toCharArray();
        int minimun = ca.length;

        for (int i = 1; i < strs.length; i++) {
            int tp = 0;
            char[] ca2 = strs[i].toCharArray();
            for (int j = 0; j < ca.length && j < ca2.length; j++) {
                if (ca[j] == ca2[j])
                    tp++;
                else
                    break;
            }
            if(minimun > tp)
                minimun = tp;
        }

        if (minimun == 0) {
            s = new StringBuilder();
        }
        else{
            for (int i = 0; i < minimun; i++) {
                s.append(ca[i]);
            }
        }
        return s.toString();
    }
}
