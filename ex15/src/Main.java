import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int length;


        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        int[] values= new int[length];
        for (int i = 0; i < length; i++){
            values[i] = sc.nextInt();
        }


        sum(values, length);
    }

    public static void sum(int[] values, int length) {
        int[] sum = new int[length + 1];
        for (int i = 0; i < length; i++) {
            String value = Integer.toString(values[i]);
            int size = value.length();
            int originalValue = values[i];
            for (int i2 = size; i2 > 0; i2--) {
                sum[i] = sum[i] + (originalValue % 10 * i2);
                originalValue = originalValue / 10;
            }
            System.out.println(sum[i] + " ");
        }
    }
}


