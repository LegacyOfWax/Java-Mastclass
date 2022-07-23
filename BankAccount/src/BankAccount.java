public class BankAccount {
    public int accountNumber;
    public double accountBalance;
    public String customerName;
    public String email;
    public String phoneNUmber;

    public BankAccount()
    {
        this(3567679, 3.98, "Default name", "Default email", "Default phone");
        System.out.println("empty construct called");
    }
    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNUmber)
    {
        System.out.println("Account Construct With Parameters Called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
    }

    public BankAccount(String customerName, String email, String phoneNUmber) {
        this(764356728, 537.98, customerName,email, phoneNUmber );
    }

    //Getters
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getAccountBalance()
    {
        return this.accountBalance;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNUmber()
    {
        return this.phoneNUmber;
    }
    //Setters
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhoneNUmber(String phoneNUmber)
    {
        this.phoneNUmber = phoneNUmber;
    }
    public void depositFunds(double depositAmount)
    {
        System.out.println(this.accountBalance + depositAmount);
        this.accountBalance += depositAmount;
    }
    public void withdrawAmount(double withdrawAmount)
    {
        if(this.accountBalance - withdrawAmount < 0)
        {
            System.out.println("Not enough funds");
        }
        else
        {
            System.out.println(this.accountBalance - withdrawAmount);
            this.accountBalance -= withdrawAmount;
        }
    }
}
