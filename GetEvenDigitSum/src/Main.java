public class Main {
    public static void main(String[] args) {
        getEvenDigitSum(2562);
    }
    public static int getEvenDigitSum(int number) {
        if(number < 0)
        {
            return -1;
        }
        int sum = 0;

        while (number > 0 )
        {
            if(number % 2 == 0)
            {
                sum = sum + (number % 10);
            }
            number = number / 10;
        }
        System.out.println(sum);
        return sum;
    }
}