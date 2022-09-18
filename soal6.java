public class soal6 {
    public static int perkalian(int hasil[][]) {
        int a[][] = {{-7, 5, 3, -2}, {4, 8, -3, 2}};
        int b[][] = {{1, 1, 3}, {-4, 9, 7}, {2, 1, 1}, {-5, 4, 8}};
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 4; z++) {
                    hasil[x][y] = hasil[x][y] + a[x][z] * b[z][y];
                }
            }
        }

        for (int p=0 ;p<2 ;p++){
            for (int q=0 ; q<3 ; q++){
                System.out.print(hasil[p][q]+"\t");
            }
            System.out.println();
        }
                return hasil[1][2];

    }

        public static void main (String[]args){
            int hasil[][] = new int[2][3];
            perkalian(hasil);

        }
    }

