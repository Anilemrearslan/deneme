package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpeedTicket {

    public static void main(String[] args) {
        /*
        You are driving a little too fast, and a police officer stops you.
        Write code to compute the result, encoded as an int value:
        0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
        If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
        the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases
         */
        System.out.println(caughtSpeeding(75, false));

        System.out.println(sortaSum(10, 11));

        String something = "asdfghjkl";
        System.out.println(ReverseString(something));
        System.out.println(ReverseString2(something));

        ArrayList<Integer> List=new ArrayList<>(Arrays.asList(4,7,9,13,25));
        System.out.println("NOT reversed version "+List);
        System.out.println(reverseArrayList(List));

        int[] arr = List.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(ReverseArray(arr)));


        System.out.println(doubling(List));
        System.out.println(square(List));

        List<String> Word = new ArrayList<>(Arrays.asList("a","bb","ccc","*"));
        System.out.println(addStar(Word));

        System.out.println(copies3(Word));


        System.out.println("************************************");

        List<String> sList = new ArrayList<>(Arrays.asList("a","bb","ccc","*"));

        if (sList != null)
        {
            String listString = sList.toString();
            listString = listString.substring(1, listString.length() - 1);
            System.out.println(listString);
        }

        System.out.println(moreY(Word));

        System.out.println(math1(List));

        List<Integer>List2 = new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1));

        System.out.println(rightDigit(List2));
        System.out.println("8888888888888888888888888888888888888888888");
        int[] a={6,7,8,9,0};
        System.out.println(a);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(6);
        b.add(3);
        b.add(5);
        b.add(8);
        b.add(1);
        System.out.println(b);
        b.add(2,7);
        System.out.println(b);
        b.remove(0);
        System.out.println(b);
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(4,5,6,8,2,15,3));
        System.out.println(c);
    }

    public static int caughtSpeeding(int speed , boolean birthDay){

        int ticket=0;
        if (speed>0&&speed<=60){
            ticket=0;
        }else if(speed>60&&speed<=80){
            ticket=1;
        }else if (speed>80){
            ticket = 2;
        }

        if (birthDay == true){
            ticket = ticket-1;
        }

        return ticket;
    }

    public static int sortaSum(int a, int b){
        int sum = a+b;
        if (sum>=10&&sum<=19){
            return 20;
        }else{
            return sum;
        }
    }

    public static String ReverseString(  String param1  ){// ['u' 'c' 'a' 'k']
        char[] letters = param1.toCharArray();//['u' 'c' 'a' 'k']
        String reversedString="";
        for (int i = 0; i < letters.length; i++) {
            reversedString=letters[i]+reversedString;
        }//                    k             kacu
        return reversedString;
    }

    public static String ReverseString2(String param1){
        char[] letters = param1.toCharArray();
        String reversedString="";
        for (int i = letters.length-1; i >= 0; i--) {
            reversedString = reversedString+letters[i];
        }
        return reversedString;
    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> param1){
        ArrayList<Integer>ReversedList = new ArrayList<>();

        for (int i= param1.size()-1; i>=0; i--){
            ReversedList.add(param1.get(i));
        }
        return ReversedList;
    }

    public static int[] ReverseArray(int[] param1){
        int[] ReversedArray = new int[param1.length];
        int j=param1.length;
        for (int i = 0; i < param1.length; i++) {
            ReversedArray[j-1]=param1[i];
            j--;
        }
        return ReversedArray;
    }

    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer>DoubleList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            DoubleList.add(nums.get(i)*2);
        }
        return DoubleList;
    }

    public static List<Integer> square(List<Integer> nums) {
        List<Integer>squareList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            squareList.add(nums.get(i)*nums.get(i));
        }
        return squareList;
    }

    public static List<String> addStar(List<String> param1){
        List<String> Star= new ArrayList<>();
        for (int i = 0; i < param1.size(); i++) {
            Star.add(param1.get(i)+"*");
        }
        return Star;
    }

    public static List<String> copies3(List<String> param1) {
        List<String> triple= new ArrayList<>();
        for (int i = 0; i < param1.size(); i++) {
            triple.add(param1.get(i).concat(param1.get(i).concat(param1.get(i))));
        }
        return triple;
    }

    public static List<String> moreY(List<String> param1) {
        List<String> Y= new ArrayList<>();
        for (int i = 0; i < param1.size(); i++) {
            Y.add("y"+param1.get(i)+"y");
        }
        return Y;
    }

    public static List<Integer> math1(List<Integer> param1){
        List<Integer> idkw = new ArrayList<>();
        for (int i = 0; i < param1.size(); i++) {
            idkw.add((param1.get(i)+1)*10);
        }
        return idkw;
    }

    public static List<Integer> rightDigit(List<Integer> nums) {

//   Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int numbercheck = nums.get(i);
            String a ="";
            a=a.valueOf(numbercheck);
            char[]ca=a.toCharArray();
            String rigth= "";
            rigth=rigth+ca.length;
            newList.add(Integer.valueOf(rigth));
        }
        return newList;
    }
}
