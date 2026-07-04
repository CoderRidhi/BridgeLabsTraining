import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SalesOperations
{
    Scanner sc = new Scanner(System.in);
    //sell product
    public void sellProduct()
    {
        try
        {
            Connection con = DBConnection.getConnection();
            System.out.println("Enter sales id: ");
            int sales_id = sc.nextInt();

            sc.nextLine();
            System.out.println("Enter product id: ");
            int product_id = sc.nextInt();

            System.out.println("Enter sold quantity id: ");
            int sold_quantity = sc.nextInt();

            System.out.println("Enter sales date: ");
            int sales_date = sc.nextInt();

             String query = "INSERT INTO Sales VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, sales_id);
            ps.setInt(2, product_id);
            ps.setInt(3, sold_quantity);
            ps.setInt(4, sales_date);
            int rows = ps.executeUpdate();

            if (rows > 0)
            {
                System.out.println("\nProduct Sold Successfully.\n");
            }
            else
            {
                System.out.println("\nProduct Not Sold.\n");
            }   

            ps.close();
            con.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}