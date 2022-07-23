public class Main {
    public static void main(String[] args) {
        sumFirstAndLastDigit(67);
    }
    public  static int sumFirstAndLastDigit(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        int firstDigit = number % 10;

        System.out.println("First Digit = " + firstDigit);

        while (number > 9)
        {
            number = number / 10;
            System.out.println("Begining Digit = " + number);
        }
        int sumOfFirstAndLast = firstDigit + number;
        System.out.println("Sum of first and last digit are " + sumOfFirstAndLast);
        return sumOfFirstAndLast;
    }
}