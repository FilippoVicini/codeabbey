import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[][] numbers = new int[length][3];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }

        compare(numbers, length);
    }

    public static void compare(int[][] numbers, int length){
        int[] median = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                Arrays.sort(numbers[i]);
                median[i] = numbers[i][1];
            }
        }

        for (int i = 0; i < median.length; i++){
            System.out.print(median[i] + " ");
        }
    }
}