package task.leetcode;

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int[] candyCount = new int[ratings.length];
        for(int i=0; i<ratings.length ; i++){
            candyCount[i] = 1;
        }

//        check the right neighbors
        for(int i=1; i < ratings.length ; i++){
           if(ratings[i]>ratings[i-1] && candyCount[i] <= candyCount[i-1]){
               candyCount[i] = candyCount[i-1]+1;
           }
        }
//        check the left neighbors
        for(int i=ratings.length-2; i >= 0 ; i--){
            if(ratings[i]>ratings[i+1] && candyCount[i] <= candyCount[i+1]){
                candyCount[i] = candyCount[i+1]+1;
            }
        }

        int sum = 0;
        for(int i=0; i<ratings.length ; i++){
            sum += candyCount[i];
        }
        return sum;
    }
}
