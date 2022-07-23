public class Main {
    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("Number As String = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Number = " + number);
    }
}