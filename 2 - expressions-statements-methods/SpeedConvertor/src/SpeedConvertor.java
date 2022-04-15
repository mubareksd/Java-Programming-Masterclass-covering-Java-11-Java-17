public class SpeedConvertor {
    public static long twoMilesPerHour (double kilometersPerHour) {
    if (kilometersPerHour < 0) {
        return -1;
    }

    return Math.round(kilometersPerHour / 1.609);

    }
}
