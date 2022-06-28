package casestudy.model;

import java.time.LocalDate;

public class Customer extends Person{
    private String makhachhang;
    private String loaikhach;
    private String diachi;

    public Customer() {
    }

    public Customer(String makhachhang, String loaikhach, String diachi) {
        this.makhachhang = makhachhang;
        this.loaikhach = loaikhach;
        this.diachi = diachi;
    }

    public Customer(String hovaten, LocalDate ngaysinh, String gioitinh, String socmnd, String sodienthoai, String email, String makhachhang, String loaikhach, String diachi) {
        super(hovaten, ngaysinh, gioitinh, socmnd, sodienthoai, email);
        this.makhachhang = makhachhang;
        this.loaikhach = loaikhach;
        this.diachi = diachi;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getLoaikhach() {
        return loaikhach;
    }

    public void setLoaikhach(String loaikhach) {
        this.loaikhach = loaikhach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "makhachhang='" + makhachhang + '\'' +
                ", loaikhach='" + loaikhach + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
