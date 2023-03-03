package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String_2 {

    public static void main(String[] args) {
        System.out.println(catDog("1cat1cadodog"));

        System.out.println(countCode("cxxarhaga"));
        System.out.println("****************");
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

        int[] arr2={5,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum2(arr2, target)));
        System.out.println("***************************");
        ReversedString("Anil");
        ReverseString2( "Hadi bakalim bu cumleyi cevir!");
        ReverseSentence("Hadi bakalim bu cumleyi cevir!");
        int [] babba={6,2,8,235,7,89,54,4};
        Arrays.sort(babba);
        System.out.println(Arrays.toString(babba));
        System.out.println("*******************");
        int[] array ={1,2,2,2,3,3,4,4,4,5,6,6,7};
        int[] array2 ={0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates(arr);
    }
    
    public static boolean catDog(String str){
        int dogCount = 0;
        int catCount = 0;

        for (int i = 0; i < str.length()-2; i++) {
            String temp = str.substring(i,i+3);
            if (temp.contains("cat")){
                catCount++;
            }
            if (temp.contains("dog")){
                dogCount++;
            }
        }
        if (catCount==dogCount){
            return true;
        }else {
            return false;
        }
    }
    public static int countCode(String str) {// c o d e
        int  count = 0;                      // 0 1 2 3
        int Length=str.length();
        String co = "co";
        String e = "e";

        if(Length<4){
            return 0;
        }
        for (int i = 0; i < Length-3; i++) { // 0 12  3 4
            if (str.substring(i,i+2).contains(co) &&str.substring(i+3,i+4).contains(e)){
                count++;
            }
        }
        return count;
    }

    public static int removeDuplicates(int[] nums) { //[0,0,1,1,1,2,2,3,3,4]
        if(nums.length == 0) {
            return 0;
        }
        int addIndex = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]){
                nums[addIndex] = nums[i+1];
                addIndex++;
            }
        }
        return addIndex;
    }

    public static int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i,k};
                }
            }
        }
        return nums;
    }

    public static int[] twoSum2(int[] nums, int target){

        Map<Integer, Integer> compliments = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex=compliments.get(nums[i]);
            if (complementIndex != null){
                return new int[]{i,complementIndex};
            }
            compliments.put(target - nums[i], i);
        }
        return nums;
    }

    public static void ReversedString(String param1){// l,a,h,m,a,c,u,n
        String reversed= "";
        char[]letters= param1.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            reversed=letters[i]+reversed;
            //  al         a + "l"
        }
        System.out.println(reversed);

    }

    public static void ReverseString2(String param1){
        String reversed = "";

        for (int i = param1.length()-1; i >=0 ; i--) {
            reversed = reversed + param1.charAt(i);
        }
        System.out.println(reversed);
    }

    public static void ReverseSentence(String param1){ // "Hadi, bakalim, bu, cumleyi, cevir!"
        String ReversedSentence="";
        String [] sentence = param1.split(" ");
        for (int i = 0; i < sentence.length; i++) {
            String dummy = sentence[i];
            ReversedSentence =" "+dummy+ReversedSentence;
        //     ""            =  Hadi + "";
        //     "Hadi"            =  bakalim + "Hadi";
        }
        ReversedSentence=ReversedSentence.trim();
        System.out.println(ReversedSentence);
    }

    public static void RemoveDuplicates(int[] param1){//{1,2,2,3,4,4,5,6,6,7},{0,0,1,1,1,2,2,3,3,4}

        int[] removed = new int[param1.length];
        int j = 0;
        for (int i = 0; i<param1.length-1; i++){
                if (param1[i] != param1[i+1]){
                    removed[j] = param1[i];
                    j++;
                }
        }
        removed[j++] = param1[param1.length-1];

        for (int k = 0; k < j; k++) {
            System.out.print(removed[k]+" ");
        }
    }
}
