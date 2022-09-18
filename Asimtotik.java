import java.util.Scanner;

public class Asimtotik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 1;

        System.out.println("Masukkan nilai n");
        int n = in.nextInt();

        System.out.println("Ini memakan waktu ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("Ini output ke " + k + " = " + (i * j));
                k++;
            }
        }
    }
}
