import java.util.Scanner;

public class soal7spp {
    public static int tagihan (int bayar){
        int sb [][]={{50,5}, {150, 10}, {300, 20}};
        int sn [][]={{70,5}, {170, 10}, {350, 20}};
        int ma [][]={{100,10}, {250, 20}, {500, 30}};
        String data [][]= {{"1", "Mira", "SBMPTN","Sawojajar"},{"2", "Nina", "SNMPTN","Kedung Kandang"},{"3", "Oemar", "Mandiri","Ijen"},{"4", "Pena", "SBMPTN","Dinoyo"}};

        int id=0, pendapatan=0, bulan=0, syarat=1;
        String kategori=null;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID Mahasiswa : ");
       id=input.nextInt();
        System.out.print("Masukkan pendapatan orang tua : ");
       pendapatan= input.nextInt();
        System.out.print("Masukkan pembayaran untuk berapa bulan : ");
        bulan= input.nextInt();

        if(pendapatan<2000000){
            kategori="A";
        } else if (pendapatan>=2000000 && pendapatan<=10000000){
            kategori="B";
        } else if (pendapatan>10000000){
            kategori="C";
        }
    if (id>0 && id<5) {
        if (data[id - 1][2].equals("SBMPTN")) {
            if (kategori.equals("A")) {
                bayar = sb[0][0] + sb[0][1] * bulan;
            } else if (kategori.equals("B")) {
                bayar = sb[1][0] + sb[1][1] * bulan;
            } else if (kategori.equals("C")) {
                bayar = sb[2][0] + sb[2][1] * bulan;
            }
        } else if (data[id - 1][2].equals("SNMPTN")) {
            if (kategori.equals("A")) {
                bayar = sn[0][0] + sn[0][1] * bulan;
            } else if (kategori.equals("B")) {
                bayar = sn[1][0] + sn[1][1] * bulan;
            } else if (kategori.equals("C")) {
                bayar = sn[2][0] + sn[2][1] * bulan;
            }
        } else if (data[id - 1][2].equals("Mandiri")) {
            if (kategori.equals("A")) {
                bayar = ma[0][0] + ma[0][1] * bulan;
            } else if (kategori.equals("B")) {
                bayar = ma[1][0] + ma[1][1] * bulan;
            } else if (kategori.equals("C")) {
                bayar = ma[2][0] + ma[2][1] * bulan;
            }
        }
    } else {
        System.out.println("Maaf, pilihan tidak tersedia, silahkan coba lagi");
    }
        System.out.println();
        System.out.println("ID mahasiswa : "+id);
        System.out.println("Nama mahasiswa : "+data[id-1][1]);
        System.out.println("Alamat mahasiswa : "+data[id-1][3]);
        System.out.println("Jalur masuk : "+data[id-1][2]);
        System.out.println("Kategori pendapatan : "+kategori);
        System.out.println("Total tagihan : "+bayar*100000+" Rupiah");

        return bayar;
    }

    public static void main(String[] args) {
        int bayar=0;
        System.out.println("===== Selamat Datang Di Program Pembayaran SPP & DSP =====");


        tagihan(bayar);
    }
}
