import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        // Consume the newline character left in the buffer
        sc.nextLine();

        ArrayList<String> b = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            b.add(sc.nextLine());
        }

        for (String str : b) {
            int vowelCount = countVowels(str, vowels);
            System.out.print(vowelCount + " ");
        }
    }

    private static int countVowels(String str, char[] vowels) {
        int count = 0;
        for (char vowel : vowels) {
            for (char c : str.toCharArray()) {
                if (c == vowel) {
                    count++;
                }
            }
        }
        return count;
    }
}
