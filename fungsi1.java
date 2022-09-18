public class fungsi1 {
    public static void hitungLuasPersegi (int sisi) {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi dengan sisi " + sisi + " adalah " + luas);
    }
    public static double hitungLuasLingkaran (int jari){
        double luas = 3.14*jari*jari;
        System.out.println("Luas lingkaran " + luas);
        return luas;
    }

    public static void main(String[] args) {
        hitungLuasPersegi(12);
        hitungLuasLingkaran(10);
    }
}
