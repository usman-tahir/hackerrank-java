package strings;

import java.io.*;
import java.util.*;

public class Anagrams {
    public static ArrayList<String> generateLettersFromWord(String word) {
        return new ArrayList<String>(Arrays.asList(word.toLowerCase().split("")));
    }

    public static boolean isAnagram(String a, String b) {
        ArrayList<String> wordOneLetters = generateLettersFromWord(a);
        ArrayList<String> wordTwoLetters = generateLettersFromWord(b);
        
        Collections.sort(wordOneLetters);
        Collections.sort(wordTwoLetters);

        return wordOneLetters.equals(wordTwoLetters);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        s.close();

        boolean result = isAnagram(a, b);
        System.out.println((result) ? "Anagrams" : "Not Anagrams");
    }
}