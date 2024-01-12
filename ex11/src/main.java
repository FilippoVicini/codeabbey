import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args){
        int length;

        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        int[][] numb = new int[length][3];
        int[] values = new int[length];
         int[] sum = new int[length + 1];
        for (int i = 0; i < length; i++){
            for (int j = 0; j < 3; j++){
                numb[i][j] = sc.nextInt();
            }
        }
        multiply(numb, values);
        internalSum(values, sum);
        for (int i = 0; i < length; i++ ){
            System.out.print(sum[i] + " ");
        }
    }


    public static void multiply(int[][] numb, int[] values){
       for(int i = 0; i < numb.length; i++){
           values[i] =(numb[i][0] * numb[i][1]) + numb[i][2];
       }
    }

    public static void internalSum(int[] numbers, int[] sum) {
        int digit;
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] > 0) {
                digit = numbers[i] % 10;
                sum[i] = sum[i] + digit;
                numbers[i] = numbers[i] / 10;
            }
            sum[i + 1] = 0;
        }
    }
}


