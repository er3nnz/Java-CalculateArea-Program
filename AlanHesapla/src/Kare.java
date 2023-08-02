
public class Kare extends Sekil {

    private double kenar;
    public Kare(double Kenar) {
        this.kenar=Kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println("Karenin Alani:"+(kenar*kenar));
        
    }

    @Override
    void cevreHesapla() {
        System.out.println("Karenin Cevresi:"+(kenar*4));
    }
    
}
