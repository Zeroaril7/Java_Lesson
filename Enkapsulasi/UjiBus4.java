package Enkapsulasi;

public class UjiBus4 {
    public static void main(String[] args) {
        Bus4 busMini = new Bus4(10);
        busMini.addPenumpang(1);
        busMini.getAverage(45);
        busMini.cetak();

        busMini.addPenumpang(2);
        busMini.getAverage(40);
        busMini.cetak();

        busMini.addPenumpang(1);
        busMini.getAverage (70);
        busMini.cetak();

        busMini.addPenumpang(1);
        busMini.getAverage(50);
        busMini.cetak();


    }
}
