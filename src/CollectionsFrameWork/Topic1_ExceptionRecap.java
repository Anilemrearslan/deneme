package CollectionsFrameWork;

public class Topic1_ExceptionRecap {
    public static void main(String[] args) {
        // datatype variablename = new COnstructor(parameter defined in constructor)

        BankAccount MyAccount = new BankAccount(100.0);
        MyAccount.Deposit(900);
        MyAccount.Withdraw(1500);

    }
}
