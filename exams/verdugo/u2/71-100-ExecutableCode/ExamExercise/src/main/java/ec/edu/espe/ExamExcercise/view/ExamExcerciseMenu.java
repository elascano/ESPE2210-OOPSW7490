package ec.edu.espe.ExamExcercise.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sebastian Verdugo,Progress Team, DCCO-ESPE
 */
public class ExamExcerciseMenu extends javax.swing.JFrame {

    /**
     * Creates new form taxiScheduling
     */
    public ExamExcerciseMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mnubAirportTaxiScheduling = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miExit = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mitAddTraveler = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airport Taxi Scheduling");
        setAlwaysOnTop(true);

        jLabel1.setText("Sebastian Verdugo N°39");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        mnubAirportTaxiScheduling.setToolTipText("Airport Taxi Scheduling");

        jMenu1.setText("ExamExcercise");

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        mnubAirportTaxiScheduling.add(jMenu1);

        jMenu5.setText("Coin");

        mitAddTraveler.setText("Add Coin");
        mitAddTraveler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAddTravelerActionPerformed(evt);
            }
        });
        jMenu5.add(mitAddTraveler);

        mnubAirportTaxiScheduling.add(jMenu5);

        setJMenuBar(mnubAirportTaxiScheduling);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_miExitActionPerformed

    private void mitAddTravelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAddTravelerActionPerformed
        // TODO add your handling code here:
    AddCoin addCoin;
    addCoin =  new AddCoin();
    addCoin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mitAddTravelerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamExcerciseMenu().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem mitAddTraveler;
    private javax.swing.JMenuBar mnubAirportTaxiScheduling;
    // End of variables declaration//GEN-END:variables
}
