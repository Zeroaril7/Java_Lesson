import java.util.Scanner;
public class tesFungsi {
    public static void print(int a, int b, String d){
        if (d.equalsIgnoreCase("Genap")){
            for (int c = a+1; c<b; c++){
                if (c%2 == 0){
                    System.out.println(c);
                }
            }
        }
        else if (d.equalsIgnoreCase("Ganjil")){
            for (int c = a+1; c <b; c++){
                if (c%2 !=0){
                    System.out.println(c);
                }
            }
        }
        else if (d.equalsIgnoreCase("prima")){
            for (int c = a+1; c < b; c++){
                int jumlahFaktor = 0;
                for (int e = 1 ; e <= c ; e++)
                if (c%e == 0){
                    jumlahFaktor += 1;
                    if (jumlahFaktor == 2){
                        System.out.println(c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan range awal nilai: ");
        int a = input.nextInt();
        System.out.print("Masukkan range akhir nilai: ");
        int b = input.nextInt();
        System.out.println("Masukkan jenis angka ganjil / genap / prima yang akan ditampilkan");
        String c = input.next();
        print(a,b,c);
    }
}
