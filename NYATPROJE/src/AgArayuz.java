import java.util.Scanner;
public class AgArayuz implements IAgArayuz {
    Scanner input = new Scanner(System.in);

    @Override
    public boolean kullaniciGiris() {
        int sayici = 0;
        while (sayici != 3) {
            SQL User = SQL.Nesne();
            String kullaniciAdi = "";
            String sifre = "";
            mesajGoster("KULLANICI ADINIZI VE ŞİFRENİZİ GİRİNİZ");
            mesajGoster("KULLANICI ADI:  ");
            kullaniciAdi = input.next();
            mesajGoster("ŞİFRE: ");
            sifre = input.next();
            boolean result = User.UserAuthentication(kullaniciAdi, sifre);
            if (result) {
                return true;
            }
            sayici++;
        }
        return false;
    }


    @Override
    public void mesajGoster(String mes) {
        System.out.println(mes);
    }

    @Override
    public int Secim() {
        int operation = 0;
        mesajGoster("**********************************************");
        mesajGoster("**************** ANA MENU ********************");
        mesajGoster("1-SICAKLIK GOSTER");
        mesajGoster("2-SOGUTUCU AÇ");
        mesajGoster("3-SOGUTUCU KAPAT ");
        mesajGoster("4-CIKIS");
        mesajGoster("**********************************************");
        mesajGoster("  SECIMINIZ: ");
        operation = input.nextInt();
        return operation;
    }



    @Override
    public void sicaklikGönder(ISicaklikAlgilayici sicaklikAlgilayici) {
        sicaklikAlgilayici.SicaklikGonder();
    }

    @Override
    public void SogutucuAc(){
        IDepency eylc=new Eyleyici();
        Depency dep=new Depency(eylc);
        dep.ac();
    }
    @Override
    public void SogutucuKapat(){
        IDepency eyleyici1=new Eyleyici();
        Depency dep=new Depency(eyleyici1);
        dep.kapat();
    }


    @Override
    public void Cikis() {
        mesajGoster("Cikis Yapildi... :)");
    }


}