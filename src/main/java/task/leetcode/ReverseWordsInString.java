package task.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reverseWords = new StringBuilder();
        for (int i = words.length-1 ; i >= 0; i--) {
            if(!words[i].equals("")){
                reverseWords.append(words[i]).append(" ");
            }
        }
        reverseWords.deleteCharAt(reverseWords.length()-1);
        return reverseWords.toString();
    }
}
