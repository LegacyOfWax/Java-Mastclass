public class Main {

    public static void main(String[] args)
    {
        byte myByteValue = 40;
        short myShortValue = 10;
        int myIntValue = 20;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println(myLongValue);

        short shortValue = (short) (1000 + 10 * (myShortValue + myIntValue + myShortValue));
        System.out.println(shortValue);
    }

}