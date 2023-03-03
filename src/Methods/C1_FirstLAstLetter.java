package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class C1_FirstLAstLetter {
//create a java program that will ask for 5 String name to store in the array
    //and print first and last letter from each String

    //example
    //input : berkan
    //output :bn
    public static void main(String[] args) {
        // scanner : to store numbers
        // Array String :to store 5 names
        // Loop to store 5 names(for loop while loop)
        // charAt : to get each letter from each name
        // foreach  : to store initials from each name to new String

//        Scanner scan =new Scanner(System.in);
//
//        String [] nameList = new String[5]; // to store 5 names
//
//        for (int i=0; i< nameList.length; i++){
//            System.out.println("Enter a name for index: "+i);
//            nameList[i] = scan.next();
//        }
//        //to print all names
//        System.out.println(Arrays.toString(nameList));
//
//        String FirstLastLetters = "";
//        for (String eachName:nameList){
//            FirstLastLetters += ""+eachName.charAt(0)+ eachName.charAt(eachName.length()-1);
//
//        }
//        System.out.println(FirstLastLetters);


        int [] arr = {5,3,7,9,8};
        System.out.println(Arrays.toString(SortMethod(arr)));

    }//main


    public static int[] SortMethod(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }



}//class
