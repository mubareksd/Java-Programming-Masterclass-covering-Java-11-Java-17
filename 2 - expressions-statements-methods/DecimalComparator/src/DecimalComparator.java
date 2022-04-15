import java.math.BigDecimal;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
        int aa = (int) (a * 1000);
        int bb = (int) (b * 1000);
        if (aa == bb) {
            return true;
        } else {
            return false;
        }
    }
}