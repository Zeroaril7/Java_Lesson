package Cottege;

public class CottegePembayaran {

    int lama ;
    int biaya ;

    int hari ;
    String gol ;
    int weekday [] = {915, 575, 595, 495,25};
    int weekend [] = {1025, 695, 715, 575,25};
    int holiday [] = {1225, 895, 915, 755,35};

    void outLama (){
        System.out.println("Lama menginap: "+lama+" Hari");
    }
    void tagihan (){
        if (gol.equalsIgnoreCase("Weekday")){
            biaya = weekday[hari];
        } else if (gol.equalsIgnoreCase("Weekend")){
            biaya = weekend[hari];
        } else if (gol.equalsIgnoreCase("holiday")){
            biaya = holiday[hari];
        }
        System.out.println("Tagihan anda : "+biaya*lama*1000+" Rupiah");
    }
}
