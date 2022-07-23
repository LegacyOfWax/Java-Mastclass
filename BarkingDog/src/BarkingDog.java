public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay)
    {
        if (barking && hourOfTheDay < 8 && hourOfTheDay >= 0 || hourOfTheDay > 22 && hourOfTheDay <= 23)
        {
            System.out.println(true);
            return true;
        }
        else
        {
            System.out.println(false);
            return false;
        }
    }
}
