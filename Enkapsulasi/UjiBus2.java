package Enkapsulasi;

public class UjiBus2 {
    public static void main(String[] args) {
        Bus2 busMini= new Bus2(12);
        busMini.cetak();

        busMini.addPenumpang(10);
        busMini.cetak();

        busMini.addPenumpang(7);
        busMini.cetak();

        busMini.addPenumpang(1);
        busMini.cetak();
    }
}
