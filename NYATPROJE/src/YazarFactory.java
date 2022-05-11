public class YazarFactory {
    public static Yazarlar createYazar (Class aClass) throws IllegalAccessException, InstantiationException {
        return (Yazarlar) aClass.newInstance();
    }


}
