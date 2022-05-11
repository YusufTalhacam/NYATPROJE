public class Yazar1 implements Yazarlar{
    @Override
    public void isim() {
        System.out.println("Yazar Adı: Yusuf Talha Çam");
    }

    @Override
    public void baslangicYil(int year) {
        System.out.println( "Sistem "+year+ "senesinde yapılmıştır");
    }
}
