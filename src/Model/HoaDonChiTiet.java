/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author tranl
 */
public class HoaDonChiTiet {

    private String maHD;
    private String maCT;
    private int soLuongMua;
    private BigDecimal giaTien;
    private String trangThai;
    private String ghiChu;
    private String maBan;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHD, String maCT, int soLuongMua, BigDecimal giaTien, String trangThai, String ghiChu, String maBan) {
        this.maHD = maHD;
        this.maCT = maCT;
        this.soLuongMua = soLuongMua;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.maBan = maBan;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaCT() {
        return maCT;
    }

    public void setMaCT(String maCT) {
        this.maCT = maCT;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public BigDecimal getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(BigDecimal giaTien) {
        this.giaTien = giaTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    
}
