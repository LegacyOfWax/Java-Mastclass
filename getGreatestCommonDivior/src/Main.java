public class Main {
    public static void main(String[] args) {
        getGreatestCommonDivisor(81, 152);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (first != second)
        {
            if (first > second)
            {
                first = first - second;
                System.out.println("first - second = " + first + "     " + second);
            } else {
                second = second - first;
                System.out.println("second - first = " + second + "     " + first);
            }
        }
        return second;
    }
}