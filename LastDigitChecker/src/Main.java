public class Main {
    public static void main(String[] args) {
        hasSameLastDigit(40 , 78 , 56);
    }
    public static boolean hasSameLastDigit(int x, int y, int z)
    {
        if(isValid(x) && isValid(y) && isValid(z))
        {
            x %= 10;
            y %= 10;
            z %= 10;
            System.out.println(x + " " + y + " " + z);

            return (x == y) || (x == z) || (y == z);
        }
        return false;
    }
    public static boolean isValid(int number)
    {
        if(number < 10 || number > 1000)
        {
            return false;
        }
        return true;
    }
}