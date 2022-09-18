import java.util.Scanner;
public class fungsi19102021 {
    public static int tarif(int golongan, int jumlah) {
        int hasil = 0;
        if(golongan == 1) {
            hasil = jumlah * 1000;
        }
        else if(golongan == 2) {
            hasil = jumlah * 1300;
        }
        else {
            hasil = jumlah * 1500;
        }
        return hasil;
    }

    public static void main(String[] args) {
        String data[][] = {
                {"", "", "", ""},
                {"1", "Galuh", "1", "Sawojajar"},
                {"2", "Indro", "3", "Kedungkandang"},
                {"3", "Jedi", "2", "Ijen"},
                {"4", "Kanu", "3", "Dinoyo"},
        };

        Scanner input = new Scanner(System.in);
        System.out.print("ID Pelanggan : ");
        int id = input.nextInt();
        System.out.print("Jumlah Pemakaian (kwh) : ");
        int jumlah = input.nextInt();

        int golongan = 0;

        if(id < 1 || id > data.length) {
            System.out.println("ID Pelanggan tidak ada");
        }
        else {
            golongan = Integer.parseInt(data[id][2]);

            int bayar = tarif(golongan, jumlah);

            if(bayar < 50000) {
                bayar = 50000;
            }

            int total = bayar + 13000;

            System.out.println("ID Pelanggan : " + data[id][0]);
            System.out.println("Nama Pelanggan : " + data[id][1]);
            System.out.println("Jumlah Tagihan : Rp. " + total);
            System.out.println("Alamat : " + data[id][3]);
            System.out.println("Golongan : " + data[id][2]);
        }
    }
}
