package com.supermart.items;

import java.sql.*;
import java.util.ArrayList;

import com.supermart.Structure.*;

public class dairyNBakery {

    public class Milk {
        public int id = 16;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Milk() throws SQLException, ClassNotFoundException {
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

    public class Bread {
        public int id = 3;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Bread() throws SQLException, ClassNotFoundException {
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

    public class Pastries {
        public int id = 23;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Pastries() throws SQLException, ClassNotFoundException {
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

    public class Cake {
        public int id = 6;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Cake() throws SQLException, ClassNotFoundException {
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

    public class Butter {
        public int id = 5;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Butter() throws SQLException, ClassNotFoundException {
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

    public class Eggs {
        public int id = 11;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Eggs() throws SQLException, ClassNotFoundException {
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