package Enkapsulasi;

public class Bola {
    private double Jarijari;

    public void setJarijari (double r){
        this.Jarijari=r;

        System.out.println("Jari-jari Bola : "+r);
    }

    public void showDiameter(){
        double d =this.Jarijari*2;

        System.out.println("Diameter Bola : "+d);
    }

    public void showLuasPermukaan(){
        double lP=Math.PI*this.Jarijari*this.Jarijari*4;

        System.out.println("Luas Permukaan Bola : "+lP);
    }

    public void showVolume(){
        double v=Math.PI*this.Jarijari*this.Jarijari*this.Jarijari*4/3;

        System.out.println("Volume Bola : "+v);
    }

}
