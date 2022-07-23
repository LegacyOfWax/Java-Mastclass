public class Main {
    public static void main(String[] args) {
        canPack(2,1,5);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if (bigCount < 0 || smallCount < 0 || goal < 0 )
        {
            return false;
        }
        while(bigCount > 0 && goal >= 5 )
        {
            goal = goal - 5;
            System.out.println("big Count was " + bigCount);
            bigCount--;
            System.out.println("big Count now is  " + bigCount);
        }
        if(smallCount >= goal )
        {
            System.out.println("Small count tally");
            return true;
        }
        System.out.println("No condition true");
        return false;
    }
}