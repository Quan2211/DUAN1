/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import JDBC.DBConnect;
import Model.HoaDon;
import Model.HoaDonReal;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tranl
 */
public class HoaDonDao {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public List<HoaDonReal> selectAll() {
        List<HoaDonReal> listHD = new ArrayList<>();
        sql = "    SELECT MaHD, MaNV, SDT, NgayTao, TongTien, MaKH, MaVoucher, MaBan, DiaChi FROM HoaDon;";

        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonReal hd = new HoaDonReal(
                        rs.getString("MaHD"),
                        rs.getString("MaNV"),
                        rs.getInt("SDT"),
                        rs.getString("NgayTao"),
                        rs.getBigDecimal("TongTien"),
                        rs.getString("MaKH"),
                        rs.getString("MaVoucher"),
                        rs.getString("MaBan"),
                        rs.getString("DiaChi"));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return null;
    }

    public List<HoaDonReal> selectAll2() {
        List<HoaDonReal> listHD = new ArrayList<>();
        sql = "SELECT \n"
                + "    HoaDon.MaHD, \n"
                + "    NhanVien.MaNV, \n"
                + "    NhanVien.TenNV, \n"
                + "	KhachHang.MaKH, \n"
                + "    KhachHang.TenKH, \n"
                + "    HoaDon.SDT, \n"
                + "    HoaDon.NgayTao, \n"
                + "    HoaDon.TongTien, \n"
                + "    HoaDon.MaVoucher, \n"
                + "    HoaDon.MaBan, \n"
                + "    HoaDon.DiaChi\n"
                + "FROM \n"
                + "    HoaDon\n"
                + "JOIN \n"
                + "    NhanVien ON HoaDon.MaNV = NhanVien.MaNV\n"
                + "JOIN \n"
                + "    KhachHang ON HoaDon.MaKH = KhachHang.MaKH";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonReal hd = new HoaDonReal(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getBigDecimal(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));
                listHD.add(hd);
            }
            return listHD;
        } catch (Exception e) {
            e.fillInStackTrace();
            return null;
        }
    }

    public List<HoaDonReal> phanTrangHoaDon(int tienLui) {
        ArrayList<HoaDonReal> lst = new ArrayList<>();
        try {
            sql = """
            SELECT 
                HoaDon.MaHD, 
                NhanVien.MaNV, 
                NhanVien.TenNV, 
                KhachHang.MaKH, 
                KhachHang.TenKH, 
                HoaDon.SDT, 
                HoaDon.NgayTao, 
                HoaDon.TongTien, 
                HoaDon.MaVoucher, 
                HoaDon.MaBan,
                HoaDon.DiaChi
            FROM 
                HoaDon
            JOIN 
                NhanVien ON HoaDon.MaNV = NhanVien.MaNV
            JOIN 
                KhachHang ON HoaDon.MaKH = KhachHang.MaKH
            ORDER BY
                HoaDon.NgayTao DESC
            OFFSET ? ROWS
            FETCH NEXT 5 ROWS ONLY
            """;
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, tienLui);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonReal hd = new HoaDonReal(
                        rs.getString("MaHD"),
                        rs.getString("MaNV"),
                        rs.getString("TenNV"),
                        rs.getInt("SDT"),
                        rs.getString("NgayTao"),
                        rs.getBigDecimal("TongTien"),
                        rs.getString("MaKH"),
                        rs.getString("TenKH"),
                        rs.getString("MaVoucher"),
                        rs.getString("MaBan"),
                        rs.getString("DiaChi"));
                lst.add(hd);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }
}
