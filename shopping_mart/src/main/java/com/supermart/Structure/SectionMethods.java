package com.supermart.Structure;

import java.sql.*;
import java.util.*;
import com.supermart.items.*;

public class SectionMethods {
    public static List<List<Object>> cart = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    static void selectAndAddItemBeverages() throws ClassNotFoundException, SQLException {
        int choice;

        do {
            System.out.println("\nSelect an item to add to your cart:");
            System.out.println("1. Water");
            System.out.println("2. Tea");
            System.out.println("3. Coffee");
            System.out.println("4. Juice");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    beverages.Water temp = new beverages().new Water();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 2: {
                    beverages.Tea temp = new beverages().new Tea();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 3: {
                    beverages.Coffee temp = new beverages().new Coffee();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 4: {
                    beverages.Juice temp = new beverages().new Juice();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    static void selectAndAddItemDairyNBakery() throws ClassNotFoundException, SQLException {
        int choice;

        do {
            System.out.println("\nSelect an item to add to your cart:");
            System.out.println("1. Milk");
            System.out.println("2. Bread");
            System.out.println("3. Pastries");
            System.out.println("4. Cake");
            System.out.println("5. Butter");
            System.out.println("6. Eggs");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    dairyNBakery.Milk temp = new dairyNBakery().new Milk();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 2: {
                    dairyNBakery.Bread temp = new dairyNBakery().new Bread();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 3: {
                    dairyNBakery.Pastries temp = new dairyNBakery().new Pastries();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 4: {
                    dairyNBakery.Cake temp = new dairyNBakery().new Cake();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 5: {
                    dairyNBakery.Butter temp = new dairyNBakery().new Butter();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 6: {
                    dairyNBakery.Eggs temp = new dairyNBakery().new Eggs();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    static void selectAndAddItemFreshProducts() throws ClassNotFoundException, SQLException {
        int choice;

        do {
            System.out.println("\nSelect an item to add to your cart:");
            System.out.println("1. Apple");
            System.out.println("2. Banana");
            System.out.println("3. Orange");
            System.out.println("4. Patato");
            System.out.println("5. Onion");
            System.out.println("6. Tamato");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    freshProducts.Apple temp = new freshProducts().new Apple();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 2: {
                    freshProducts.Banana temp = new freshProducts().new Banana();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 3: {
                    freshProducts.Orange temp = new freshProducts().new Orange();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 4: {
                    freshProducts.Patato temp = new freshProducts().new Patato();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 5: {
                    freshProducts.Onion temp = new freshProducts().new Onion();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 6: {
                    freshProducts.Tamato temp = new freshProducts().new Tamato();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    static void selectAndAddItemFrozenFood() throws ClassNotFoundException, SQLException {
        int choice;

        do {
            System.out.println("\nSelect an item to add to your cart:");
            System.out.println("1. Ice Cream");
            System.out.println("2. Green Peas");
            System.out.println("3. Paratha");
            System.out.println("4. Chicken");
            System.out.println("5. Paneer");
            System.out.println("6. Fruit Salat");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    frozenFood.Ice_cream temp = new frozenFood().new Ice_cream();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 2: {
                    frozenFood.Green_Peas temp = new frozenFood().new Green_Peas();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 3: {
                    frozenFood.Paratha temp = new frozenFood().new Paratha();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 4: {
                    frozenFood.Chicken temp = new frozenFood().new Chicken();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 5: {
                    frozenFood.Fruit_Salad temp = new frozenFood().new Fruit_Salad();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 6: {
                    frozenFood.Paneer temp = new frozenFood().new Paneer();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    static void selectAndAddItemSnacks() throws ClassNotFoundException, SQLException {
        int choice;

        do {
            System.out.println("\nSelect an item to add to your cart:");
            System.out.println("1. Chips");
            System.out.println("2. Chocolate");
            System.out.println("3. Burger");
            System.out.println("4. Pizza");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    snacks.Chips temp = new snacks().new Chips();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 2: {
                    snacks.Chocolate temp = new snacks().new Chocolate();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 3: {
                    snacks.Burger temp = new snacks().new Burger();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 4: {
                    snacks.Pizza temp = new snacks().new Pizza();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    static void selectAndAddItemGroceryNstapels() throws ClassNotFoundException, SQLException {
        int choice;

        do {
            System.out.println("\nSelect an item to add to your cart:");
            System.out.println("1. Rice");
            System.out.println("2. Wheat Floor");
            System.out.println("3. Oats");
            System.out.println("4. Salt");
            System.out.println("5. Sugar");
            System.out.println("6. Pulse");
            System.out.println("7. Vegetable Oil");
            System.out.println("8. Mustard Oil");
            System.out.println("0. Exit\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    groceryNstapels.Rice temp = new groceryNstapels().new Rice();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 2: {
                    groceryNstapels.Wheat_Floor temp = new groceryNstapels().new Wheat_Floor();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 3: {
                    groceryNstapels.Oats temp = new groceryNstapels().new Oats();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 4: {
                    groceryNstapels.Salt temp = new groceryNstapels().new Salt();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 5: {
                    groceryNstapels.Sugar temp = new groceryNstapels().new Sugar();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 6: {
                    groceryNstapels.Pulse temp = new groceryNstapels().new Pulse();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 7: {
                    groceryNstapels.Vegetable_Oils temp = new groceryNstapels().new Vegetable_Oils();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 8: {
                    groceryNstapels.Mustard_Oil temp = new groceryNstapels().new Mustard_Oil();
                    System.out.println("Enter the quantity to purchase: ");
                    temp.buy(sc.nextInt());
                    break;
                }
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

}
