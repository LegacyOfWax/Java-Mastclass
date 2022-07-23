public class TeenNumberChecker {
    public static boolean hasTeen (int numOne, int numTwo, int numThree)
    {
        if(numOne >= 13 && numOne <= 19 || numTwo >= 13 && numTwo <= 19 || numThree >= 13 && numThree <= 19 )
        {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
    public static boolean isTeen (int teenNum)
    {
        if(teenNum >= 13 && teenNum <= 19)
        {
            System.out.println("true");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
