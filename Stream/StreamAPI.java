package Stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args)
    {
        String str = "Shreyansh";

        Map<Character, Long> map = str.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(s -> s,
             LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);


        List<String> names = Arrays.asList("AA","BB","CC","AA");

        Map<String,Long> namescount = names.stream()
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey ,Map.Entry::getValue));

        System.out.println(namescount);


        List<Integer> number = Arrays.asList(2,3,4,5,6);
        int maxvalue = number.stream().max(Integer::compare).get();

    int secondmaxvalue =    number.stream().sorted(Collections
                            .reverseOrder()).distinct()
                            .skip(1).findFirst()
                            .orElse(-1);
    System.out.println(secondmaxvalue);
        String input = "java articles";
        Set<Character> seen = new  HashSet<>();
        Character result = input.chars().mapToObj(s->(char) s)
                .filter( c -> !seen.add(c)).findFirst().orElse(null);

        System.out.println(result);

        Character seen1 = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(seen1);

        String str1 = "shreyansh";  // The string
        char checkChar = 'h';      // The character to check

        // Using Stream API to check if the string contains the character 'h'
      Boolean value1 =  str1.chars()
                .anyMatch(c -> c == checkChar);
        System.out.println(value1);


        //check vowel
        String str2 = "shreyansh";
        List<Character> vowelstr = str2.chars().mapToObj(s -> (char) s)
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                 .collect(Collectors.toList());
        System.out.println(vowelstr);

        String newstr = "shreyansh";
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=newstr.length()-1;i>=0;i--)
        {
            stringBuffer.append(newstr.charAt(i));
        }

        System.out.println(stringBuffer);

    }



}
