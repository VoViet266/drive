/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoicsdl;

/**
 *
 * @author ADMIN
 */
public class qlcb {
     // them can bo
    void themcb(String macb, String hovaten,String gioitinh, String diachi, int tuoi, int bac, String nganh, String congviec,String loai){
        if (loai== "congnhan"){
           congnhan cn = new  congnhan(bac, macb, hovaten, gioitinh, diachi, tuoi);
            cn.them_thongtin_congnhan();
           
        }
    }
    void suacb(String macb, String hovaten,String gioitinh, String diachi, int tuoi, int bac, String nganh, String congviec,String loai){
        if (loai== "congnhan"){
            congnhan cn = new congnhan(bac, macb, hovaten, gioitinh, diachi, tuoi);
            cn.sua_thongtin_congnhan();
           
        }
    }
    void xoacb(String macb){
            congnhan cn = new congnhan();
            cn.macb=macb;
            cn.xoa_thongtin_congnhan();
           
    }
}
