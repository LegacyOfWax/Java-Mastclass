public class Main {
    public static void main(String[] args) {
        printSquareStar(20);
    }
    public static void  printSquareStar(int number)
    {
        if(number < 5 )
        {
            System.out.println("Invalid Value");
            return;
        }

        for(int row = 0; row < number; row++)
        {
            for(int colum = 0; colum < number; colum++)
            {
                if(row == 0 || row == number - 1 || colum == 0 || colum == number - 1
                        || row == colum || row + colum == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}