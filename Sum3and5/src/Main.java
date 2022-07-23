public class Main {
    public static void main(String[] args) {

//        for(int i = 0; i <= 1000; i++)
//        {
//            if (i % 3 == 0 || i % 5 == 0)
//            {
//                System.out.println(i);
//            }
//        }

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                count++;
                sum += i;
                System.out.println(i);
            }
            if(count == 5)
            {
                break;
            }
        }
        System.out.printf("Sum = " + sum);
    }
}