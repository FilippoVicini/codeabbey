import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int size = 0;
        int[] f = new int[0];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            size = sc.nextInt();
        }
        f = new int[size];
        for (int i = 0; i < f.length; i++) {
            f[i] = sc.nextInt();
        }
        double[] c = new double[size];
        int[] d = new int[size];

        for (int i = 0; i < f.length; i++) {
            int a = f[i] - 32;
            double b = 0.5555555556;
            c[i] = a*b;
            c[i] = Math.round(c[i]);
            d[i] = (int)c[i];
            System.out.print(d[i] + " ");
        }
    }
}

