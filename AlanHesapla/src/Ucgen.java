
public class Ucgen extends Sekil {
    
    private double taban;
    private double kenar1;
    private double kenar2;
    private double yukseklik;
    
    //Alan Kullanımı Icın Constructor
    
     public Ucgen(double taban, double yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }
     
   //Cevre Kullanımı İcin Constructor
    public Ucgen(double taban, double kenar1, double kenar2) {
        this.taban = taban;
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    void alanHesapla() {
        System.out.println("Ucgenin Alani:"+(taban*yukseklik)/2);
    }

    
    void cevreHesapla() {
        System.out.println("Ucgenin Cevresi:"+(kenar1+kenar2+taban));
    }

    
    
}

