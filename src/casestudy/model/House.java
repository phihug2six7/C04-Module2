package casestudy.model;

public class House extends Facility{
    private String tieuchuanphong;
    private String sotang;

    public House() {
    }

    public House(String tendichvu, String dientichsudung, int chiphithue, byte soluongnguoitoida, String kieuthue, String tieuchuanphong, String sotang) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public String getSotang() {
        return sotang;
    }

    public void setSotang(String sotang) {
        this.sotang = sotang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuchuanphong='" + tieuchuanphong + '\'' +
                ", sotang='" + sotang + '\'' +
                '}';
    }
}
