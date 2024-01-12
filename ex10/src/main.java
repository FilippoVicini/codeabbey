import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static int nseq = 0;
    public static int[][] nums;
    public static int[] lnum;
    public static int[] sum;


    public static void main(String[] args) {
        createArray();
        for (int f = 0; f < nums.length; f++) {
            lnum[f] = (nums[f][0] + (nums[f][2] -1) * nums[f][1]);

            sum[f] = (nums[f][2]* (  nums[f][0] + lnum[f])) /2;
            System.out.print(sum[f] + " ");
        }
    }

    public static void createArray() {
        Scanner sc = new Scanner(System.in);
        nseq = sc.nextInt();
        lnum = new int[nseq];
        sum = new int[nseq];
        nums = new int[nseq][3];

        for (int i = 0; i < nseq; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = sc.nextInt();
            }
            // Remove the extra sc.nextLine() here
        }
    }
}
