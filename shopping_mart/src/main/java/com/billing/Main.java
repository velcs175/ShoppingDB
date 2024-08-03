package com.billing;

import java.io.IOException;
import java.sql.SQLException;

import com.supermart.Structure.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        System.out.println("1. Login\n2. Add Salesman\n3. Delete Salesman");
        switch (SectionMethods.sc.nextInt()) {
            case 1: {
                if (VerifyUser.login()) {
                    Sections.section();
                }
                break;
            }
            case 2: {
                try {
                    Salesperson.addSalesperson();
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    Salesperson.removeSalesperson();
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }
            default:
                break;
        }
    }
}