public class soal5 {
    public static int penjumlahan(int hasil[][]){
        int a [][]= {{-7,5},{4,8}};
        int b [][]= {{1,1,},{-4,9}};
        for (int x=0 ; x<2 ; x++){
            for (int y = 0 ; y<2 ; y++) {
                for (int z = 0; z< 2; z++) {
                    hasil[x][y] = hasil[x][y]+a[x][z] * b[x][z];
                }
            }
        }
        for (int p=0;p<2;p++){
            for (int q=0;q<3;q++){
                System.out.print(hasil[p][q]+"\t");
            }
            System.out.println();
        }
        return hasil[1][2];
    }

    public static void main(String[] args) {
        int hasil [][] = new int [2][3];
        penjumlahan(hasil);
    }
}
