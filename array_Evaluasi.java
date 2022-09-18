import java.util.Scanner;
public class array_Evaluasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan banyak siswa yang akan diinputkan : ");
        int indeks = input.nextInt();
        String siswa[] = new String[indeks];

        input.nextLine();

        for (int a = 0 ; a < siswa.length ; a++){
            System.out.printf("Masukkan nama siswa ke " + (a+1) + " : ");
            siswa [a] = input.nextLine();
        }

        System.out.println("-----------------------------------");

        for (int b = 0 ; b<siswa.length ; b++){
            System.out.println("Nama siswa ke " + (b+1) + " adalah " + siswa[b]);
        }

        System.out.println("-------------------------------------");

    }
}


