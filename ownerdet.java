/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinandana
 */
import java.sql.*;
public class ownerdet {
    Connection con;
    public Connection connect()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prj","root","abhi");
           return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
