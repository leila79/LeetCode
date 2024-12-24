package task.leetcode;

import java.util.Map;

public class IntegerToRoman {
    /*
    I	1
    V	5
    X	10
    L	50
    C	100
    D	500
    M	1000

    - If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
    - If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
    - Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
    */

    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; num > 0; i++)
            while (num >= val[i]) {
                ans.append(rom[i]);
                num -= val[i];
            }
        return ans.toString();
    }
    public String intToRomanMyWay(int num) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (num > 0){
            String symbol = "";
            int digit = num % 10;
            int value = (int) (Math.pow(10, i));
            if (digit == 4 || digit == 9){
//                subtract form
                int number = digit * value + value;
                symbol = getSymbol(number);
                result.insert(0, symbol);
                symbol = getSymbol(value);
                result.insert(0, symbol);

            }else {
//                add form
//               find the maximal value that can be subtracted from the input
                int val = 0;
                int number = digit * value;
                StringBuilder s = new StringBuilder();
                while (number > 0){
                    if ( number < 5){
                        symbol = "I";
                        val = 1;
                    }else if (number < 10){
                        symbol = "V";
                        val = 5;
                    }else if ( number < 50){
                        symbol = "X";
                        val = 10;
                    }else if (number < 100){
                        symbol = "L";
                        val = 50;
                    }else if (number < 500){
                        symbol = "C";
                        val = 100;
                    }else if (number < 1000){
                        symbol = "D";
                        val = 500;
                    }else{
                        symbol = "M";
                        val = 1000;
                    }
//                    append that symbol to the result
                    s.append(symbol);
//                    subtract its value, and convert the remainder to a Roman numeral
                    number = number - val;
                }

                result.insert(0, s);
            }
            num = num / 10;
            i++;
        }
        return String.valueOf(result);
    }

    public String getSymbol (int value){
        return switch (value) {
            case 1 -> "I";
            case 5 -> "V";
            case 10 -> "X";
            case 50 -> "L";
            case 100 -> "C";
            case 500 -> "D";
            case 1000 -> "M";
            default -> "";
        };
    }
}
