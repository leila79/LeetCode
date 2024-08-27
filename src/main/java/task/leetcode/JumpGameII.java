package task.leetcode;

public class JumpGameII {
//    minimum number of jumps
    public int jump(int[] nums) {
        int goal = nums.length-1;
        int numberOfJumps = 0;
        while (goal != 0){
//        furthest number that can reach the goal
            for (int i = 0; i < goal; i++){
                if(goal <= nums[i]+i){
                    goal = i;
                    numberOfJumps++;
                    break;
                }
            }
        }
        return numberOfJumps;
    }
}
