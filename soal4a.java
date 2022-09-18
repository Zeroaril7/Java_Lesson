public class soal4a {
    static int uke (int un, int s){
        int unx=1, uny=5, a=3, b=5;

        un=a+(unx-1)*b;
        s+=un;

        for (int x=unx ;x<=uny;x++){
            for (int y=unx; y<=x;y++) {
                System.out.print(un+"\t");
                un += b;
                s += un;
            }
            System.out.println();
        }
        for (int x=unx+1 ;x<=uny;x++){
            for (int y=unx-1; y<=uny-x;y++) {
                System.out.print(un+"\t");
                un += b;
                s += un;
            }
            System.out.println();
        }
        System.out.println("Jumlah deretnya adalah : "+(s-un));
        return un&s;
    }
    public static void main(String[] args) {
        int un=0, s=0;
        uke(un,s);
    }
}
