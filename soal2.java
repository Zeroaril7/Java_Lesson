public class soal2 {
    static int uke (int un, int s){
        int unx=2, uny=5, a=3, b=5;

        un=a+(unx-1)*b;
        s+=un;

        for (int x=unx ;x<uny;x++){
            for (int y=unx; y<=uny;y++) {
                System.out.print(un+"\t");
                un += b;
                s += un;
            }
            System.out.println();
        }
        System.out.println("Jumlah deretnya dari U ke-"+unx+" sampai U ke-"+uny+" adalah : "+(s-un));
        return un&s;
    }
    public static void main(String[] args) {
        int un=0, s=0;
        uke(un,s);
    }
}
