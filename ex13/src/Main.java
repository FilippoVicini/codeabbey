import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int length;
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        double[][] values = new double[length][2];

        // populate values from input
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 2; j++) {
                values[i][j] = sc.nextDouble();
            }
        }
        BMI(values, length);
    }

    public static void BMI(double[][] values, int length){
        double bmi[] = new double[length];
        String bmi2[] = new String[length];
        for (int i = 0; i < length; i++){
            double height = values[i][0];
            bmi[i] = height / (values[i][1]* values[i][1]);
            if (bmi[i] < 18.5) {
                bmi2[i] = "under";
            } else if (18.5 <= bmi[i] && bmi[i] < 25.0 ) {
                bmi2[i] = "normal";
            } else if (25.0 <= bmi[i] && bmi[i] < 30.0 ) {
                bmi2[i] = "over";
            }else if (30 <= bmi[i]  ) {
                bmi2[i] = "obese";
            }

            System.out.print(bmi2[i] + " ");
        }


    }
}
