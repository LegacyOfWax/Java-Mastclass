public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5)
        {
            System.out.println("Count = " + count);
            count++;
        }
        System.out.println("");
        //This For loop is showing how to do the same while loop method from the top
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Count = " + i);
        }
        System.out.println("");
        //using a diff name variable other than i but not the same as the intial var from line 3
        for(count = 0; count != 5; count++)
        {
            System.out.println("Count = " + count);
        }
        System.out.println("");
        //reset count value from before as while loop used count from line 3
        count = 0;
        while (true)
        {
            if(count == 5)
            {
                break;
            }
            System.out.println("Count = " + count);
            count++;
        }
        System.out.println("");
        count = 0;
        do
        {
            System.out.println("Count = " + count);
            count++;
        }
        while (count != 5);
        System.out.println("");

        int number = 4;
        int finishedNumber = 20;
        int countEven = 0;

        while (number <= finishedNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            else if (countEven != 5 )
            {
                countEven++;
                System.out.println("Even Number " + number);
            }
            else
            {
                break;
            }
        }
        System.out.println("Total number of even numbers found = " + count);
    }

    public static boolean isEvenNumber(int number)
    {
        if(number % 2  == 0)
        {
            return true;
        }
        return false;
    }
}