package String;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "(){}[]";

        Boolean value = valid(s);

        System.out.println(value);
    }

    public static Boolean valid(String s) {
        Stack<Character> st = new Stack<>(); // Change the Stack type to Character

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Character variable instead of Character object

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch); // Push the character directly
            } else {
                if (!st.empty()) {
                    char topch = st.peek(); // Directly retrieve the top character
                    if (ch == ')' && topch == '(') {
                        st.pop();
                    } else if (ch == ']' && topch == '[') {
                        st.pop();
                    } else if (ch == '}' && topch == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return st.empty(); // Ensure the stack is empty at the end
    }
}
