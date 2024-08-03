package com.supermart.Structure;

import java.sql.*;
import java.time.LocalTime;

public class VerifyUser {

    public static boolean verifyUser(String un, String ps) {
        try {
            ResultSet rs = Salesperson.supermart_Connection().createStatement()
                    .executeQuery("select * from salesperson where name = '" + un + "';");
            if (rs.next()) {
                if (ps.equals(rs.getString(3)) || ps.equals(rs.getString(4)))
                    return true;
                else {
                    System.out.println("Wrong password");
                    return false;
                }
            } else {
                System.out.println("No user found with name " + un);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean login() {
        System.out.print("Enter Username : ");
        String username = SectionMethods.sc.next();
        System.out.print("Enter Password : ");
        String pass = SectionMethods.sc.next();
        if (verifyUser(username, pass)) {
            System.out.println(getSalutaion() + username);
            return true;
        } else
            return false;
    }

    static String getSalutaion() {
        int hour = LocalTime.now().getHour();
        if (hour > 0 && hour <= 12)
            return "Good Moring ";
        else if (hour > 12 && hour <= 18)
            return "Good Afternoon ";
        else
            return "Good Evening ";
    }

}
