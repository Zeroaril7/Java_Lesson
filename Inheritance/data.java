package Inheritance;

public class data {
    private int gajix, gajiy;
    int nomor = 333333;

    void gajiP (int gaji){
        this.gajix = gaji;
        System.out.println("Gaji utama yang didapat "+gajix);
    }

    void gajiP (int gaji, int kelipatan){
        this.gajiy = gaji*kelipatan;
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi "+gajiy);
    }

    void cetak (){
        System.out.println("Berikut identitas pegawai");
    }
}
