package com.output;

import java.io.*;
import java.sql.*;
import java.time.*;
import java.util.*;
import java.util.List;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.supermart.Structure.*;

public class Output {
    public static void generatePdf(double total, String fileName) throws IOException {
        Document document = new Document();
        Paragraph p = new Paragraph();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("src\\main\\resources\\" + fileName + ".pdf"));
            document.open();
            p.add("============================================\n");
            p.add(generateLineWithSpaces("", 40) + "Invoice\n");
            p.add("============================================\n");
            p.add("Date : " + LocalDate.now() + " " + LocalTime.now().truncatedTo(java.time.temporal.ChronoUnit.SECONDS)
                    + "\n\n\n");
            p.add("Bill To:\n");
            System.out.print("Customer Name :");
            SectionMethods.sc.nextLine();
            p.add("Customer Name : " + SectionMethods.sc.nextLine() + "\n");
            System.out.print("Customer Address : ");
            p.add("Address : " + SectionMethods.sc.nextLine() + "\n");
            System.out.print("City : ");
            p.add("City : " + SectionMethods.sc.nextLine() + "\n");
            System.out.print("State : ");
            p.add("State : " + SectionMethods.sc.nextLine() + "\n\n");
            p.add("============================================\n");
            p.add(generateLineWithSpaces("Description", 30)
                    + generateLineWithSpaces("||", 10)
                    + generateLineWithSpaces("Quantity", 15)
                    + generateLineWithSpaces("||", 10)
                    + generateLineWithSpaces("Amount", 15) + "\n");
            p.add("============================================\n");
            for (List<Object> item : SectionMethods.cart) {
                p.add(generateLineWithSpaces((String) item.get(1), 30)
                        + generateLineWithSpaces("||", 15)
                        + generateLineWithSpaces((Integer) item.get(3) + "", 15)
                        + generateLineWithSpaces("||", 10)
                        + generateLineWithSpaces((Double) item.get(4) + "", 15) + "\n");
            }
            p.add("============================================\n");
            p.add(generateLineWithSpaces("Total", 73) + total + "\n");
            p.add("============================================\n");
            p.add(generateLineWithSpaces("", 22) + "Thank you for your business!\n");
            p.add("============================================\n");
            document.add(p);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
        openPdf(fileName);
    }

    private static String generateLineWithSpaces(String word, int totalSpaces) {
        int wordLength = word.length();
        int remainingSpaces = Math.max(0, totalSpaces - wordLength);
        return word + " ".repeat(remainingSpaces) + "\t";
    }

    public static void openPdf(String pdfFilename) {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\resources\\" + pdfFilename + ".pdf");
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                Runtime.getRuntime().exec("xdg-open " + pdfFilename);
            } else {
                System.out.println("Unsupported operating system for opening PDF.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayCart() throws ClassNotFoundException, SQLException, IOException {
        System.out.println("Items in your cart:");
        if (!SectionMethods.cart.isEmpty()) {
            PreparedStatement ps = Salesperson.supermart_Connection()
                    .prepareStatement("Insert into items_sold values (?,?,?,?)");
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            double totalCost = 0;
            int totalItem = 0;

            System.out.println("--------------------------------------------------------------------");
            System.out.println("Item \t\t Order Details \t\tTotal price \tOrderQuantity");
            System.out.println("--------------------------------------------------------------------");
            for (List<Object> item : SectionMethods.cart) {
                System.out.println(
                        item.get(1) + "\t\t " + item.get(3) + " X " + item.get(2) + "\t\t "
                                + item.get(4) + "\t\t" + item.get(3));
                totalCost += (double) item.get(4);
                totalItem += (int) item.get(3);
                names.add((String) item.get(1));
                quantity.add((int) item.get(3));
            }
            System.out.println("--------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t " + totalCost + "\t\t" + totalItem);
            System.out.println("--------------------------------------------------------------------");

            ps.setObject(1, names.toString());
            ps.setObject(2, quantity.toString());
            ps.setDouble(3, totalCost);
            ps.setObject(4, new java.sql.Timestamp(System.currentTimeMillis()));
            ps.execute();

            generatePdf(totalCost, "Order" + System.currentTimeMillis());
            System.out.println("Invoice generated...");
        }
    }
}
