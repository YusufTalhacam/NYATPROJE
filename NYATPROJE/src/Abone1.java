public class Abone1 implements IObserver{
    @Override
    public void güncelle(String mesaj) {
        System.out.println("Abone1 e gelen mesaj->" + mesaj);
    }
}
