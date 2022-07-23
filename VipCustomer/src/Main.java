public class Main {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Nick", 538393);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Ryker", 6069, "ryker@gamil.com");
        System.out.println(person3.getName() + "  " + person3.getEmailAddress());
    }
}