/*
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class q_58 {
    public static void main(String[] args) {


    }
    public static int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == 32){
                if(res != 0)
                    break;
            }else{
                res++;
            }
        }
        return res;
    }
}
