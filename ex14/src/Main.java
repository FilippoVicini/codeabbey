import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int length;
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        int[][] sizes = new int[length][3];

        for (int i = 0; i < length; i++){
            for (int j = 0; j < 3; j++){
                sizes[i][j]= sc.nextInt();
            }
        }
        verify(sizes, length);

    }

    public static void verify(int[][] sizes, int length) {
        int[] track = new int[length];
        for (int i = 0; i < length; i++) {
            if (sizes[i][0] + sizes[i][1] > sizes[i][2] &&
                    sizes[i][0] + sizes[i][2] > sizes[i][1] &&
                    sizes[i][1] + sizes[i][2] > sizes[i][0]) {
                track[i] = 1;
            } else {
                track[i] = 0;
            }
            System.out.print(track[i] + " ");
        }


    }

}
