package exUkl;

import java.util.ArrayList;

public class Barang {
    private ArrayList <String> namaBarang = new ArrayList<String>();
    private ArrayList <Integer> stok = new ArrayList<Integer>();
    private ArrayList <Integer> harga = new ArrayList<Integer>();

    public Barang (){
        this.namaBarang.add("Snack");
        this.stok.add(10);
        this.harga.add(10000);

        this.namaBarang.add("Pocari Sweat");
        this.stok.add(20);
        this.harga.add(7500);

        this.namaBarang.add("Nasi Tumis");
        this.stok.add(5);
        this.harga.add(15000);

    }

    public int getJmlBarang(){
        return this.namaBarang.size();
    }

    public void setNamaBarang (String namaBarang){
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang (int idBarang){
        return this.namaBarang.get(idBarang);
    }

    public void setStok (int stok){
        this.stok.add(stok);
    }

    public int getStok (int stok){
        return this.stok.get(stok);
    }

    public void editStok (int stok, int idBarang){
        this.stok.set(stok,idBarang);
    }

    public void setHarga(int harga){
        this.harga.add(harga);
    }

    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }


}
