/***
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 实现给定一个罗马数字，将其转换成整数。
 */
public class question3 {
    public static void main(String[] args) {
        int res;
//        res = romanToInt("MCMXCIV");
        res = romanToInt("DI");
        System.out.println(res);//1994
    }
    public static int romanToInt(String s) {
        int value = 0;
        char[] ca = s.toCharArray();
        char[] LMS = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        for (int i = 0; i < ca.length; i++) {
            if(ca[i] == 'I')
                value += 1;
            if(ca[i] == 'V')
                if(i>0 && ca[i-1] == 'I')
                    value += 3;
                else value += 5;
            if(ca[i] == 'X')
                if(i>0 && ca[i-1] == 'I')
                    value += 8;
                else value += 10;
            if(ca[i] == 'L')
                if(i>0 && ca[i-1] == 'X')
                    value += 30;
                else value += 50;
            if(ca[i] == 'C')
                if(i>0 && ca[i-1] == 'X')
                    value += 80;
                else value += 100;
            if(ca[i] == 'D')
                if(i>0 && ca[i-1] == 'C')
                    value += 300;
                else value += 500;
            if(ca[i] == 'M')
                if(i>0 && ca[i-1] == 'C')
                    value += 800;
                else value += 1000;
        }
        return value;
    }
}
