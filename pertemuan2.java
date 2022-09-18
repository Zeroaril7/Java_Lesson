import java.lang.Math;
import java.util.Scanner;
public class pertemuan2 {

        public static int max(int a, int b, int c) {
            int maks;
            System.out.print("nilai tertinggi adalah ");
            maks = Math.max(a, b);
            if (c > maks) {
                maks = c;
            }
            System.out.println(maks);
            return maks;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a, b, c;

            System.out.print("Masukan nilai a : ");
            a = input.nextInt();

            System.out.print("Masukan nilai b : ");
            b = input.nextInt();

            System.out.print("Masukan nilai c: ");
            c = input.nextInt();

            max(a, b, c);


    }
}