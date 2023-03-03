package InterviewPractice;

import java.util.Arrays;

public class Anagram{

    public static void main(String[] args) {
        // Listen - Silent
        // Players - parsley
        // Triangle - Integral
        // needs - dense
        // meat - team

        System.out.println(IsAnagram("Listen", "Silent"));

    }

    public static Boolean IsAnagram(String Word1, String Word2) {
        Boolean ReturnValue = false;
        // if the length is not equal they are not anagram
        if (Word1.length() != Word2.length()) {
            ReturnValue = false;
        } else {
            //get lower case of them
            Word1 = Word1.toLowerCase();
            Word2 = Word2.toLowerCase();
            //sort them
            char[] word1array = Word1.toCharArray();
            char[] word2array = Word2.toCharArray();
            Arrays.sort(word1array);
            Arrays.sort(word2array);
            //check them
            ReturnValue = Arrays.equals(word1array, word2array);
        }
        return ReturnValue;
    }
}