package InterviewPractice;

import java.util.Arrays;

public class Q1 {
    // Write a method where it takes array of integers and return the sorted version of that array

    //create a method

    //Engine => [4,5,1,7,8,9]  => [1,4,5,7,8,9]

    public static void main(String[] args) {
        int[] ArrayNotSortedExample= new int[]{4,5,1,7,80,9};
        System.out.println(Arrays.toString(Sort(ArrayNotSortedExample)));
        System.out.println("*******************");
        System.out.println(Arrays.toString(Sort2(ArrayNotSortedExample)));
    }

    public static int[] Sort(int[] param1){

        for (int i = 0; i < param1.length-1; i++) {

            //inner nested loop pointing 1 index ahead
            for (int j = i+1; j < param1.length; j++) {

                //checking elements
                int temp = 0;

                if (param1[j]<param1[i]){
                    // swapping
                    temp=param1[i];
                    param1[i]=param1[j];
                    param1[j]=temp;

                }
            }

        }

        return param1;
    }

    public static int[] Sort2(int[] param1){

        boolean condition = true;
        while(condition){

            condition=false;
            for (int i = 0; i < param1.length-1; i++) {
                if (param1[i] > param1[i+1]){
                    condition=true;
                    int temp = param1[i];
                    param1[i]=param1[i+1];
                    param1[i+1]=temp;
                }
            }
        }


        return param1;
    }
}
