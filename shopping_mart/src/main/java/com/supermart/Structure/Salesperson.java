package com.supermart.Structure;

import java.sql.*;
import java.util.Scanner;

/*  
in salesperson class there will be multiple salesperson with there 
respective name and they will have a common password provided by Manager.
 */

public class Salesperson {

    public static Connection supermart_Connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermart", "root",
                "root");
        return conn;
    }

    public static int getNewID() throws SQLException, ClassNotFoundException {
        ResultSet rs = supermart_Connection().createStatement().executeQuery("select id from salesperson;");
        int newID = 1;
        while (rs.next()) {
            newID++;
        }
        return newID;
    }

    public static void addSalesperson() throws ClassNotFoundException, SQLException {
        PreparedStatement ps = supermart_Connection().prepareStatement("insert into salesperson values (?,?,?,?);");
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Add new salesperson");
            ps.setInt(1, getNewID());

            System.out.print("Enter Name : ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter Password : ");
            ps.setString(3, sc.nextLine());
            ps.setString(4, "SuperMart@1234");
        }
        ps.execute();
        System.out.println("Salesman Added");
    }

    public static void removeSalesperson() throws ClassNotFoundException, SQLException {
        System.out.println("Enter id to delete");
        supermart_Connection().prepareStatement("delete from salesperson where id = ?").setInt(1,
                SectionMethods.sc.nextInt());
        System.out.println("Salesman Removed");
    }

}
