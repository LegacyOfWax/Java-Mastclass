public class Main {
    public static void main(String[] args) {
        area(5);
        area(-1 );
        area(5, 4);
        area (-1, 4);
    }
    public static double area(double radius)
    {
        if (radius < 0 )
        {
            System.out.println("Invalid Value");
            return -1.0;
        }

        double areaCircle = radius * radius * Math.PI;
        System.out.println(areaCircle);
        return areaCircle;
    }
    public static double area(double x , double y)
    {
        if (x < 0 || y < 0 )
        {
            System.out.println("Invalid Value");
            return -1.0;
        }

        double areaRectangle = x * y;
        System.out.println(areaRectangle);
        return areaRectangle;
    }
}
