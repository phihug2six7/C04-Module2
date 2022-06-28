package casestudy.model;

import java.time.LocalDate;

public class Employee extends Person{
    private String manhanvien;
    private String trinhdo;
    private String vitri;
    private int luong;

    public Employee() {
    }

    public Employee(String manhanvien, String trinhdo, String vitri, int luong) {
        this.manhanvien = manhanvien;
        this.trinhdo = trinhdo;
        this.vitri = vitri;
        this.luong = luong;
    }

    public Employee(String hovaten, LocalDate ngaysinh, String gioitinh, String socmnd, String sodienthoai, String email, String manhanvien, String trinhdo, String vitri, int luong) {
        super(hovaten, ngaysinh, gioitinh, socmnd, sodienthoai, email);
        this.manhanvien = manhanvien;
        this.trinhdo = trinhdo;
        this.vitri = vitri;
        this.luong = luong;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "manhanvien='" + manhanvien + '\'' +
                ", trinhdo='" + trinhdo + '\'' +
                ", vitri='" + vitri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
