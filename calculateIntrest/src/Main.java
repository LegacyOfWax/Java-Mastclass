public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Loop " + i);
        }

        for(int i = 2; i < 9; i++)
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateIntrest(10000, i)));
        }

        for(int i = 8; i > 1; i--)
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateIntrest(10000, i)));
        }

        int count = 0;
        for(int i = 10; i < 50; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3)
                {
                    System.out.println("Exiting For Loop");
                    break;
                }
            }
        }

    }


    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
            return false;
        }

        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0 )
            {
                return false;
            }
        }
        return true;
    }

    public static double calculateIntrest(double amount, double intrestRate)
    {
        return amount * (intrestRate / 100);


    }
}