import java.util.Scanner;

public class AnaIslem implements IAnaIslem {


    private final IAgArayuz agArayuz;
    private final ISicaklikAlgilayici algilayici;
    private final IDepency eyleyici;

    private static final int SICAKLIK = 1;
    private static final int FAN_AC = 2;
    private static final int FAN_KAPAT = 3;
    private static final int CIKIS = 4;

    public AnaIslem(){
        agArayuz=new AgArayuz();
        eyleyici=new Eyleyici();
        algilayici=SicaklikAlgilayici.getInstance(new Publisher());
        algilayici.aboneEkle(new Abone1());
       algilayici.aboneEkle(new Abone2());

    }


    @Override
    public int SistemOperation() {
        return agArayuz.Secim();
    }

    @Override
    public boolean Giris() {return  agArayuz.kullaniciGiris();}
    public void giris2(){
        int secim = 0;
        while (secim != 4) {
            secim = SistemOperation();
            switch (secim) {
                case SICAKLIK:
                    SicaklikOku();
                    Araclar.bekle(1200);
                    break;
                case FAN_AC:
                    SogutucuAc();
                    Araclar.bekle(1200);
                    break;
                case FAN_KAPAT:
                    SogutucuKapat();
                    Araclar.bekle(1200);
                    break;
                case CIKIS:
                    Cikis();
                    Araclar.bekle(1200);
                    break;
                default:
                    mesajGoster("HATALI SEÇİM YAPTINIZ LÜTFEN TEKRAR DENEYİNİZ");
                    break;
            }
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nDevam Etmek İstiyormusunuz? e(E)/h(H)");
            char userChoice = userInput.next().charAt(0);
            if (userChoice == 'e' || userChoice == 'E') {
                Araclar.bekle(800);
                giris2();
            } else if (userChoice == 'h' || userChoice == 'H') {
                System.out.println("Sistemden Çıkış yapılıyor!");
                Araclar.bekle(800);
                Runtime.getRuntime().exit(0);
            } else {
                System.out.println("Yanlıs bir değer seçtiniz tekrar deneyiniz!");
            }
        }
    }



    @Override
    public void Operation() {
        if (Giris()){
           giris2();
        }
        else {
            mesajGoster("             Erişim Iptal Edildi       ||      Access Cancelled");
        }

    }

    @Override
    public void mesajGoster(String mes) {
        System.out.println(mes);
    }

    @Override
    public void SicaklikOku() {
        agArayuz.sicaklikGönder(algilayici);
    }

    @Override
    public void SogutucuAc() {
        agArayuz.SogutucuAc();

    }
    @Override
    public void SogutucuKapat() {
        agArayuz.SogutucuKapat();
    }

    @Override
    public void Cikis() {
        agArayuz.Cikis();
    }

}

