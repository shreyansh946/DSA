package StacK_and_Queue;

import java.util.Stack;

public class MinimumBracket {

        public int Remove(String str)
        {
            if(str.length()%2 != 0) return -1;

            Stack<String> Stack = new Stack<>();

            for(int i=0;i<str.length();i++)
            {
                Character character = str.charAt(i);
                if (character.equals("{")) {
                    Stack.push(String.valueOf(character));
                }
                else
                {
                    if(Stack.size()  == 0 || Stack.peek().equals("}"))
                    {
                        Stack.push(String.valueOf(character));
                    }
                    else
                    {
                        Stack.pop();
                    }
                }
            }

            int ans=0,open=0,close =0;

           while(Stack.size()>0)
           {
               String c = Stack.pop();
               if(c.equals("{"))
               {
                   open++;
               }
               else
               {
                   close++;
               }
           }
            ans = (int)(Math.ceil(open/2.0) + Math.ceil(close/2.0));
           return ans;
        }
}


class Backet{

    public  static  void main(String[] args)
    {
        MinimumBracket minimumBracket = new MinimumBracket();

        String str = "}{{}}{{{";

        int count =  minimumBracket.Remove(str);
        System.out.println(count);
    }

}
