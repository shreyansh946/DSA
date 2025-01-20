package String;

import java.util.ArrayList;
import java.util.List;

class Palindrome {
    List<String> substrings = new ArrayList<>();
    public List<String> subString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }
        return substrings;
    }
    public int expand(String s, int i, int j) {
        int count = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }
    public int subString1(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int odd = expand(s, i, i);
            count += odd;
            int even = expand(s, i, i + 1);
            count += even;
        }
        return count;
    }
}

public class Revervseorder {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        List<String> substrings = palindrome.subString("noon");
        int substrings1 = palindrome.subString1("noon");
        for (String sb1 : substrings) {
            System.out.print(sb1 + " ");
        }
        System.out.println("\nPalindrome Substrings Count: " + substrings1);
    }
}
