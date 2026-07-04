package com.ridhi.demo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SupplierOperations {

    Scanner sc = new Scanner(System.in);

    // Add Supplier
    public void addSupplier() {
        try {
            Connection con = DBConnection.getConnection();
            System.out.print("Enter Supplier ID : ");
            int supplier_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Supplier Name : ");
            String supplier_name = sc.nextLine();

            System.out.print("Enter City : ");
            String city = sc.nextLine();

            System.out.print("Enter Mobile Number : ");
            String mobile_number = sc.nextLine();

            String query = "INSERT INTO Supplier VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, supplier_id);
            ps.setString(2, supplier_name);
            ps.setString(3, city);
            ps.setString(4, mobile_number);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\nSupplier Added Successfully.");
            } else {
                System.out.println("\nSupplier Not Added.");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}