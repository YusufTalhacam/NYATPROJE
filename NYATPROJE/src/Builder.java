public class Builder {
    private String yazar, yil,version;

    private Builder(ClassAuthorVersion authorVersion) {
        this.yazar = authorVersion.yazar;
        this.yil = authorVersion.yil;
        this.version = authorVersion.version;
    }
    public String getYazar() {
        return yazar;
    }
    public String getYil() {
        return yil;
    }
    public String getVersion() {
        return version;
    }
    @Override
    public String toString() {
        return "-------------------------"+
                "\nTarih =" + yil +"\n"+
                "Version =" + version +"\n"+
                "-------------------------";
    }
    public static class ClassAuthorVersion
    {
        private String yazar, yil,version;
        public ClassAuthorVersion author (String yazar) {
            this.yazar = yazar;
            return this;
        }
        public ClassAuthorVersion date (String yil) {
            this.yil = yil;
            return this;
        }
        public ClassAuthorVersion version (String version) {
            this.version = version;
            return this;
        }
        public Builder build() {
            return new Builder(this);
        }
    }
}
