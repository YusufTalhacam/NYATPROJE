public interface ISicaklikAlgilayici {
    public int SicaklikOku();
    public int SicaklikGonder();
    public void mesajGoster(String mes);
    public void  aboneEkle ( IObserver  abone );
}
