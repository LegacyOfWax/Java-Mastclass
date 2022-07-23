public class Main {
    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        System.out.println((myFirstDouble + mySecondDouble) * 100);

        double myValueTotal = (myFirstDouble + mySecondDouble) * 100.00);
        double remainder = myValueTotal % 40.00d;

        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }

    }
}