package Enkapsulasi;

public class UjiBus3 {
    public static void main(String[] args) {
        Bus3 busMini= new Bus3(12);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();
        busMini.addPenumpang(10);
        busMini.cetak();
        busMini.addPenumpang(7);
        busMini.cetak();
        busMini.addPenumpang(1);
        busMini.cetak();
    }
}
