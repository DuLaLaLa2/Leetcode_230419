public class q_67 {
    public static void main(String[] args) {
        String a = "10101111111111111111111111111111111111111111111111111111111111111111111111111";
        String b = "1011";
        String s = addBinary(a, b);
        System.out.println(s);

    }
    public static String addBinary(String a, String b) {
        StringBuilder strBuilder = new StringBuilder();
        int al = a.length();
        int bl = b.length();
        int i1;
        int i2;
        int inf = 0;
        String s;
        int max_len = al;
        if(al>bl){
            b = String.format("%"+a.length()+"s",b).replace(" ","0");
        }else {
            max_len = bl;
            a = String.format("%"+b.length()+"s",a).replace(" ","0");
        }
        for (int i = max_len-1; i >= 0 ; i--) {
            i1 = a.charAt(i) - '0';
            i2 = b.charAt(i) - '0';
            if(i1==1 && i2==1){
                if(inf == 0){
                    strBuilder.append("0");
                }else {
                    strBuilder.append("1");
                }
                inf = 1;
            }else{
                if(inf == 1 && (i1+i2)!=0){
                    strBuilder.append("0");
                }else{
                    s = String.valueOf(i1 + i2 +inf);
                    strBuilder.append(s);
                    inf = 0;
                }
            }
        }
        if(inf==1){
            strBuilder.append("1");
        }
        s = strBuilder.reverse().toString();
        return s;
    }
    public static String addBinary2(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

}
