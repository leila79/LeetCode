package task.leetcode;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int currentNum = nums[0];
        int uniqueCount = 1;
        int i = 1;
        int k = 1;
        while (i < nums.length){
            if(nums[i] == currentNum){
                i++;
            }else{
                nums[k] = nums[i];
                currentNum = nums[i];
                uniqueCount++;
                k++;
            }
        }
        return uniqueCount;
    }

//    this takes 1ms
    public int removeMoreThanTwoDuplicates(int[] nums) {
        int currentNum = nums[0];
        int currentNumCount = 1;
        int i = 1;
        int removed = 0;

        while (i < nums.length-removed){
            if(nums[i] != currentNum){
                currentNum = nums[i];
                currentNumCount = 1;
            }else{
                currentNumCount++;
            }
            if(currentNumCount > 2 ){
                removed += 1;
                shiftOne(nums, i, nums.length-removed);
                i--;
                currentNumCount--;
            }
            i++;

        }
        return i;
    }

    private void shiftOne(int[] nums1, int i, int length){
        while (length != i){
            nums1[i-1] = nums1[i];
            i++;
        }
    }

//    this takes 0ms
    public int removeDuplicatesFast(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(i==0 || i==1 || nums[i-2] != nums[j])
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
