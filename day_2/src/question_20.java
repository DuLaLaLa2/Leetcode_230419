import java.util.HashMap;
import java.util.Stack;

/***
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class question_20 {
    public boolean isValid(String s) {
        boolean result = false;
        char[] ca = s.toCharArray();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (char c : ca) {
            if (c == '(' || c == '[' || c == '{') {
                st1.push(c);
            } else if (c == ')') {
                if(!st1.empty() && st1.peek() == '('){
                    st1.pop();
                }else {
                    st2.push(c);
                }
            } else if (c == ']') {
                if(!st1.empty() && st1.peek() == '['){
                    st1.pop();
                }else {
                    st2.push(c);
                }
            }else if (c == '}') {
                if(!st1.empty() && st1.peek() == '{'){
                    st1.pop();
                }else {
                    st2.push(c);
                }
            }
            else
                return false;
        }
        if(st1.empty() && st2.empty()){
            result = true;
        }
        return result;
    }
}
