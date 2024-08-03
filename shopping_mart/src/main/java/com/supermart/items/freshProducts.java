package com.supermart.items;

import java.sql.*;
import java.util.ArrayList;

import com.supermart.Structure.*;

public class freshProducts {

    public class Apple {
        public int id = 1;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Apple() throws SQLException, ClassNotFoundException {
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
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Banana {
        public int id = 2;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Banana() throws SQLException, ClassNotFoundException {
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
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Orange {
        public int id = 20;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Orange() throws SQLException, ClassNotFoundException {
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
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Patato {
        public int id = 24;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Patato() throws SQLException, ClassNotFoundException {
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
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Onion {
        public int id = 19;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Onion() throws SQLException, ClassNotFoundException {
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
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }

    public class Tamato {
        public int id = 31;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Tamato() throws SQLException, ClassNotFoundException {
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
            ps.execute();
            System.out.println("Purchased " + purchasedQuantity + " " + Name + "(s). Remaining quantity: "
                    + (Quantity - purchasedQuantity));
            return purchasedQuantity * Price;
        }
    }
}
