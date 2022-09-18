public class soal1 {
    static int uke (int s){
        int unx=2, uny=5, a=3, b=5, un;

        un=a+(unx-1)*b;
        s+=un;

        for (int x=unx ;x<=uny;x++){
            System.out.println("Nilai U ke-"+x+" adalah : "+un);
            un+=b;
            s+=un;
        }
        System.out.println("Jumlah deretnya dari U ke-"+unx+" sampai U ke-"+uny+" adalah : "+(s-un));
        return s;
    }
    public static void main(String[] args) {
        int un=0, s=0;
        uke(s);
    }
}
