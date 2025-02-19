package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class FrmCalculator extends javax.swing.JFrame {

    /**
     * Creates new form FrmCalculator
     */
    public FrmCalculator() {
        initComponents();
        txtAHistory.setLineWrap(true);
        txtAHistory.setWrapStyleWord(true);
        txtAHistory.setEditable(false);
    }
    
    public void computeOperation(){
        float value1;
        value1 = Float.parseFloat(txtValue1.getText());
        float value2;
        value2 = Float.parseFloat(txtValue2.getText());
        float result;
        BasicOperation calculator = new BasicOperation();
        if(rbtnAddition.isSelected()){
            result = calculator.add(value1, value2);
            txtAHistory.append("\n" + value1 + "  +  " + value2);
            txtAHistory.append("\n" + "  =  " + result);
        }else if(rbtnSubtraction.isSelected()){
            result = calculator.substract(value1, value2);
            txtAHistory.append("\n" + value1 + "  -  " + value2);
            txtAHistory.append("\n" + "  =  " + result);
        }else if(rbtnMultiplication.isSelected()){
            result = calculator.multiply(value1, value2);
            txtAHistory.append("\n" + value1 + "  x  " + value2);
            txtAHistory.append("\n" + "  =  " + result);
        }else if(rbtnDivision.isSelected()){
            result = calculator.divide(value1, value2);
            txtAHistory.append("\n" + value1 + "  /  " + value2);
            txtAHistory.append("\n" + "  =  " + result);
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

        btngOperations = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAHistory = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblValue1 = new javax.swing.JLabel();
        lblValue2 = new javax.swing.JLabel();
        lblOperator = new javax.swing.JLabel();
        txtValue2 = new javax.swing.JTextField();
        btnResult = new javax.swing.JButton();
        rbtnAddition = new javax.swing.JRadioButton();
        rbtnSubtraction = new javax.swing.JRadioButton();
        rbtnMultiplication = new javax.swing.JRadioButton();
        rbtnDivision = new javax.swing.JRadioButton();
        txtValue1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtAHistory.setBackground(new java.awt.Color(246, 211, 227));
        txtAHistory.setColumns(20);
        txtAHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAHistory.setForeground(new java.awt.Color(237, 136, 177));
        txtAHistory.setRows(5);
        txtAHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(237, 136, 177), 2, true));
        jScrollPane1.setViewportView(txtAHistory);

        jLabel2.setBackground(new java.awt.Color(187, 187, 187));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 187, 188));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("History");

        lblValue1.setBackground(new java.awt.Color(187, 187, 187));
        lblValue1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblValue1.setForeground(new java.awt.Color(187, 187, 188));
        lblValue1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValue1.setText("Addend 1");

        lblValue2.setBackground(new java.awt.Color(187, 187, 187));
        lblValue2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblValue2.setForeground(new java.awt.Color(187, 187, 188));
        lblValue2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValue2.setText("Addend 2");

        lblOperator.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblOperator.setForeground(new java.awt.Color(237, 136, 177));
        lblOperator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperator.setText("+");

        txtValue2.setBackground(new java.awt.Color(255, 255, 255));
        txtValue2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtValue2.setForeground(new java.awt.Color(187, 187, 188));
        txtValue2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValue2.setText("0.00");
        txtValue2.setBorder(null);

        btnResult.setBackground(new java.awt.Color(237, 136, 177));
        btnResult.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnResult.setForeground(new java.awt.Color(255, 255, 255));
        btnResult.setText("Sum");
        btnResult.setBorder(null);
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        rbtnAddition.setBackground(new java.awt.Color(255, 255, 255));
        btngOperations.add(rbtnAddition);
        rbtnAddition.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rbtnAddition.setForeground(new java.awt.Color(187, 187, 188));
        rbtnAddition.setSelected(true);
        rbtnAddition.setText("Addition");
        rbtnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAdditionActionPerformed(evt);
            }
        });

        rbtnSubtraction.setBackground(new java.awt.Color(255, 255, 255));
        btngOperations.add(rbtnSubtraction);
        rbtnSubtraction.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rbtnSubtraction.setForeground(new java.awt.Color(187, 187, 188));
        rbtnSubtraction.setText("Subtraction");
        rbtnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSubtractionActionPerformed(evt);
            }
        });

        rbtnMultiplication.setBackground(new java.awt.Color(255, 255, 255));
        btngOperations.add(rbtnMultiplication);
        rbtnMultiplication.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rbtnMultiplication.setForeground(new java.awt.Color(187, 187, 188));
        rbtnMultiplication.setText("Multiplication");
        rbtnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMultiplicationActionPerformed(evt);
            }
        });

        rbtnDivision.setBackground(new java.awt.Color(255, 255, 255));
        btngOperations.add(rbtnDivision);
        rbtnDivision.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rbtnDivision.setForeground(new java.awt.Color(187, 187, 188));
        rbtnDivision.setText("Division");
        rbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDivisionActionPerformed(evt);
            }
        });

        txtValue1.setBackground(new java.awt.Color(255, 255, 255));
        txtValue1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtValue1.setForeground(new java.awt.Color(187, 187, 188));
        txtValue1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValue1.setText("0.00");
        txtValue1.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(187, 187, 187));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(187, 187, 187));

        jPanel2.setBackground(new java.awt.Color(246, 211, 227));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Basic Calculator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(187, 187, 187));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(187, 187, 188));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Select an operation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValue1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValue1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(lblOperator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(txtValue2)
                            .addComponent(lblValue2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnAddition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnSubtraction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnMultiplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnDivision))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnAddition)
                            .addComponent(rbtnSubtraction)
                            .addComponent(rbtnMultiplication)
                            .addComponent(rbtnDivision))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValue1)
                            .addComponent(lblValue2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOperator)
                            .addComponent(txtValue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
       computeOperation();
    }//GEN-LAST:event_btnResultActionPerformed

    private void rbtnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAdditionActionPerformed
       lblValue1.setText("Addend 1");
       lblValue2.setText("Addend 2");
       lblOperator.setText("+");
       btnResult.setText("Sum");
    }//GEN-LAST:event_rbtnAdditionActionPerformed

    private void rbtnSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSubtractionActionPerformed
       lblValue1.setText("Minuend");
       lblValue2.setText("Subtrahend");
       lblOperator.setText("-");
       btnResult.setText("Difference");
    }//GEN-LAST:event_rbtnSubtractionActionPerformed

    private void rbtnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMultiplicationActionPerformed
       lblValue1.setText("Mutiplicand");
       lblValue2.setText("Multiplier");
       lblOperator.setText("x");
       btnResult.setText("Product");
    }//GEN-LAST:event_rbtnMultiplicationActionPerformed

    private void rbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDivisionActionPerformed
       lblValue1.setText("Dividend");
       lblValue2.setText("Divisor");
       lblOperator.setText("/");
       btnResult.setText("Quotient");
    }//GEN-LAST:event_rbtnDivisionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResult;
    private javax.swing.ButtonGroup btngOperations;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblOperator;
    private javax.swing.JLabel lblValue1;
    private javax.swing.JLabel lblValue2;
    private javax.swing.JRadioButton rbtnAddition;
    private javax.swing.JRadioButton rbtnDivision;
    private javax.swing.JRadioButton rbtnMultiplication;
    private javax.swing.JRadioButton rbtnSubtraction;
    private javax.swing.JTextArea txtAHistory;
    private javax.swing.JTextField txtValue1;
    private javax.swing.JTextField txtValue2;
    // End of variables declaration//GEN-END:variables
}
