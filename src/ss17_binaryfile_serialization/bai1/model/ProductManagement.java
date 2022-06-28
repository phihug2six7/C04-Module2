package ss17_binaryfile_serialization.bai1.model;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private String maSP;
    private String tenSP;
    private String hangSX;
    private String gia;

    public ProductManagement() {
    }

    public ProductManagement(String maSP, String tenSP, String hangSX, String gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.gia = gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", gia='" + gia + '\'' +
                '}';
    }
}
