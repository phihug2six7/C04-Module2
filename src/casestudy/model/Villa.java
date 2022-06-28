package casestudy.model;

public class Villa extends Facility{
    private String tieuchuanphong;
    private String dientichhoboi;
    private String sotang;

    public Villa() {
    }

    public Villa(String tieuchuanphong, String dientichhoboi, String sotang) {
        this.tieuchuanphong = tieuchuanphong;
        this.dientichhoboi = dientichhoboi;
        this.sotang = sotang;
    }

    public Villa(String tendichvu, String dientichsudung, int chiphithue, byte soluongnguoitoida, String kieuthue, String tieuchuanphong, String dientichhoboi, String sotang) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.dientichhoboi = dientichhoboi;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public String getDientichhoboi() {
        return dientichhoboi;
    }

    public void setDientichhoboi(String dientichhoboi) {
        this.dientichhoboi = dientichhoboi;
    }

    public String getSotang() {
        return sotang;
    }

    public void setSotang(String sotang) {
        this.sotang = sotang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuchuanphong='" + tieuchuanphong + '\'' +
                ", dientichhoboi='" + dientichhoboi + '\'' +
                ", sotang='" + sotang + '\'' +
                '}';
    }
}
