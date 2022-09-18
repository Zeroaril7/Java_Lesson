package Cottege;

import java.util.Scanner;

public class CottegeRun {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CottegePembayaran run1 = new CottegePembayaran();
        CottegeData run2 = new CottegeData();
        CottegeTipe run4 = new CottegeTipe();

        System.out.print("Masukkan ID Pelanggan: ");
        run2.id = in.nextInt();

        System.out.print("1. Weekday\n2. Weekend\n3. Holiday\nMasukkan Golongan Hari : ");
        run1.gol = in.next();
        
        System.out.print("Masukkan lama menginap : ");
        run1.lama = in.nextInt();

        System.out.print("Masukkan tipe cottege pilihan anda : ");
        run4.tipe = in.nextLine();
        run4.tipe = in.nextLine();

        if (run4.tipe.equalsIgnoreCase("duku")||run4.tipe.equalsIgnoreCase("jeruk")){
            run1.hari = 0 ;
        } else if (run4.tipe.equalsIgnoreCase("alpukat")||run4.tipe.equalsIgnoreCase("jambu air")){
            run1.hari = 1 ;
        } else if (run4.tipe.equalsIgnoreCase("durian")||run4.tipe.equalsIgnoreCase("melon")){
            run1.hari = 2 ;
        } else if (run4.tipe.equalsIgnoreCase("belimbing")||run4.tipe.equalsIgnoreCase("mangga")){
            run1.hari = 3 ;
        } else if (run4.tipe.equalsIgnoreCase("barrack")){
            run1.hari = 4 ;
        }

        System.out.println();
        run2.outId();
        run2.outData();
        run4.outTipe();
        run1.outLama();
        run1.tagihan();
    }
}
