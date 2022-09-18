import java.util.Scanner;
public class pertemuan2_Array {
    public static void main(String[] args) {

        //Soal nomor 1 dan 2
        /*String nama [] = {"Sukhaku","Matatabi","Isobu","Son goku","Chomei","Gyuki","Kurama"};
            System.out.println(nama[2]);*/

        //Soal nomor 3 dan 4
        String [] siswa = {"Budi", "Nina", "Dea", "Ahmad", "Wawan"};
        Scanner input = new Scanner(System.in);

        System.out.println("0 : Budi \n1 : Nina \n2 : Dea \n3 : Ahmad \n4 : Wawan");
        System.out.println("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();

        if (pilihan<=4){
            System.out.println(siswa[pilihan]);
        } else {
            System.out.println("data tidak ditemukan");
        }

    }
}
