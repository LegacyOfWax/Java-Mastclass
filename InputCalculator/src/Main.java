import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int inputCount = 0;

        while (true)
        {
            boolean hasInt = scanner.hasNextInt();

            if(hasInt)
            {
                int number = scanner.nextInt();

                inputCount++;
                sum += number;
            }
            else
                break;

            scanner.nextLine();
            average = sum / inputCount;
        }
        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(average));
        scanner.close();
    }
}