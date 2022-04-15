public class Main {

    public static void main(String[] args) {
        long miles = SpeedConvertor.twoMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConvertor.printConversion(10.5);
    }
}
