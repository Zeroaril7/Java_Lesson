package Inheritance;

public class Pegawai extends data {
    String nama = "Diah";
    String jk = "Perempuan";

    void dataP (){
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Nomor Pegawai : "+super.nomor);
    }
    void cetak (){
        System.out.println("Bekerja di bagian admin");
    }
}
