package Inheritance;

public class Hitung2 {
    public static void main(String[] args) {
        BangunDatar2 bangundatar=new BangunDatar2();

        persegi Persegi = new persegi();
        Persegi.sisi=8;

        Persegipanjang perjang =new Persegipanjang();
        perjang.lebar=11;
        perjang.panjang=2;


        bangundatar.luas();
        bangundatar.keliling();

        Persegi.luas();
        Persegi.keliling();

        perjang.luas();
        perjang.keliling();

    }

}
