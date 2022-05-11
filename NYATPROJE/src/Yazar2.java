public class Yazar2 implements Yazarlar{
    @Override
    public void isim() {
        System.out.println("Yazar Adı:Yusuf Cihan Gedik");
    }

    @Override
    public void baslangicYil(int yil) {
        System.out.println( "Sistem "+yil+ "senesinde yapılmıştır");
    }

}
