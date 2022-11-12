package week10_11_12_2022;

import java.util.Arrays;

public class Task3SumNumbers {

    /*
    Task 3 : String numbers to sum

					Given an Array of numbers in String format, add each digit of each element and store into a different Array.

					Ex:

					Input:
					"123", "134", "513"

					Output:
					[ 6, 8, 9 ]

     */

    public static void main(String[] args) {

         String[] array={"123", "134", "513" };

         int [] result=sumNumbers(array);

        System.out.println(Arrays.toString(result));

    }

    public static int[] sumNumbers(String[] array) {

        int [] result=new int[array.length];
        int index=0;
        for (String s : array) {
            int each = Integer.parseInt(s);

          int sumOfDigits=  sumDigits(each);
          result[index++]=sumOfDigits;

        }
        return result;


    }

    public static int sumDigits(int each) {

        /*
        24 = 2*10+4


         */
        //123
        int lastDigit=each%10; //if you want to get last digit we need to use modules 10 it will give me 3
        int result=123/10; //12
        int middleDigit=   each/10   % 10;

        int result2=340/100; // 3
        int firstDigit=each/100;

        return  lastDigit+middleDigit+firstDigit;

    }
}
