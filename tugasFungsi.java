import java.util.Scanner;
public class tugasFungsi {

    public static void ganjil(int awal, int akhir) {
        for (int a = (awal+1); a <= (akhir-1); a++) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
    public static void genap(int awal, int akhir) {
        for (int a = (awal+1); a <= (akhir-1); a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
    public static void prima(int awal, int akhir) {
        for (int a = awal; a <= akhir; a++) {
            int jumlahFaktor = 0;
            for (int b = 1; b <= a; b ++) {
                if (a % b == 0) {
                    jumlahFaktor += 1;
                }
            }
            if (jumlahFaktor == 2) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;

        System.out.printf("masukkan range awal : ");
        awal = input.nextInt();
        System.out.printf("masukkan range akhir : ");
        akhir = input.nextInt();

        input.nextLine();

        System.out.printf("Pilih cek bilangan genap atau ganjil atau prima : ");
        String cek = input.nextLine();

        if (cek.equalsIgnoreCase("genap")){
            genap(awal,akhir);
        } else if (cek.equalsIgnoreCase("ganjil")){
            ganjil(awal,akhir);
        } else if (cek.equalsIgnoreCase("prima")){
            prima(awal,akhir);
        }
    }
}