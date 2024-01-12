import java.math.BigDecimal;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[] a = {-342411300, -1536075885, -1879862530, 346222525, 0, -1625359216, 386500588, -698510139, -381748367, 1796715018, -1252887832, 0, 499862507};
        int[] b = {16200, -4391, -95860, 27310, 42421, -64164, -17490, -8244, 171226, -125412, 59248, -86209, 23906};

        // Print arrays
        ArrayList<Integer> subt = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            // Perform division as BigDecimal to control precision
            BigDecimal result = new BigDecimal(a[i]).divide(new BigDecimal(b[i]), 0, BigDecimal.ROUND_HALF_UP);

            // Convert the result back to an integer
            int roundedResult = result.intValue();

            subt.add(i, roundedResult);
            System.out.print(roundedResult + " ");
        }
    }
}
