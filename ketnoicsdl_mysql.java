/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ketnoicsdl;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class ketnoicsdl_mysql {
    Connection cnn;
    ketnoicsdl_mysql(){
    try{  
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        // ten database=qlcb, user:root, pass ""
        Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/qlcb","root","");  
        this.cnn=con;
    }
    catch(Exception e){ 
        System.out.println(e);
    }  
    }
    // dong ket noi
    void dongketnoi(){
        try {
            this.cnn.close();
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }
}
