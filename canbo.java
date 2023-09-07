/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoicsdl;

/**
 *
 * @author ADMIN
 */
public class canbo {
    String macb,hoten,gioitinh,diachi;
    int tuoi;

    public canbo() {
    }

    public canbo(String macb, String hoten, String gioitinh, String diachi, int tuoi) {
        this.macb = macb;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.tuoi = tuoi;
    }

    public String get_Diachi() {
        return this.diachi;
    }

    public void set_Diachi(String diachi) {
        this.diachi = diachi;
    }

    public void set_Gioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String get_Gioitinh() {
        return this.gioitinh;
    }

    public void set_Hoten(String hoten) {
        this.hoten = hoten;
    }

    public String get_Hoten() {
        return this.hoten;
    }

    public void setMacb(String macb) {
        this.macb = macb;
    }

    public String get_Macb() {
        return this.macb;
    }

    public void set_Tuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int get_Tuoi() {
        return this.tuoi;
    }
    
}
