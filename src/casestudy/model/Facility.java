package casestudy.model;

public abstract class Facility {
    private String tendichvu;
    private String dientichsudung;
    private int chiphithue;
    private byte soluongnguoitoida;
    private String kieuthue;  //theo ngày,tháng,năm.

    public Facility() {
    }

    public Facility(String tendichvu, String dientichsudung, int chiphithue, byte soluongnguoitoida, String kieuthue) {
        this.tendichvu = tendichvu;
        this.dientichsudung = dientichsudung;
        this.chiphithue = chiphithue;
        this.soluongnguoitoida = soluongnguoitoida;
        this.kieuthue = kieuthue;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public String getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(String dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public int getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(int chiphithue) {
        this.chiphithue = chiphithue;
    }

    public byte getSoluongnguoitoida() {
        return soluongnguoitoida;
    }

    public void setSoluongnguoitoida(byte soluongnguoitoida) {
        this.soluongnguoitoida = soluongnguoitoida;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tendichvu='" + tendichvu + '\'' +
                ", dientichsudung='" + dientichsudung + '\'' +
                ", chiphithue=" + chiphithue +
                ", soluongnguoitoida=" + soluongnguoitoida +
                ", kieuthue='" + kieuthue + '\'' +
                '}';
    }
}
