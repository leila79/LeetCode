package task.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int width = height.length-1;
        int maxArea = 0;
        while (i < j){
            int shortEnd = Math.min(height[i], height[j]);
            int area = shortEnd * width;
            if (area > maxArea) maxArea = area;
            if (height[i] == shortEnd) i++;
            else if (height[j] == shortEnd) j--;
            width--;
        }
        return maxArea;
    }
}
