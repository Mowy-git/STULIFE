package stulife;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Mowy
 */
public class MealPlanUnderweight extends javax.swing.JPanel {
    private User user;
    /**
     * Creates new form Content3
     */
    public MealPlanUnderweight() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        update();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bmiimg = new javax.swing.JLabel();
        budgettext = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        caloriesnum = new javax.swing.JLabel();
        goaltext = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        caloriesbar = new javax.swing.JLabel();
        caloriesintake = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phsign = new javax.swing.JLabel();
        bmitext = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 2000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("<html>\n<head>\n    <style>\n        body {\n            font-family: Arial, sans-serif;\n            line-height: 1.6;\n        }\n        h1, h2, h3 {\n            color: #333;\n        }\n        ul {\n            padding-left: 20px;\n        }\n        .meal-section {\n            margin-bottom: 40px;\n        }\n    </style>\n</head>\n<body>\n    <h1>BMI: Normal (18.5–24.9)</h1>\n    <p>For individuals with a BMI in the normal range, the goal is typically to maintain weight, focusing on balanced nutrition.</p>\n\n    <div class=\"meal-section\">\n        <h2>Breakfast</h2>\n        <h3>Omelet with Tuyo (Dried Fish) and Tomatoes</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>2 eggs: 140 kcal, 12g protein</li>\n            <li>1 small tomato: 22 kcal, 1g protein</li>\n            <li>1 small dried fish (tuyo): 35 kcal, 6g protein</li>\n            <li>1 tsp vegetable oil (for cooking): 40 kcal, 0g protein</li>\n        </ul>\n        <p><strong>Total:</strong> 19g protein, 237 calories.</p>\n\n        <h3>Lugaw (Rice Porridge with Chicken)</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>1/2 cup cooked rice: 102 kcal, 2g protein</li>\n            <li>100g chicken breast: 165 kcal, 31g protein</li>\n            <li>1 clove garlic: 4 kcal, 0.2g protein</li>\n            <li>1/2 small onion: 20 kcal, 0.5g protein</li>\n            <li>1 tsp fish sauce: 5 kcal, 1g protein</li>\n            <li>1 tsp vegetable oil: 40 kcal, 0g protein</li>\n            <li>1 tbsp ginger: 5 kcal, 0.2g protein</li>\n        </ul>\n        <p><strong>Total:</strong> 34.9g protein, 341 calories.</p>\n\n        <h3>Champorado with Milk</h3>\n        <p>Chocolate rice porridge made with tablea, with a bit of evaporated or fresh milk.</p>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>Glutinous Rice (½ cup): ~2g protein, ~180 calories</li>\n            <li>Tablea (30g): ~1g protein, ~160 calories</li>\n            <li>Evaporated Milk (¼ cup): ~2g protein, ~50 calories</li>\n        </ul>\n        <p><strong>Total:</strong> ~5g protein, ~390 calories.</p>\n\n        <h3>Avocado and Egg Pandesal</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>Pandesal (1 roll): ~4g protein, ~130 calories</li>\n            <li>Avocado (¼ fruit): ~1g protein, ~60 calories</li>\n            <li>Boiled Egg (1 large): ~6g protein, ~70 calories</li>\n        </ul>\n        <p><strong>Total:</strong> ~11g protein, ~260 calories.</p>\n    </div>\n\n    <div class=\"meal-section\">\n        <h2>Lunch</h2>\n        <h3>Inihaw na Isda (Grilled Fish) with Achara (Pickled Papaya) and Steamed Rice</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>150g tilapia or bangus: 150 kcal, 30g protein</li>\n            <li>1 tbsp vegetable oil (for grilling fish): 40 kcal, 0g protein</li>\n            <li>1/2 cup steamed rice: 102 kcal, 2g protein</li>\n            <li>1/4 cup achara (pickled papaya): 30 kcal, 1g protein</li>\n        </ul>\n        <p><strong>Total:</strong> 33g protein, 322 calories.</p>\n\n        <h3>Pinakbet (Vegetable Stew with Shrimp Paste)</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>1/2 cup squash (kalabasa): 20 kcal, 0.5g protein</li>\n            <li>1/2 cup eggplant (talong): 20 kcal, 0.5g protein</li>\n            <li>1/2 cup string beans (sitaw): 15 kcal, 1g protein</li>\n            <li>1/2 cup okra: 20 kcal, 1g protein</li>\n            <li>1 small tomato: 22 kcal, 1g protein</li>\n            <li>1/2 small onion: 20 kcal, 0.5g protein</li>\n            <li>1 tbsp shrimp paste (bagoong): 20 kcal, 2g protein</li>\n            <li>1 tbsp vegetable oil: 40 kcal, 0g protein</li>\n        </ul>\n        <p><strong>Total:</strong> 6.5g protein, 177 calories.</p>\n    </div>\n\n    <div class=\"meal-section\">\n        <h2>Dinner</h2>\n        <h3>Chicken Adobo with Brown Rice</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>100g chicken thighs: 185 kcal, 20g protein</li>\n            <li>2 tbsp soy sauce: 20 kcal, 1g protein</li>\n            <li>1 tbsp vinegar: 3 kcal, 0g protein</li>\n            <li>2 cloves garlic: 8 kcal, 0.4g protein</li>\n            <li>1/2 cup brown rice: 110 kcal, 2.5g protein</li>\n            <li>1 tsp vegetable oil (for cooking): 40 kcal, 0g protein</li>\n        </ul>\n        <p><strong>Total:</strong> 23.5g protein.</p>\n    </div>\n\n    <div class=\"meal-section\">\n        <h2>Snacks</h2>\n        <h3>Chicken Adobo Wrap</h3>\n        <h4>Ingredients:</h4>\n        <ul>\n            <li>Shredded Chicken (100g): ~22g protein, ~150 calories</li>\n            <li>Whole-Wheat Tortilla (1): ~4g protein, ~100 calories</li>\n            <li>Lettuce (¼ cup): ~0.5g protein, ~5 calories</li>\n            <li>Cucumber (¼ cup): ~0.5g protein, ~5 calories</li>\n        </ul>\n        <p><strong>Total:</strong> ~27g protein, ~260 calories.</p>\n    </div>\n</body>\n</html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 1800));

        setBackground(new java.awt.Color(255, 245, 230));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bmiimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bmiimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bmi.png"))); // NOI18N
        add(bmiimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 150, 150));

        budgettext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        budgettext.setForeground(new java.awt.Color(5, 75, 40));
        budgettext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        budgettext.setText("Budget");
        budgettext.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(budgettext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 130, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 245, 230));
        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 245, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 2000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 245, 230));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>\n<head>\n<style>\n        body {\n            font-family: Arial, sans-serif;\n            line-height: 1.6;\n            margin: 20px;\n            color: rgb(5, 75, 40);\n        }\n        h1, h2, h3 {\n            color: rgb(5, 75, 40);\n        }\n        ul {\n            margin: 10px 0;\n            padding-left: 20px;\n        }\n        li {\n            margin-bottom: 5px;\n        }\n    </style>\n</head>\n<body>\n    <h1>Underweight (BMI &lt; 18.5)</h1>\n    <p>For individuals with a BMI under 18.5 who need to increase their calorie intake in a healthy way, here's a more affordable approach using inexpensive ingredients:</p>\n\n    <h2>Breakfast</h2>\n    <ul>\n        <li>\n            <h3>Tocilog (Tocino, garlic rice, and a fried egg)</h3>\n            <p>Substitute tocino with cheaper cuts of pork or even chicken, which can be marinated in a sweet-salty soy sauce and sugar mix. Garlic rice is simple and cheap.</p>\n            <ul>\n                <li>100g pork belly (or chicken thigh), marinated in soy sauce, sugar, and vinegar: 250 kcal, 20g protein</li>\n                <li>1 cup garlic rice (cooked): 210 kcal, 4g protein</li>\n                <li>1 large fried egg: 90 kcal, 6g protein</li>\n                <li>1 tsp vegetable oil (for frying): 40 kcal, 0g</li>\n            </ul>\n        </li>\n        <li>\n            <h3>Pancit Canton (stir-fried noodles)</h3>\n            <p>A cheap and filling dish. Use noodles, vegetables (cabbage, carrots), and a protein like egg or leftover meat.</p>\n            <ul>\n                <li>1 pack Pancit Canton noodles (approx. 80g): 320 kcal, 8g</li>\n                <li>1 egg (for protein): 70 kcal, 6g</li>\n                <li>1/4 cup cabbage (sautéed): 10 kcal, 0.5g</li>\n                <li>1/4 cup carrots (sautéed): 12 kcal, 0.5g</li>\n                <li>1 tsp vegetable oil (for stir-frying): 40 kcal, 0g</li>\n                <li>1 tbsp soy sauce: 10 kcal, 1g</li>\n            </ul>\n        </li>\n        <li>\n            <h3>Taho with Granola</h3>\n            <p>Tofu with arnibal syrup, sago, and a sprinkle of granola for added calories.</p>\n            <ul>\n                <li>Tofu (100g): ~8g protein, ~70 calories</li>\n                <li>Arnibal Syrup (2 tbsp): ~50 calories</li>\n                <li>Sago (2 tbsp): ~40 calories</li>\n                <li>Granola (2 tbsp): ~2g protein, ~60 calories</li>\n                <li>Total: ~10g protein, ~220 calories</li>\n            </ul>\n        </li>\n        <li>\n            <h3>Egg and Cheese Pandesal</h3>\n            <p>Toasted pandesal with scrambled eggs and cheese, with an optional spread of avocado if available.</p>\n            <ul>\n                <li>Pandesal (1 roll): ~4g protein, ~130 calories</li>\n                <li>Scrambled Eggs (2 large): ~12g protein, ~140 calories</li>\n                <li>Cheese Slice (1): ~5g protein, ~80 calories</li>\n                <li>Avocado (2 tbsp, optional): ~1g protein, ~50 calories</li>\n                <li>Total: ~21g protein, ~400 calories</li>\n            </ul>\n        </li>\n        <li>\n            <h3>Oatmeal with Peanut Butter and Banana</h3>\n            <p>Cook oats with milk, add banana slices, and a spoon of peanut butter for extra calories.</p>\n            <ul>\n                <li>Oats (½ cup): ~5g protein, ~150 calories</li>\n                <li>Milk (½ cup): ~4g protein, ~50 calories</li>\n                <li>Banana (1 medium): ~1g protein, ~105 calories</li>\n                <li>Peanut Butter (1 tbsp): ~4g protein, ~90 calories</li>\n                <li>Total: ~14g protein, ~395 calories</li>\n            </ul>\n        </li>\n    </ul>\n\n    <h2>Lunch</h2>\n    <ul>\n        <li>\n            <h3>Sinigang na Baboy (Pork sour soup)</h3>\n            <p>Use cheaper cuts of pork like pork belly or even pork neck. Add vegetables like kangkong (water spinach), sitaw (string beans), and labanos (radish).</p>\n            <ul>\n                <li>150g pork belly (or neck): 300 kcal, 22g</li>\n                <li>1/2 cup kangkong (water spinach): 15 kcal, 1g</li>\n                <li>1/2 cup sitaw (string beans): 20 kcal, 1g</li>\n                <li>1/2 cup labanos (radish): 10 kcal, 0.5g</li>\n                <li>1 small onion: 22 kcal, 0.5g</li>\n                <li>1 packet sinigang mix: 25 kcal, 0g</li>\n                <li>1 tsp fish sauce: 5 kcal, 1g</li>\n            </ul>\n        </li>\n        <li>\n            <h3>Tuna Adobo</h3>\n            <p>Canned tuna in oil is an affordable alternative to fresh meat. Cook with soy sauce, vinegar, garlic, and bay leaves.</p>\n            <ul>\n                <li>1 can tuna in oil (160g): 220 kcal, 32g</li>\n                <li>2 tbsp soy sauce: 20 kcal, 1g</li>\n                <li>2 cloves garlic (minced): 8 kcal, 0.5g</li>\n                <li>2 bay leaves: 2 kcal, 0g</li>\n                <li>1 tbsp vegetable oil (for frying): 120 kcal, 0g</li>\n            </ul>\n        </li>\n    </ul>\n\n    <h2>Snacks</h2>\n    <ul>\n        <li>\n            <h3>Banana Cue (Caramelized bananas on skewers)</h3>\n            <ul>\n                <li>2 saba bananas (caramelized): 180 kcal, 2g</li>\n                <li>1 tbsp sugar (for caramelizing): 45 kcal, 0g</li>\n                <li>1 tsp vegetable oil (for frying): 40 kcal, 0g</li>\n            </ul>\n        </li>\n        <li>\n            <h3>Turon (Banana spring rolls)</h3>\n            <ul>\n                <li>1 saba banana: 90 kcal, 1g</li>\n                <li>1/2 sheet lumpia wrapper: 35 kcal, 1g</li>\n                <li>1 tbsp sugar (for caramelizing): 45 kcal, 0g</li>\n            </ul>\n        </li>\n    </ul>\n</body>\n</html>\n\n");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 560, 1940));

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 730));

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

        goaltext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        goaltext.setForeground(new java.awt.Color(5, 75, 40));
        goaltext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        goaltext.setText("Calories:");
        goaltext.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(goaltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 130, 30));

        progressbar.setBackground(new java.awt.Color(255, 255, 255));
        progressbar.setForeground(new java.awt.Color(255, 255, 255));
        progressbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 130, 20));

        caloriesbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calorieintake.png"))); // NOI18N
        caloriesbar.setText("jLabel2");
        add(caloriesbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 150, 30));

        caloriesintake.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        caloriesintake.setForeground(new java.awt.Color(5, 75, 40));
        caloriesintake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caloriesintake.setText("Calories Intake");
        add(caloriesintake, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 150, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(String.valueOf(User.getBudget()));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 90, 20));

        phsign.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        phsign.setForeground(new java.awt.Color(0, 0, 0));
        phsign.setText("₱");
        add(phsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 30, 20));

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
    }// </editor-fold>//GEN-END:initComponents

    private void caloriesnumPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_caloriesnumPropertyChange

    }//GEN-LAST:event_caloriesnumPropertyChange

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        update();
    }//GEN-LAST:event_formPropertyChange

    private void bmitextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bmitextPropertyChange

    }//GEN-LAST:event_bmitextPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bmiimg;
    private javax.swing.JLabel bmitext;
    private javax.swing.JLabel budgettext;
    private javax.swing.JLabel caloriesbar;
    private javax.swing.JLabel caloriesintake;
    private javax.swing.JLabel caloriesnum;
    private javax.swing.JLabel goaltext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel phsign;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables
}