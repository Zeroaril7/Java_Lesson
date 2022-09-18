package Inheritance;

public class dataPegawairun {
    public static void main(String[] args) {
        data rundata = new data ();
        Pegawai runpegawai = new Pegawai();

        rundata.cetak();
        runpegawai.dataP();
        runpegawai.cetak();
        rundata.gajiP(1200000);
        rundata.gajiP (1200000,2);
    }
}
