package maps;

import java.util.ArrayList;

public class IntroToMaps {

    public static void main(String[] args) {
        ArrayList<String> MyEmployeeInformation = new ArrayList<>();
        MyEmployeeInformation.add("anil");
        MyEmployeeInformation.add("arslan");
        MyEmployeeInformation.add("23");
        MyEmployeeInformation.add("12355678");

        printEmployee(MyEmployeeInformation);
    }

    //please create a method that takes an arrayList of string as parameter
    //no return type
    // method name printEmployee
    /// This method will print employee's name and age

    public static void printEmployee(ArrayList<String> param1){
        System.out.println(param1.get(0));
        System.out.println(param1.get(2));
    }
}
