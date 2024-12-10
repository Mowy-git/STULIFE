package stulife;

import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class Home extends javax.swing.JPanel {
    private User user;
    private BMICalculator bmi;
    private JPanel parentPanel;
    private JFrame frame;
    private int totalQuantity = 0; 
    

    public Home(JFrame parentFrame) {
        frame = parentFrame;
        initComponents();
        String userName,userPass;
        int userHeight, userWeight;    
        
        
        
        
        
        SQLConnection connection = new SQLConnection();
        connection.start();
        change();
        
        userName = user.getUsername();
        userPass = user.getPassword();
        userHeight = user.getHeight();
        userWeight = user.getWeight();
        
        
        bmi = new BMICalculator(userHeight, userWeight);
        bmi.calculate();
        bmitext.setText("BMI: " + BMICalculator.getBMI());
        
        budget.setText(String.valueOf(User.getBudget()));
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        
        
        
        
        // <editor-fold defaultstate="collapsed">
        plus1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Egg", 7, 10);
                plus1.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus1.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus1.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus1.setForeground(Color.white);
            }
        });
        
        plus2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Apple", 50, 20);
                plus2.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus2.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus2.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus2.setForeground(Color.white);
            }
        });
        
        plus3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Orange", 20, 20);
                plus3.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus3.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus3.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus3.setForeground(Color.white);
            }
        });
        
        plus4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Milk", 120, 40);
                plus4.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus4.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus4.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus4.setForeground(Color.white);
            }
        });
        
        plus5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Banana", 27, 100);
                update();
                plus5.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus5.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus5.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus5.setForeground(Color.white);
            }
        });
        
        plus6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Corn", 35, 75);
                plus6.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus6.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus6.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus6.setForeground(Color.white);
            }
        });
        
        plus7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Cheese", 120, 60);
                plus7.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus7.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus7.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus7.setForeground(Color.white);
            }
        });
        
        plus8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 Food food = new Food();
                  food.addFood("Pasta", 131, 30);
                plus8.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus8.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus8.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus8.setForeground(Color.white);
            }
        });
        
        plus9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Bread", 90, 80);
                plus9.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus9.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus9.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus9.setForeground(Color.white);
            }
        });
        
        plus36.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Avocado", 250, 80);
                plus36.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus36.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus36.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus36.setForeground(Color.white);
            }
        });
        
        plus37.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Beef", 250, 150);
                plus37.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus37.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus37.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus37.setForeground(Color.white);
            }
        });
        
        plus38.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Almond", 100, 90);
                plus38.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus38.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus38.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus38.setForeground(Color.white);
            }
        });
        
        plus39.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Carrots", 55, 176);
                plus39.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus39.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus39.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus39.setForeground(Color.white);
            }
        });
        
        plus41.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Cashew", 100, 100);
                plus41.setForeground(new Color(255, 255, 0));
                update();
                try {   
                    Timer timer = new Timer(150, actionEvent -> plus41.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus41.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus41.setForeground(Color.white);
            }
        });
        
        plus42.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Brown Rice", 220, 83);
                plus42.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus42.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus42.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus42.setForeground(Color.white);
            }
        });
        
        plus43.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Chicken", 160,185);
                plus43.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus43.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus43.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus43.setForeground(Color.white);
            }
        });
        
        plus44.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Kangkong", 40,20);
                plus44.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus44.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus44.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus44.setForeground(Color.white);
            }
        });
        
        plus45.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Chia seeds", 100, 90);
                plus45.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus45.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus45.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus45.setForeground(Color.white);
            }
        });
        
        plus46.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Oats", 170, 134);
                plus46.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus46.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus46.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus46.setForeground(Color.white);
            }
        });
        
        plus47.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
        food.addFood("Peanuts", 567, 20);
                plus47.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus47.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus47.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus47.setForeground(Color.white);
            }
        });
        
        plus48.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Mango", 110, 120);
                plus48.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus48.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus48.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus48.setForeground(Color.white);
            }
        });
        
        plus49.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Pork", 110, 200);
                plus49.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus49.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus49.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus49.setForeground(Color.white);
            }
        });
        
        plus50.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Potato", 130, 103);
                plus50.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus50.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus50.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus50.setForeground(Color.white);
            }
        });
        
        plus51.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Pear", 250, 30);
                plus51.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus51.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus51.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus51.setForeground(Color.white);
            }
        });
        
        plus52.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Tuna", 160, 120);
                plus52.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus52.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus52.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus52.setForeground(Color.white);
            }
        });
        
        plus53.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Sweet Potatoes", 115, 59);
                plus53.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus53.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus53.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus53.setForeground(Color.white);
            }
        });
        
        plus54.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Bangus", 230, 100);
                plus54.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus54.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus54.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus54.setForeground(Color.white);
            }
        });
        
        plus55.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("White Rice", 140, 57);
                plus55.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus55.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus55.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus55.setForeground(Color.white);
            }
        });
        
        plus56.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                 food.addFood("Salmon", 230, 200);
                plus56.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus56.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus56.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus56.setForeground(Color.white);
            }
        });
        
        plus57.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Tofu", 220, 50);
                plus57.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus57.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus57.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus57.setForeground(Color.white);
            }
        });
        
        plus58.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Yogurt", 150, 40);
                plus58.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus58.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus58.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus58.setForeground(Color.white);
            }
        });
        
        plus59.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Food food = new Food();
                food.addFood("Squash", 100, 50);
                plus59.setForeground(new Color(255, 255, 0));
                update();
                try {
                    Timer timer = new Timer(150, actionEvent -> plus59.setForeground(new Color(211, 211, 211)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered
                plus59.setForeground(new Color(211, 211, 211));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited
                plus59.setForeground(Color.white);
            }
        });
        //</editor-fold>
        
    }
    
    public void change() {
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/stulife_user";
        SUser = "root";
        SPass = "";
        
        
        try {
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            int quantity, calories, multiply, totalCalories = 0;
            
            int id = user.getId();
            int height = user.getHeight();
            
            
            // SQL query with a placeholder for the username
            String query = "SELECT * FROM food WHERE userID = ?";
            
            // Use PreparedStatement
            PreparedStatement pst = con.prepareStatement(query);
            
            // Bind the username to the placeholder
            pst.setInt(1, id);
            
            // Execute the query
            ResultSet rs = pst.executeQuery();
            
            // Process the result set
            while (rs.next()) {
                quantity = rs.getInt("quantity");
                calories = rs.getInt("calories");
                
                multiply = quantity * calories;
                
                totalCalories += multiply;
                totalQuantity += quantity;
                
            }
            
            cartquantity.setText(String.valueOf(totalQuantity));
            caloriesnum.setText(String.valueOf(totalCalories) + " / 2500");
            
            double progressFraction = (double) totalCalories / 2500; // Cast to double
            int progressbarnum = (int) (progressFraction * 100); // Scale to 0-100 range
            
            progressbar.setValue(progressbarnum);
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
    }
    
    public void update() {
        
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/stulife_user";
        SUser = "root";
        SPass = "";
        
        
        try {
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            int quantity, calories, multiply, totalCalories = 0;
            
            int id = user.getId();
            
            String query = "SELECT * FROM food WHERE userID = ?";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            // Process the result set
            while (rs.next()) {
                quantity = rs.getInt("quantity");
                calories = rs.getInt("calories");
                multiply = quantity * calories;
                totalCalories += multiply;
                
            }
            caloriesnum.setText(String.valueOf(totalCalories) + " / 2500");
            cartquantity.setText(String.valueOf(totalQuantity += 1));
            
            double progressFraction = (double) totalCalories / 2500; // Cast to double
            int progressbarnum = (int) (progressFraction * 100); // Scale to 0-100 range
            
            progressbar.setValue(progressbarnum);
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        greeting = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        orange = new javax.swing.JLabel();
        brocolli = new javax.swing.JLabel();
        pasta = new javax.swing.JLabel();
        cheese = new javax.swing.JLabel();
        egg = new javax.swing.JLabel();
        banana = new javax.swing.JLabel();
        bread = new javax.swing.JLabel();
        milk = new javax.swing.JLabel();
        apple = new javax.swing.JLabel();
        pasta4 = new javax.swing.JLabel();
        cheese4 = new javax.swing.JLabel();
        bread5 = new javax.swing.JLabel();
        pasta5 = new javax.swing.JLabel();
        cheese5 = new javax.swing.JLabel();
        bread6 = new javax.swing.JLabel();
        pasta6 = new javax.swing.JLabel();
        cheese6 = new javax.swing.JLabel();
        bread7 = new javax.swing.JLabel();
        pasta7 = new javax.swing.JLabel();
        cheese7 = new javax.swing.JLabel();
        bread8 = new javax.swing.JLabel();
        pasta8 = new javax.swing.JLabel();
        cheese8 = new javax.swing.JLabel();
        bread9 = new javax.swing.JLabel();
        pasta9 = new javax.swing.JLabel();
        cheese9 = new javax.swing.JLabel();
        bread10 = new javax.swing.JLabel();
        pasta10 = new javax.swing.JLabel();
        pasta11 = new javax.swing.JLabel();
        cheese10 = new javax.swing.JLabel();
        pasta12 = new javax.swing.JLabel();
        cheese11 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        price6 = new javax.swing.JLabel();
        price7 = new javax.swing.JLabel();
        price8 = new javax.swing.JLabel();
        price9 = new javax.swing.JLabel();
        price10 = new javax.swing.JLabel();
        price11 = new javax.swing.JLabel();
        price19 = new javax.swing.JLabel();
        price20 = new javax.swing.JLabel();
        price23 = new javax.swing.JLabel();
        price12 = new javax.swing.JLabel();
        price18 = new javax.swing.JLabel();
        price22 = new javax.swing.JLabel();
        price17 = new javax.swing.JLabel();
        price21 = new javax.swing.JLabel();
        price14 = new javax.swing.JLabel();
        price13 = new javax.swing.JLabel();
        price15 = new javax.swing.JLabel();
        price16 = new javax.swing.JLabel();
        price25 = new javax.swing.JLabel();
        price30 = new javax.swing.JLabel();
        price29 = new javax.swing.JLabel();
        price24 = new javax.swing.JLabel();
        price27 = new javax.swing.JLabel();
        price26 = new javax.swing.JLabel();
        price28 = new javax.swing.JLabel();
        price31 = new javax.swing.JLabel();
        plus1 = new javax.swing.JLabel();
        plus2 = new javax.swing.JLabel();
        plus3 = new javax.swing.JLabel();
        plus4 = new javax.swing.JLabel();
        plus5 = new javax.swing.JLabel();
        plus6 = new javax.swing.JLabel();
        plus7 = new javax.swing.JLabel();
        plus8 = new javax.swing.JLabel();
        plus9 = new javax.swing.JLabel();
        plus36 = new javax.swing.JLabel();
        plus37 = new javax.swing.JLabel();
        plus38 = new javax.swing.JLabel();
        plus39 = new javax.swing.JLabel();
        plus41 = new javax.swing.JLabel();
        plus42 = new javax.swing.JLabel();
        plus43 = new javax.swing.JLabel();
        plus44 = new javax.swing.JLabel();
        plus45 = new javax.swing.JLabel();
        plus46 = new javax.swing.JLabel();
        plus47 = new javax.swing.JLabel();
        plus48 = new javax.swing.JLabel();
        plus49 = new javax.swing.JLabel();
        plus50 = new javax.swing.JLabel();
        plus51 = new javax.swing.JLabel();
        plus52 = new javax.swing.JLabel();
        plus53 = new javax.swing.JLabel();
        plus54 = new javax.swing.JLabel();
        plus55 = new javax.swing.JLabel();
        plus56 = new javax.swing.JLabel();
        plus57 = new javax.swing.JLabel();
        plus58 = new javax.swing.JLabel();
        plus59 = new javax.swing.JLabel();
        food1 = new javax.swing.JLabel();
        food2 = new javax.swing.JLabel();
        food3 = new javax.swing.JLabel();
        food4 = new javax.swing.JLabel();
        food5 = new javax.swing.JLabel();
        food6 = new javax.swing.JLabel();
        food7 = new javax.swing.JLabel();
        food8 = new javax.swing.JLabel();
        food9 = new javax.swing.JLabel();
        food32 = new javax.swing.JLabel();
        food33 = new javax.swing.JLabel();
        food34 = new javax.swing.JLabel();
        food35 = new javax.swing.JLabel();
        food36 = new javax.swing.JLabel();
        food37 = new javax.swing.JLabel();
        food38 = new javax.swing.JLabel();
        food39 = new javax.swing.JLabel();
        food40 = new javax.swing.JLabel();
        food41 = new javax.swing.JLabel();
        food42 = new javax.swing.JLabel();
        food43 = new javax.swing.JLabel();
        food44 = new javax.swing.JLabel();
        food45 = new javax.swing.JLabel();
        food46 = new javax.swing.JLabel();
        food47 = new javax.swing.JLabel();
        food48 = new javax.swing.JLabel();
        food49 = new javax.swing.JLabel();
        food50 = new javax.swing.JLabel();
        food51 = new javax.swing.JLabel();
        food52 = new javax.swing.JLabel();
        food53 = new javax.swing.JLabel();
        food54 = new javax.swing.JLabel();
        foodname33 = new javax.swing.JLabel();
        foodname34 = new javax.swing.JLabel();
        foodname35 = new javax.swing.JLabel();
        foodname36 = new javax.swing.JLabel();
        foodname37 = new javax.swing.JLabel();
        foodname28 = new javax.swing.JLabel();
        foodname29 = new javax.swing.JLabel();
        foodname30 = new javax.swing.JLabel();
        foodname31 = new javax.swing.JLabel();
        foodname32 = new javax.swing.JLabel();
        foodname19 = new javax.swing.JLabel();
        foodname20 = new javax.swing.JLabel();
        foodname21 = new javax.swing.JLabel();
        foodname22 = new javax.swing.JLabel();
        foodname23 = new javax.swing.JLabel();
        foodname24 = new javax.swing.JLabel();
        foodname25 = new javax.swing.JLabel();
        foodname26 = new javax.swing.JLabel();
        foodname27 = new javax.swing.JLabel();
        foodname10 = new javax.swing.JLabel();
        foodname11 = new javax.swing.JLabel();
        foodname12 = new javax.swing.JLabel();
        foodname13 = new javax.swing.JLabel();
        foodname14 = new javax.swing.JLabel();
        foodname15 = new javax.swing.JLabel();
        foodname16 = new javax.swing.JLabel();
        foodname17 = new javax.swing.JLabel();
        foodname18 = new javax.swing.JLabel();
        foodname7 = new javax.swing.JLabel();
        foodname8 = new javax.swing.JLabel();
        foodname9 = new javax.swing.JLabel();
        foodname4 = new javax.swing.JLabel();
        foodname5 = new javax.swing.JLabel();
        foodname6 = new javax.swing.JLabel();
        foodname1 = new javax.swing.JLabel();
        foodname2 = new javax.swing.JLabel();
        foodname3 = new javax.swing.JLabel();
        bmiimg = new javax.swing.JLabel();
        bmitext = new javax.swing.JLabel();
        budget = new javax.swing.JLabel();
        goaltext = new javax.swing.JLabel();
        budgettext = new javax.swing.JLabel();
        caloriesintake = new javax.swing.JLabel();
        caloriesbar = new javax.swing.JLabel();
        phsign = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        caloriesnum = new javax.swing.JLabel();
        cartquantity = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(255, 245, 230));
        setMinimumSize(new java.awt.Dimension(100, 600));
        setPreferredSize(new java.awt.Dimension(770, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greeting.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 50)); // NOI18N
        greeting.setForeground(new java.awt.Color(5, 75, 40));
        greeting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        greeting.setText("Hello " + user.getUsername() + "!");
        add(greeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 490, 70));

        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 245, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 3000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orange.setBackground(new java.awt.Color(0, 0, 0));
        orange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orange.png"))); // NOI18N
        jPanel2.add(orange, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 70, 70));

        brocolli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corn (2).png"))); // NOI18N
        jPanel2.add(brocolli, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        pasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pasta.png"))); // NOI18N
        jPanel2.add(pasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        cheese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cheese.png"))); // NOI18N
        jPanel2.add(cheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        egg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/egg.png"))); // NOI18N
        jPanel2.add(egg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        banana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BANANA.png"))); // NOI18N
        jPanel2.add(banana, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 70, 80));

        bread.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bread.png"))); // NOI18N
        jPanel2.add(bread, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        milk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        milk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/milk.png"))); // NOI18N
        jPanel2.add(milk, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 80, 80));

        apple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APPLE.png"))); // NOI18N
        jPanel2.add(apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, 80));

        pasta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beef.png"))); // NOI18N
        jPanel2.add(pasta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, -1, -1));

        cheese4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AVOCADO.png"))); // NOI18N
        jPanel2.add(cheese4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, -1, -1));

        bread5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Almond.png"))); // NOI18N
        jPanel2.add(bread5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, -1, -1));

        pasta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cashew.png"))); // NOI18N
        jPanel2.add(pasta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 900, 70, -1));

        cheese5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CARROTS.png"))); // NOI18N
        jPanel2.add(cheese5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 900, 70, -1));

        bread6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Brown rice.png"))); // NOI18N
        jPanel2.add(bread6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 900, 70, -1));

        pasta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kangkong.png"))); // NOI18N
        jPanel2.add(pasta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1110, -1, 70));

        cheese6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chicken.png"))); // NOI18N
        jPanel2.add(cheese6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1110, -1, -1));

        bread7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chia seeds.png"))); // NOI18N
        jPanel2.add(bread7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1110, -1, -1));

        pasta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Peanuts.png"))); // NOI18N
        jPanel2.add(pasta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1320, -1, -1));

        cheese7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Oats.png"))); // NOI18N
        jPanel2.add(cheese7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1320, -1, -1));

        bread8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MANGO.png"))); // NOI18N
        jPanel2.add(bread8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1320, -1, -1));

        pasta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/potato.png"))); // NOI18N
        jPanel2.add(pasta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1530, -1, -1));

        cheese8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pork.png"))); // NOI18N
        jPanel2.add(cheese8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1530, -1, -1));

        bread9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pear.png"))); // NOI18N
        jPanel2.add(bread9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1530, -1, -1));

        pasta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/potatoes.png"))); // NOI18N
        jPanel2.add(pasta9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1740, -1, -1));

        cheese9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tuna.png"))); // NOI18N
        jPanel2.add(cheese9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1740, -1, -1));

        bread10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bangus.png"))); // NOI18N
        jPanel2.add(bread10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1740, -1, -1));

        pasta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rice.png"))); // NOI18N
        jPanel2.add(pasta10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 1950, -1, -1));

        pasta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tofu.png"))); // NOI18N
        jPanel2.add(pasta11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1950, -1, -1));

        cheese10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salmon.png"))); // NOI18N
        jPanel2.add(cheese10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1950, -1, -1));

        pasta12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yogurt.png"))); // NOI18N
        jPanel2.add(pasta12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 2160, -1, -1));

        cheese11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/squash.png"))); // NOI18N
        jPanel2.add(cheese11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2160, -1, -1));

        price.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.setText("10");
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        price1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price1.setForeground(new java.awt.Color(0, 0, 0));
        price1.setText("20");
        jPanel2.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        price2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price2.setForeground(new java.awt.Color(0, 0, 0));
        price2.setText("40");
        jPanel2.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        price3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price3.setForeground(new java.awt.Color(0, 0, 0));
        price3.setText("100");
        jPanel2.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        price4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price4.setForeground(new java.awt.Color(0, 0, 0));
        price4.setText("75");
        jPanel2.add(price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        price5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price5.setForeground(new java.awt.Color(0, 0, 0));
        price5.setText("20");
        jPanel2.add(price5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        price6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price6.setForeground(new java.awt.Color(0, 0, 0));
        price6.setText("80");
        jPanel2.add(price6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        price7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price7.setForeground(new java.awt.Color(0, 0, 0));
        price7.setText("60");
        jPanel2.add(price7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        price8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price8.setForeground(new java.awt.Color(0, 0, 0));
        price8.setText("30");
        jPanel2.add(price8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        price9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price9.setForeground(new java.awt.Color(0, 0, 0));
        price9.setText("90");
        jPanel2.add(price9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 770, -1, -1));

        price10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price10.setForeground(new java.awt.Color(0, 0, 0));
        price10.setText("80");
        jPanel2.add(price10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, -1, -1));

        price11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price11.setForeground(new java.awt.Color(0, 0, 0));
        price11.setText("150");
        jPanel2.add(price11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 770, -1, -1));

        price19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price19.setForeground(new java.awt.Color(0, 0, 0));
        price19.setText("176");
        jPanel2.add(price19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 980, 30, -1));

        price20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price20.setForeground(new java.awt.Color(0, 0, 0));
        price20.setText("100");
        jPanel2.add(price20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 980, 30, -1));

        price23.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price23.setForeground(new java.awt.Color(0, 0, 0));
        price23.setText("20");
        jPanel2.add(price23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1190, -1, -1));

        price12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price12.setForeground(new java.awt.Color(0, 0, 0));
        price12.setText("30");
        jPanel2.add(price12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1610, -1, -1));

        price18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price18.setForeground(new java.awt.Color(0, 0, 0));
        price18.setText("83");
        jPanel2.add(price18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 980, 20, -1));

        price22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price22.setForeground(new java.awt.Color(0, 0, 0));
        price22.setText("185");
        jPanel2.add(price22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1190, -1, -1));

        price17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price17.setForeground(new java.awt.Color(0, 0, 0));
        price17.setText("134");
        jPanel2.add(price17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1400, -1, -1));

        price21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price21.setForeground(new java.awt.Color(0, 0, 0));
        price21.setText("90");
        jPanel2.add(price21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1190, -1, -1));

        price14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price14.setForeground(new java.awt.Color(0, 0, 0));
        price14.setText("200");
        jPanel2.add(price14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1610, -1, -1));

        price13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price13.setForeground(new java.awt.Color(0, 0, 0));
        price13.setText("103");
        jPanel2.add(price13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1610, -1, -1));

        price15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price15.setForeground(new java.awt.Color(0, 0, 0));
        price15.setText("20");
        jPanel2.add(price15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1400, -1, -1));

        price16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price16.setForeground(new java.awt.Color(0, 0, 0));
        price16.setText("120");
        jPanel2.add(price16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1400, -1, -1));

        price25.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price25.setForeground(new java.awt.Color(0, 0, 0));
        price25.setText("120");
        jPanel2.add(price25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1820, -1, -1));

        price30.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price30.setForeground(new java.awt.Color(0, 0, 0));
        price30.setText("40");
        jPanel2.add(price30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2240, -1, -1));

        price29.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price29.setForeground(new java.awt.Color(0, 0, 0));
        price29.setText("57");
        jPanel2.add(price29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2030, -1, -1));

        price24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price24.setForeground(new java.awt.Color(0, 0, 0));
        price24.setText("100");
        jPanel2.add(price24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1820, -1, -1));

        price27.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price27.setForeground(new java.awt.Color(0, 0, 0));
        price27.setText("50");
        jPanel2.add(price27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 2030, -1, -1));

        price26.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price26.setForeground(new java.awt.Color(0, 0, 0));
        price26.setText("59");
        jPanel2.add(price26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1820, -1, -1));

        price28.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price28.setForeground(new java.awt.Color(0, 0, 0));
        price28.setText("200");
        jPanel2.add(price28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 2030, -1, -1));

        price31.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        price31.setForeground(new java.awt.Color(0, 0, 0));
        price31.setText("50");
        jPanel2.add(price31, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 2240, -1, -1));

        plus1.setBackground(new java.awt.Color(255, 255, 255));
        plus1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus1.setForeground(new java.awt.Color(255, 255, 255));
        plus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus1.setText("+");
        plus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus1FocusLost(evt);
            }
        });
        plus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plus1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plus1MouseExited(evt);
            }
        });
        jPanel2.add(plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 40, 40));

        plus2.setBackground(new java.awt.Color(255, 255, 255));
        plus2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus2.setForeground(new java.awt.Color(255, 255, 255));
        plus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus2.setText("+");
        plus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus2FocusLost(evt);
            }
        });
        plus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus2MouseClicked(evt);
            }
        });
        jPanel2.add(plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 40, 40));

        plus3.setBackground(new java.awt.Color(255, 255, 255));
        plus3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus3.setForeground(new java.awt.Color(255, 255, 255));
        plus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus3.setText("+");
        plus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus3FocusLost(evt);
            }
        });
        plus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus3MouseClicked(evt);
            }
        });
        jPanel2.add(plus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 40, 40));

        plus4.setBackground(new java.awt.Color(255, 255, 255));
        plus4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus4.setForeground(new java.awt.Color(255, 255, 255));
        plus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus4.setText("+");
        plus4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus4FocusLost(evt);
            }
        });
        plus4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus4MouseClicked(evt);
            }
        });
        jPanel2.add(plus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 40, 40));

        plus5.setBackground(new java.awt.Color(255, 255, 255));
        plus5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus5.setForeground(new java.awt.Color(255, 255, 255));
        plus5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus5.setText("+");
        plus5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus5FocusLost(evt);
            }
        });
        plus5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus5MouseClicked(evt);
            }
        });
        jPanel2.add(plus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 40, 40));

        plus6.setBackground(new java.awt.Color(255, 255, 255));
        plus6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus6.setForeground(new java.awt.Color(255, 255, 255));
        plus6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus6.setText("+");
        plus6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus6FocusLost(evt);
            }
        });
        plus6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus6MouseClicked(evt);
            }
        });
        jPanel2.add(plus6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 40, 40));

        plus7.setBackground(new java.awt.Color(255, 255, 255));
        plus7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus7.setForeground(new java.awt.Color(255, 255, 255));
        plus7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus7.setText("+");
        plus7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus7FocusLost(evt);
            }
        });
        plus7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus7MouseClicked(evt);
            }
        });
        jPanel2.add(plus7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 40, 40));

        plus8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus8.setForeground(new java.awt.Color(255, 255, 255));
        plus8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus8.setText("+");
        plus8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus8MouseClicked(evt);
            }
        });
        jPanel2.add(plus8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 40, 40));

        plus9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus9.setForeground(new java.awt.Color(255, 255, 255));
        plus9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus9.setText("+");
        plus9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus9MouseClicked(evt);
            }
        });
        jPanel2.add(plus9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 40, 40));

        plus36.setBackground(new java.awt.Color(255, 255, 255));
        plus36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus36.setForeground(new java.awt.Color(255, 255, 255));
        plus36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus36.setText("+");
        plus36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus36.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus36FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus36FocusLost(evt);
            }
        });
        plus36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus36MouseClicked(evt);
            }
        });
        jPanel2.add(plus36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, 40, 40));

        plus37.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus37.setForeground(new java.awt.Color(255, 255, 255));
        plus37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus37.setText("+");
        plus37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus37MouseClicked(evt);
            }
        });
        jPanel2.add(plus37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 760, 40, 40));

        plus38.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus38.setForeground(new java.awt.Color(255, 255, 255));
        plus38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus38.setText("+");
        plus38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus38MouseClicked(evt);
            }
        });
        jPanel2.add(plus38, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 760, 40, 40));

        plus39.setBackground(new java.awt.Color(255, 255, 255));
        plus39.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus39.setForeground(new java.awt.Color(255, 255, 255));
        plus39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus39.setText("+");
        plus39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus39.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus39FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus39FocusLost(evt);
            }
        });
        plus39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus39MouseClicked(evt);
            }
        });
        jPanel2.add(plus39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 970, 40, 40));

        plus41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus41.setForeground(new java.awt.Color(255, 255, 255));
        plus41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus41.setText("+");
        plus41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus41MouseClicked(evt);
            }
        });
        jPanel2.add(plus41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 970, 40, 40));

        plus42.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus42.setForeground(new java.awt.Color(255, 255, 255));
        plus42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus42.setText("+");
        plus42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus42MouseClicked(evt);
            }
        });
        jPanel2.add(plus42, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 970, 40, 40));

        plus43.setBackground(new java.awt.Color(255, 255, 255));
        plus43.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus43.setForeground(new java.awt.Color(255, 255, 255));
        plus43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus43.setText("+");
        plus43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus43FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus43FocusLost(evt);
            }
        });
        plus43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus43MouseClicked(evt);
            }
        });
        jPanel2.add(plus43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1180, 40, 40));

        plus44.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus44.setForeground(new java.awt.Color(255, 255, 255));
        plus44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus44.setText("+");
        plus44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus44MouseClicked(evt);
            }
        });
        jPanel2.add(plus44, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1180, 40, 40));

        plus45.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus45.setForeground(new java.awt.Color(255, 255, 255));
        plus45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus45.setText("+");
        plus45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus45MouseClicked(evt);
            }
        });
        jPanel2.add(plus45, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1180, 40, 40));

        plus46.setBackground(new java.awt.Color(255, 255, 255));
        plus46.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus46.setForeground(new java.awt.Color(255, 255, 255));
        plus46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus46.setText("+");
        plus46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus46FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus46FocusLost(evt);
            }
        });
        plus46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus46MouseClicked(evt);
            }
        });
        jPanel2.add(plus46, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1390, 40, 40));

        plus47.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus47.setForeground(new java.awt.Color(255, 255, 255));
        plus47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus47.setText("+");
        plus47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus47MouseClicked(evt);
            }
        });
        jPanel2.add(plus47, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1390, 40, 40));

        plus48.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus48.setForeground(new java.awt.Color(255, 255, 255));
        plus48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus48.setText("+");
        plus48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus48MouseClicked(evt);
            }
        });
        jPanel2.add(plus48, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1390, 40, 40));

        plus49.setBackground(new java.awt.Color(255, 255, 255));
        plus49.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus49.setForeground(new java.awt.Color(255, 255, 255));
        plus49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus49.setText("+");
        plus49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus49FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus49FocusLost(evt);
            }
        });
        plus49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus49MouseClicked(evt);
            }
        });
        jPanel2.add(plus49, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1600, 40, 40));

        plus50.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus50.setForeground(new java.awt.Color(255, 255, 255));
        plus50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus50.setText("+");
        plus50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus50MouseClicked(evt);
            }
        });
        jPanel2.add(plus50, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1600, 40, 40));

        plus51.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus51.setForeground(new java.awt.Color(255, 255, 255));
        plus51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus51.setText("+");
        plus51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus51MouseClicked(evt);
            }
        });
        jPanel2.add(plus51, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1600, 40, 40));

        plus52.setBackground(new java.awt.Color(255, 255, 255));
        plus52.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus52.setForeground(new java.awt.Color(255, 255, 255));
        plus52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus52.setText("+");
        plus52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus52.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus52FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus52FocusLost(evt);
            }
        });
        plus52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus52MouseClicked(evt);
            }
        });
        jPanel2.add(plus52, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1810, 40, 40));

        plus53.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus53.setForeground(new java.awt.Color(255, 255, 255));
        plus53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus53.setText("+");
        plus53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus53MouseClicked(evt);
            }
        });
        jPanel2.add(plus53, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1810, 40, 40));

        plus54.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus54.setForeground(new java.awt.Color(255, 255, 255));
        plus54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus54.setText("+");
        plus54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus54MouseClicked(evt);
            }
        });
        jPanel2.add(plus54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1810, 40, 40));

        plus55.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus55.setForeground(new java.awt.Color(255, 255, 255));
        plus55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus55.setText("+");
        plus55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus55MouseClicked(evt);
            }
        });
        jPanel2.add(plus55, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 2020, 40, 40));

        plus56.setBackground(new java.awt.Color(255, 255, 255));
        plus56.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus56.setForeground(new java.awt.Color(255, 255, 255));
        plus56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus56.setText("+");
        plus56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus56.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus56FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus56FocusLost(evt);
            }
        });
        plus56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus56MouseClicked(evt);
            }
        });
        jPanel2.add(plus56, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2020, 40, 40));

        plus57.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus57.setForeground(new java.awt.Color(255, 255, 255));
        plus57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus57.setText("+");
        plus57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus57MouseClicked(evt);
            }
        });
        jPanel2.add(plus57, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 2020, 40, 40));

        plus58.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus58.setForeground(new java.awt.Color(255, 255, 255));
        plus58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus58.setText("+");
        plus58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus58MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plus58MouseEntered(evt);
            }
        });
        jPanel2.add(plus58, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 2230, 40, 40));

        plus59.setBackground(new java.awt.Color(255, 255, 255));
        plus59.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        plus59.setForeground(new java.awt.Color(255, 255, 255));
        plus59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus59.setText("+");
        plus59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plus59.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plus59FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                plus59FocusLost(evt);
            }
        });
        plus59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus59MouseClicked(evt);
            }
        });
        jPanel2.add(plus59, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 2230, 40, 40));

        food1.setBackground(new java.awt.Color(255, 245, 230));
        food1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food1.setOpaque(true);
        jPanel2.add(food1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, 140));

        food2.setBackground(new java.awt.Color(255, 245, 230));
        food2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food2.setOpaque(true);
        jPanel2.add(food2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 140, 140));

        food3.setBackground(new java.awt.Color(255, 245, 230));
        food3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food3.setOpaque(true);
        jPanel2.add(food3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 140, 140));

        food4.setBackground(new java.awt.Color(255, 245, 230));
        food4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food4.setOpaque(true);
        jPanel2.add(food4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 140));

        food5.setBackground(new java.awt.Color(255, 245, 230));
        food5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food5.setOpaque(true);
        jPanel2.add(food5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 140, 140));

        food6.setBackground(new java.awt.Color(255, 245, 230));
        food6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food6.setOpaque(true);
        jPanel2.add(food6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, 140));

        food7.setBackground(new java.awt.Color(255, 245, 230));
        food7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food7.setOpaque(true);
        jPanel2.add(food7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 140, 140));

        food8.setBackground(new java.awt.Color(255, 245, 230));
        food8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food8.setOpaque(true);
        jPanel2.add(food8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 140, 140));

        food9.setBackground(new java.awt.Color(255, 245, 230));
        food9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food9.setOpaque(true);
        jPanel2.add(food9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 140, 140));

        food32.setBackground(new java.awt.Color(255, 245, 230));
        food32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food32.setOpaque(true);
        jPanel2.add(food32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 140, 140));

        food33.setBackground(new java.awt.Color(255, 245, 230));
        food33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food33.setOpaque(true);
        jPanel2.add(food33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 140, 140));

        food34.setBackground(new java.awt.Color(255, 245, 230));
        food34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food34.setOpaque(true);
        jPanel2.add(food34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 140, 140));

        food35.setBackground(new java.awt.Color(255, 245, 230));
        food35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food35.setOpaque(true);
        jPanel2.add(food35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 880, 140, 140));

        food36.setBackground(new java.awt.Color(255, 245, 230));
        food36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food36.setOpaque(true);
        jPanel2.add(food36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 880, 140, 140));

        food37.setBackground(new java.awt.Color(255, 245, 230));
        food37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food37.setOpaque(true);
        jPanel2.add(food37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 880, 140, 140));

        food38.setBackground(new java.awt.Color(255, 245, 230));
        food38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food38.setOpaque(true);
        jPanel2.add(food38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1090, 140, 140));

        food39.setBackground(new java.awt.Color(255, 245, 230));
        food39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food39.setOpaque(true);
        jPanel2.add(food39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1090, 140, 140));

        food40.setBackground(new java.awt.Color(255, 245, 230));
        food40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food40.setOpaque(true);
        jPanel2.add(food40, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1090, 140, 140));

        food41.setBackground(new java.awt.Color(255, 245, 230));
        food41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food41.setOpaque(true);
        jPanel2.add(food41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1300, 140, 140));

        food42.setBackground(new java.awt.Color(255, 245, 230));
        food42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food42.setOpaque(true);
        jPanel2.add(food42, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1300, 140, 140));

        food43.setBackground(new java.awt.Color(255, 245, 230));
        food43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food43.setOpaque(true);
        jPanel2.add(food43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1300, 140, 140));

        food44.setBackground(new java.awt.Color(255, 245, 230));
        food44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food44.setOpaque(true);
        jPanel2.add(food44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1510, 140, 140));

        food45.setBackground(new java.awt.Color(255, 245, 230));
        food45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food45.setOpaque(true);
        jPanel2.add(food45, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1510, 140, 140));

        food46.setBackground(new java.awt.Color(255, 245, 230));
        food46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food46.setOpaque(true);
        jPanel2.add(food46, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1510, 140, 140));

        food47.setBackground(new java.awt.Color(255, 245, 230));
        food47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food47.setOpaque(true);
        jPanel2.add(food47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1720, 140, 140));

        food48.setBackground(new java.awt.Color(255, 245, 230));
        food48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food48.setOpaque(true);
        jPanel2.add(food48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1720, 140, 140));

        food49.setBackground(new java.awt.Color(255, 245, 230));
        food49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food49.setOpaque(true);
        jPanel2.add(food49, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1720, 140, 140));

        food50.setBackground(new java.awt.Color(255, 245, 230));
        food50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food50.setOpaque(true);
        jPanel2.add(food50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1930, 140, 140));

        food51.setBackground(new java.awt.Color(255, 245, 230));
        food51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food51.setOpaque(true);
        jPanel2.add(food51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1930, 140, 140));

        food52.setBackground(new java.awt.Color(255, 245, 230));
        food52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food52.setOpaque(true);
        jPanel2.add(food52, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1930, 140, 140));

        food53.setBackground(new java.awt.Color(255, 245, 230));
        food53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food53.setOpaque(true);
        jPanel2.add(food53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2140, 140, 140));

        food54.setBackground(new java.awt.Color(255, 245, 230));
        food54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        food54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greenbg.png"))); // NOI18N
        food54.setOpaque(true);
        jPanel2.add(food54, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2140, 140, 140));

        foodname33.setBackground(new java.awt.Color(255, 255, 255));
        foodname33.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname33.setForeground(new java.awt.Color(0, 0, 0));
        foodname33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname33.setText("White Rice");
        foodname33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname33.setOpaque(true);
        jPanel2.add(foodname33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1900, 140, 30));

        foodname34.setBackground(new java.awt.Color(255, 255, 255));
        foodname34.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname34.setForeground(new java.awt.Color(0, 0, 0));
        foodname34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname34.setText("Salmon");
        foodname34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname34.setOpaque(true);
        jPanel2.add(foodname34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1900, 140, 30));

        foodname35.setBackground(new java.awt.Color(255, 255, 255));
        foodname35.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname35.setForeground(new java.awt.Color(0, 0, 0));
        foodname35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname35.setText("Squash");
        foodname35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname35.setOpaque(true);
        jPanel2.add(foodname35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2110, 140, 30));

        foodname36.setBackground(new java.awt.Color(255, 255, 255));
        foodname36.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname36.setForeground(new java.awt.Color(0, 0, 0));
        foodname36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname36.setText("Yogurt");
        foodname36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname36.setOpaque(true);
        jPanel2.add(foodname36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2110, 140, 30));

        foodname37.setBackground(new java.awt.Color(255, 255, 255));
        foodname37.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname37.setForeground(new java.awt.Color(0, 0, 0));
        foodname37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname37.setText("Tofu");
        foodname37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname37.setOpaque(true);
        jPanel2.add(foodname37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1900, 140, 30));

        foodname28.setBackground(new java.awt.Color(255, 255, 255));
        foodname28.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname28.setForeground(new java.awt.Color(0, 0, 0));
        foodname28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname28.setText("Peanuts");
        foodname28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname28.setOpaque(true);
        jPanel2.add(foodname28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1270, 140, 30));

        foodname29.setBackground(new java.awt.Color(255, 255, 255));
        foodname29.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname29.setForeground(new java.awt.Color(0, 0, 0));
        foodname29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname29.setText("Bangus");
        foodname29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname29.setOpaque(true);
        jPanel2.add(foodname29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1690, 140, 30));

        foodname30.setBackground(new java.awt.Color(255, 255, 255));
        foodname30.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname30.setForeground(new java.awt.Color(0, 0, 0));
        foodname30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname30.setText("Potato");
        foodname30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname30.setOpaque(true);
        jPanel2.add(foodname30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1480, 140, 30));

        foodname31.setBackground(new java.awt.Color(255, 255, 255));
        foodname31.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname31.setForeground(new java.awt.Color(0, 0, 0));
        foodname31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname31.setText("Pear");
        foodname31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname31.setOpaque(true);
        jPanel2.add(foodname31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1480, 140, 30));

        foodname32.setBackground(new java.awt.Color(255, 255, 255));
        foodname32.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname32.setForeground(new java.awt.Color(0, 0, 0));
        foodname32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname32.setText("Oats");
        foodname32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname32.setOpaque(true);
        jPanel2.add(foodname32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1270, 140, 30));

        foodname19.setBackground(new java.awt.Color(255, 255, 255));
        foodname19.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname19.setForeground(new java.awt.Color(0, 0, 0));
        foodname19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname19.setText("Sweet Potatoes");
        foodname19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname19.setOpaque(true);
        jPanel2.add(foodname19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1690, 140, 30));

        foodname20.setBackground(new java.awt.Color(255, 255, 255));
        foodname20.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname20.setForeground(new java.awt.Color(0, 0, 0));
        foodname20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname20.setText("Pork");
        foodname20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname20.setOpaque(true);
        jPanel2.add(foodname20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1480, 140, 30));

        foodname21.setBackground(new java.awt.Color(255, 255, 255));
        foodname21.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname21.setForeground(new java.awt.Color(0, 0, 0));
        foodname21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname21.setText("Mango");
        foodname21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname21.setOpaque(true);
        jPanel2.add(foodname21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1270, 140, 30));

        foodname22.setBackground(new java.awt.Color(255, 255, 255));
        foodname22.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname22.setForeground(new java.awt.Color(0, 0, 0));
        foodname22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname22.setText("Tuna");
        foodname22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname22.setOpaque(true);
        jPanel2.add(foodname22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1690, 140, 30));

        foodname23.setBackground(new java.awt.Color(255, 255, 255));
        foodname23.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname23.setForeground(new java.awt.Color(0, 0, 0));
        foodname23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname23.setText("Egg");
        foodname23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname23.setOpaque(true);
        jPanel2.add(foodname23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1270, 140, 30));

        foodname24.setBackground(new java.awt.Color(255, 255, 255));
        foodname24.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname24.setForeground(new java.awt.Color(0, 0, 0));
        foodname24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname24.setText("Egg");
        foodname24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname24.setOpaque(true);
        jPanel2.add(foodname24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1690, 140, 30));

        foodname25.setBackground(new java.awt.Color(255, 255, 255));
        foodname25.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname25.setForeground(new java.awt.Color(0, 0, 0));
        foodname25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname25.setText("Egg");
        foodname25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname25.setOpaque(true);
        jPanel2.add(foodname25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1480, 140, 30));

        foodname26.setBackground(new java.awt.Color(255, 255, 255));
        foodname26.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname26.setForeground(new java.awt.Color(0, 0, 0));
        foodname26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname26.setText("Egg");
        foodname26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname26.setOpaque(true);
        jPanel2.add(foodname26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1480, 140, 30));

        foodname27.setBackground(new java.awt.Color(255, 255, 255));
        foodname27.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname27.setForeground(new java.awt.Color(0, 0, 0));
        foodname27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname27.setText("Egg");
        foodname27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname27.setOpaque(true);
        jPanel2.add(foodname27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1270, 140, 30));

        foodname10.setBackground(new java.awt.Color(255, 255, 255));
        foodname10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname10.setForeground(new java.awt.Color(0, 0, 0));
        foodname10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname10.setText("Chia Seeds");
        foodname10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname10.setOpaque(true);
        jPanel2.add(foodname10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1060, 140, 30));

        foodname11.setBackground(new java.awt.Color(255, 255, 255));
        foodname11.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname11.setForeground(new java.awt.Color(0, 0, 0));
        foodname11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname11.setText("Chicken");
        foodname11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname11.setOpaque(true);
        jPanel2.add(foodname11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1060, 140, 30));

        foodname12.setBackground(new java.awt.Color(255, 255, 255));
        foodname12.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname12.setForeground(new java.awt.Color(0, 0, 0));
        foodname12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname12.setText("Kangkong");
        foodname12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname12.setOpaque(true);
        jPanel2.add(foodname12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1060, 140, 30));

        foodname13.setBackground(new java.awt.Color(255, 255, 255));
        foodname13.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname13.setForeground(new java.awt.Color(0, 0, 0));
        foodname13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname13.setText("Brown Rice");
        foodname13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname13.setOpaque(true);
        jPanel2.add(foodname13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 140, 30));

        foodname14.setBackground(new java.awt.Color(255, 255, 255));
        foodname14.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname14.setForeground(new java.awt.Color(0, 0, 0));
        foodname14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname14.setText("Carrot");
        foodname14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname14.setOpaque(true);
        jPanel2.add(foodname14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 850, 140, 30));

        foodname15.setBackground(new java.awt.Color(255, 255, 255));
        foodname15.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname15.setForeground(new java.awt.Color(0, 0, 0));
        foodname15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname15.setText("Cashew");
        foodname15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname15.setOpaque(true);
        jPanel2.add(foodname15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 850, 140, 30));

        foodname16.setBackground(new java.awt.Color(255, 255, 255));
        foodname16.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname16.setForeground(new java.awt.Color(0, 0, 0));
        foodname16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname16.setText("Almond");
        foodname16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname16.setOpaque(true);
        jPanel2.add(foodname16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 140, 30));

        foodname17.setBackground(new java.awt.Color(255, 255, 255));
        foodname17.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname17.setForeground(new java.awt.Color(0, 0, 0));
        foodname17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname17.setText("Avocado");
        foodname17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname17.setOpaque(true);
        jPanel2.add(foodname17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 140, 30));

        foodname18.setBackground(new java.awt.Color(255, 255, 255));
        foodname18.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname18.setForeground(new java.awt.Color(0, 0, 0));
        foodname18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname18.setText("Beef");
        foodname18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname18.setOpaque(true);
        jPanel2.add(foodname18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 140, 30));

        foodname7.setBackground(new java.awt.Color(255, 255, 255));
        foodname7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname7.setForeground(new java.awt.Color(0, 0, 0));
        foodname7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname7.setText("Bread");
        foodname7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname7.setOpaque(true);
        jPanel2.add(foodname7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 140, 30));

        foodname8.setBackground(new java.awt.Color(255, 255, 255));
        foodname8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname8.setForeground(new java.awt.Color(0, 0, 0));
        foodname8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname8.setText("Cheese");
        foodname8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname8.setOpaque(true);
        jPanel2.add(foodname8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 140, 30));

        foodname9.setBackground(new java.awt.Color(255, 255, 255));
        foodname9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname9.setForeground(new java.awt.Color(0, 0, 0));
        foodname9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname9.setText("Pasta");
        foodname9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname9.setOpaque(true);
        jPanel2.add(foodname9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 140, 30));

        foodname4.setBackground(new java.awt.Color(255, 255, 255));
        foodname4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname4.setForeground(new java.awt.Color(0, 0, 0));
        foodname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname4.setText("Banana");
        foodname4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname4.setOpaque(true);
        jPanel2.add(foodname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 30));

        foodname5.setBackground(new java.awt.Color(255, 255, 255));
        foodname5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname5.setForeground(new java.awt.Color(0, 0, 0));
        foodname5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname5.setText("Corn");
        foodname5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname5.setOpaque(true);
        jPanel2.add(foodname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 140, 30));

        foodname6.setBackground(new java.awt.Color(255, 255, 255));
        foodname6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname6.setForeground(new java.awt.Color(0, 0, 0));
        foodname6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname6.setText("Orange");
        foodname6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname6.setOpaque(true);
        jPanel2.add(foodname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 140, 30));

        foodname1.setBackground(new java.awt.Color(255, 255, 255));
        foodname1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname1.setForeground(new java.awt.Color(0, 0, 0));
        foodname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname1.setText("Egg");
        foodname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname1.setOpaque(true);
        jPanel2.add(foodname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        foodname2.setBackground(new java.awt.Color(255, 255, 255));
        foodname2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname2.setForeground(new java.awt.Color(0, 0, 0));
        foodname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname2.setText("Apple");
        foodname2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname2.setOpaque(true);
        jPanel2.add(foodname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 140, 30));

        foodname3.setBackground(new java.awt.Color(255, 255, 255));
        foodname3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        foodname3.setForeground(new java.awt.Color(0, 0, 0));
        foodname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodname3.setText("Milk");
        foodname3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        foodname3.setOpaque(true);
        jPanel2.add(foodname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, 30));

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 620, 590));
        jScrollPane1.getAccessibleContext().setAccessibleName("");

        bmiimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bmiimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bmi.png"))); // NOI18N
        add(bmiimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 150, 150));

        bmitext.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        bmitext.setForeground(new java.awt.Color(5, 75, 40));
        bmitext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bmitext.setText("BMI: " + BMICalculator.getBMI());
        bmitext.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bmitextPropertyChange(evt);
            }
        });
        add(bmitext, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 150, -1));

        budget.setBackground(new java.awt.Color(255, 255, 255));
        budget.setForeground(new java.awt.Color(0, 0, 0));
        budget.setText(String.valueOf(User.getBudget()));
        budget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        budget.setOpaque(true);
        add(budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 90, 20));

        goaltext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        goaltext.setForeground(new java.awt.Color(5, 75, 40));
        goaltext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        goaltext.setText("Calories:");
        goaltext.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(goaltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 130, 30));

        budgettext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        budgettext.setForeground(new java.awt.Color(5, 75, 40));
        budgettext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        budgettext.setText("Budget");
        budgettext.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(budgettext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 130, 40));

        caloriesintake.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        caloriesintake.setForeground(new java.awt.Color(5, 75, 40));
        caloriesintake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caloriesintake.setText("Calories Intake");
        add(caloriesintake, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 150, -1));

        caloriesbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calorieintake.png"))); // NOI18N
        caloriesbar.setText("jLabel2");
        add(caloriesbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 150, 30));

        phsign.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        phsign.setForeground(new java.awt.Color(0, 0, 0));
        phsign.setText("₱");
        add(phsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 30, 20));

        cart.setBackground(new java.awt.Color(255, 255, 255));
        cart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        cart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cart.setOpaque(true);
        cart.setPreferredSize(new java.awt.Dimension(70, 70));
        cart.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                cartHierarchyChanged(evt);
            }
        });
        cart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cartFocusLost(evt);
            }
        });
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartMouseExited(evt);
            }
        });
        add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 60, 50));

        caloriesnum.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        caloriesnum.setForeground(new java.awt.Color(0, 0, 0));
        caloriesnum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caloriesnum.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        caloriesnum.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                caloriesnumPropertyChange(evt);
            }
        });
        add(caloriesnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 130, 30));

        cartquantity.setBackground(new java.awt.Color(255, 255, 255));
        cartquantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartquantity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cartquantity.setOpaque(true);
        add(cartquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 55, 60, 20));

        progressbar.setBackground(new java.awt.Color(255, 255, 255));
        progressbar.setForeground(new java.awt.Color(255, 255, 255));
        progressbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 130, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void plus1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus1FocusGained
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_plus1FocusGained

    private void plus1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus1FocusLost

    private void plus3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus3FocusGained

    private void plus3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus3FocusLost

    private void plus2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus2FocusGained

    private void plus2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus2FocusLost

    private void plus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus2MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_plus2MouseClicked

    private void plus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus3MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_plus3MouseClicked

    private void plus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus1MouseClicked
        /*
        Food food = new Food();
                food.addFood("Egg", 7, 10);
                plus1.setForeground(new Color(66, 219, 55));

                try {
                    Timer timer = new Timer(100, e -> plus1.setForeground(new Color(154, 184, 181)));
                    timer.setRepeats(false); // Run only once
                    timer.start();
                }catch (Exception e) {
                    System.out.println("Error: " + e);
                }*/
    }//GEN-LAST:event_plus1MouseClicked

    private void plus4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus4FocusGained
      
    }//GEN-LAST:event_plus4FocusGained

    private void plus4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus4FocusLost

    private void plus4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus4MouseClicked

    }//GEN-LAST:event_plus4MouseClicked

    private void plus5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus5FocusGained

    private void plus5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus5FocusLost

    private void plus5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus5MouseClicked

    }//GEN-LAST:event_plus5MouseClicked

    private void plus6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus6FocusGained

    private void plus6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus6FocusLost

    private void plus6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus6MouseClicked

    }//GEN-LAST:event_plus6MouseClicked

    private void plus7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus7FocusGained

    private void plus7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus7FocusLost

    private void plus7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus7MouseClicked

    }//GEN-LAST:event_plus7MouseClicked

    private void plus9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus9MouseClicked

    }//GEN-LAST:event_plus9MouseClicked

    private void plus8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus8MouseClicked

    }//GEN-LAST:event_plus8MouseClicked

    private void plus36FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus36FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus36FocusGained

    private void plus36FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus36FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus36FocusLost

    private void plus36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus36MouseClicked

    }//GEN-LAST:event_plus36MouseClicked

    private void plus37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus37MouseClicked

    }//GEN-LAST:event_plus37MouseClicked

    private void plus38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus38MouseClicked

    }//GEN-LAST:event_plus38MouseClicked

    private void plus39FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus39FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus39FocusGained

    private void plus39FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus39FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus39FocusLost

    private void plus39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus39MouseClicked

    }//GEN-LAST:event_plus39MouseClicked

    private void plus41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus41MouseClicked

    }//GEN-LAST:event_plus41MouseClicked

    private void plus42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus42MouseClicked

    }//GEN-LAST:event_plus42MouseClicked

    private void plus43FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus43FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus43FocusGained

    private void plus43FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus43FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus43FocusLost

    private void plus43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus43MouseClicked

    }//GEN-LAST:event_plus43MouseClicked

    private void plus44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus44MouseClicked

    }//GEN-LAST:event_plus44MouseClicked

    private void plus45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus45MouseClicked

    }//GEN-LAST:event_plus45MouseClicked

    private void plus46FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus46FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus46FocusGained

    private void plus46FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus46FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus46FocusLost

    private void plus46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus46MouseClicked

    }//GEN-LAST:event_plus46MouseClicked

    private void plus47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus47MouseClicked

    }//GEN-LAST:event_plus47MouseClicked

    private void plus48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus48MouseClicked

    }//GEN-LAST:event_plus48MouseClicked

    private void plus49FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus49FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus49FocusGained

    private void plus49FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus49FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus49FocusLost

    private void plus49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus49MouseClicked

    }//GEN-LAST:event_plus49MouseClicked

    private void plus50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus50MouseClicked

    }//GEN-LAST:event_plus50MouseClicked

    private void plus51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus51MouseClicked

    }//GEN-LAST:event_plus51MouseClicked

    private void plus52FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus52FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus52FocusGained

    private void plus52FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus52FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus52FocusLost

    private void plus52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus52MouseClicked

    }//GEN-LAST:event_plus52MouseClicked

    private void plus53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus53MouseClicked

    }//GEN-LAST:event_plus53MouseClicked

    private void plus54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus54MouseClicked

    }//GEN-LAST:event_plus54MouseClicked

    private void plus55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus55MouseClicked

    }//GEN-LAST:event_plus55MouseClicked

    private void plus56FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus56FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus56FocusGained

    private void plus56FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus56FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus56FocusLost

    private void plus56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus56MouseClicked

    }//GEN-LAST:event_plus56MouseClicked

    private void plus57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus57MouseClicked

    }//GEN-LAST:event_plus57MouseClicked

    private void plus58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus58MouseClicked

    }//GEN-LAST:event_plus58MouseClicked

    private void plus59FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus59FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_plus59FocusGained

    private void plus59FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plus59FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_plus59FocusLost

    private void plus59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus59MouseClicked

    }//GEN-LAST:event_plus59MouseClicked

    private void plus58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus58MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_plus58MouseEntered

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        frame.dispose();
        cartTable = Cart.getInstance();
        if (!cartTable.isVisible()) {
            cartTable.setVisible(true); // Show the Cart frame
        } else {
            cartTable.setVisible(true);
            cartTable.toFront(); // Bring the existing Cart frame to the front
        }
        // Cart carttable = new Cart();
        //carttable.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cartMouseClicked

    private void cartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseEntered
        cart.setBackground(new Color(0xCCCCCC));
        // TODO add your handling code here:
    }//GEN-LAST:event_cartMouseEntered

    private void cartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseExited
        cart.setBackground(new Color(255, 255, 255));
        // TODO add your handling code here:
    }//GEN-LAST:event_cartMouseExited

    private void cartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cartFocusLost
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cartFocusLost

    private void cartHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_cartHierarchyChanged

    }//GEN-LAST:event_cartHierarchyChanged

    private void plus1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus1MouseEntered
        //plus1.setForeground(new Color(154, 184, 181));
        // TODO add your handling code here:
    }//GEN-LAST:event_plus1MouseEntered

    private void plus1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus1MouseExited
        //plus1.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_plus1MouseExited

    private void bmitextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bmitextPropertyChange
        
    }//GEN-LAST:event_bmitextPropertyChange

    private void caloriesnumPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_caloriesnumPropertyChange

    }//GEN-LAST:event_caloriesnumPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apple;
    private javax.swing.JLabel banana;
    private javax.swing.JLabel bmiimg;
    private javax.swing.JLabel bmitext;
    private javax.swing.JLabel bread;
    private javax.swing.JLabel bread10;
    private javax.swing.JLabel bread5;
    private javax.swing.JLabel bread6;
    private javax.swing.JLabel bread7;
    private javax.swing.JLabel bread8;
    private javax.swing.JLabel bread9;
    private javax.swing.JLabel brocolli;
    private javax.swing.JLabel budget;
    private javax.swing.JLabel budgettext;
    private javax.swing.JLabel caloriesbar;
    private javax.swing.JLabel caloriesintake;
    private javax.swing.JLabel caloriesnum;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel cartquantity;
    private javax.swing.JLabel cheese;
    private javax.swing.JLabel cheese10;
    private javax.swing.JLabel cheese11;
    private javax.swing.JLabel cheese4;
    private javax.swing.JLabel cheese5;
    private javax.swing.JLabel cheese6;
    private javax.swing.JLabel cheese7;
    private javax.swing.JLabel cheese8;
    private javax.swing.JLabel cheese9;
    private javax.swing.JLabel egg;
    private javax.swing.JLabel food1;
    private javax.swing.JLabel food2;
    private javax.swing.JLabel food3;
    private javax.swing.JLabel food32;
    private javax.swing.JLabel food33;
    private javax.swing.JLabel food34;
    private javax.swing.JLabel food35;
    private javax.swing.JLabel food36;
    private javax.swing.JLabel food37;
    private javax.swing.JLabel food38;
    private javax.swing.JLabel food39;
    private javax.swing.JLabel food4;
    private javax.swing.JLabel food40;
    private javax.swing.JLabel food41;
    private javax.swing.JLabel food42;
    private javax.swing.JLabel food43;
    private javax.swing.JLabel food44;
    private javax.swing.JLabel food45;
    private javax.swing.JLabel food46;
    private javax.swing.JLabel food47;
    private javax.swing.JLabel food48;
    private javax.swing.JLabel food49;
    private javax.swing.JLabel food5;
    private javax.swing.JLabel food50;
    private javax.swing.JLabel food51;
    private javax.swing.JLabel food52;
    private javax.swing.JLabel food53;
    private javax.swing.JLabel food54;
    private javax.swing.JLabel food6;
    private javax.swing.JLabel food7;
    private javax.swing.JLabel food8;
    private javax.swing.JLabel food9;
    private javax.swing.JLabel foodname1;
    private javax.swing.JLabel foodname10;
    private javax.swing.JLabel foodname11;
    private javax.swing.JLabel foodname12;
    private javax.swing.JLabel foodname13;
    private javax.swing.JLabel foodname14;
    private javax.swing.JLabel foodname15;
    private javax.swing.JLabel foodname16;
    private javax.swing.JLabel foodname17;
    private javax.swing.JLabel foodname18;
    private javax.swing.JLabel foodname19;
    private javax.swing.JLabel foodname2;
    private javax.swing.JLabel foodname20;
    private javax.swing.JLabel foodname21;
    private javax.swing.JLabel foodname22;
    private javax.swing.JLabel foodname23;
    private javax.swing.JLabel foodname24;
    private javax.swing.JLabel foodname25;
    private javax.swing.JLabel foodname26;
    private javax.swing.JLabel foodname27;
    private javax.swing.JLabel foodname28;
    private javax.swing.JLabel foodname29;
    private javax.swing.JLabel foodname3;
    private javax.swing.JLabel foodname30;
    private javax.swing.JLabel foodname31;
    private javax.swing.JLabel foodname32;
    private javax.swing.JLabel foodname33;
    private javax.swing.JLabel foodname34;
    private javax.swing.JLabel foodname35;
    private javax.swing.JLabel foodname36;
    private javax.swing.JLabel foodname37;
    private javax.swing.JLabel foodname4;
    private javax.swing.JLabel foodname5;
    private javax.swing.JLabel foodname6;
    private javax.swing.JLabel foodname7;
    private javax.swing.JLabel foodname8;
    private javax.swing.JLabel foodname9;
    private javax.swing.JLabel goaltext;
    private javax.swing.JLabel greeting;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel milk;
    private javax.swing.JLabel orange;
    private javax.swing.JLabel pasta;
    private javax.swing.JLabel pasta10;
    private javax.swing.JLabel pasta11;
    private javax.swing.JLabel pasta12;
    private javax.swing.JLabel pasta4;
    private javax.swing.JLabel pasta5;
    private javax.swing.JLabel pasta6;
    private javax.swing.JLabel pasta7;
    private javax.swing.JLabel pasta8;
    private javax.swing.JLabel pasta9;
    private javax.swing.JLabel phsign;
    private javax.swing.JLabel plus1;
    private javax.swing.JLabel plus2;
    private javax.swing.JLabel plus3;
    private javax.swing.JLabel plus36;
    private javax.swing.JLabel plus37;
    private javax.swing.JLabel plus38;
    private javax.swing.JLabel plus39;
    private javax.swing.JLabel plus4;
    private javax.swing.JLabel plus41;
    private javax.swing.JLabel plus42;
    private javax.swing.JLabel plus43;
    private javax.swing.JLabel plus44;
    private javax.swing.JLabel plus45;
    private javax.swing.JLabel plus46;
    private javax.swing.JLabel plus47;
    private javax.swing.JLabel plus48;
    private javax.swing.JLabel plus49;
    private javax.swing.JLabel plus5;
    private javax.swing.JLabel plus50;
    private javax.swing.JLabel plus51;
    private javax.swing.JLabel plus52;
    private javax.swing.JLabel plus53;
    private javax.swing.JLabel plus54;
    private javax.swing.JLabel plus55;
    private javax.swing.JLabel plus56;
    private javax.swing.JLabel plus57;
    private javax.swing.JLabel plus58;
    private javax.swing.JLabel plus59;
    private javax.swing.JLabel plus6;
    private javax.swing.JLabel plus7;
    private javax.swing.JLabel plus8;
    private javax.swing.JLabel plus9;
    private javax.swing.JLabel price;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price10;
    private javax.swing.JLabel price11;
    private javax.swing.JLabel price12;
    private javax.swing.JLabel price13;
    private javax.swing.JLabel price14;
    private javax.swing.JLabel price15;
    private javax.swing.JLabel price16;
    private javax.swing.JLabel price17;
    private javax.swing.JLabel price18;
    private javax.swing.JLabel price19;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price20;
    private javax.swing.JLabel price21;
    private javax.swing.JLabel price22;
    private javax.swing.JLabel price23;
    private javax.swing.JLabel price24;
    private javax.swing.JLabel price25;
    private javax.swing.JLabel price26;
    private javax.swing.JLabel price27;
    private javax.swing.JLabel price28;
    private javax.swing.JLabel price29;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel price30;
    private javax.swing.JLabel price31;
    private javax.swing.JLabel price4;
    private javax.swing.JLabel price5;
    private javax.swing.JLabel price6;
    private javax.swing.JLabel price7;
    private javax.swing.JLabel price8;
    private javax.swing.JLabel price9;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables
    private Cart cartTable;
}
