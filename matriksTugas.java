public class matriksTugas {
    public static void main(String[] args) {

        int matriks1 [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.print("---------------------------");
        for (int a = 0 ; a < matriks1.length ; a++){
            System.out.println();
            for (int b = 0 ; b < matriks1[a].length ; b++){
                System.out.print(matriks1[a][b] + " ");
            }
        }
        System.out.println();
        System.out.print("---------------------------");
    }
}
