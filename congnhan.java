/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoicsdl;

/**
 *
 * @author ADMIN
 */
import java.sql.*;
public class congnhan extends canbo{
    int  bac;

    public congnhan(){}
    public congnhan(int bac, String macb, String hoten, String gioitinh, String diachi, int tuoi) {
        super(macb, hoten, gioitinh, diachi, tuoi);
        this.bac = bac;
    }

    public void set_Bac(int bac) {
        this.bac = bac;
    }

    public int get_Bac() {
        return this.bac;
    }
    void them_thongtin_congnhan(){
        ketnoicsdl_mysql kn = new ketnoicsdl_mysql();
        Connection con=kn.cnn;
        
         try{
            // executeUpdate trả về số dòng bị ảnh hưởng
            // execute trả về true nếu nhận được một đối tượng ResultSet (select dư liệu=>return true)
            // executeQuery trả một đối tượng Resultset
            Statement stmt=con.createStatement();  
            String sql="INSERT INTO `canbo`(`macb`, `hoten`, `gioitinh`, `tuoi`, `diachi`, `bac`) VALUES ('"+get_Macb()+"','"+get_Hoten()+"','"+get_Gioitinh()+"','"+ Integer.toString(get_Tuoi())+"','"+ get_Diachi()+ "','"+get_Bac()+"')";            
            //String sql="INSERT INTO `nguoidung`(`mand`, `tennd`, `dc`, `gioitinh`) VALUES ('"+get_macb()+"','"+get_hoten()+"','"+get_diachi()+"','"+get_giotinh()+"')";
            //System.out.println(sql);
            int kq=stmt.executeUpdate(sql);  
            System.out.println(kq);
            // hiển thị từng dòng trong kết quả câu truy vấn trả về
            if(kq>0){
                System.out.println("Thêm công nhân thành công");
            }  
            else{
                System.out.println("Có lỗi xảy ra vui lòng kiểm tra lại");
            }
            kn.dongketnoi();
        }
         catch(Exception e){ 
            System.out.println(e);
        } 
    }
    // chinh sua thong tin
    void sua_thongtin_congnhan(){
        ketnoicsdl_mysql kn = new ketnoicsdl_mysql();
        Connection con=kn.cnn;
         try{
            Statement stmt=con.createStatement();  
            String sql="UPDATE `canbo` SET `hoten`='"+get_Hoten()+"',`gioitinh`='"+get_Gioitinh()+"',`tuoi`='"+get_Tuoi()+"',`diachi`='"+get_Diachi()+"',`bac`='"+get_Bac()+"' WHERE macb='"+get_Macb()+"'";
            //System.out.println(sql);
            int kq=stmt.executeUpdate(sql);  
            System.out.println(kq);
            // hiển thị từng dòng trong kết quả câu truy vấn trả về
            if(kq>0){
                System.out.println("Cập nhật công nhân thành công");
            }  
            else{
                System.out.println("Có lỗi xảy ra vui lòng kiểm tra lại");
            }
            kn.dongketnoi();
        }
         catch(Exception e){ 
            System.out.println(e);
        } 
    }
    
    void xoa_thongtin_congnhan(){
        ketnoicsdl_mysql kn = new ketnoicsdl_mysql();
        Connection con=kn.cnn;
         try{
            Statement stmt=con.createStatement();  
            String sql="DELETE FROM `canbo` WHERE macb='"+get_Macb()+"'";
            //System.out.println(sql);
            int kq=stmt.executeUpdate(sql);  
            System.out.println(kq);
            // hiển thị từng dòng trong kết quả câu truy vấn trả về
            if(kq>0){
                System.out.println("xoa công nhân thành công");
            }  
            else{
                System.out.println("Có lỗi xảy ra vui lòng kiểm tra lại");
            }
            kn.dongketnoi();
        }
         catch(Exception e){ 
            System.out.println(e);
        } 
    }
    
    
}
