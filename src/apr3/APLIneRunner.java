package apr3;

public class APLIneRunner
{
    public static void main(String[] args)
    {

        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean online1 = line1.isOnline(5, -2);

        System.out.println(slope1);
        System.out.println(online1);

        APLine line2 = new APLine(-25,40,30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnline(5,-2);
        System.out.println(slope2);
        System.out.println(onLine2);

    }

}
