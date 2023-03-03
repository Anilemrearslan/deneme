package InterviewPractice;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(UsingStringBuilder("This is an example"));
        System.out.println("********");
        System.out.println(ReversedString("This is an example"));
        System.out.println("********");
        System.out.println(regularWayChar2("This is an example"));
        System.out.println("********");
        System.out.println(RegularWayWithForEach("This is an example"));

    }
    public static String ReversedString(String param1){//append infront
        String reversedString="";
        for (int i = 0; i < param1.length(); i++) {
            reversedString= param1.charAt(i)+reversedString;
        }
        return reversedString;
    }
    public static String UsingStringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }
    public static String regularWayChar(String param1){//append infront
        char[] MyCharArray = param1.toCharArray();
        String reversed = "";
        for (int i = 0; i < MyCharArray.length; i++) {
            reversed = MyCharArray[i]+reversed;
        }
        return reversed;
    }
    public static String regularWayChar2(String param1){//decrease
        char[] MyCharArray = param1.toCharArray();
        String reversed = "";
        for (int i = MyCharArray.length-1; i >=0; i--) {
            reversed = reversed + MyCharArray[i];
        }
        return reversed;
    }

    public static String RegularWayWithForEach(String param1){
        char[] MyCharArray = param1.toCharArray();
        String reversed = "";
        for(char letter:MyCharArray){
            reversed = letter+reversed;
        }
        return reversed;
    }



}
