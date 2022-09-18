import java.util.Scanner;
public class programMahasiswa {
    public static String uang (int pendapatan){
        String kategori= "";

        if (pendapatan < 2000000) {
            kategori = "A";
        } else if (pendapatan >= 2000000 || pendapatan <= 10000000 ){
            kategori = "B";
        }else if (pendapatan > 10000000 ){
            kategori = "C";
        }
        return kategori;
    }

    public static void main(String[] args) {
        int hasil = 0;

        int sb[][] = {{5000000, 500000}, {15000000, 1000000}, {30000000, 2000000},};
        int sn[][] = {{7000000, 500000}, {17000000, 1000000}, {35000000, 2000000},};
        int ma[][] = {{10000000, 1000000}, {25000000, 2000000}, {50000000, 3000000}};
        String data[][] = {
                {"1", "Mira", "SBMPTN", "Sawojajar"},
                {"2", "Mira", "SNMPTN", "Kedung Kandang"},
                {"3", "Oemar", "Mandiri", "Ijen"},
                {"4", "Pena", "SBMPTN", "Dinoyo"}
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID anda : ");
        int id = input.nextInt();
        System.out.print("Masukkan pendapatan orang tua anda : ");
        int pendapatan = input.nextInt();
        System.out.print("Masukkan berapa bulan SPP yang akan anda bayar : ");
        int bulan = input.nextInt();

        String kategori = uang(pendapatan);
        String jalur = data[(id - 1)][2];

        if (jalur.equals("SBMPTN")) {
            if (kategori.equals("A")) {
                hasil = sb[0][0] + sb[0][1] * bulan;
            } else if (kategori.equals("B")) {
                hasil = sb[1][0] + sb[1][1] * bulan;
            } else if (kategori.equals("C")) {
                hasil = sb[2][0] + sb[2][1] * bulan;
            }
        } else if (jalur.equals("SNMPTN")) {
            if (kategori.equals("A")) {
                hasil = sn[0][0] + sn[0][1] * bulan;
            } else if (kategori.equals("B")) {
                hasil = sn[1][0] + sn [1][1] * bulan;
            } else if (kategori.equals("C")) {
                hasil = sn[2][0] + sn[2][1] * bulan;
            }

        } else if (jalur.equals("Mandiri")) {
            if (kategori.equals("A")) {
                hasil = ma[0][0] + ma[0][1] * bulan;
            } else if (kategori.equals("B")) {
                hasil = ma[1][0] + ma[1][1] * bulan;
            } else if (kategori.equals("C")) {
                hasil = ma[2][0] + ma[2][1] * bulan;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("ID : " + id);
        System.out.println("Nama : " + data[id-1][1]);
        System.out.println("Jalur Masuk : " + data[id-1][2]);
        System.out.println("Kategori Pendapatan : " + kategori);
        System.out.println("Jumlah biaya : " + hasil);
        System.out.println("Alamat : " + data[id-1][3]);
        System.out.println("----------------------------------------");
    }
}
