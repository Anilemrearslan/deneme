package Practice;

public class NonStart {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        String str3 = "";
        System.out.println(nonStart(str1, str2));
        System.out.println(Left2(str1));
        System.out.println(Right2(str1));
        System.out.println(TheEnd(str1, false));
        System.out.println(withouEnd2(str3));
    }

    public static String nonStart(String a, String b){
        String newString= a.substring(1)+b.substring(1);
        return newString;
    }

    public static String Left2(String str){
        String newString = str.substring(2)+str.substring(0,2);
        return newString;
    }

    public static String Right2(String str){
        String newString =str.substring(str.length()-2, str.length()) + str.substring(0,str.length()-2);
        return newString;
    }

    public static String TheEnd(String str, boolean front){
        if (front==true){
            String newString=str.substring(0,1);
            return newString;
        }else {
            String newString =str.substring(str.length()-1);
            return newString;
        }

    }

    public final static String withouEnd2(String str){

        if (str.length()<2){
            return "";
        }else {
            String newString = str.substring(1, str.length() - 1);
            return newString;
        }
    }
}
