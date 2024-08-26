package task.leetcode;

import java.util.Arrays;

public class RotateArray {

//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
    public void rotate(int[] nums, int k) {
//        shift one at a time and do it for k times -> Time Limit Exceeded for k = 54944
//        while (k > 0){
//            int lastElement = nums[nums.length-1];
//            for (int i = nums.length-2; i >= 0 ; i--) {
//                nums[i+1] = nums[i];
//            }
//            nums[0] = lastElement;
//            k--;
//        }

//        shift k step at once
        if (k > nums.length){
            k = k % nums.length;
        }
        int[] lastKElement = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        for (int i = nums.length-k-1; i >= 0 ; i--) {
                nums[i+k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = lastKElement[i];
        }

    }
}
