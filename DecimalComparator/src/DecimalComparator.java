public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double nubOne , double nubTwo)
    {
        int nubOneCheck = (int) (nubOne * 1000);
        int nubTwoCheck = (int) (nubTwo * 1000);

        if(nubOneCheck == nubTwoCheck)
        {
            return true;
        }
        return false;
    }
}
