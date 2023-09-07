/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoicsdl;

/**
 *
 * @author ADMIN
 */
public class nhanvien extends canbo{
    String congviec;

    public nhanvien() {
    }

    public nhanvien(String congviec, String macb, String hoten, String gioitinh, String diachi, int tuoi) {
        super(macb, hoten, gioitinh, diachi, tuoi);
        this.congviec = congviec;
    }

    public void set_Congviec(String congviec) {
        this.congviec = congviec;
    }

    public String get_Congviec() {
        return this.congviec;
    }
    
}
