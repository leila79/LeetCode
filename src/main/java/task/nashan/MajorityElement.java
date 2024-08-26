package task.nashan;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxKey = 0;
        int maxVal = 0;
        for (int num : nums) {
            count.computeIfPresent(num, (key, val) -> val + 1);
            int v = count.computeIfAbsent(num, (k) -> 1);
            if (v > maxVal) {
                maxKey = num;
                maxVal = v;
            }
        }
        return maxKey;
    }
}
