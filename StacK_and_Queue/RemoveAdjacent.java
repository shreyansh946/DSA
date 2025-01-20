package StacK_and_Queue;
import java.util.Stack;

public class RemoveAdjacent {

   public String Remove(String str)
   {
       Stack<String> stack = new Stack<>();

       for (int i = 0; i < str.length(); i++) {
           char currentChar = str.charAt(i);
           if (!stack.isEmpty() && stack.peek().equals(String.valueOf(currentChar))) {
               stack.pop();
           } else {
               stack.push(String.valueOf(currentChar));
           }
       }

       StringBuilder newstr = new StringBuilder();

       while (!stack.isEmpty()) {
           newstr.append(stack.pop());
       }
       newstr.reverse();

       return newstr.toString();
   }

}

class main{
    public  static  void main(String[] args)
    {
        RemoveAdjacent removeAdjacent = new RemoveAdjacent();
        String str = "aaaaaa";

      String adjacentString =  removeAdjacent.Remove(str);

      System.out.println(adjacentString);

    }


}
