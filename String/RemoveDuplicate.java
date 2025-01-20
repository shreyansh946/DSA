package String;



class Remove {

    public String duplicate(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!ans.isEmpty() && ans.charAt(ans.length() - 1) == s.charAt(i)) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(s.charAt(i)); // Append current character
            }
        }
        return ans.toString();
    }
    public String dup(String s,String sbtr)
    {
        StringBuilder sb = new StringBuilder(s);
        int pos = sb.indexOf(sbtr);
        while (pos != -1) {
            sb.delete(pos, pos + sbtr.length());
            pos = sb.indexOf(sbtr);
        }
        return sb.toString();
    }
}

public class RemoveDuplicate {

    public static void main(String[] args) {
        Remove rm = new Remove();
        String newstr = rm.duplicate("abbaca" + " "); //remove adjust string
        String newstr1 =rm.dup("daacbaabcbc","abc"); //remove substr
        System.out.print(newstr);
        System.out.print(newstr1); // Output should be "ca"
    }
}

