package task.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length-count; i++) {
            if(nums[i] == val){
                shift(nums, i);
                count++;
                i--;
            }
        }
        return  nums.length - count;
    }
    private void shift(int[] nums1, int i){
        int k = i+1;
        while (k <= nums1.length-1){
            nums1[k-1] = nums1[k];
            k++;
        }
    }
}
