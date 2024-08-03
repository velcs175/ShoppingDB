package com.supermart.Structure;

import java.io.IOException;
import java.sql.SQLException;

import com.output.Output;

public class Sections {

    public static void section() throws ClassNotFoundException, SQLException, IOException {
        int selection;
        do {
            System.out.println("Choose a section\n1. Fresh Produce\n" + "2. Dairy & Bakery\n" + "3. Grocery & Staples\n"
                    + "4. Frozen Food\n"
                    + "5. Beverages\n" + "6. Snacks\n" + "0. Exit");
            selection = SectionMethods.sc.nextInt();
            switch (selection) {
                case 1:
                    SectionMethods.selectAndAddItemFreshProducts();
                    break;
                case 2:
                    SectionMethods.selectAndAddItemDairyNBakery();
                    break;
                case 3:
                    SectionMethods.selectAndAddItemGroceryNstapels();
                    break;
                case 4:
                    SectionMethods.selectAndAddItemFrozenFood();
                    break;
                case 5:
                    SectionMethods.selectAndAddItemBeverages();
                    break;
                case 6:
                    SectionMethods.selectAndAddItemSnacks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (selection != 0);

        Output.displayCart();
    }
}
