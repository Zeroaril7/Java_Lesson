public class matriksTugas2 {
    public static void main(String[] args) {
        int matriks1 [][] = {{27,27,27},{27,27,27},{27,27,27}};
        int matriks2 [][] = {{5,5,5},{5,5,5},{5,5,5}};
        System.out.print("---------------------------");
        for (int a = 0 ; a < matriks1.length  ; a++){
            System.out.println();
            for (int b = 0 ; b < matriks1[a].length ; b++){
                System.out.print(matriks1[a][b] + " ");
            }
        }
        System.out.println();
        System.out.print("---------------------------");
        for (int a = 0 ; a < matriks2.length  ; a++){
            System.out.println();
            for (int b = 0 ; b < matriks2[a].length ; b++){
                System.out.print(matriks2[a][b] + " ");
            }
        }
        System.out.println();
        System.out.print("---------------------------");
        System.out.println();
        int hasil [][] = new int [matriks1.length][matriks2.length];
        for (int a = 0 ; a < hasil.length ; a++){
            for (int b = 0 ; b < hasil.length ; b++){
                hasil[a][b] = matriks1[a][b] - matriks2[a][b]  ;
                System.out.println("hasil pengurangan dari matriks " + "|" + a + " " + b + "|" + " adalah " + hasil[a][b]);
            }
        }
    }
}
