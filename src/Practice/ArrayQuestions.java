package Practice;

import java.util.Arrays;

public class ArrayQuestions {

    public static void main(String[] args) {
        int[] arr= {10, 3, 5, 6};
        System.out.println(countEvens(arr));
        System.out.println(bigDiff(arr));
        int[] arr2 = {1, 2, 13, 2, 1, 13};
        System.out.println(sum13(arr2));
        System.out.println("*****************");
        int[] arr3 = {6, 7, 1, 6, 7, 7};
        System.out.println(sum67(arr3));

        String str = "Hi-There";
        System.out.println(doubleChar(str));

        String str2= "hihi";
        System.out.println(countHi(str2));
    }

    public static int countEvens(int [] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int biggest = nums[0];
        int smallest = nums[0];

        for (int i = 0; i < nums.length; i++) { //10, 3, 5, 6
                if (nums[i]>biggest){
                    biggest=nums[i];
                }
        }
        for (int i = 0; i < nums.length; i++) {
                if (nums[i]<smallest){
                    smallest=nums[i];
                }
        }
        int diff = biggest-smallest;
        return diff;
    }

    public static int sum13(int[] nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==13){
                i++;
                continue;
            }
            sum=sum+nums[i];
        }
        return sum;
    }
    public static int sum67(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==6){
                for (int k = i+1; k < nums.length; k++) {
                    if (nums[k]==7){
                        i=k;
                        break;
                    }
                }
            }else if (nums[i]==6){
                sum=sum+nums[i];
            }else {
                sum=sum+nums[i];
            }
        }
        return sum;
    }

    public static String doubleChar(String str){
        String doubleChar = "";
        char[] Letters = str.toCharArray();
        for (int i = 0; i < Letters.length; i++) {
            doubleChar=doubleChar+Letters[i]+Letters[i];
        }
        return doubleChar;
    }

    public static int countHi(String str){
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }


}
