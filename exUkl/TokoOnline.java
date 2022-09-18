package exUkl;

public class TokoOnline {
    public static void main(String[] args) {
        Member runM = new Member();
        Karyawan run2 = new Karyawan();
        Barang runB = new Barang();
        Transaksi runT = new Transaksi();
        Laporan runL = new Laporan();

        runL.laporan(runB);
        runL.laporan(runM);
        runL.laporan(runT,runB);
        runT.prosesTransaksi(runM,runT,runB);
        runL.laporan(runT,runB);
        runL.laporan(runB);
        runL.laporan(runM);
    }
}
