package task.leetcode;


public class Main {
    public static void main(String[] args) {
//        MergeSortedArray mergeSortedArray = new MergeSortedArray();
//        int[] nums1 = new int[]{4,5,6,0,0,0};
//        int m = 3;
//        int[] nums2 = new int[]{1,2,3};
//        int n = 3;
//        mergeSortedArray.merge(nums1, m, nums2,  n);
//        System.out.println(Arrays.toString(nums1));

//        int[] nums = new int[]{0,1,2,2,3,0,4,2};
//        int val = 2;
//        RemoveElement removeElement = new RemoveElement();
//        int k = removeElement.removeElement(nums, val);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(k);

//        int[] nums = new int[]{1,2,3}; // Input array
//        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
//        int k = removeDuplicatesSortedArray.removeDuplicates(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(k);

//        int[] nums = new int[]{0,0,1,1,1,1,2,3,3}; // Input array
//        int k = removeDuplicatesSortedArray.removeDuplicates(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(k);

//        int[] nums = new int[]{3,3,4};
//        MajorityElement majorityElement = new MajorityElement();
//        int k = majorityElement.majorityElement(nums);
//        System.out.println(k);
//        int[] nums = new int[]{1};
//        int k = 3;
//        RotateArray rotateArray = new RotateArray();
//        rotateArray.rotate(nums, k);
//        System.out.println(Arrays.toString(nums));
//        int[] prices = new int[]{7,6,4,20,1};
//        Stock stock = new Stock();
//        int k = stock.maxProfit_two(prices);
//        System.out.println(k);
//        int[] nums = new int[]{0};
//        JumpGame jumpGame = new JumpGame();
//        System.out.println( jumpGame.canJump(nums));
//        int[] nums = new int[]{0};
//        JumpGameII jumpGameII = new JumpGameII();
//        System.out.println( jumpGameII.jump(nums));
//        int[] nums = new int[]{100};
//        HIndex hIndex = new HIndex();
//        System.out.println(hIndex.hIndex(nums));
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.remove(2);
        boolean param_4 = obj.insert(2);
        int param_3 = obj.getRandom();
        boolean param_5 = obj.remove(1);
        boolean param_6 = obj.insert(2);
        int param_7 = obj.getRandom();

    }
}