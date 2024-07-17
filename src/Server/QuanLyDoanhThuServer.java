/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import JDBC.DBConnect;
import Model.HoaDon;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Hoàng Quân
 */
public class QuanLyDoanhThuServer {
    public static List<HoaDon> getDoanhThu(){
        List<HoaDon> HoaDonList = new ArrayList<>();
        try {
            Connection con = DBConnect.getConnection();
            String sql = "select  MaHD ,NgayTao, MaHD, TongTien from HoaDon";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {  
                Date Ngay = rs.getDate(2);
                String ma = rs.getString(3);
                float Tong = rs.getFloat(4);
                HoaDon hoaDon = new HoaDon(ma, ma, 0, Ngay, Tong, ma, ma, 0, ma);
                HoaDonList.add(hoaDon);
                
            }
            return HoaDonList;
            
        } catch (Exception e) {
        }
        return null;
    }
    
    
}
