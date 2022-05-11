public class AkilliCihaz {
    public static void main(String[] args) {

        try {
            Yazar1 yazar = (Yazar1) YazarFactory.createYazar(Yazar1.class);
            yazar.baslangicYil(2022);
            yazar.isim();

            Yazar2 yazar2 = (Yazar2) YazarFactory.createYazar(Yazar2.class);
            yazar2.isim();

        } catch (Exception e) {
            e.printStackTrace();
        }
        Builder authorversion = new Builder.ClassAuthorVersion().version(" 1.1.1.1").date(" 21.05.2022").build();
        System.out.println(authorversion);
        IAnaIslem basla=new AnaIslem();
        basla.Operation();
    }
}
