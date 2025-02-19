package ec.edu.espe.restaurant.view;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.restaurant.controller.CustomerController;
import ec.edu.espe.restaurant.controller.ServiceController;
import ec.edu.espe.restaurant.model.Customer;
import ec.edu.espe.restaurant.controller.MongoDBConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class PanelUpdateOrder extends javax.swing.JPanel {

    public PanelUpdateOrder() {
        initComponents();
        MongoDBConnection.connectDatabase();
    }

    public void updateCustomer(){
        CustomerController customerC;
        customerC = new CustomerController("Orders");
        MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Orders");


        Document doc = collection.find(eq("identification", txt_identification.getText())).first();      
    
            if(doc==null){
                JOptionPane.showMessageDialog(this,"Order not found");
               
                txt_firstName.setText("");
                txt_lastName.setText("");
                txt_Id.setText("");
                txt_Cellphone.setText("");
                txt_Email.setText("");
                txt_Food.setText("");
                txt_Cost.setText("");
                txt_Note.setText("");
                txt_Date.setText("");
                txt_Hour.setText("");
            }else{
                Gson gson = new Gson();
                Customer customer = gson.fromJson(doc.toJson(), Customer.class);
       
                txt_firstName.setText(customer.getFirstName());
                txt_lastName.setText(customer.getLastName());
                txt_Id.setText(customer.getIdentification());
                txt_Cellphone.setText(customer.getCellphone());
                txt_Email.setText(customer.getEmail());
                txt_Cost.setText(customer.getCost());
                txt_Note.setText(customer.getNote());
                txt_Food.setText(customer.getFood());
                txt_Date.setText(customer.getDate());
                txt_Hour.setText(customer.getHourOfAttention());
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_identification = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_firstName = new javax.swing.JTextField();
        txt_lastName = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        txt_Cellphone = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Food = new javax.swing.JTextField();
        txt_Cost = new javax.swing.JTextField();
        txt_Note = new javax.swing.JTextField();
        txt_Date = new javax.swing.JTextField();
        txt_Hour = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_identification.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_identification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificationActionPerformed(evt);
            }
        });
        txt_identification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_identificationKeyTyped(evt);
            }
        });
        jPanel1.add(txt_identification, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, 30));

        btn_Search.setBackground(new java.awt.Color(102, 102, 255));
        btn_Search.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(0, 0, 0));
        btn_Search.setText("SEARCH");
        btn_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchMouseExited(evt);
            }
        });
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        btn_Update.setBackground(new java.awt.Color(102, 102, 255));
        btn_Update.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(0, 0, 0));
        btn_Update.setText("UPDATE");
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseExited(evt);
            }
        });
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("E-mail:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fullnames:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Surnames:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("C.I:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Hour of Attention:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 150, 20));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cellphone:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Food:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Cost:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 60, 20));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Note:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Date:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        txt_firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_firstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstNameActionPerformed(evt);
            }
        });
        txt_firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstNameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 180, 20));

        txt_lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_lastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastNameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 180, 20));

        txt_Id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 130, 20));

        txt_Cellphone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Cellphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 130, 20));

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 180, 20));

        txt_Food.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Food.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 180, -1));

        txt_Cost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 100, -1));

        txt_Note.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Note.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Note, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 180, 20));

        txt_Date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Date.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 140, -1));

        try {
            txt_Hour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_Hour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HourActionPerformed(evt);
            }
        });
        txt_Hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_HourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_HourKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Type the ID of the client:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Update Order:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 500));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 160, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 10, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
      updateCustomer();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void txt_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstNameActionPerformed
        //
    }//GEN-LAST:event_txt_firstNameActionPerformed

    private void txt_firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstNameKeyTyped

    }//GEN-LAST:event_txt_firstNameKeyTyped

    private void txt_lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastNameKeyTyped

    }//GEN-LAST:event_txt_lastNameKeyTyped

    private void txt_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyPressed

    }//GEN-LAST:event_txt_IdKeyPressed

    private void txt_CellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CellphoneKeyPressed

    }//GEN-LAST:event_txt_CellphoneKeyPressed

    private void txt_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyTyped
        char character = evt.getKeyChar();

        if(((character < '0' || character > '9')) && (character != KeyEvent.VK_BACK_SPACE)
            && (character != '.' || txt_Cost.getText().contains(".") )){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CostKeyTyped

    private void txt_HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HourActionPerformed
    
    }//GEN-LAST:event_txt_HourActionPerformed

    private void txt_HourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyPressed
        ServiceController h;
        h = new ServiceController("Orders");
        if(h.validateHour(txt_Hour.getText())== false){

        }
    }//GEN-LAST:event_txt_HourKeyPressed

    private void txt_HourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyTyped

    }//GEN-LAST:event_txt_HourKeyTyped

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
    
    MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Orders");    
    Document doc = collection.find(eq("identification",txt_identification.getText())).first();
    
    CustomerController customerController = new CustomerController("Orders");
    
    int i =  JOptionPane.showConfirmDialog(this,"Update customer data?","Warning",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        customerController.uploadToDatabase(doc, customerController.RegisterAndBuildDocument(txt_firstName.getText(),
        txt_lastName.getText(),
        txt_Id.getText(),
        txt_Cellphone.getText(),
        txt_Email.getText(),
        txt_Food.getText(),
        txt_Cost.getText(),
        txt_Note.getText(),
        txt_Date.getText(),
        txt_Hour.getText()));
        JOptionPane.showMessageDialog(this, "Data updated successfully");
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseEntered
    
    }//GEN-LAST:event_btn_SearchMouseEntered

    private void btn_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseExited
    
    }//GEN-LAST:event_btn_SearchMouseExited

    private void btn_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseEntered
      
    }//GEN-LAST:event_btn_UpdateMouseEntered

    private void btn_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseExited
      
    }//GEN-LAST:event_btn_UpdateMouseExited

    private void txt_identificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificationActionPerformed
        btn_Search.requestFocus();
        updateCustomer();
    }//GEN-LAST:event_txt_identificationActionPerformed

    private void txt_identificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_identificationKeyTyped
        int key = evt.getKeyChar();
        
        boolean onlyNumbers = key >= 48 && key <= 57;
        
        if(!onlyNumbers){
            evt.consume();
        }
        if(txt_identification.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txt_identificationKeyTyped

    private void txt_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyTyped
        int key = evt.getKeyChar();
        
        boolean onlyNumbers = key >= 48 && key <= 57;
        
        if(!onlyNumbers){
            evt.consume();
        }
        if(txt_Id.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txt_IdKeyTyped

    private void txt_CellphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CellphoneKeyTyped
        int key = evt.getKeyChar();
        
        boolean onlyNumbers = key >= 48 && key <= 57;
        
        if(!onlyNumbers){
            evt.consume();
        }
        if(txt_Cellphone.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CellphoneKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JTextField txt_Cellphone;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Food;
    private javax.swing.JFormattedTextField txt_Hour;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Note;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextField txt_identification;
    private javax.swing.JTextField txt_lastName;
    // End of variables declaration//GEN-END:variables
}
