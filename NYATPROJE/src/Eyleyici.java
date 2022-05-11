public class Eyleyici implements IDepency {

    @Override
    public void SogutucuAc() {
        mesajGoster("Soğutucu Açılıyor!");
        Araclar.bekle(1000);
        mesajGoster("Lütfen Bekleyiniz!");
        Araclar.bekle(1000);
        mesajGoster("SOĞUTUCU : AÇIK");
    }

    @Override
    public void SogutucuKapat() {
       mesajGoster("Soğutucu Kapatılıyor!");
        Araclar.bekle(1000);
        mesajGoster("Lütfen Bekleyiniz!");
        Araclar.bekle(1000);
        mesajGoster("SOĞUTUCU : KAPALI");

    }

    @Override
    public void mesajGoster(String mes) {
        System.out.println(mes);
    }

}

