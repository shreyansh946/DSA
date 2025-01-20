package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args)
    {
        String str ="HelloWorld";

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        char mostFrequently = ' ';
        int maxfreq = 0;
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue() > maxfreq)
            {
                    mostFrequently = entry.getKey();
                    maxfreq = entry.getValue();
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequently + " (Frequency: " + maxfreq + ")");



        String[] strings = {"hello", "world", "java"};

        Map<Character, Integer> map1 = new HashMap<>();
        for (String str1 : strings) {
            for (char c : str1.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Frequencies: " + map1);
    }

}
