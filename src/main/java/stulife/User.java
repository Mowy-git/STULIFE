package stulife;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class User {
    private static String username;
    private static String password;
    private static int height;
    private static int weight;
    private static String date;
    private static String gender;
    private static int age;
    private static int id;
    private static int budget;
    private static int caloriesgoal;
    private static String number;
    
    
    public static void setUsername(String username) {
        User.username = username;
    }
    
    public static String getUsername() {
        return username;
    }
    
    public static void setPassword(String password) {
        User.password = password;
    }
    
    public static String getPassword() {
        return password;
    }
    
    public static int getHeight() {
        return height;
    }
    
    public static void setHeight(int height) {
        User.height = height;
    }
    
    public static int getWeight() {
        return weight;
    }
    
    public static void setWeight(int weight) {
        User.weight = weight;
    }
    
    public static void setDate(String date) {
        
        // Parse the input date to a LocalDate object
        LocalDate ldate = LocalDate.parse(date);
        
        // Define the desired output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        
        // Format the LocalDate object to the desired string format
        String formattedDate = ldate.format(formatter);
        
        User.date = formattedDate;
    }
    
    public static String getDate() {
        return date;
    }
    
    public static void setGender(String gender) {
        User.gender = gender;
    }
    
    public static String getGender() {
        return gender;
    }
    
    public static void setAge(int age) {
        User.age = age;
    }
    
    public static int getAge() {
        return age;
    }
    
    public static void setId(int id) {
        User.id = id;
    }
    
    public static int getId() {
        return id;
    }
    
    public static void setBudget(int budget) {
        User.budget = budget;
    }
    
    public static int getBudget() {
        return User.budget;
    }
    
    public static void setCaloriesgoal(int caloriesgoal) {
        User.caloriesgoal = caloriesgoal;
    }
    
    public static int getCaloriesgoal() {
        return User.caloriesgoal;
    }
    
    public static void setNumber(String number) {
        User.number = number;
    }
    
    public static String getNumber() {
        return User.number;
    }
}
