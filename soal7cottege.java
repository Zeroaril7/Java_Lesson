import java.util.Scanner;
public class soal7cottege {
    public static int tagihan(int bayar) {
        int syarat = 1;
        int day[] = {915, 575, 595, 495, 25};
        int end[] = {1025, 695, 715, 575, 25};
        int hol[] = {1225, 895, 915, 755, 35};
        String data[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};

        do {
            syarat -= 1;

            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan id anda : ");
            int id = input.nextInt();
            System.out.print("Masukkan tipe cottage : ");
            String cot = input.next();
            System.out.print("1. Weekday\n2. Weekend\n3. Holiday \nMasukkan golongan hari (gunakan angka): ");
            int hari = input.nextInt();
            System.out.print("Masukkan berapa lama anda menginap : ");
            int lama = input.nextInt();

            if (id > 0 && id < 6) {
                if (cot.equalsIgnoreCase("duku") || cot.equalsIgnoreCase("jeruk")) {
                    if (hari == 1) {
                        bayar = day[0];
                    } else if (hari == 2) {
                        bayar = end[0];
                    } else if (hari == 3) {
                        bayar = hol[0];
                    } else {
                        System.out.println("Mohon maaf, pilihan yang anda masukkan tidak tersedia, silahkan coba lagi");
                        syarat += 1;
                        System.out.println();
                    }
                } else if (cot.equalsIgnoreCase("alpukat") || cot.equalsIgnoreCase("jambu air")) {
                    if (hari == 1) {
                        bayar = day[1];
                    } else if (hari == 2) {
                        bayar = end[1];
                    } else if (hari == 3) {
                        bayar = hol[1];
                    } else {
                        System.out.println("Mohon maaf, pilihan yang anda masukkan tidak tersedia, silahkan coba lagi");
                        syarat += 1;
                        System.out.println();
                    }
                } else if (cot.equalsIgnoreCase("durian") || cot.equalsIgnoreCase("melon") || cot.equalsIgnoreCase("kedondong")) {
                    if (hari == 1) {
                        bayar = day[2];
                    } else if (hari == 2) {
                        bayar = end[2];
                    } else if (hari == 3) {
                        bayar = hol[2];
                    } else {
                        System.out.println("Mohon maaf, pilihan yang anda masukkan tidak tersedia, silahkan coba lagi");
                        syarat += 1;
                        System.out.println();
                    }
                } else if (cot.equalsIgnoreCase("belimbing") || cot.equalsIgnoreCase("mangga") || cot.equalsIgnoreCase("kedondong")) {
                    if (hari == 1) {
                        bayar = day[3];
                    } else if (hari == 2) {
                        bayar = end[3];
                    } else if (hari == 3) {
                        bayar = hol[3];
                    } else {
                        System.out.println("Mohon maaf, pilihan yang anda masukkan tidak tersedia, silahkan coba lagi");
                        syarat += 1;
                        System.out.println();
                    }
                } else if (cot.equalsIgnoreCase("barrack")) {
                    if (hari == 3) {
                        bayar = day[4];
                    } else if (hari == 2) {
                        bayar = end[4];
                    } else if (hari == 3) {
                        bayar = hol[4];
                    } else {
                        System.out.println("Mohon maaf, pilihan yang anda masukkan tidak tersedia, silahkan coba lagi");
                        syarat += 1;
                        System.out.println();
                    }
                } else {
                    System.out.println("Mohon maaf, pilihan anda tidak tersedia, silahkan coba lagi");
                    syarat += 1;
                    System.out.println();
                }
            } else {
                System.out.println("Mohon maaf, pilihan anda tidak tersedia, silahkan coba lagi");
                syarat += 1;
                System.out.println();
            }
            if (syarat == 0) {
                System.out.println();
                System.out.println("ID pelanggan : " + id);
                System.out.println("Nama pelanggan : " + data[id - 1]);
                System.out.println("Lama menginap : " + lama + " hari");
                System.out.println("Tipe cottage : " + cot);
                System.out.println("Total tagihan : " + (bayar * lama * 1000) + " Rupiah");
            }

            return bayar;
        }while (syarat==1);
    }

    public static void main(String[] args) {
        int bayar=0;
        tagihan(bayar);
    }
}
