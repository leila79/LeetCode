package task.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder forward = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                forward.append(s.charAt(i));
            }
        }
        StringBuilder backward = new StringBuilder();
        for (int i = forward.length()-1; i >= 0; i--) {
            backward.append(forward.charAt(i));
        }
        if (backward.toString().contentEquals(forward)){
            System.out.println(true);
            return true;
        }
        return false;
    }
}
