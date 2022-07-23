import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;

        while(counter <= 10)
        {

            System.out.println("Enter a number #" + counter);
            boolean hasInt = scanner.hasNextInt();

            if(hasInt)
            {
                int number = scanner.nextInt();
                sum += number;
                System.out.println(sum);
                counter++;
            }
            else
            {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Your Total is " + sum);
        scanner.close();
    }
}