
package odev;
class Masa extends Mobilya{
    
    int uzunluk,genislik;
    
    //boş ve dolu istenilen kurucu metotları oluşturdum.
    public Masa(){
       // super();
       
    }
    public Masa(Konum konum,String renk,String tip,int uzunluk,int genislik){
        super(konum,renk,tip);
        this.uzunluk=uzunluk;
        this.genislik=genislik;
        this.tip=tip;
        this.konum=konum;
        this.renk=renk;
       
        
    }
    
    //yazdir metodu ile masanın genişlik ve uzunluk bilgilerini yazdırdım.
    @Override
    
    public void yazdir(){
        super.yazdir();
        System.out.println("Masanın Uzunluğu: "+uzunluk+ "metre");
        System.out.println("Masanın Genişliği: "+genislik+ "metre");
    }
    
    //göster metodu ile ekrana masa gösyeriliyor yazdırıyoruz.
    @Override
    public void goster(){
        System.out.println("Masa Gösteriliyor...");
    }
    
}
