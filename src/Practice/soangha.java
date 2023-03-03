package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class soangha {

    public static void main(String[] args) {
        int[] a ={2,5,5,11};
        int target = 10;

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;



        System.out.println(Arrays.toString(twoSum(a, target)));

        System.out.println(removeElement(nums,val));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                    arr[0]=i;
                    arr[1]=j;

                }
            }

        }

        return arr;
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }

        }

        return k;
    }
}


