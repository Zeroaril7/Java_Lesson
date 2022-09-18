package Latihan;

public class bangun implements relasi{


        private int panjang;
        private int lebar;
        public bangun (int p, int l){
            this.panjang=p;
            this.lebar=l;
    }

    public int getLuas (){
            int luas=2*(panjang+lebar);
            return luas;
    }

    @Override
    public boolean cek(Object a, Object b) {
        int luas1 = ((bangun)a).getLuas();
        int luas2 = ((bangun)b).getLuas();
        return  (luas1>luas2);
    }

    public static void main(String[] args) {
        bangun persegi1 = new bangun(10,9);
        bangun persegi2 = new bangun(8,12);

        System.out.println(persegi1.getLuas());
        System.out.println(persegi2.getLuas());
        System.out.println(persegi1.cek(persegi1,persegi2));
    }
}
