package Practice;

public class bob {

    public static void main(String[] args) {
        String bobThere = "abcdefb";
        System.out.println(bobThere(bobThere));
    }

    public static boolean bobThere(String str){
        char[] letters = str.toCharArray();
        boolean check = false;
        for (int i = 0; i < letters.length-2; i++) {
            if (letters[i]=='b'&& letters[i+2]=='b'){
                    check = true;
            }

        }
        return check;
    }
}
