public class Main {
    public static void main(String[] args) {
        isPerfectNumber(6);
    }
    public static boolean isPerfectNumber(int number)
    {
        if (number < 1)
        {
            return false;
        }

        int sumCount = 0;

        for (int i = 1; i < number; i++)
        {
            if(number % i == 0 )
            {
                sumCount = sumCount + i;
                System.out.println("sumCount = " + sumCount);
            }
        }
        if(sumCount == number)
        {
            System.out.println("sumCount = number");
            return true;
        }
        else
            return false;
    }
}