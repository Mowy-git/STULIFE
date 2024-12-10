package stulife;


import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class BMICalculator {
    private static String BMI;
    private static double height;
    private static double weight;
    private static double BMIint;
    
    public BMICalculator(double heightcm, double weightkg) {
        BMICalculator.height = heightcm;
        BMICalculator.weight = weightkg;
    }
    
    /*
    
    public static void set(double heightcm, double weightkg) {
        BMICalculator.height = heightcm;
        BMICalculator.weight = weightkg;
    }

*/
    
    public static void calculate() {
        
        double heightInMeters = height / 100.0; // Convert height to meters
        double BMI = weight / (heightInMeters * heightInMeters); // BMI formula
        
        BMICalculator.BMIint = BMI;
        // Format and print the BMI
        DecimalFormat df = new DecimalFormat("#.0");
        
        BMICalculator.BMI = df.format(BMI);
    }
    
    public static String getBMI() {
        return BMICalculator.BMI;
    }
    
    public static double BMI() {
        return BMICalculator.BMIint;
    }
}
