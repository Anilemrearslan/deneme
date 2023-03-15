package InterviewPractice;

import com.sun.scenario.animation.shared.ClipEnvelope;
import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;

import java.util.*;

public class TargetNumber {

    public static void main(String[] args) {
        int[] nums = {2,3,3,5,7,20,8};
        int target = 15;
        System.out.println(Arrays.toString(TargetNumber(nums, target)));

        ArrayList<Integer>l1 = new ArrayList<>(Arrays.asList(9,9,9,9,9,9,9));
        ArrayList<Integer>l2 = new ArrayList<>(Arrays.asList(9,9,9,9));
        System.out.println(addTwoNumbers(l1, l2));

        System.out.println(isPalindrome(121));

        Map<String, String> map = new HashMap<>();
        map.put("a","candy");
        map.put("b","Dirt");
        System.out.println("a = "+map.get("a"));
        System.out.println("b = "+map.get("b"));
        System.out.println("++++++++++");
        mapBully(map);
        System.out.println("a = "+map.get("a"));
        System.out.println("b = "+map.get("b"));

        System.out.println(stringTimes("hi", 4));
        System.out.println(frontTimes("Chocolate", 5));
        System.out.println(countXX("abcxx"));

        System.out.println(doubleX("xaxxx"));
        System.out.println(stringBits("Heeololeo"));
        System.out.println(stringSplosion("Code"));

        int[] nine = {0, 1, 2, 3, 4, 7};
        System.out.println(arrayFront9(nine));
        System.out.println(array123(nine));
        int[] lahmacun = {3, 3, 2, 7};
        System.out.println(has22(lahmacun));

    }

    public static int[] TargetNumber(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> addTwoNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        String List1="";
        for (int i = 0; i < l1.size(); i++) {
            List1=l1.get(i).toString()+List1;
        }
        String List2="";
        for (int i = 0; i < l2.size(); i++) {
            List2=l2.get(i).toString()+List2;
        }
        Integer Sum =Integer.parseInt(List1)+Integer.parseInt(List2);
        String str = Sum.toString();
        char[] letters = str.toCharArray();
        String number="";
        for (int i = 0; i < letters.length; i++) {
            number= letters[i] + number;
        }

        char[] each = number.toCharArray();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < each.length; i++) {
            String a =""+each[i];
            result.add(Integer.parseInt(a));
        }
        return result;
    }

    public static ArrayList<Integer> addTwoNumbers2(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // Convert the ArrayLists to strings
        String str1 = "";
        for (int i = l1.size() - 1; i >= 0; i--) {
            str1 += l1.get(i).toString();
        }

        String str2 = "";
        for (int i = l2.size() - 1; i >= 0; i--) {
            str2 += l2.get(i).toString();
        }

        // Add the two numbers as strings
        String sum = Integer.toString(Integer.parseInt(str1) + Integer.parseInt(str2));

        // Convert the sum to an ArrayList of integers
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = sum.length() - 1; i >= 0; i--) {
            result.add(Character.getNumericValue(sum.charAt(i)));
        }

        return result;
    }

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reverse ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse = reverse+str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("c")&&map.containsKey("a")){
            map.put("b",map.get("a"));
            map.remove("c");
        }else if(map.containsKey("c")){
            map.put("b",map.get("b"));
            map.remove("c");
        }else if(!map.containsKey("b")){
            map.put("b",map.get("a"));
            map.remove("c");
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab",map.get("a")+map.get("b"));
        }else if (map.containsKey("a")){
            map.put("a",map.get("a"));
        }else if(map.containsKey("b")){
            map.put("b",map.get("b"));
        }
        return map;
    }

    public static String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString = newString+str;
        }
        return newString;
    }

    public static String frontTimes(String str, int n) {
        String Front ="";
        if (str.length()>2){
            for (int i = 0; i < n; i++) {
                Front = Front+str.substring(0,3);
            }
        }else if(str.length()<=2){
            for (int i = 0; i < n; i++) {
                Front=Front+str;
            }
        }
        return Front;
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)== str.charAt(i+1)){
                if (str.charAt(i)=='x'){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()){ // check i+1 in bounds?
            return false;
        }
        boolean isItContains = str.substring(i+1, i+2).equals("x");
        return isItContains ;

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");

//        boolean isItContains=false;
//        for (int i = 0; i < str.length()-1; i++) {
//            if (str.charAt(i)==str.charAt(i+1)){
//                if (str.charAt(i)=='x'){
//                    isItContains=true;
//                }
//            }
//        }
//        return isItContains;
    }

    public static String stringBits(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i+=2) {//"H e e o l o l e o"
            newString=newString+str.substring(i,i+1);
        }
        return newString;
    }

    public static String stringSplosion(String str) {// C o d e
        int n = str.length(); // n = 4
        String str2="";
        for (int i = 0; i <=n-1; i++) { // 0  1  2 3
            str2=str2+str.substring(0,i+1);
            //   ""  +   C
            //   C   +   Co
            //   CCo +  Cod
            // CCoCod + Code
            //str2 = CCoCodCode
        }
        return str2;
    }

    public static int arrayCount9(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==9){
                count++;
            }
        }
        return count;
    }

    public static boolean arrayFront9(int[] nums) {
        boolean nine = false;
        int end = nums.length;
        if (end > 4){
            end = 4;
        }
        for (int i = 0; i < end; i++) {
            if (nums[i]==9){
                nine = true;
            }
        }

        return nine;
    }

    public static boolean array123(int[] nums) {
        boolean sequence = false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]!= 0 && nums[i+2]<4){
                if (nums[i]<nums[i+1] &&nums[i+1]<nums[i+2]){
                    sequence=true;
                }
            }

        }
        return sequence;
    }

    public static int stringMatch(String a, String b) {
            int countA = 0;
            int countB = 0;
        for (int i = 0; i < a.length()-1; i++) {//{a b c d e}
            if (a.charAt(i)=='x' && a.charAt(i) == a.charAt(i+1)){
                countA++;
            }else if (a.charAt(i)=='a' && a.charAt(i) == a.charAt(i+1)){
                countA++;
            }else if (a.charAt(i)=='x' && a.charAt(i+1)=='z'){
                countA++;
            }
        }

        for (int i = 0; i < b.length()-1; i++) {//{a b c d e}
            if (b.charAt(i)=='x' && b.charAt(i) == b.charAt(i+1)){
                countB++;
            }else if (b.charAt(i)=='a' && b.charAt(i) == b.charAt(i+1)){
                countB++;
            }else if (b.charAt(i)=='x' && b.charAt(i+1)=='z'){
                countB++;
            }
        }

        if (countA==countB){
            return countA;
        }else {
            return 0;
        }
    }

    public static String stringX(String str) {
        String x = "";
        if (str.length()==1) {
            if (str.equals("x")){
                x = "x";
            }
        }else if (str.length()==0){
            x = "";
        }else{
            x = str.substring(0, 1) + str.substring(1, str.length() - 1).replaceAll("x", "") + str.substring(str.length() - 1);
        }


        return x;

    }

    public static String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public static int array667(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==6 && nums[i]==nums[i+1]){
                count++;
            }else if(nums[i]==6 && nums[i+1]==7){
                count++;
            }
        }
        return count;
    }

    public static boolean noTriples(int[] nums){
        boolean b = false;
        if (nums.length > 3) {
            for (int i = 0; i < nums.length-2; i++) {
                if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                    b= false;
                }else{
                    b= true;
                }
            }
        }else if(nums.length<3){
            b=true;
        }else {
            for (int i = 0; i < nums.length-2; i++) {
                if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                    b= false;
                }else{
                    b= true;
                }
            }
        }

        return b;
    }

    public static boolean firstLast6(int[] nums) {
        boolean b=false;
        if (nums.length==1){
            if(nums[0]==6){b=true;}
        }else if(nums.length==0){
            b=false;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[0]==6){
                    b=true;
                }
                if (nums[nums.length-1]==6) {
                    b=true;
                }
            }
        }
        return b;
    }

    public static boolean sameFirstLast(int[] nums) {
        boolean b= false;
        if (nums.length>1){
            for (int i = 0; i < nums.length; i++) {
                if (nums[0]==nums[nums.length-1]){
                    b=true;
                }
            }
        }else if(nums.length==1){
            b=true;
        }
        int[] p = new int[3];

        return b;
    }

    public static Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            String value = map.get("ice cream");
            map.put("yogurt", value);
        }
        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;
    }

    public static boolean has22(int[] nums) {
        boolean b= false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                if (nums[i]==2){
                    b=true;
                }
            }
        }
        return b;
    }

    public static boolean lucky13(int[] nums) {
        boolean b= true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1||nums[i]==3){
                b=false;
            }
        }
        return b;
    }


}
