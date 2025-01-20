package String;

class Valid
{
    public Boolean check(String s, int i, int j)
    {
        while(i<=j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }

    public Boolean pal(String s)
    {
            int i =0;
             int j= s.length() -1;


            while(i<=j)
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    return check(s,i+1,j) || check(s,i,j-1);
                }
                else {
                    i++;j--;
                }
            }
            return true;
    }

}

public class ValidPalindrome2 {

        public static  void main(String[] args)
        {
            Valid valid = new Valid();

          Boolean value = valid.pal("abcaa");

          System.out.print(value);

        }
}
