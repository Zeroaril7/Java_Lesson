public class arrayMultiDimensi {
    public static void main(String[] args) {

        String nama [][] = {{"Budi", "Malang", "22 Tahun"}, {"Lasmini", "Surabaya", "20 Tahun"}, {"Sugeng", "Yogyakarta", "25 Tahun"}};
            for (int a = 0 ; a < nama.length ; a++){
                System.out.println("-------------------------");
                for (int b = 0 ; b < nama.length; b++){
                    System.out.println(nama[a][b]);

                }
            } System.out.println("-------------------------");
    }
}
