package InterviewPractice;

public class CapitalizeTitle {
    public static void main(String[] args) {
        //jaVa iS eASY -> Java Is Easy
        System.out.println(UsingSplit("jaVa iS eASY"));
    }
    public static String UsingSplit(String param1){
        String CapitalizeString = "";
        String[] EachWord = param1.split(" ");
        for (String word:EachWord) {
            CapitalizeString=CapitalizeString+word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()+" ";
        }
        CapitalizeString = CapitalizeString.trim();
        return CapitalizeString;
    }
}

//leetcode