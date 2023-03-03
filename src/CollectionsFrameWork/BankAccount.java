package CollectionsFrameWork;

public class BankAccount {

    private double Balance;

    ///please create constructor that takes one double parameter

    public BankAccount(double param1){
        Balance= param1;

    }

    //please create a method that takes a double as a parameter
    ///no return
    //this method will add the parameter to your balance
    //method name = Deposit

    public void Deposit(double param1){
        Balance = Balance+param1;
        System.out.println("Avaliable balance : "+Balance);
    }

    //please create a method that takes a double as parameter
    //no return
    //this method will subtract the parameter to your balance
    //method name = Withdraw
    public void Withdraw(double param1){
        if (Balance< param1){
            System.out.println("you don't have enough money you little poor bastard");
        }else {
            Balance = Balance - param1;
            System.out.println("Avaliable balance : "+Balance);
        }

    }
}
