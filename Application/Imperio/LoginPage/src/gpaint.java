
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class gpaint extends javax.swing.JFrame {
    String user;
    String item;
    int t1;
    public static Connection conn=null;
    public static ResultSet rs=null;
     public static ResultSet rs1=null;
    public static Statement stmt=null;
    public static Statement stmt1=null;

    /**
     * Creates new form gpaint
     */
    public gpaint(String User) {
        user=User;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","ssd");
            
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            
            String n1="SELECT * FROM test.inventry ";
            rs=stmt.executeQuery(n1);
             p1.setVisible(false);
        //rs.next();
            
             //String sql;
            //sql = "SELECT *  FROM Admins";
             //rs = stmt.executeQuery(sql);
            //rs.next();
             
        }
         catch(Exception e)
        {
        }
        initComponents();
        
       
         p1.setVisible(false);
         //p2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nerolac = new javax.swing.JRadioButton();
        asian = new javax.swing.JRadioButton();
        dulux = new javax.swing.JRadioButton();
        apex = new javax.swing.JRadioButton();
        tractor = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        len = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tcost = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        shades = new javax.swing.JButton();
        p1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        wish = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Available Brands:");

        nerolac.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nerolac.setForeground(new java.awt.Color(51, 51, 0));
        nerolac.setText("Nerolac");
        nerolac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nerolacActionPerformed(evt);
            }
        });

        asian.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        asian.setForeground(new java.awt.Color(51, 51, 0));
        asian.setText("Asian");
        asian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asianActionPerformed(evt);
            }
        });

        dulux.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        dulux.setForeground(new java.awt.Color(51, 51, 0));
        dulux.setText("Dulux");
        dulux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duluxActionPerformed(evt);
            }
        });

        apex.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        apex.setForeground(new java.awt.Color(51, 51, 0));
        apex.setText("Apex Ultima");
        apex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexActionPerformed(evt);
            }
        });

        tractor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tractor.setForeground(new java.awt.Color(51, 51, 0));
        tractor.setText("Tractor Emulsion");
        tractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tractorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Cost Per Sq.Feet");

        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Enter Size Of Wall");

        len.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("ft");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("X");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("ft");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Estimated Cost");

        calculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculate.setForeground(new java.awt.Color(0, 51, 51));
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        shades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shades.setForeground(new java.awt.Color(0, 102, 51));
        shades.setText("Show Shades");
        shades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadesActionPerformed(evt);
            }
        });

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/4621_Paints-in-a-palette-full-of-colors-HD-wallpaper.jpg"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("Gallery");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/h.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/re.jpg"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        wish.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wish.setForeground(new java.awt.Color(0, 51, 51));
        wish.setText("Add to Cart");
        wish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wishActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/cart.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("MY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(asian)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(len, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(bre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8))
                                        .addComponent(tcost, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))))
                        .addGap(573, 573, 573))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tractor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(shades)
                                .addGap(135, 135, 135)
                                .addComponent(wish, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(357, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(calculate)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(nerolac)
                                    .addGap(319, 319, 319)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dulux)
                                        .addComponent(apex)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refresh)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nerolac)
                                .addComponent(dulux))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21)
                        .addComponent(asian)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tractor)
                    .addComponent(apex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(bre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(calculate))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shades)
                            .addComponent(wish)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel2, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/wall_splatters_paint_splatter_1366x768_wallpaperdo_com.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nerolacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nerolacActionPerformed
        // TODO add your handling code here:
        if(nerolac.isSelected())
        {
            len.setText(null);
            bre.setText(null);
            tcost.setText(null);
            tractor.setSelected(false);
            dulux.setSelected(false);
            apex.setSelected(false);
            asian.setSelected(false);
            //nerolac.setSelected(false);

            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='nerolac'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_nerolacActionPerformed

    private void asianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asianActionPerformed
        // TODO add your handling code here:

        if(asian.isSelected())
        {
            len.setText(null);
            bre.setText(null);
            tcost.setText(null);
            tractor.setSelected(false);
            dulux.setSelected(false);
            apex.setSelected(false);
            //asian.setSelected(false);
            nerolac.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='asian'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_asianActionPerformed

    private void duluxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duluxActionPerformed
        // TODO add your handling code here:

        if(dulux.isSelected())
        {
            len.setText(null);
            bre.setText(null);
            tcost.setText(null);
            tractor.setSelected(false);
            //dulux.setSelected(false);
            apex.setSelected(false);
            asian.setSelected(false);
            nerolac.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='dulux'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_duluxActionPerformed

    private void apexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexActionPerformed
        // TODO add your handling code here:

        if(apex.isSelected())
        {
            len.setText(null);
            bre.setText(null);
            tcost.setText(null);
            tractor.setSelected(false);
            dulux.setSelected(false);
            //   apex.setSelected(false);
            asian.setSelected(false);
            nerolac.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='apex'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_apexActionPerformed

    private void tractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tractorActionPerformed
        // TODO add your handling code here:

        if(tractor.isSelected())
        {
            len.setText(null);
            bre.setText(null);
            tcost.setText(null);
            //    tractor.setSelected(false);
            dulux.setSelected(false);
            apex.setSelected(false);
            asian.setSelected(false);
            nerolac.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='tractor'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_tractorActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void lenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lenActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        String l1=len.getText();
        String b1=bre.getText();
        String c1=cost.getText();
        int x1=Integer.parseInt(l1);
        int y1=Integer.parseInt(b1);
        int z1=Integer.parseInt(c1);
        int r1=x1*y1*z1;
        String re1=String.valueOf(r1);
        tcost.setText(re1);
    }//GEN-LAST:event_calculateActionPerformed

    private void shadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadesActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
         
    }//GEN-LAST:event_shadesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new gallery(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        new gpaint(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_refreshActionPerformed

    private void wishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wishActionPerformed
        // TODO add your handling code here:
        try{
            String e1="SELECT * FROM test.guser WHERE Name='"+user+"'";
            rs=stmt1.executeQuery(e1);
            rs.next();
            String e=rs.getString("Items");
            String c=rs.getString("Total");
            int c1=Integer.parseInt(c);
            if(nerolac.isSelected())
            {
                item=e+",Nerolac Paint";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                t1=c1+a1;
            }
            if(dulux.isSelected())
            {
                item=e+",Dulux Paint";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                t1=c1+a1;
            }
            if(asian.isSelected())
            {
                item=e+",Asian Paint";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                t1=c1+a1;
            }
            if(tractor.isSelected())
            {
                item=e+",Tractor Emulsion";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                t1=c1+a1;
            }
            if(apex.isSelected())
            {
                item=e+",Apex Ultima";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                t1=c1+a1;
            }

            String w1="UPDATE test.guser SET Items='"+item+"',Total='"+t1+"' WHERE Name='"+user+"'";
            stmt1.executeUpdate(w1);
            JOptionPane.showMessageDialog(null, "Item added to Wishlist!");

            String f1="SELECT * FROM test.guser WHERE Name='"+user+"'";
            rs=stmt.executeQuery(f1);
            rs.next();
            String f=rs.getString("Items");
            //String c=rs.getString("Total");
            //exist.setText(f);

            ///refresh.doClick();

        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Regiter!");
            new guser().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_wishActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new gcart(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gpaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gpaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gpaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gpaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String user=null;
                new gpaint(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton apex;
    private javax.swing.JRadioButton asian;
    private javax.swing.JTextField bre;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField cost;
    private javax.swing.JRadioButton dulux;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField len;
    private javax.swing.JRadioButton nerolac;
    private javax.swing.JLabel p1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton shades;
    private javax.swing.JTextField tcost;
    private javax.swing.JRadioButton tractor;
    private javax.swing.JButton wish;
    // End of variables declaration//GEN-END:variables
}
