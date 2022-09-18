import java.util.Scanner;
public class latihanFungsi {


    public static int prima(int awal, int akhir) {
        for (int a = awal; a <= akhir; a++) {
            int jumlahFaktor = 0;
            int hasil = 0;

            for (int pembanding = 1; pembanding <= a; pembanding++) {
                if (a % pembanding == 0) {
                    hasil = jumlahFaktor + 1;
                    if (hasil == 2) {
                        System.out.println(a);
                    }
                }
            }   return hasil;
        }
        return prima(awal,akhir);
    }

    /*String sapaan ;

    //Tipe tanpa mengembalikan nilai
    public static void ucapSalam (){
        System.out.println("Halo...");
    }
    //Tipe dengan mengembalikan nilai
    public static int hitung (int a, int b){
            System.out.println(a*b);
        return a*b;
    }*/


        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            int a, b;

            System.out.println("masukkan nilai awal : ");
            a = input.nextInt();
            System.out.println("masukkan nilai akhir : ");
            b = input.nextInt();

            System.out.println("Hasilnya adalah " + prima(a,b));
        }

        /*ucapSalam();
        hitung(6,9);*/
    }


