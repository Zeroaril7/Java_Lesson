public class Matriks {
    public static void main(String[] args) {
        int matriksA [][] = {{6,3,2},{4,2,3}};
        int matriksB [][] = {{1,2},{2,3},{3,1}};

        for (int a = 0 ; a < matriksA.length  ; a++){
            System.out.println();
            for (int b = 0 ; b < matriksA[a].length ; b++){
                System.out.print(matriksA[a][b] + " ");

            }
        } System.out.println(); System.out.println("-------------------------");

        for (int c = 0 ; c < matriksB.length  ; c++){
            System.out.println();
            for (int d = 0 ; d < matriksB[c].length ; d++){
                System.out.print(matriksB[c][d] + " ");
            }
        }System.out.println(); System.out.println("-------------------------");
    }
}
