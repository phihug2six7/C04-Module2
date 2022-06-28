package casestudy.model;

import java.time.LocalDate;

public class Booking {
    private String mabooking;
    private LocalDate ngaybatdau;
    private LocalDate ngayketthuc;
    private String makhachhang;
    private String tendichvu;
    private String loaidichvu;

    public Booking() {
    }

    public Booking(String mabooking, LocalDate ngaybatdau, LocalDate ngayketthuc, String makhachhang, String tendichvu, String loaidichvu) {
        this.mabooking = mabooking;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
        this.makhachhang = makhachhang;
        this.tendichvu = tendichvu;
        this.loaidichvu = loaidichvu;
    }

    public String getMabooking() {
        return mabooking;
    }

    public void setMabooking(String mabooking) {
        this.mabooking = mabooking;
    }

    public LocalDate getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(LocalDate ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public LocalDate getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(LocalDate ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public String getLoaidichvu() {
        return loaidichvu;
    }

    public void setLoaidichvu(String loaidichvu) {
        this.loaidichvu = loaidichvu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "mabooking='" + mabooking + '\'' +
                ", ngaybatdau=" + ngaybatdau +
                ", ngayketthuc=" + ngayketthuc +
                ", makhachhang='" + makhachhang + '\'' +
                ", tendichvu='" + tendichvu + '\'' +
                ", loaidichvu='" + loaidichvu + '\'' +
                '}';
    }
}
