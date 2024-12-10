package stulife;


import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class XAMPPCommand { 
    public static void stop() {
        try {
            // Paths to the batch files in the 'scripts' folder
            String stopSQL = "C:/xampp/mysql_stop.bat";
            String stopApache = "C:/xampp/apache_stop.bat";
            
            // Execute the batch files
            Process commandSQL = new ProcessBuilder("cmd.exe", "/c", stopSQL).start();
            Process commandApache = new ProcessBuilder("cmd.exe", "/c", stopApache).start();
            
            // Wait for the processes to complete
            int exitCode = commandApache.waitFor() + commandSQL.waitFor();

            if (exitCode == 0) {
                System.out.println("XAMPP stopped successfully.");
            } else {
                System.out.println("Failed to stop XAMPP. Exit code: " + exitCode);
            }
        } catch (IOException e) {
            System.out.println("Error while stopping XAMPP: " + e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Process was interrupted: " + e.getMessage());
            e.printStackTrace();
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
    }
    
    public static void start() {
    try {
        // Paths to batch files in the 'scripts' directory
        Process testProcess = new ProcessBuilder("cmd.exe", "/c", "echo Hello World").start();
        
        
        String apacheStartPath = "C:/xampp/apache_start.bat";
        String mysqlStartPath = "C:/xampp/mysql_start.bat";

        // Start Apache
        Process apacheProcess = new ProcessBuilder("cmd.exe", "/c", apacheStartPath).start();

        // Start MySQL
        Process mysqlProcess = new ProcessBuilder("cmd.exe", "/c", mysqlStartPath).start();
    } catch (IOException ex) {
        System.out.println("Error: " + ex.getMessage());
        ex.printStackTrace();
        Thread.currentThread().interrupt(); // Restore interrupt status
    }
}

}
