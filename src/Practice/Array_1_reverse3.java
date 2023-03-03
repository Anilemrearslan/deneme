package Practice;

import java.util.Arrays;

public class Array_1_reverse3 {
    /*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public static void main(String[] args) {
        int [] Arr = {1, 2, 3};
        int[] Deneme = reverse3(Arr , 3);
        System.out.println(Arrays.toString(Deneme));

        int[] arr = {9, 11, 5, 7, 6};
        System.out.println(Arrays.toString(reverse3(arr, 5)));
    }


    ///@param2 = Length
    ///@ param1 is array that we will pass in method
    public static int[] reverse3(int[] param1, int param2 ){
        // [1, 2, 3]
        //  0  1  2
        int[] ReversedArr = new int[param2];
        int j= param2;
        for (int i = 0; i < param2; i++) {
            ReversedArr[j - 1] =  param1[i];
            j=j-1;
        }

        return ReversedArr;
    }
}
