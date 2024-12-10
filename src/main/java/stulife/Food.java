package stulife;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class Food {
    private User user;
    
    
    // Ilagay nyo lang sa button: String, Calories, Prices.
    public void addFood(String food, int calories, int price) {
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/stulife_user";
        SUser = "root";
        SPass = "";
        
        try {
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

        // Query to count the number of "Apple" rows
        String query = "SELECT COUNT(*) AS count FROM food WHERE food = ? and userID = ?";
        
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, food);
        pst.setInt(2, user.getId());
        ResultSet rsCheck = pst.executeQuery();

            if (rsCheck.next()) { // Ensure there's a result to process
                int count = rsCheck.getInt("count"); // Get the count value from the result
                if (count > 0) {
                    System.out.println("Added 1 more " + food + " in table");
                    
                    String query2 = " UPDATE food SET quantity = quantity + 1 WHERE userID = ? and food = ?";
                    PreparedStatement pstz = con.prepareStatement(query2);
                    pstz.setInt(1, user.getId());
                    pstz.setString(2, food);
                    pstz.executeUpdate();
                } else {
                    System.out.println("Added " + food + " in table");
                    
                    String query2 = " INSERT INTO food (food,quantity,calories,price,userID) VALUES (?, 1, ?, ?, ?) ";
                    PreparedStatement pstz = con.prepareStatement(query2);
                    pstz.setString(1, food);
                    pstz.setInt(2,calories);
                    pstz.setInt(3,price);
                    pstz.setInt(4, user.getId());
                    pstz.executeUpdate();
                }
            }

        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
