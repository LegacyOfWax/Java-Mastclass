public class Main {
    public static void main(String[] args) {
        String myString = "This Is A String";
        System.out.println("My string is Equal to = " + myString);
        myString = myString + ", and More";
        System.out.println("My string is Equal to = " + myString);
        myString = myString + "\u00A9 2022";
        System.out.println("My String is Equal to = " + myString);
        String numberString = "250.25";
        numberString = numberString + "45.25";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is Equale to = " + lastString);

    }
}