package StacK_and_Queue;

import java.util.Stack;

class Valid {
    public Boolean para(String s) {
        Stack<Character> st = new Stack<>(); // Initialize the stack outside the loop

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch); // Push opening brackets to the stack
            } else {
                if (!st.empty()) {
                    Character topch = st.peek();
                    if ((ch == ')' && topch == '(') ||
                            (ch == '}' && topch == '{') ||
                            (ch == ']' && topch == '[')) {
                        st.pop(); // Pop matching opening brackets
                    } else {
                        return false; // Mismatch case
                    }
                } else {
                    return false; // Closing bracket without matching opening bracket
                }
            }
        }
        return st.isEmpty(); // Return true if the stack is empty
    }
}

public class ValidParatheisis {
    public static void main(String[] args) {
        Valid valid = new Valid();
        Boolean value = valid.para("(())[]{}(");

        System.out.print(value); // Output the result
    }
}
