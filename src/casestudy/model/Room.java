package casestudy.model;

public class Room extends Facility{
    private String dichvumienphi;

    public Room() {
    }

    public Room(String dichvumienphi) {
        this.dichvumienphi = dichvumienphi;
    }

    public Room(String tendichvu, String dientichsudung, int chiphithue, byte soluongnguoitoida, String kieuthue, String dichvumienphi) {
        super(tendichvu, dientichsudung, chiphithue, soluongnguoitoida, kieuthue);
        this.dichvumienphi = dichvumienphi;
    }

    public String getDichvumienphi() {
        return dichvumienphi;
    }

    public void setDichvumienphi(String dichvumienphi) {
        this.dichvumienphi = dichvumienphi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichvumienphi='" + dichvumienphi + '\'' +
                '}';
    }
}
