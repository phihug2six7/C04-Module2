package casestudy.model;

import java.time.LocalDate;

public abstract class Person {
    private String hovaten;
    private LocalDate ngaysinh;
    private String gioitinh;
    private String socmnd;
    private String sodienthoai;
    private String email;

    public Person() {
    }

    public Person(String hovaten, LocalDate ngaysinh, String gioitinh, String socmnd, String sodienthoai, String email) {
        this.hovaten = hovaten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.socmnd = socmnd;
        this.sodienthoai = sodienthoai;
        this.email = email;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSocmnd() {
        return socmnd;
    }

    public void setSocmnd(String socmnd) {
        this.socmnd = socmnd;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hovaten='" + hovaten + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", gioitinh='" + gioitinh + '\'' +
                ", socmnd='" + socmnd + '\'' +
                ", sodienthoai='" + sodienthoai + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
