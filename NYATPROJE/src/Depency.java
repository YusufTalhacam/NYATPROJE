public class Depency {
    private IDepency depency;

    public Depency(IDepency dip) {
        this.depency = dip;
    }
    public void ac(){
        depency.SogutucuAc();
    }
    public void kapat(){
        depency.SogutucuKapat();
    }
}
