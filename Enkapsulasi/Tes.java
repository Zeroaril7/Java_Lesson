package Enkapsulasi;

public class Tes {
    public static void main(String[] args) {
        double Jarijari=10;

        Bola ball = new Bola();

        ball.setJarijari(Jarijari);
        ball.showDiameter();
        ball.showLuasPermukaan();
        ball.showVolume();

    }
}
