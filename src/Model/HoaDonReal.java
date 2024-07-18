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
public class HoaDonReal {

    private String MaHD;
    private String MaNV;
    private String TenNV;
    private int SDT;
    private String NgayTao;
    private BigDecimal TongTien;
    private String MaKH;
    private String TenKH;
    private String MaVoucher;
    private String MaBan;
    private String diaChi;

    public HoaDonReal() {
    }

    public HoaDonReal(String MaHD, String MaNV, int SDT, String NgayTao, BigDecimal TongTien, String MaKH, String MaVoucher, String MaBan, String diaChi) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.SDT = SDT;
        this.NgayTao = NgayTao;
        this.TongTien = TongTien;
        this.MaKH = MaKH;
        this.MaVoucher = MaVoucher;
        this.MaBan = MaBan;
        this.diaChi = diaChi;
    }

    public HoaDonReal(String MaHD, String MaNV, String TenNV, int SDT, String NgayTao, BigDecimal TongTien, String MaKH, String TenKH, String MaVoucher, String MaBan, String diaChi) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDT = SDT;
        this.NgayTao = NgayTao;
        this.TongTien = TongTien;
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.MaVoucher = MaVoucher;
        this.MaBan = MaBan;
        this.diaChi = diaChi;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaVoucher() {
        return MaVoucher;
    }

    public void setMaVoucher(String MaVoucher) {
        this.MaVoucher = MaVoucher;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Object[] toDaTaRow() {
        return new Object[]{
            this.MaHD,
            this.MaNV,
            this.TenNV,
            this.SDT,
            this.NgayTao,
            this.TongTien == null ? "0.00" : this.TongTien,
            this.MaKH,
            this.TenKH,
            this.MaVoucher,
            this.MaBan,
            this.diaChi
        };
    }
}
