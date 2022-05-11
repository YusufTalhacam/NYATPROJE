import java.util.ArrayList;
import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {

    @Override
    public int SicaklikOku() {
        Random rand = new Random();
        int sayi=0;
        while (sayi<20){
         sayi = rand.nextInt(100);
        }
        return sayi;
    }
    private static SicaklikAlgilayici instance;
    private ISubject publisher;
    public SicaklikAlgilayici(ISubject publisher){
        this.publisher=publisher;
    }
    public static SicaklikAlgilayici getInstance(ISubject publisher){
        if(instance==null){
            instance=new SicaklikAlgilayici(publisher);
        }
        return instance;
    }
    @Override
    public void aboneEkle(IObserver abone){
        publisher.attach(abone);
    }


    int sicaklik;
    @Override
    public int SicaklikGonder() {
        sicaklik=SicaklikOku();
        mesajGoster("Sicaklik    : "+ sicaklik+"°C");
        if(sicaklik>=60){
            Araclar.bekle(1000);
            publisher.notify("Sıcaklık 60 derecenin üzerine çıktı, soğutucuyu açınız.");
        }
        else if(sicaklik>=23 && sicaklik<60){
            Araclar.bekle(1000);
            publisher.notify("Soğutucuyu açabilirsiniz.");
        }
        else if(sicaklik<23){
            Araclar.bekle(1000);
            publisher.notify("Sıcaklık 23 derecenin altına indi, soğutucuyu kapatınız.");
        }
        return SicaklikOku();
    }
    @Override
    public void mesajGoster(String mes) {
        System.out.println(mes);
    }

}
