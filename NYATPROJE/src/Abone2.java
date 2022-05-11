public class Abone2 implements IObserver {
    @Override
    public void güncelle(String mesaj) {
        System.out.println("Abone2 ye gelen mesaj->" + mesaj);
    }
}
