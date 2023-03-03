package Practice;

public class pratik {

    public static void main(String[] args) {
        String e ="{[]}";
        System.out.println(isValid(e));

        System.out.println(makeBricks(3, 1, 9));
    }

    public static boolean isValid(String e){
        char[] EachChar = e.toCharArray();
        boolean check = false;
        for (int i = 0; i < EachChar.length; i++) {
            for (int j = i+1; j < EachChar.length; j++) {
                if (EachChar[i]==EachChar.length-1 && EachChar[j]==EachChar.length-2){
                    check = true;
                }else if (EachChar[i]=='{'&& EachChar[j]=='}'){
                    check = true;
                } else if (EachChar[i]=='['&& EachChar[j]==']') {
                    check = true;
                }else if (EachChar[i]=='('&& EachChar[j]==')'){
                    check=true;
                }else {
                    check=false;
                }
            }
        }
        return check;
    }

    public static boolean makeBricks(int small,int big,int goal){
        if ((small+big)*2==goal){
            return true;
        }else {
            return false;
        }
    }
}
