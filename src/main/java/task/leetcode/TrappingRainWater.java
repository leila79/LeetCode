package task.leetcode;

public class TrappingRainWater {
    public int trap(int[] height) {
        int waterSum = 0;
//        find the highest wall
        int maxIndex = 0;
        int maxWall = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i]>maxWall){
                maxIndex = i;
                maxWall = height[i];
            }
        }
//        from start point to the highest wall
        int j = 0;
        while ( j < maxIndex) {
            int countSteps = 0;
            int countIntermediateElevations = 0;
            boolean hitAWall = false;
            for (int k = j+1; k < height.length; k++) {
                if(height[k]>=height[j]){
                    waterSum += ((height[j] * countSteps) - countIntermediateElevations);
                    j = k;
                    hitAWall = true;
                    break;
                }
                countSteps++;
                countIntermediateElevations += height[k];
            }
            if (!hitAWall){
                j++;
            }
        }

//        from the end point to the highest wall
        j = height.length-1;
        while ( j > maxIndex) {
            int countSteps = 0;
            int countIntermediateElevations = 0;
            boolean hitAWall = false;
            for (int k = j-1; k >= maxIndex; k--) {
                if(height[k]>=height[j]){
                    waterSum += ((height[j] * countSteps) - countIntermediateElevations);
                    j = k;
                    hitAWall = true;
                    break;
                }
                countSteps++;
                countIntermediateElevations += height[k];
            }
            if (!hitAWall){
                j--;
            }
        }

        return waterSum;
    }
}
