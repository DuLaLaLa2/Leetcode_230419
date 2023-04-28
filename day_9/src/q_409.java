import java.util.HashMap;

public class q_409 {
    public static void main(String[] args) {
        int res = longestPalindrome("aaaaasss");
        System.out.println(res);
    }
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> ha = new HashMap<>();
        for (int i=0;i<s.length();++i) {
            char c = s.charAt(i);
            if (ha.containsKey(c)) {
                ha.compute(c,(key,value)->++value);
            } else
                ha.put(c, 1);
        }
        boolean isexist = false;
        int res = 0;
        for (int value : ha.values()) {
             if(value%2!=0)
                 isexist = true;
            res += value - value % 2;
        }
        return isexist?res + 1:res;
    }
}
