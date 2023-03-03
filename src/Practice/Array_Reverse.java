package Practice;

import java.util.Arrays;

public class Array_Reverse {

    public static int[] Reverse(int[] param1 ){

        int[] arr = new int[param1.length];
        int j = param1.length;
        for (int i = 0; i < param1.length; i++) {
            arr[j - 1] = param1[i];
            j=j-1;
        }
        return arr;
    }

    public static int[] Reverse2(int[] param1 ){

        int[] arr = new int[param1.length];
        int j = 0;
        for (int i = param1.length-1; i >= 0; i--) {
            arr[j] = param1[i];
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,22,9,10,12,32,55};

        System.out.println(Arrays.toString(Reverse2(arr)));
    }
}
