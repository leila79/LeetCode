package task.leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class HIndex {
    /*
    * The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
    * citations = [3,0,6,1,5]
    * sort        [0,1,3,5,6]
    * revers      [6,5,3,1,0]
    * i:           1,2,3,4,5
    * h-index(citations) = max{i: citation[i] >= i}
    */

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i = 0; i < citations.length / 2; i++)
        {
            int temp = citations[i];
            citations[i] = citations[citations.length - i - 1];
            citations[citations.length - i - 1] = temp;
        }
        int hMax = 0;
        for (int i = 0; i < citations.length; i++) {
            if(citations[i] >= i+1){
                if(i+1 > hMax){
                    hMax = i+1;
                }
            }
        }

        return hMax;
    }
}
