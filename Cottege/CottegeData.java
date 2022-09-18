package Cottege;
public class CottegeData {
    int id ;
    String data [] ={"Ali", "Budi", "Dani", "Edi", "Umar"};

    void outId(){
        System.out.println("ID Pelanggan: " + id);
    }

    void outData () {
        System.out.println("Nama Pelanggan: "+data[id-1]);
    }
}
