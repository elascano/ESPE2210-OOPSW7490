/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.ExamExcercise.view;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.ExamExcercise.model.Coin;
import ec.edu.espe.ExamExcercise.controller.CoinController;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
/**
 *
 * @author w_ver
 */
public class AddCoin extends javax.swing.JFrame {

    /**
     * Creates new form GUI2
     */
    public AddCoin() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        txt1 = new javax.swing.JTextField();
        txt0 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Ingress the Id: ");

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt1.setToolTipText("First the name, later the last name");
        txt1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt0.setToolTipText("Ingress for create traveler, search traveler or delete traveler :)");
        txt0.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt0ActionPerformed(evt);
            }
        });
        txt0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt0KeyTyped(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingress the Value:");

        jLabel2.setText("Add Coin");

        bt1.setText("CREATE");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt5.setText("CLEAN");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped

    }//GEN-LAST:event_txt1KeyTyped

    private void txt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt0ActionPerformed

    }//GEN-LAST:event_txt0ActionPerformed

    private void txt0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt0KeyTyped
        int validNumber = evt.getKeyChar();
        boolean number = validNumber >= 48 && validNumber <= 57;
        if (!number) {
            evt.consume();
        }
        if (txt0.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txt0KeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ExamExcerciseMenu examExcerciseMenu;
        examExcerciseMenu = new ExamExcerciseMenu();
        this.setVisible(false);
        examExcerciseMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        if (txt0.getText().isEmpty() || txt1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, some fields are empty ");
        } else {
            MongoClient mongoClient = CoinController.conection();
            MongoDatabase database = mongoClient.getDatabase("ExamExcercise");
            MongoCollection<Document> collection = database.getCollection("Coin");
            Bson filter = Filters.and(Filters.all("id", Integer.valueOf(txt0.getText())));
            MongoCursor<Document> cursor = collection.find(filter).iterator();
            if (collection.find(filter).first() == null) {
                Coin coin = new Coin();
                coin.setId(Integer.valueOf(txt0.getText()));
                coin.setValue(Float.valueOf(txt1.getText()));
                CoinController.uploadDocumentMdb(coin);
                cleanPanel();
                JOptionPane.showMessageDialog(null, "Create document successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Error, the id is already registered");
            }

        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        cleanPanel();
    }//GEN-LAST:event_bt5ActionPerformed

    public static void main(String args[]) {

        try ( MongoClient mongoClient = CoinController.conection()) {
            MongoDatabase database = mongoClient.getDatabase("ExamExcercisee");
            JOptionPane.showMessageDialog(null, "Conection successfully");
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AddCoin().setVisible(true);
                }
            });
        } catch (InputMismatchException me) {
            JOptionPane.showMessageDialog(null, "An error occurred while attempting to connect: " + me);
        }
    }
    private void cleanPanel() {
        txt0.setText("");
        txt1.setText("");
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt5;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label2;
    private javax.swing.JTextField txt0;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
