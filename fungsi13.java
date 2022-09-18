import java.util.Scanner;
public class fungsi13 {
    public static int penjumlahan (int a, int b){
        int hasil =  a + b ;
        System.out.println(hasil);
        return hasil ;
    }

    public static int pengurangan (int a, int b){
        int hasil =  a - b ;
        System.out.println(hasil);
        return hasil ;
    }

    public static int perkalian (int a, int b){
        int hasil =  a * b ;
        System.out.println(hasil);
        return hasil ;
    }

    public static double pembagian (int a, int b){
        double hasil =  a * b ;
        System.out.println(hasil);
        return hasil ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b ;
        String operator;

        System.out.printf("masukkan nilai a : ");
        a = input.nextInt();
        System.out.printf("masukkan nilai b : ");
        b = input.nextInt();

        input.nextLine();

        System.out.println("Pilih operator antara |+|-|*|/|");
        operator = input.nextLine();

        switch (operator){
            case ("+") :
                System.out.println("hasilnya adalah " + penjumlahan(a,b));
            break;
            case ("*") :
                System.out.println("hasilnya adalah " + perkalian(a,b));
                break;
            case ("-") :
                System.out.println("hasilnya adalah " + pengurangan(a,b));
                break;
            case ("/") :
                System.out.println("hasilnya adalah " + pembagian(a,b));
                break;
        }
    }
}
