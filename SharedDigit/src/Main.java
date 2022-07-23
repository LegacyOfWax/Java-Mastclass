public class Main {
    public static void main(String[] args) {
        hasSharedDigit(10, 45);
    }
    public static boolean hasSharedDigit (int numOne, int numTwo)
    {
        if(numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99)
        {
            System.out.println("One or Two Numbers out of range");
            return false;
        }
        else if (((numOne / 10) == (numTwo / 10)) || ((numOne % 10) == (numTwo % 10)) ||
                ((numOne / 10)) == (numTwo % 10) || (numOne % 10 == numTwo /10) )
        {
            System.out.println("numbers have shared Digits");
            return true;
        }
        else
            System.out.println("numbers do not have shared Digits");
            return false;
    }
}