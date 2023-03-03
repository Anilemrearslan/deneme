package InterviewPractice;

public class Swap2StringWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "RenasTech";
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("*************");
        Swap(a,b);
    }

    public static void Swap(String a,String b){
        a = a+b; //param1 = "HelloRenasTech" length = 14
                                //param2 = "RenasTech"  length = 9
        b = a.substring(0,a.length()-b.length());//param1 = "HelloRenasTech" length = 14
                                                 //param2 = "Hello"  length = 5
        a = a.substring(b.length());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
