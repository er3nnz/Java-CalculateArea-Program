public class Dikdortgen extends Sekil{

    private double kısaKenar;
    private double uzunKenar;
    public Dikdortgen(double kısaKenar,double uzunKenar) {
        this.kısaKenar=kısaKenar;
        this.uzunKenar=uzunKenar;
    }

    @Override
    void alanHesapla() {
        System.out.println("Dikdortgenin Alani:"+(kısaKenar*uzunKenar));
    }

    @Override
    void cevreHesapla() {
        System.out.println("Dikdortgenin Cevresi:"+((kısaKenar+uzunKenar)*2));
    }
    
}
