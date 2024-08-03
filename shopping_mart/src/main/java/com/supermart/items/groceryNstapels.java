package com.supermart.items;

import java.sql.*;
import java.util.ArrayList;

import com.supermart.Structure.*;

public class groceryNstapels {
    public class Rice {
        public int id = 27;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Rice() throws SQLException, ClassNotFoundException {
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

    public class Wheat_Floor {
        public int id = 34;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Wheat_Floor() throws SQLException, ClassNotFoundException {
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

    public class Salt {
        public int id = 28;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Salt() throws SQLException, ClassNotFoundException {
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

    public class Vegetable_Oils {
        public int id = 32;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Vegetable_Oils() throws SQLException, ClassNotFoundException {
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

    public class Sugar {
        public int id = 29;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Sugar() throws SQLException, ClassNotFoundException {
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

    public class Mustard_Oil {
        public int id = 17;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Mustard_Oil() throws SQLException, ClassNotFoundException {
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

    public class Oats {
        public int id = 18;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Oats() throws SQLException, ClassNotFoundException {
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

    public class Pulse {
        public int id = 26;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Pulse() throws SQLException, ClassNotFoundException {
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
