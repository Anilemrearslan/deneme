package InterviewPractice;

public class Q2 {
    // write a method where it takes a poem and return the most poetical word from the poem

    // calculate score of each word by fallowing scores
    // a,b,c,d,e,f  +1
    // x -2
    // k -1

    // Example: poem => "and the garden diminishes: grape leaves rumbled and rusty, zucchini felled by borers, tometoes sparseon the vines"


    public static void main(String[] args) {
        String Poem = "and the garden diminishes: grape leaves rumbled and rusty, zucchini felled by borers, tometoes sparseon the vines";
        System.out.println(Poem(Poem));
    }

    public static String Poem(String param1){//"and","the", "garden", "diminishes:", "grape" leaves rumbled and rusty, zucchini

        String[] Words = param1.split(" ");

        int count2= 0;
        String result="";
        for (int i = 0; i < Words.length; i++) {
            String word = Words[i];
            int count = 0;
            char[] letters = word.toCharArray(); // a,n,d  t,h,e
            for (int j = 0; j < letters.length; j++) {
                if(letters[j]== 'a' ||letters[j]== 'b' ||letters[j]== 'c' ||letters[j]== 'd' ||letters[j]== 'e' ||letters[j]== 'f'){
                    count = count+1;
                }else if(letters[j]== 'x'){
                    count = count -2;
                }else if(letters[j]== 'k'){
                    count = count -1;
                }
            }
            if (count>count2){
                count2=count;
                result=Words[i];
            }
        }
        return result;
    }

}
