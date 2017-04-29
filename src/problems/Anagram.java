package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "ABC";
        String str2 = "CAB";
        System.out.println("Are these two strings are anrgam ? "+isAnargam(str1, str2));
    }
    public static boolean isAnargam(String str1, String str2){
        char[] word = str1.toCharArray();
        char[] word2 = str2.toCharArray();
        Arrays.sort(word);
        Arrays.sort(word2);
        return Arrays.equals(word, word2);
    }
}
