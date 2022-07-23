public class Main {

    private static final String INVALID_VALUE = ("Invalid Value");

    public static void printYearsAndDays(long minutes)
    {
        if(minutes < 0)
        {
            System.out.println(INVALID_VALUE);
            return;
        }
        long hoursCalc = minutes / 60;
        //System.out.println(hoursCalc);
        long daysCalc = hoursCalc / 24;
        //System.out.println(daysCalc);
        long yearCalc = daysCalc / 365;
        //System.out.println(yearCalc);
        if(daysCalc >= 365)
        {
            daysCalc = daysCalc % 365;
        }

        System.out.println(minutes + " min = " + yearCalc + " y and " + daysCalc + " d");
        return;
    }
}