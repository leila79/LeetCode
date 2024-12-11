package task.leetcode;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length+1];
        int[] suffix = new int[nums.length+1];
        int[] answer = new int[nums.length];
        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = 1;
            suffix[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] * nums[i];
        }

        for (int i = nums.length-1; i >= 0 ; i--) {
            suffix[i] = suffix[i+1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++ ){
            answer[i] = prefix[i] * suffix[i+1];
        }

        return answer;
    }
}
