
package odev;
class Mobilya {
    //değişkenleri tanımladım.
    Konum konum;
    String renk;
    String tip;
    
    //boş ve dolu metotları oluşturdum.
    public Mobilya(){
        super();
    }  
    public Mobilya(Konum konum,String renk,String tip){
       // super();
        this.konum=konum;
        this.renk=renk;
        this.tip=tip;
    }
    
    //mobilyanın bilgilerini ekrana yazdırdım.
    public void yazdir(){
        System.out.println("Konumu: "+konum.x+","+konum.y);
        System.out.println("Rengi:"+renk);
        System.out.println("Tipi: "+tip);
    }
    //ekrana mobilyayı yazdırdım.
    public void goster(){
        System.out.println("Mobilya Gösteriliyor..");
    }
    
    //mobilyanın girilen konum bilgisine göre konumunu değiştiren kodu yazdım.
    public void yeriniDegistir(Konum konumYeni){
        this.konum=konumYeni;
    }
}
