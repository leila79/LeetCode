package task.leetcode;

import java.util.Arrays;

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        String[] rows = new String[numRows];
        Arrays.fill(rows, "");

        int i = 0;
        while (i < s.length()) {
            int r = 0;
            while (r != numRows){
                rows[r] += s.charAt(i);
                r++;
                i++;
                if(i == s.length()) break;
            }
            if(i == s.length()) break;
            int z = 1;
            while (z <= r-2){
                rows[numRows-1-z] += s.charAt(i);
                z++;
                i++;
                if(i == s.length()) break;
            }
            if(i == s.length()) break;
        }
        String zigzag = "";
        for (i = 0; i < numRows; i++) {
            zigzag += rows[i] ;
        }
        return zigzag;
    }
}
