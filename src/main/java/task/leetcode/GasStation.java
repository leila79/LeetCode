package task.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int remaining = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            remaining += gas[i] - cost[i];
//            if there isn't enough surplus then all the other station before now also leave no surplus
            if (remaining < 0){
//                we move the starting point to the next station
                start = i+1;
                remaining = 0;
            }
        }
//        If total gas is smaller than total cost we cannot do a full circle
        if (totalGas < totalCost) return -1;
        return start;

    }
}
