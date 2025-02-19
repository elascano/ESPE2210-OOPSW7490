/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.vinylrecord.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.vinylrecord.model.Vinyl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class FrmReviewVinyl extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form FrmReviewVinyl
     */
    public FrmReviewVinyl() {
        initComponents();
        mostTable();
    }

    private void mostTable() {
        model.addColumn("Id");
        model.addColumn("Artist");
        model.addColumn("Year of Release");

        this.tblVinyls.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVinyls = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        bntBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        itmExitProgram = new javax.swing.JMenu();
        itmExit = new javax.swing.JMenuItem();
        itmReview = new javax.swing.JMenu();
        itmReviewVinyl = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Review Vinyls");

        tblVinyls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVinyls);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        bntBack.setBackground(new java.awt.Color(255, 102, 102));
        bntBack.setText("Back");
        bntBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBackActionPerformed(evt);
            }
        });

        itmExitProgram.setText("Vinyl Record");

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        itmExitProgram.add(itmExit);

        jMenuBar1.add(itmExitProgram);

        itmReview.setText("Vinyls");

        itmReviewVinyl.setText("Review Vinyl");
        itmReviewVinyl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReviewVinylActionPerformed(evt);
            }
        });
        itmReview.add(itmReviewVinyl);

        jMenuBar1.add(itmReview);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntBack))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBack))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList<String> allVinyls = new ArrayList<>();
        Gson gson = new Gson();
        String[] datos = new String[3];
        String document = "";

        String uri = "mongodb+srv://elasluisa:1234567890@cluster0.iofgjxa.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("VinylRecord");

            try {
                //Conection with database server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection<Document> collection = database.getCollection("VinylRecord");

                Document query = collection.find().first();
                MongoCursor<Document> cursor = collection.find().iterator();

                document = query.toJson();
                TypeToken<Vinyl> type = new TypeToken<Vinyl>() {
                };
                while (cursor.hasNext()) {
                    allVinyls.add(cursor.next().toJson());

                }
                for (int i = 0; i < allVinyls.size(); i++) {
                    Vinyl vinylRecordsData = gson.fromJson(allVinyls.get(i), type.getType());
                    datos[0] = String.valueOf(vinylRecordsData.getId());
                    datos[1] = vinylRecordsData.getArtist();
                    datos[2] = vinylRecordsData.getYearOfRelease();

                    model.addRow(datos);
                }

            } catch (MongoException me) {
                System.err.println("An error ocurred while attempting to connect: " + me);
                JOptionPane.showMessageDialog(this, "An error ocurred while attempting to connect: " + me, "Database Conection", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void bntBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBackActionPerformed
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bntBackActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmReviewVinylActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReviewVinylActionPerformed
        FrmReviewVinyl reviewVinyl = new FrmReviewVinyl();
        reviewVinyl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmReviewVinylActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReviewVinyl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReviewVinyl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReviewVinyl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReviewVinyl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReviewVinyl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenu itmExitProgram;
    private javax.swing.JMenu itmReview;
    private javax.swing.JMenuItem itmReviewVinyl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVinyls;
    // End of variables declaration//GEN-END:variables
}
