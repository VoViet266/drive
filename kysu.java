/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoicsdl;

/**
 *
 * @author ADMIN
 */
public class kysu extends canbo{
    String nganh;

    public kysu() {
    }

    public kysu(String nganh, String macb, String hoten, String gioitinh, String diachi, int tuoi) {
        super(macb, hoten, gioitinh, diachi, tuoi);
        this.nganh = nganh;
    }

    public void set_Nganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNganh() {
        return this.nganh;
    }
    
    
}
