public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result  = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result  = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 2 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("it is not an Alien");
            System.out.println("I am scared of Aliens");
        }
        int topScore = 100;
        if(topScore == 100)
        {
            System.out.println("You Got The High Score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
        {
            System.out.println("Greater than the second top score and less than 100");
        }

        if((topScore > 90 || (secondTopScore <= 90)))
        {
            System.out.println("either or both are true");
        }
        int newValue = 50;
        if(newValue == 50)
        {

        }

        boolean isCar = false;
        if(isCar == true)
        {

        }

        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("was Car is true");
        }

        int ageOfClient = 22;
        boolean isEighteenOrOver = ageOfClient >= 18 ? true : false;
        System.out.println(isEighteenOrOver);
    }
}