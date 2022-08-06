public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Beef", 5.40, "White bread");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("bacon", 1);
        hamburger.addHamburgerAddition2("lettuce", 1.5);
        hamburger.addHamburgerAddition3("cheese", 2.06);

        price = hamburger.itemizeHamburger();

        String str1 = "my-string";
        String str2 = new String("my-string");
        str2.intern();
        System.out.println(str2);
        System.out.println(str1);
        System.out.println(str1 == str2);
    }
}