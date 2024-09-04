package task.leetcode;

import java.util.*;

class RandomizedSet {

    Map<Integer, Integer> set;
    List<Integer> values;
    int index;
    public RandomizedSet() {
        set = new HashMap<>();
        values = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!set.containsKey(val)){
            values.add(val);
            set.put(val, values.size()-1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (set.containsKey(val)){
            int i = set.get(val);
            values.set(i, values.get(values.size()-1));
            set.put(values.get(i), i);
            set.remove(val);
            values.remove(values.size()-1);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Random random = new Random();
        return values.get(random.nextInt(values.size()));
    }
}
