/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import JDBC.DBConnect;
import Model.HoaDonChiTiet;
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
public class HoaDonChiTietDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    public List<HoaDonChiTiet> selectAll() {
        List<HoaDonChiTiet> listHDCT = new ArrayList<>();
        sql = "select * from hoaDonChiTiet order by hoaDon_id";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getBigDecimal(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
                listHDCT.add(hdct);
            }
            return listHDCT;
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return null;
    }
}
