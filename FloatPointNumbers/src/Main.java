public class Main {
    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println(myMinDouble);
        System.out.println(myMaxDouble);

        int myIntValue = 5 / 3;
        //Do not use is as casting for floats to cluttered
        float myFloatValueCast = (float) 5 / 3;
        //use this with the f at the end of the float, cleaner code
        float myFloatValueNotCast = 5f / 3f;
        double myDoubleValue = 5d / 3sd;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValueNotCast);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}