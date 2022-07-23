public class Main {
    public static void main(String[] args) {
        int value = 1;

        if(value == 1)
        {
            System.out.println("value = " + value);
        }
        else if(value == 2)
        {
            System.out.println("value = " + value);
        }
        else
        {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 2;

        switch(switchValue)
        {
            case 1:
                System.out.println("value = 1 " + switchValue);
                break;

            case 2:
                System.out.println("value = 2 " + switchValue);
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actual value was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'D';

        switch (letter)
        {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
            default:
                System.out.println("NOt Found");
                break;
        }

        String month = "Jan";

        switch (month.toLowerCase())
        {
            case "jan":
                System.out.println("Jan was found");
                break;
            case "feb":
                System.out.println("Feb was found");
                break;
            case "mar":
                System.out.println("Mar was found");
                break;
            default:
                System.out.println("Jan Feb Mar not fou nd");
                break;
        }


    }
}