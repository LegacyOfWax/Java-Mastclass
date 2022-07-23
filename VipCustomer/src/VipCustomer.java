public class VipCustomer {
    public String name;
    public int creditLimit;
    public  String emailAddress;

    public VipCustomer(){
        this("Default Name", 0, "Default Email");
        System.out.println("Empty Construct Called");
    }
    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit,"Default Email");
    }
    public VipCustomer(String name, int creditLimit, String emailAddress){
        System.out.println("Account Construct With Parameters Called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
