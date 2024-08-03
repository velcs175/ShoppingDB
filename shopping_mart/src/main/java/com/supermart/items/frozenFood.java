package com.supermart.items;

import java.sql.*;
import java.util.ArrayList;

import com.supermart.Structure.*;

public class frozenFood {
    public class Ice_cream {
        public int id = 14;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Ice_cream() throws SQLException, ClassNotFoundException {
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

    public class Green_Peas {
        public int id = 13;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Green_Peas() throws SQLException, ClassNotFoundException {
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

    public class Paratha {
        public int id = 22;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Paratha() throws SQLException, ClassNotFoundException {
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

    public class Chicken {
        public int id = 7;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Chicken() throws SQLException, ClassNotFoundException {
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

    public class Paneer {
        public int id = 21;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Paneer() throws SQLException, ClassNotFoundException {
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

    public class Fruit_Salad {
        public int id = 12;
        public String Name = "";
        public double Price = 0.0;
        public int Quantity = 0;

        public Fruit_Salad() throws SQLException, ClassNotFoundException {
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
