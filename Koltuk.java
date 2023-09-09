
package odev;
class Koltuk extends Mobilya{
    
    int kaçKisilik;
    
    //boş ve dolu metotları oluşturdum.
    public Koltuk(){
        super();
    }
    public Koltuk(Konum konum,String renk,String tip, int kacKisilik){
        super(konum,renk,tip);
        this.kaçKisilik=kacKisilik;
        this.konum=konum;
        this.renk=renk;
        this.tip=tip;
    }


    
    //aynı metotları birden çok kez kullandığımız için override ettik.
    @Override
    public void yazdir(){
        super.yazdir();
        System.out.println("Koltukta Oturabilecek Kişi Sayısı: "+kaçKisilik);
    }
    @Override
    public void goster(){
        System.out.println("Koltuk Gösteriliyor..");
    }
}
