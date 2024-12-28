package task.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        find the longest word
        String shortest = "";
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < min){
                shortest = str;
                min = str.length();
            }
        }
        int longest = shortest.length();
        for (String str :
                strs) {
            for (int i = 0; i < shortest.length(); i++) {
                if (str.charAt(i) != shortest.charAt(i)){
                    if (i < longest){
                        longest = i;
                    }
                    break;
                }
            }
        }
        return shortest.substring(0, longest);
    }
}
