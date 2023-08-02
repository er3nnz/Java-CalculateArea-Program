public class daire extends Sekil{
    
    private double yarıcap;

    public daire(double yarıcap) {
        this.yarıcap = yarıcap;
    }

    @Override
    void alanHesapla() {
        System.out.println("Dairenin Alani:"+(yarıcap*yarıcap*Math.PI));
    }

    @Override
    void cevreHesapla() {
        System.out.println("Dairenin Cevresi:"+(2*Math.PI*yarıcap));
    }
    
}
