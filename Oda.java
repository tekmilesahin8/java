
package odev;

import java.util.ArrayList;
import java.util.List;

class Oda{
    
    double alan;
    String tip;
    List<Mobilya>mobilyalar;
    
    //odanın boş ve dolu kurucularını yaptım.
    public Oda(){
        super();
    }
    
    public Oda(String tip,double alan){
        this.alan=alan;
        this.tip=tip;
        this.mobilyalar=new ArrayList<>();
    }
    
    //odaya eklenen mobilyaları mobilyalar listesine ekledim.
    public void mobilyaEkle(Mobilya mobilya){
        mobilyalar.add(mobilya);
    }
    
    //oda bilgilerini ekrana yazdırdım.
    public void listele(){ 
        System.out.println("..ODA BİLGİLERİ..");
        System.out.println("Odanın tipi:"+tip);
        System.out.println("Odanın alanı"+ alan);
        
        //mobilya bilgileri liste şeklinde olduğu için döngü ile yazdırdım.
        System.out.println("..MOBİLYANIN BİLGİLERİ..");
        for(Mobilya mobilya:mobilyalar){
            mobilya.yazdir();
        }
    }
    
    //mobilyaları göster fonksiyonu ile çağırdım.
    public void tumunuGoster(){ 
        for(Mobilya mobilya:mobilyalar){
            mobilya.goster();
        }
    }
}
