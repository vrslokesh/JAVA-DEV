public class BankAccount {
    //Always remember to variable starts with lower case and camel case in-between
    private int accountNumber = 86756284;
    private double accountBalance = 95000;
    private String customerName = "VRS Lokesh";
    private String email ="vrslokesh123@gmail.com";

    private int phoneNumber = 9121642;

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName(){
        return customerName;
    }
    public String getEmail() {
        return email;
    }

    public   void depositFund(double amount){
        if(amount>0.0000){
            accountBalance = accountBalance+amount;
            System.out.println("HI " +customerName +" Your Amount " +amount +" deposited into BankAccount your latest balance is " +accountBalance);

        }

    }
    public  void withDrawingFund(double withdrawBalance){
        if(withdrawBalance <= accountBalance){
            double latestAccountBalance = accountBalance- withdrawBalance;
            System.out.println("Withdrawal of amount "+withdrawBalance +" is  sucessfull" +" Your Balance after withdrawl is " +latestAccountBalance);
        }
        else
        {
            System.out.println("Insufficent funds please enter the value below Account Balance" +accountBalance);
        }

    }
}
