package Enkapsulasi;

public class Bus4 {
    private double Penumpang,maxPenumpang, counter, penumpangBaru;

    public Bus4 (int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        Penumpang = 0;
    }
    public void addPenumpang(int Penumpang){
        double temp=this.penumpangBaru+Penumpang;
        if (temp>=maxPenumpang){
            System.out.println("Overload penumpang");
        } else {
            this.penumpangBaru=temp;
            this.Penumpang=Penumpang;
        }
    }
    public void getAverage(double average){
        this.counter += average*Penumpang;
    }
    public void cetak (){
        System.out.println("Penumpang sekarang = "+penumpangBaru);
        System.out.println("Penumpang seharusnya = "+maxPenumpang);
        System.out.println("Rata-rata berat badan penumpang = "+(counter/penumpangBaru));
        System.out.println();
    }
}
