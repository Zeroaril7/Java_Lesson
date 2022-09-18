import java.util.Scanner;

public class soal7tol {
    public static int tagihan (int bayar){
        int syarat = 1;

        do {
            syarat-=1;

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan asal daerah : ");
            String in = input.next();
            System.out.print("Masukkan keluar ke daerah : ");
            String out = input.next();
            System.out.print("Masukkan golongan kendaraan : ");
            int gol = input.nextInt();

            if (in.equalsIgnoreCase("Dupak") && out.equalsIgnoreCase("Waru")) {
                if (gol == 1) {
                    bayar += 5000;
                } else if (gol == 2 || gol == 3) {
                    bayar += 8000;
                } else if (gol == 4 || gol == 5) {
                    bayar += 10500;
                }else {
                    System.out.println("Mohon maaf golongan yang anda masukkan tidak tersedia, silahkan coba lagi");
                    syarat+=1;
                    System.out.println();
                }
            } else if ((in.equalsIgnoreCase("waru") || in.equalsIgnoreCase("sidoarjo")) && (out.equalsIgnoreCase("sidoarjo") || out.equalsIgnoreCase("waru"))) {
                if (gol == 1) {
                    bayar += 6000;
                } else if (gol == 2 || gol == 3) {
                    bayar += 9000;
                } else if (gol == 4 || gol == 5) {
                    bayar += 12000;
                }else {
                    System.out.println("Mohon maaf golongan yang anda masukkan tidak tersedia, silahkan coba lagi");
                    syarat+=1;
                    System.out.println();
                }
            } else if ((in.equalsIgnoreCase("waru") || in.equalsIgnoreCase("porong")) && (out.equalsIgnoreCase("porong") || out.equalsIgnoreCase("waru"))) {
                if (gol == 1) {
                    bayar += 9000;
                } else if (gol == 2 || gol == 3) {
                    bayar += 14000;
                } else if (gol == 4 || gol == 5) {
                    bayar += 18500;
                }else {
                    System.out.println("Mohon maaf golongan yang anda masukkan tidak tersedia, silahkan coba lagi");
                    syarat+=1;
                    System.out.println();
                }
            } else if ((in.equalsIgnoreCase("porong") || in.equalsIgnoreCase("sidoarjo")) && (out.equalsIgnoreCase("sidoarjo") || out.equalsIgnoreCase("porong"))) {
                if (gol == 1) {
                    bayar += 5500;
                } else if (gol == 2 || gol == 3) {
                    bayar += 8500;
                } else if (gol == 4 || gol == 5) {
                    bayar += 11500;
                }else {
                    System.out.println("Mohon maaf golongan yang anda masukkan tidak tersedia, silahkan coba lagi");
                    syarat+=1;
                    System.out.println();
                }
            } else if (in.equalsIgnoreCase("porong")  &&  out.equalsIgnoreCase("kejapanan")) {
                if (gol == 1) {
                    bayar += 6000;
                } else if (gol == 2 || gol == 3) {
                    bayar += 8500;
                } else if (gol == 4 || gol == 5) {
                    bayar += 11500;
                } else {
                    System.out.println("Mohon maaf golongan yang anda masukkan tidak tersedia, silahkan coba lagi");
                    syarat+=1;
                    System.out.println();
                }
            } else if (in.equalsIgnoreCase("kejapanan")  &&  out.equalsIgnoreCase("gempol")) {
                if (gol == 1) {
                    bayar += 3000;
                } else if (gol == 2 || gol == 3) {
                    bayar += 5000;
                } else if (gol == 4 || gol == 5) {
                    bayar += 6500;
                } else {
                    System.out.println("Mohon maaf golongan yang anda masukkan tidak tersedia, silahkan coba lagi");
                    syarat+=1;
                    System.out.println();
                }
            } else {
                System.out.println("Mohon maaf data yang anda masukkan tidak tersedia, silahkan coba lagi");
                syarat += 1;
                System.out.println();
            }
        } while (syarat == 1);
        System.out.println();
        System.out.println("total tagihan anda : " + bayar + " Rupiah");
        System.out.println();
        System.out.println("Selamat menikmati perjalanan anda");

        return bayar;
    }

    public static void main(String[] args) {
        int bayar=0;
        System.out.println("==Selamat Datang di Pintu Tol==");
        tagihan(bayar);
    }
}
