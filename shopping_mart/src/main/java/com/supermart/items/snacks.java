package com.supermart.items;

import java.sql.*;
import java.util.ArrayList;

import com.supermart.Structure.*;

public class snacks {
    public class Chips {
        public int id = 8;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Chips() throws SQLException, ClassNotFoundException {
            ResultSet rs = Salesperson.supermart_Connection().createStatement()
                    .executeQuery("select * from items where id = " + id + ";");
            rs.next();
            Quantity = rs.getInt("Quantity");
            Name = rs.getString("Name");
            Price = rs.getDouble("Price");
        }

        public void buy(int quantity) throws ClassNotFoundException, SQLException {
            if (quantity <= Quantity && quantity >= 1) {
                ArrayList<Object> a = new ArrayList<>();
                a.add(id);
                a.add(Name);
                a.add(Price);
                a.add(quantity);
                a.add(updateQuantity(quantity));
                SectionMethods.cart.add(a);
            } else {
                System.out.println("Invalid Quantity");
            }
        }

        public double updateQuantity(int purchasedQuantity) throws ClassNotFoundException, SQLException {
            PreparedStatement ps = Salesperson.supermart_Connection()
                    .prepareStatement("update items set quantity = ? where id = ?;");
            ps.setInt(1, Quantity - purchasedQuantity);
            ps.setInt(2, id);
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Chocolate {
        public int id = 9;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Chocolate() throws SQLException, ClassNotFoundException {
            ResultSet rs = Salesperson.supermart_Connection().createStatement()
                    .executeQuery("select * from items where id = " + id + ";");
            rs.next();
            Quantity = rs.getInt("Quantity");
            Name = rs.getString("Name");
            Price = rs.getDouble("Price");
        }

        public void buy(int quantity) throws ClassNotFoundException, SQLException {
            if (quantity <= Quantity && quantity >= 1) {
                ArrayList<Object> a = new ArrayList<>();
                a.add(id);
                a.add(Name);
                a.add(Price);
                a.add(quantity);
                a.add(updateQuantity(quantity));
                SectionMethods.cart.add(a);
            } else {
                System.out.println("Invalid Quantity");
            }
        }

        public double updateQuantity(int purchasedQuantity) throws ClassNotFoundException, SQLException {
            PreparedStatement ps = Salesperson.supermart_Connection()
                    .prepareStatement("update items set quantity = ? where id = ?;");
            ps.setInt(1, Quantity - purchasedQuantity);
            ps.setInt(2, id);
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Burger {
        public int id = 4;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Burger() throws SQLException, ClassNotFoundException {
            ResultSet rs = Salesperson.supermart_Connection().createStatement()
                    .executeQuery("select * from items where id = " + id + ";");
            rs.next();
            Quantity = rs.getInt("Quantity");
            Name = rs.getString("Name");
            Price = rs.getDouble("Price");
        }

        public void buy(int quantity) throws ClassNotFoundException, SQLException {
            if (quantity <= Quantity && quantity >= 1) {
                ArrayList<Object> a = new ArrayList<>();
                a.add(id);
                a.add(Name);
                a.add(Price);
                a.add(quantity);
                a.add(updateQuantity(quantity));
                SectionMethods.cart.add(a);
            } else {
                System.out.println("Invalid Quantity");
            }
        }

        public double updateQuantity(int purchasedQuantity) throws ClassNotFoundException, SQLException {
            PreparedStatement ps = Salesperson.supermart_Connection()
                    .prepareStatement("update items set quantity = ? where id = ?;");
            ps.setInt(1, Quantity - purchasedQuantity);
            ps.setInt(2, id);
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Pizza {
        public int id = 25;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Pizza() throws SQLException, ClassNotFoundException {
            ResultSet rs = Salesperson.supermart_Connection().createStatement()
                    .executeQuery("select * from items where id = " + id + ";");
            rs.next();
            Quantity = rs.getInt("Quantity");
            Name = rs.getString("Name");
            Price = rs.getDouble("Price");
        }

        public void buy(int quantity) throws ClassNotFoundException, SQLException {
            if (quantity <= Quantity && quantity >= 1) {
                ArrayList<Object> a = new ArrayList<>();
                a.add(id);
                a.add(Name);
                a.add(Price);
                a.add(quantity);
                a.add(updateQuantity(quantity));
                SectionMethods.cart.add(a);
            } else {
                System.out.println("Invalid Quantity");
            }
        }

        public double updateQuantity(int purchasedQuantity) throws ClassNotFoundException, SQLException {
            PreparedStatement ps = Salesperson.supermart_Connection()
                    .prepareStatement("update items set quantity = ? where id = ?;");
            ps.setInt(1, Quantity - purchasedQuantity);
            ps.setInt(2, id);
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

}
