import java.util.Scanner;

public class multi_dimensi_input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan jumlah kolom di Matriks 1 : ");
        int indeks1A = input.nextInt();
        System.out.printf("Masukkan jumlah baris di Matriks 1 : ");
        int indeks2A = input.nextInt();

        int listA [][] = new int [indeks1A][indeks2A] ;

        for (int a = 0 ; a < listA.length ; a++){
            for (int b = 0 ; b < listA[a].length ; b++){
                System.out.print("Masukkan list di kolom ke " + (a+1) + " dan baris ke " + (b+1) + " : ");
                listA[a][b] = input.nextInt();
            }
        }
        System.out.println();

        System.out.printf("Masukkan jumlah kolom di Matriks 2 : ");
        int indeks1B = input.nextInt();
        System.out.printf("Masukkan jumlah baris di Matriks 2: ");
        int indeks2B = input.nextInt();

        int listB [][] = new int [indeks1B][indeks2B] ;

        for (int a = 0 ; a < listB.length ; a++){
            for (int b = 0 ; b < listB[a].length ; b++){
                System.out.print("Masukkan list di kolom ke " + (a+1) + " dan baris ke " + (b+1) + " : ");
                listB[a][b] = input.nextInt();
            }
        }
        System.out.println();

        System.out.println();
        System.out.print("Matriks 1");
        for (int a = 0 ; a < listA.length ; a++){
            System.out.println();
            for (int b = 0 ; b < listA[a].length ; b++){
                System.out.print(listA[a][b] + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.print("Matriks 2");
        for (int a = 0 ; a < listB.length ; a++){
            System.out.println();
            for (int b = 0 ; b < listB[a].length ; b++){
                System.out.print(listB[a][b] + " ");
            }
        }

        System.out.println();
        System.out.println();

        int hasil [][] = new int [(indeks1A+indeks1B)][(indeks2A+indeks2B)];
        for (int a = 0 ; a < hasil.length ; a++){
            for (int b = 0 ; b < hasil.length ; b++){
                hasil[a][b] = listA[a][b] + listB[a][b]  ;
                System.out.println("hasil penjumlahan dari matriks " + "kolom ke " + (a+1) + " dan baris ke " + (b+1) + " adalah " + hasil[a][b]);
            }
        }
    }
}
