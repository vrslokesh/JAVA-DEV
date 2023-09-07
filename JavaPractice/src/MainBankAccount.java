public class MainBankAccount {
    public static void main(String[] args) {

        BankAccount Lokesh = new BankAccount();
      /*  BankAccount Sita = new BankAccount();*/
        Lokesh.setAccountBalance(89000);
        Lokesh.setAccountNumber(24532134);
        System.out.println("The Balance is " + Lokesh.getAccountBalance());
        Lokesh.depositFund(50000);
        Lokesh.withDrawingFund(5000);
        System.out.println("Your account number is "+Lokesh.getAccountNumber());

    }

}
