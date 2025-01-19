package task.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    private int findLastWordInLine(int first, String[] words, int maxWidth) {
        int last = first;
        int sum = words[last].length();
        int i = first + 1;
        while (i < words.length && sum <= maxWidth) {
            int length = words[i].length();
            if (sum + length + 1 <= maxWidth) {
                sum += length + 1;
                last++;
            } else {
                break;
            }
            i++;
        }
        return last;
    }

    private int wordsLength(int first, int last, String[] words) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += words[i].length();
        }
        return sum;
    }

    private String justify(int first, int last, String[] words, int maxWidth) {

        String line = "";
        if (first == last){
            line += words[last];
            int remainder = maxWidth - line.length();
            while (remainder > 0){
                line += " ";
                remainder--;
            }
            return line;
        }
        int numSpaces = last - first;
        int totalSpace = maxWidth - wordsLength(first, last, words);
        if (last == words.length - 1) {
            for (int j = first; j < last; j++) {
                line += words[j] + " ";
            }
            line += words[last];
            double extra = maxWidth - line.length();
            for (int k = 0; k < extra; k++) {
                line += " ";
            }
        } else {
            int space = totalSpace / numSpaces;
            int remainder = totalSpace % numSpaces;
            for (int j = first; j < last; j++) {
                line += words[j];
                for (int k = 0; k < space; k++) {
                    line += " ";
                }
                if (remainder > 0) {
                    line += " ";
                    remainder--;
                }
            }
            line += words[last];
            while (remainder > 0){
                line += " ";
                remainder--;
            }
        }
        return line;
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> format = new ArrayList<>();
        int first = 0;
        while (first < words.length) {
            int last = findLastWordInLine(first, words, maxWidth);
            String line = justify(first, last, words, maxWidth);
            format.add(line);
            first = last + 1;
        }
        return format;
    }
}
