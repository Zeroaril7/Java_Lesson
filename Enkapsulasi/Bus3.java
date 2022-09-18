package Enkapsulasi;

public class Bus3 {
    private int Penumpang,maxPenumpang;

    public Bus3 (int maxPenumpang){
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
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("password salah");
        }
    }
    public void cetak (){
        System.out.println("Penumpang sekarang = "+Penumpang);
        System.out.println("Penumpang seharusnya = "+maxPenumpang);
    }
}
