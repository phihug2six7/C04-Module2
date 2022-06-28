package casestudy.model;

public class Constracts {
    private String soHopDong;
    private String maBooking;
    private int soTienCocTruoc;
    private int tongSoTienThanhToan;
    private String maKhachHang;

    public Constracts() {
    }

    public Constracts(String soHopDong, String maBooking, int soTienCocTruoc, int tongSoTienThanhToan, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongSoTienThanhToan = tongSoTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(int soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public int getTongSoTienThanhToan() {
        return tongSoTienThanhToan;
    }

    public void setTongSoTienThanhToan(int tongSoTienThanhToan) {
        this.tongSoTienThanhToan = tongSoTienThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Constracts{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", soTienCocTruoc=" + soTienCocTruoc +
                ", tongSoTienThanhToan=" + tongSoTienThanhToan +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
