/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.Jorge.wordle.gui;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author joric
 */
public class MainGui extends javax.swing.JFrame {
    private static final java.awt.Color COLOR_VERDE = new java.awt.Color(51,102,0);
    private static final java.awt.Color COLOR_AMARILLO = new java.awt.Color(204,153,0);
    private static final java.awt.Color COLOR_ROJO = new java.awt.Color(204,0,0);
    private static final int MAX_INTENTOS = 6;
    private static final int TAMNHO_PALABRA = 5;
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMNHO_PALABRA];
    
    /**
     * Creates new form MainGui
     */
    public MainGui() {
        initComponents();        
        inicializarLabesl();
        //hideLabels();
    }
    
    public void hideLabels(){
        for(int i = 0; i< labels.length;i++){
            JLabel[] label = labels[i];
            for(int j = 0; j < label.length;j++){
                JLabel jlabel = label[j];
                jlabel.setVisible(false);
            }
            
            
        }
    }
    
    public final void inicializarLabesl(){
        for(int i = 1; i <= MAX_INTENTOS;i++){
            for(int j = 1;j <= TAMNHO_PALABRA; j++){
                try {
                    String nombreLabel = "jLabel"+i+"_"+j;
                    javax.swing.JLabel aux = (javax.swing.JLabel)this.getClass().getDeclaredField(nombreLabel).get(this);
                    labels[i-1][j-1] = aux;
                    
                    
                } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                JLabel label =labels[i-1][j-1];
                label.setVisible(false);
            }
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
        java.awt.GridBagConstraints gridBagConstraints;

        MotoresbuttonGroup = new javax.swing.ButtonGroup();
        MainjPanel = new javax.swing.JPanel();
        ZonaLetrasjPanel = new javax.swing.JPanel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel1_4 = new javax.swing.JLabel();
        jLabel1_5 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_4 = new javax.swing.JLabel();
        jLabel2_5 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_4 = new javax.swing.JLabel();
        jLabel3_5 = new javax.swing.JLabel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel4_3 = new javax.swing.JLabel();
        jLabel4_4 = new javax.swing.JLabel();
        jLabel4_5 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel5_3 = new javax.swing.JLabel();
        jLabel5_4 = new javax.swing.JLabel();
        jLabel5_5 = new javax.swing.JLabel();
        jLabel6_1 = new javax.swing.JLabel();
        jLabel6_2 = new javax.swing.JLabel();
        jLabel6_3 = new javax.swing.JLabel();
        jLabel6_4 = new javax.swing.JLabel();
        jLabel6_5 = new javax.swing.JLabel();
        BottomjPanel = new javax.swing.JPanel();
        estadojPanel = new javax.swing.JPanel();
        maljPanel = new javax.swing.JPanel();
        maljLabel = new javax.swing.JLabel();
        existenjPanel2 = new javax.swing.JPanel();
        existenjLabel = new javax.swing.JLabel();
        bienjPanel3 = new javax.swing.JPanel();
        bienjLabel = new javax.swing.JLabel();
        inputPalabrasjPanel = new javax.swing.JPanel();
        palabrajTextField = new javax.swing.JTextField();
        enviarjButton = new javax.swing.JButton();
        exitojPanel4 = new javax.swing.JPanel();
        finaljLabel = new javax.swing.JLabel();
        errorjPanel3 = new javax.swing.JPanel();
        errorjLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonTest = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonArchivoTexto = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonBasesDatos = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JorgeRodriguez");

        MainjPanel.setLayout(new java.awt.BorderLayout());

        ZonaLetrasjPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel1_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setText("A");
        ZonaLetrasjPanel.add(jLabel1_1);

        jLabel1_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setText("A");
        ZonaLetrasjPanel.add(jLabel1_2);

        jLabel1_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_3.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setText("A");
        ZonaLetrasjPanel.add(jLabel1_3);

        jLabel1_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_4.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_4.setText("A");
        ZonaLetrasjPanel.add(jLabel1_4);

        jLabel1_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_5.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_5.setText("A");
        ZonaLetrasjPanel.add(jLabel1_5);

        jLabel2_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setText("A");
        ZonaLetrasjPanel.add(jLabel2_1);

        jLabel2_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setText("A");
        ZonaLetrasjPanel.add(jLabel2_2);

        jLabel2_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_3.setForeground(new java.awt.Color(187, 187, 187));
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setText("A");
        ZonaLetrasjPanel.add(jLabel2_3);

        jLabel2_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_4.setForeground(new java.awt.Color(187, 187, 187));
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_4.setText("A");
        ZonaLetrasjPanel.add(jLabel2_4);

        jLabel2_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_5.setForeground(new java.awt.Color(187, 187, 187));
        jLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_5.setText("A");
        ZonaLetrasjPanel.add(jLabel2_5);

        jLabel3_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setText("A");
        ZonaLetrasjPanel.add(jLabel3_1);

        jLabel3_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setText("A");
        ZonaLetrasjPanel.add(jLabel3_2);

        jLabel3_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_3.setForeground(new java.awt.Color(187, 187, 187));
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setText("A");
        ZonaLetrasjPanel.add(jLabel3_3);

        jLabel3_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_4.setForeground(new java.awt.Color(187, 187, 187));
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_4.setText("A");
        ZonaLetrasjPanel.add(jLabel3_4);

        jLabel3_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_5.setForeground(new java.awt.Color(187, 187, 187));
        jLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_5.setText("A");
        ZonaLetrasjPanel.add(jLabel3_5);

        jLabel4_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_1.setText("A");
        ZonaLetrasjPanel.add(jLabel4_1);

        jLabel4_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_2.setText("A");
        ZonaLetrasjPanel.add(jLabel4_2);

        jLabel4_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_3.setForeground(new java.awt.Color(187, 187, 187));
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_3.setText("A");
        ZonaLetrasjPanel.add(jLabel4_3);

        jLabel4_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_4.setForeground(new java.awt.Color(187, 187, 187));
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_4.setText("A");
        ZonaLetrasjPanel.add(jLabel4_4);

        jLabel4_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_5.setForeground(new java.awt.Color(187, 187, 187));
        jLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_5.setText("A");
        ZonaLetrasjPanel.add(jLabel4_5);

        jLabel5_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_1.setText("A");
        ZonaLetrasjPanel.add(jLabel5_1);

        jLabel5_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_2.setText("A");
        ZonaLetrasjPanel.add(jLabel5_2);

        jLabel5_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_3.setForeground(new java.awt.Color(187, 187, 187));
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_3.setText("A");
        ZonaLetrasjPanel.add(jLabel5_3);

        jLabel5_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_4.setForeground(new java.awt.Color(187, 187, 187));
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_4.setText("A");
        ZonaLetrasjPanel.add(jLabel5_4);

        jLabel5_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_5.setForeground(new java.awt.Color(187, 187, 187));
        jLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_5.setText("A");
        ZonaLetrasjPanel.add(jLabel5_5);

        jLabel6_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_1.setText("A");
        ZonaLetrasjPanel.add(jLabel6_1);

        jLabel6_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_2.setForeground(new java.awt.Color(187, 187, 187));
        jLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_2.setText("A");
        ZonaLetrasjPanel.add(jLabel6_2);

        jLabel6_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_3.setForeground(new java.awt.Color(187, 187, 187));
        jLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_3.setText("A");
        ZonaLetrasjPanel.add(jLabel6_3);

        jLabel6_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_4.setForeground(new java.awt.Color(187, 187, 187));
        jLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_4.setText("A");
        ZonaLetrasjPanel.add(jLabel6_4);

        jLabel6_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_5.setForeground(new java.awt.Color(187, 187, 187));
        jLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_5.setText("A");
        ZonaLetrasjPanel.add(jLabel6_5);

        MainjPanel.add(ZonaLetrasjPanel, java.awt.BorderLayout.CENTER);

        BottomjPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        BottomjPanel.setLayout(new java.awt.GridLayout(2, 2));

        estadojPanel.setLayout(new java.awt.GridLayout(3, 0));

        maljPanel.setLayout(new java.awt.GridLayout(1, 0));

        maljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        maljLabel.setForeground(new java.awt.Color(204, 0, 0));
        maljLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maljLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        maljPanel.add(maljLabel);

        estadojPanel.add(maljPanel);

        existenjPanel2.setLayout(new java.awt.GridLayout(1, 0));

        existenjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        existenjLabel.setForeground(new java.awt.Color(255, 204, 0));
        existenjPanel2.add(existenjLabel);

        estadojPanel.add(existenjPanel2);

        bienjPanel3.setLayout(new java.awt.GridLayout(1, 0));

        bienjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bienjLabel.setForeground(new java.awt.Color(51, 102, 0));
        bienjPanel3.add(bienjLabel);

        estadojPanel.add(bienjPanel3);

        BottomjPanel.add(estadojPanel);

        palabrajTextField.setPreferredSize(new java.awt.Dimension(120, 20));
        inputPalabrasjPanel.add(palabrajTextField);

        enviarjButton.setText("Enviar");
        inputPalabrasjPanel.add(enviarjButton);

        BottomjPanel.add(inputPalabrasjPanel);

        exitojPanel4.setLayout(new java.awt.GridBagLayout());

        finaljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 104, 18, 105);
        exitojPanel4.add(finaljLabel, gridBagConstraints);

        BottomjPanel.add(exitojPanel4);

        errorjPanel3.setLayout(new java.awt.GridBagLayout());

        errorjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        errorjLabel.setForeground(new java.awt.Color(204, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 112, 18, 113);
        errorjPanel3.add(errorjLabel, gridBagConstraints);

        BottomjPanel.add(errorjPanel3);

        MainjPanel.add(BottomjPanel, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Motores");

        MotoresbuttonGroup.add(jRadioButtonTest);
        jRadioButtonTest.setSelected(true);
        jRadioButtonTest.setText("jRadioButtonMenuItem1");
        jMenu2.add(jRadioButtonTest);

        MotoresbuttonGroup.add(jRadioButtonArchivoTexto);
        jRadioButtonArchivoTexto.setText("jRadioButtonMenuItem2");
        jMenu2.add(jRadioButtonArchivoTexto);

        MotoresbuttonGroup.add(jRadioButtonBasesDatos);
        jRadioButtonBasesDatos.setText("jRadioButtonMenuItem3");
        jMenu2.add(jRadioButtonBasesDatos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainjPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomjPanel;
    private javax.swing.JPanel MainjPanel;
    private javax.swing.ButtonGroup MotoresbuttonGroup;
    private javax.swing.JPanel ZonaLetrasjPanel;
    private javax.swing.JLabel bienjLabel;
    private javax.swing.JPanel bienjPanel3;
    private javax.swing.JButton enviarjButton;
    private javax.swing.JLabel errorjLabel;
    private javax.swing.JPanel errorjPanel3;
    private javax.swing.JPanel estadojPanel;
    private javax.swing.JLabel existenjLabel;
    private javax.swing.JPanel existenjPanel2;
    private javax.swing.JPanel exitojPanel4;
    private javax.swing.JLabel finaljLabel;
    private javax.swing.JPanel inputPalabrasjPanel;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel1_4;
    private javax.swing.JLabel jLabel1_5;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel2_4;
    private javax.swing.JLabel jLabel2_5;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JLabel jLabel3_4;
    private javax.swing.JLabel jLabel3_5;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel4_3;
    private javax.swing.JLabel jLabel4_4;
    private javax.swing.JLabel jLabel4_5;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel5_3;
    private javax.swing.JLabel jLabel5_4;
    private javax.swing.JLabel jLabel5_5;
    private javax.swing.JLabel jLabel6_1;
    private javax.swing.JLabel jLabel6_2;
    private javax.swing.JLabel jLabel6_3;
    private javax.swing.JLabel jLabel6_4;
    private javax.swing.JLabel jLabel6_5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonArchivoTexto;
    private javax.swing.JRadioButtonMenuItem jRadioButtonBasesDatos;
    private javax.swing.JRadioButtonMenuItem jRadioButtonTest;
    private javax.swing.JLabel maljLabel;
    private javax.swing.JPanel maljPanel;
    private javax.swing.JTextField palabrajTextField;
    // End of variables declaration//GEN-END:variables
}
