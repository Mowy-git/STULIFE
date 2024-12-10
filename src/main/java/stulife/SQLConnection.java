package stulife;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class SQLConnection {
    private User user;
    
    public void start() {
        User user = new User();
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/stulife_user";
        SUser = "root";
        SPass = "";
        
        
        try {
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            
            int height = 0;
            int weight = 0;
            int age = 0;
            int id = 0;
            int budget = 0;
            
            String number = "";
            String gender = "";
            String birthday = "";
            
            
            
            
            String userName = user.getUsername();
            String userPass = user.getPassword();
            
            
            // SQL query with a placeholder for the username
            String query = "SELECT * FROM user_info WHERE username = ?";
            
            // Use PreparedStatement
            PreparedStatement pst = con.prepareStatement(query);
            
            // Bind the username to the placeholder
            pst.setString(1, userName);
            
            // Execute the query
            ResultSet rs = pst.executeQuery();
            
            // Process the result set
            if (rs.next()) {
                height = rs.getInt("height");
                weight = rs.getInt("weight");
                birthday = rs.getString("birthday");
                gender = rs.getString("gender");
                age = rs.getInt("age");
                id = rs.getInt("id");
                budget = rs.getInt("budget");
                number = rs.getString("phone_number");
                
            } else {
                System.out.println("User not found or incorrent credentials");
            }
            
            user.setHeight(height);
            user.setWeight(weight);
            user.setDate(birthday);
            user.setGender(gender);
            user.setAge(age);
            user.setId(id);
            user.setBudget(budget);
            user.setNumber(number);
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public void change(String name, String pass, int height, int weight, String date, String gender, int age, int budget, String number) {
        if (height < 0) {
        JOptionPane.showMessageDialog(new JFrame(), "Error in Height Field", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } else if (weight < 0) {
        JOptionPane.showMessageDialog(new JFrame(), "Error in Weight Field", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } else if (age < 0) {
        JOptionPane.showMessageDialog(new JFrame(), "Age should be greater than 0", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } else if (number.length() != 11) {
        JOptionPane.showMessageDialog(new JFrame(), "Phone Number should have 11 digits", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Parse and format the date
    String formattedDate;
    java.sql.Date sqlDate;
    try {
        SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        java.util.Date parsedDate = inputFormat.parse(date);
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        formattedDate = outputFormat.format(parsedDate);
        sqlDate = java.sql.Date.valueOf(formattedDate);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(new JFrame(), "Invalid date format", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return;
    }

    // Database connection and operations
    String url = "jdbc:mysql://localhost:3306/stulife_user";
    String user = "root";
    String password = "";

    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        // Check for duplicate username
        String checkQuery = "SELECT COUNT(*) FROM user_info WHERE username = ? AND username != ?";
        try (PreparedStatement checkStatement = connection.prepareStatement(checkQuery)) {
            checkStatement.setString(1, name);
            checkStatement.setString(2, User.getUsername());
            try (ResultSet resultSet = checkStatement.executeQuery()) {
                if (resultSet.next() && resultSet.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "The username is already taken. Please choose a different username.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }

        // Update user information
        String updateQuery = "UPDATE user_info SET username = ?, password = ?, height = ?, weight = ?, birthday = ?, gender = ?, age = ?, budget = ?, phone_number = ? WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateQuery)) {
            statement.setString(1, name);
            statement.setString(2, pass);
            statement.setInt(3, height);
            statement.setInt(4, weight);
            statement.setDate(5, sqlDate);
            statement.setString(6, gender);
            statement.setInt(7, age);
            statement.setInt(8, budget);
            statement.setString(9, number);
            statement.setString(10, User.getUsername());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User information updated successfully!");
                User.setUsername(name);
                User.setPassword(pass);
                User.setHeight(height);
                User.setWeight(weight);
                User.setDate(formattedDate);
                User.setGender(gender);
                User.setAge(age);
                User.setBudget(budget);
                User.setNumber(number);
            } else {
                System.out.println("No user found with the specified username.");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    
    public void createDB() {
            String jdbcUrl = "jdbc:mysql://localhost:3306/";
        String username = "root"; // Replace with your MySQL username
        String password = "";     // Replace with your MySQL password
        String databaseName = "stulife_user";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            // Create the database if it does not exist
            String createDatabase = "CREATE DATABASE IF NOT EXISTS " + databaseName;
            statement.execute(createDatabase);
            System.out.println("Database '" + databaseName + "' is ready.");

            // Use the database
            String useDatabase = "USE " + databaseName;
            statement.execute(useDatabase);

            // Create user_info table
            String createUserInfoTable = "CREATE TABLE IF NOT EXISTS user_info (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "username VARCHAR(100) NOT NULL UNIQUE, " + // UNIQUE constraint for username
                    "password VARCHAR(255) NOT NULL, " +         // Increased length for hashed passwords
                    "height INT, " +
                    "weight INT, " +
                    "birthday DATE, " +
                    "gender ENUM('m', 'f'), " +          // Descriptive ENUM values
                    "age INT, " +
                    "budget INT, " +
                    "phone_number VARCHAR(20) NOT NULL" +        // Added NOT NULL for phone number
                    ")";
            statement.execute(createUserInfoTable);
            System.out.println("Table 'user_info' created.");

            // Create food table
            String createFoodTable = "CREATE TABLE IF NOT EXISTS food (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "food VARCHAR(100) NOT NULL, " +
                    "quantity INT, " +
                    "calories INT, " +
                    "price INT, " +
                    "userID INT, " +
                    "FOREIGN KEY (userID) REFERENCES user_info(id) ON DELETE CASCADE" + // Cascading delete
                    ")";
            statement.execute(createFoodTable);
            System.out.println("Table 'food' created.");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
