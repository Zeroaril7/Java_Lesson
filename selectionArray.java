import java.util.Scanner;
public class selectionArray {
    public static void main(String[] args) {
        String databarang[][] = {{"M1", "Meja", "800000"}, {"K1", "Kursi", "430000"}, {"L1", "Lemari", "120000"}};

        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan kode barang : ");
        String kode = input.nextLine();
        System.out.print("Inputkan jumlah barang : ");
        int jumlah = input.nextInt();


        for (int a = 0; a < databarang.length; a++) {
            //for (int b = 0; b < databarang[a].length; b++) {
                if (databarang[a][0].equals(kode)) {
                    System.out.println("Nama barang adalah : " + databarang[a][1]);
                    System.out.println("Total bayar adalah : " + Integer.parseInt(databarang[a][2]) * jumlah);
                }
            //}

        }
    }
}