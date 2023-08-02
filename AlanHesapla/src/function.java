
import java.util.Scanner;

public class function {
    
     public static void fonksiyon(){
         
        Scanner scanner=new Scanner(System.in);
        int secenek;
        boolean a=false;
        System.out.println("Alan Hesaplama Programina Hosgeldiniz....");
        System.out.println("**************************");
        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz...\n"
                         + "1:Kare Alani Hesaplama\n"
                         + "2:Kare Cevresi Hesaplama\n"
                         + "3:Ucgen Alani Hesaplama\n"
                         + "4:Ucgen Cevresi Hesaplama\n"
                         + "5:Daire Alani Hesaplama\n"
                         + "6:Daire Cevresi Hesaplama\n"
                         + "7:Dikdortgen Alani Hesaplama\n"
                         + "8:Dikdortgen Cevresi Hesaplama\n"
                         + "9:Cikis Yapmak Icin");
        System.out.println("**************************");
        
        while(!a){
            secenek=scanner.nextInt();
            
            if(secenek==1){
                
                double kenar;
                System.out.println("Kare Alani Hesaplama Islemini Sectiniz....");

                System.out.println("Lutfen Sisteme Karenin Bir Kenar Olcusunu Giriniz");
                kenar=scanner.nextDouble();
                
                Kare kare=new Kare( kenar);
                kare.alanHesapla();
            
            } else if(secenek==2){
   
                double kenar;
                
                System.out.println("Karenin Cevresini Hesaplama Islemini Sectiniz....");

                System.out.println("Lutfen Sisteme Karenin Bir Kenar Olcusunu Giriniz");
                kenar=scanner.nextDouble();
 
                Kare kare=new Kare( kenar);
                kare.cevreHesapla();
            
            } else if(secenek==3){

                double kenar;
                double yukseklik;
                
                System.out.println("Ucgenin Alanini Hesaplama Islemini Sectiniz....");
                
                System.out.println("Lutfen Sisteme Ucgenin Kenar Olculerini Giriniz");
                kenar=scanner.nextDouble();
                
                System.out.println("Lutfen Sisteme Ucgenin Yukseklik Olculerini Giriniz");
                yukseklik=scanner.nextDouble();
                
                Ucgen ucgen=new Ucgen(kenar, yukseklik);
                ucgen.alanHesapla();
            
            }else if(secenek==4){
                
                double kenar;
                double kenar1;
                double kenar3;
                
                System.out.println("Ucgenin Cevresini Hesaplama Islemini Sectiniz....");
                
                System.out.println("Lutfen Sisteme Ucgenin Kenar Olculerini Giriniz");
                kenar=scanner.nextDouble();
                
                System.out.println("Lutfen Sisteme Ucgenin Kenar Olculerini Giriniz");
                kenar1=scanner.nextDouble();
                
                System.out.println("Lutfen Sisteme Ucgenin Kenar Olculerini Giriniz");
                kenar3=scanner.nextDouble();
                
                Ucgen ucgen=new Ucgen(kenar3, kenar1, kenar);
                ucgen.cevreHesapla();
            
            } else if(secenek==5){
                
                double yaricap;
                
                System.out.println("Dairenin Alanini Hesaplama Islemini Sectiniz....");

                System.out.println("Lutfen Sisteme Dairenin Yaricap Olculerini Giriniz");
                yaricap=scanner.nextDouble();
                
                daire daire=new daire(yaricap);
                daire.alanHesapla();
            
            }else if(secenek==6){
                String isim;
                double yaricap;
                
                System.out.println("Dairenin Cevresini Hesaplama Islemini Sectiniz....");
 
                System.out.println("Lutfen Sisteme Dairenin Yaricap Olculerini Giriniz");
                yaricap=scanner.nextDouble();
                
                daire daire=new daire(yaricap);
                daire.cevreHesapla();
            
            }else if(secenek==7){
                
                double kısaKenar;
                double uzunKenar;
                
                System.out.println("Dikdortgenin Alanini Hesaplama Islemini Sectiniz....");
                
                System.out.println("Lutfen Sisteme Dikdortgenin Kenar Olculerini Giriniz(Kisa Kenar)");
                kısaKenar=scanner.nextDouble();
                
                System.out.println("Lutfen Sisteme Dikdortgenin Kenar Olculerini Giriniz(Uzun Kenar)");
                uzunKenar=scanner.nextDouble();
                
                Dikdortgen dikdortgen=new Dikdortgen(kısaKenar, uzunKenar);
                dikdortgen.alanHesapla();
                
            }else if(secenek==8){
                
                double kısaKenar;
                double uzunKenar;
                
                System.out.println("Dikdortgenin Cevresini Hesaplama Islemini Sectiniz....");
                
                System.out.println("Lutfen Sisteme Dikdortgenin Kenar Olculerini Giriniz(Kisa Kenar)");
                kısaKenar=scanner.nextDouble();
                
                System.out.println("Lutfen Sisteme Dikdortgenin Kenar Olculerini Giriniz(Uzun Kenar)");
                uzunKenar=scanner.nextDouble();
                
                Dikdortgen dikdortgen=new Dikdortgen( kısaKenar, uzunKenar);
                dikdortgen.cevreHesapla();
            
            }else if(secenek==9){
                System.out.println("Sistemden Cikis Yapiliyor....");
                break;
            } 
        }
    }
}
