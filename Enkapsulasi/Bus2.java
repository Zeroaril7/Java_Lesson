package Enkapsulasi;

public class Bus2 {
    private int Penumpang,maxPenumpang;

    public Bus2 (int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        Penumpang = 0;
    }
    public void addPenumpang(int Penumpang){
        int temp;
        temp=this.Penumpang+Penumpang;
        if (temp>=maxPenumpang){
            System.out.println("Overload penumpang");
        } else {
            this.Penumpang=temp;
        }
    }

    public void cetak (){
        System.out.println("Penumpang sekarang = "+Penumpang);
        System.out.println("Penumpang seharusnya = "+maxPenumpang);
    }
}
