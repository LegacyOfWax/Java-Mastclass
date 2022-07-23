public class Main {
    public static void main(String[] args) {
        getBucketCount(7.25, 4.3, 2.35, 0);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets)
    {
        if(width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0)
        {
            return -1;
        }

        int bucketsNeeded = 0;
        double calculated = 0;
        double areaToCover = ((width * height) - (extraBuckets * areaPerBucket));

        System.out.println(areaToCover);

        while(areaToCover > calculated)
        {
            calculated += areaPerBucket;
            bucketsNeeded++;
        }
        System.out.println(bucketsNeeded);
        return bucketsNeeded;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width < 0 || height < 0 || areaPerBucket < 0)
        {
            return -1;
        }

        int bucketsNeeded = 0;
        double calculated = 0;
        double areaToCover = width * height;

        System.out.println(areaToCover);

        while(areaToCover > calculated)
        {
            calculated += areaPerBucket;
            bucketsNeeded++;
        }
        System.out.println(bucketsNeeded);
        return bucketsNeeded;
    }
}