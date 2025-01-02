package task.leetcode;

public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {
        char first = needle.charAt(0);
        int max = haystack.length() - needle.length();
        for (int i = 0; i <= max; i++) {
            if (haystack.charAt(i) != first){
//                Find the First
                while (i < max && haystack.charAt(i) != first){
                    i++;
                }
            }
            if (haystack.charAt(i) != first){
                break;
            }
            if (i <= max){
                int j = i + 1;
                int k = 1;
                int end = j + needle.length() - 1;
//                Check the Rest
                while (j < end && haystack.charAt(j) == needle.charAt(k)) {
                    k++;
                    j++;
                }
                if (j == end){
                    return i;
                }
            }
        }

        return -1;
    }
}
