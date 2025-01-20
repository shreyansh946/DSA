package StacK_and_Queue;

import java.util.Stack;

class Validpara
{
    public int value(String s)
    {
        Stack<Integer> st = new Stack<>();

        int maxlen =0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.empty())
                {
                    st.push(i);
                }
                else
                {
                    int len = i-st.peek();
                    maxlen = Math.max(len,maxlen);
                }
            }

        }
        return maxlen;
    }
}

public class longestValidParenthesis
{
    public static void main(String[] args)
    {
        Validpara validpara = new Validpara();

     int count =   validpara.value("(()");

    System.out.println(count);
    }


}
