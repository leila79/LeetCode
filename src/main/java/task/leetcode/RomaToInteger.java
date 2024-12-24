package task.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RomaToInteger {
    /*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
     */
    public int romanToInt(String s) {
        String[] numbers = s.split("");
        Map<String, Integer> symbols = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500,"M", 1000);
        int sum = 0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int value=symbols.get(numbers[i]);
            if(value>=prev) sum+=value;
            else sum-=value;
            prev=value;
        }

//        for (int i = 0 ; i < s.length(); i++) {
//            if(i != s.length()-1){
//                if (numbers[i].equals("I") && numbers[i + 1].equals("V")){
//                    sum += 4;
//                    i++;
//                } else if (numbers[i].equals("I") && numbers[i + 1].equals("X")){
//                    sum += 9;
//                    i++;
//                }else if (numbers[i].equals("X") && numbers[i + 1].equals("L")){
//                    sum += 40;
//                    i++;
//                }else if (numbers[i].equals("X") && numbers[i + 1].equals("C")){
//                    sum += 90;
//                    i++;
//                }else if (numbers[i].equals("C") && numbers[i + 1].equals("D")){
//                    sum += 400;
//                    i++;
//                }else if (numbers[i].equals("C") && numbers[i + 1].equals("M")){
//                    sum += 900;
//                    i++;
//                }else{
//                    sum += symbols.get(numbers[i]);
//                }
//            } else{
//                sum += symbols.get(numbers[i]);
//            }
//
//        }
        return sum;
    }
}
