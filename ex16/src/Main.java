import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.toIntExact;
public class Main {
    public static void main(String[] args){
        int N;
        int N2;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        float[] values = new float[N];
        int[] nvalues = new int[N];
        for (int i = 0; i < N; i++){
            values[i] = sc.nextFloat();
        }
        operations(values, N, nvalues);
    }

    public static void operations(float[] values, int N2, int[] nvalues){
        for (int i = 0; i < values.length; i++){
           nvalues[i]  = toIntExact((long) (values[i] *6)) +1;
           System.out.print(nvalues[i] + " ");
        }
    }
}


