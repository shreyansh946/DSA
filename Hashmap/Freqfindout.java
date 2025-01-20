package Hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class Freqfindout {

    public static void main(String[] str) {
        String stre = "shreeyansh";

        // Calculate character frequencies (preserving order)
        Map<Character, Long> freqchar = stre.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(s -> s,
                        LinkedHashMap::new, Collectors.counting()));

        // Find the first non-repeating character
        Optional<Character> firstNonRepeating = freqchar.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        // Print character frequencies
        for (Map.Entry<Character, Long> entry : freqchar.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
        System.out.println();

        // Print the first non-repeating character
        System.out.println("First non-repeating character: " +
                firstNonRepeating.orElse('N')); // 'N' if no non-repeating character is found


        String check = "h";

        Boolean value = stre.chars().mapToObj(s->(char)s)
                        .anyMatch(s -> check.indexOf(s) >= 0);


        List<Integer> array = Arrays.asList(4,5,6,7,11,5);

      int val =  array.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

      System.out.println(val);

      int val1 = array.stream().max(Integer::compare).get();

      System.out.println(val1);

      array.stream().map(s -> s +" ").filter(s -> s.startsWith("1")).forEach(System.out::println);


      List<Character> vowel = stre.chars().mapToObj(s -> (char)s).distinct().filter(s-> "aieouAEIOU".indexOf(s) == 0).collect(Collectors.toList());

      System.out.println(vowel);


    }
}
