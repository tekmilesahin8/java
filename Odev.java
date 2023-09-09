
package odev;
class Odev {
    public static void main(String[] args) {
       
        
        
        /*Konum konum=new Konum(20,50);
        Koltuk koltuk=new Koltuk(konum,"Mavi",1);
        
        Konum konum2=new Konum(300,100);
        Koltuk koltuk2=new Koltuk(konum2,"Gri",3);
        
        Konum konum3=new Konum(100,200);
        Masa masa=new Masa(konum3,"Kahverengi",4,2);*/
        
        
        //etkinlikte istenen değerleri metotlar ile oluşturuyoruz.
        Oda oda=new Oda("Misafir Odası",30);
        
        Koltuk k1=new Koltuk(new Konum(20,50),"Mavi","Tek Kişilik",1);
        Koltuk k2=new Koltuk(new Konum(300,100),"Gri","Üç Kişilik",3);
        Masa masa=new Masa(new Konum(100,200),"Kahverengi","Masa",4,2); 
        
        //mobilyaekle metodu ile verileri çekiyoruz.
        oda.mobilyaEkle(k1);
        oda.mobilyaEkle(k2);
        oda.mobilyaEkle(masa);
        
        //listele ve tumunugoster metotları ile verileri çıktıda gösteriyoruz.
        oda.listele();
        System.out.println();
        oda.tumunuGoster();
        
    }
    
}
