import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        while (true)
        {
            System.out.println("Enter a Number");
            boolean hasInt = scanner.hasNextInt();

            if(hasInt)
            {
                int number = scanner.nextInt();

                if(number < minNum)
                {
                    minNum = number;
                }
                else if(number > maxNum)
                {
                    maxNum = number;
                }
            }
            else if(!hasInt)
            {
                System.out.println("Invalid Value");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Your Min number = " + minNum + " Your Max number = " + maxNum);
        scanner.close();
    }

}