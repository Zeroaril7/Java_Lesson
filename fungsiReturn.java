import java.util.Scanner;
public class fungsiReturn {
    public static String nama (String a){
        System.out.printf("Selamat Pagi ");
        System.out.println(a);
        return a;
    }
    public static int absen (int nomor) {
        System.out.print(nomor);
        int jumlahFaktor = 0;
        if (nomor % 2 == 0) {
            System.out.printf(" adalah bilangan genap");
        } else {
            System.out.printf(" adalah bilangan ganjil");
        }
        if (nomor > 0){
            for (int a = 1 ; a <= nomor ; a++){
                if (nomor%a == 0){
                    jumlahFaktor += 1;
                }
            } if (jumlahFaktor == 2){
                System.out.println(" dan bilangan prima");
            } else {
                System.out.println(" dan bukan bilangan prima");
            }
        }
        return nomor;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nomor;
        System.out.printf("Masukkan nama anda : ");
        String cek = input.nextLine();
        System.out.printf("masukkan nomor absen anda: ");
        nomor = input.nextInt();
        System.out.println();
        nama(cek);
        absen(nomor);
    }
}
