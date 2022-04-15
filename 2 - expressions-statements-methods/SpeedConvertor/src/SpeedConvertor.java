public class SpeedConvertor {
    public static long twoMilesPerHour (double kilometersPerHour) {
    if (kilometersPerHour < 0) {
        return -1;
    }

    return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = twoMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
