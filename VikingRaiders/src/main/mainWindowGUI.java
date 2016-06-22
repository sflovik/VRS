/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

/**
 *
 * @author Sondre
 */
public class mainWindowGUI extends javax.swing.JFrame {

    /**
     * Creates new form mainWindowGUI
     */
    static missionsGUI missions = new missionsGUI();
    
    public mainWindowGUI() {
        initComponents();
        updateLabels();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBank = new javax.swing.JLabel();
        jLabelIncome = new javax.swing.JLabel();
        btnBuyFarmer = new javax.swing.JButton();
        btnBuySmith = new javax.swing.JButton();
        jLabelFarmers = new javax.swing.JLabel();
        jLabelSmiths = new javax.swing.JLabel();
        jLabelUpkeep = new javax.swing.JLabel();
        jLabelFood = new javax.swing.JLabel();
        btnBuyForge = new javax.swing.JButton();
        jLabelForges = new javax.swing.JLabel();
        jLabelFarmhouses = new javax.swing.JLabel();
        jLabelIron = new javax.swing.JLabel();
        jLabelIronIncome = new javax.swing.JLabel();
        btnBuyFarmhouse = new javax.swing.JButton();
        btnBuyWoodsman = new javax.swing.JButton();
        jLabelWoodsmen = new javax.swing.JLabel();
        jLabelWoodshops = new javax.swing.JLabel();
        btnBuyWoodshop = new javax.swing.JButton();
        jLabelWood = new javax.swing.JLabel();
        jLabelWoodIncome = new javax.swing.JLabel();
        btnMissions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelBank.setText("Bank");
        jLabelBank.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabelBankInputMethodTextChanged(evt);
            }
        });
        jLabelBank.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabelBankPropertyChange(evt);
            }
        });

        jLabelIncome.setText("Income");

        btnBuyFarmer.setText("Buy farmer");
        btnBuyFarmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuyFarmerMouseClicked(evt);
            }
        });
        btnBuyFarmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyFarmerActionPerformed(evt);
            }
        });

        btnBuySmith.setText("Buy smith");
        btnBuySmith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuySmithActionPerformed(evt);
            }
        });

        jLabelFarmers.setText("Farmers");

        jLabelSmiths.setText("Smiths");

        jLabelUpkeep.setText("Upkeep");

        jLabelFood.setText("Food ");

        btnBuyForge.setText("Buy forge");
        btnBuyForge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyForgeActionPerformed(evt);
            }
        });

        jLabelForges.setText("Forges");

        jLabelFarmhouses.setText("Farmhouses");

        jLabelIron.setText("Iron");

        jLabelIronIncome.setText("Iron income");

        btnBuyFarmhouse.setText("Buy farmhouse");
        btnBuyFarmhouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyFarmhouseActionPerformed(evt);
            }
        });

        btnBuyWoodsman.setText("Buy woodsman");
        btnBuyWoodsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyWoodsmanActionPerformed(evt);
            }
        });

        jLabelWoodsmen.setText("Woodsmen");

        jLabelWoodshops.setText("Woodshops");

        btnBuyWoodshop.setText("Buy woodshop");
        btnBuyWoodshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyWoodshopActionPerformed(evt);
            }
        });

        jLabelWood.setText("Wood");

        jLabelWoodIncome.setText("Wood income");

        btnMissions.setText("Missions");
        btnMissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBank)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelIron)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelWood))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSmiths)
                                    .addComponent(jLabelFarmers))
                                .addGap(18, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFarmhouses)
                                    .addComponent(jLabelWoodshops)
                                    .addComponent(jLabelForges))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIronIncome)
                                    .addComponent(jLabelIncome)
                                    .addComponent(jLabelWoodIncome))))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuySmith, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuyFarmer, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(btnBuyForge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWoodsmen)
                            .addComponent(jLabelFood)
                            .addComponent(jLabelUpkeep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuyWoodshop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuyFarmhouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuyWoodsman, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(btnMissions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBank)
                        .addComponent(jLabelIron)
                        .addComponent(jLabelWood))
                    .addComponent(btnBuyFarmer))
                .addGap(18, 18, 18)
                .addComponent(btnBuySmith)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnBuyForge)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuyFarmhouse)
                            .addComponent(jLabelWoodsmen))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuyWoodsman)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuyWoodshop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelUpkeep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFood)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFarmers)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabelFarmhouses)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelSmiths)
                                    .addComponent(jLabelForges))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWoodshops))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabelIncome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelIronIncome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWoodIncome)))
                        .addGap(207, 207, 207))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyFarmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyFarmerActionPerformed
        VikingRaiders.buyFarmer();
        updateLabels();
    }//GEN-LAST:event_btnBuyFarmerActionPerformed

    private void btnBuyFarmerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyFarmerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyFarmerMouseClicked

    private void jLabelBankPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabelBankPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabelBankPropertyChange

    private void jLabelBankInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabelBankInputMethodTextChanged
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jLabelBankInputMethodTextChanged

    private void btnBuySmithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuySmithActionPerformed
        VikingRaiders.buySmiths();
        updateLabels();
    }//GEN-LAST:event_btnBuySmithActionPerformed

    private void btnBuyForgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyForgeActionPerformed
        VikingRaiders.buyForge();
        updateLabels();
    }//GEN-LAST:event_btnBuyForgeActionPerformed

    private void btnBuyFarmhouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyFarmhouseActionPerformed
        VikingRaiders.buyFarmhouse();
        updateLabels();
    }//GEN-LAST:event_btnBuyFarmhouseActionPerformed

    private void btnBuyWoodsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyWoodsmanActionPerformed
        VikingRaiders.buyWoodsman();
        updateLabels();
    }//GEN-LAST:event_btnBuyWoodsmanActionPerformed

    private void btnBuyWoodshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyWoodshopActionPerformed
        VikingRaiders.buyWoodshop();
        updateLabels();
    }//GEN-LAST:event_btnBuyWoodshopActionPerformed

    private void btnMissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissionsActionPerformed
        
        missions.setVisible(true);
      //  VikingRaiders.addIncome.cancel();
    }//GEN-LAST:event_btnMissionsActionPerformed
    public void updateLabels() {
       
        jLabelWood.setText("Wood:" + "  " + VikingRaiders.getWood());
        jLabelWoodIncome.setText("Wood income:" +"  " + VikingRaiders.getWoodIncome());
        jLabelWoodsmen.setText("Number of woodsmen:" +"  " + VikingRaiders.getWoodsmen());
        jLabelWoodshops.setText("Number of woodshops:" + "  " + VikingRaiders.getWoodshops());
        jLabelIron.setText("Iron:" + "  " + VikingRaiders.getIron());
        jLabelIronIncome.setText("Iron income:" + "  " + VikingRaiders.getIronIncome());
        jLabelFarmhouses.setText("Number of farmhouses:" + "  " + VikingRaiders.getFarmhouses());
        jLabelForges.setText("Number of forges:" + "  " + VikingRaiders.getForges());
        jLabelFood.setText("Food production:" + "  " + VikingRaiders.getFood());
        jLabelUpkeep.setText("Current upkeep:" + "  " + VikingRaiders.getUpkeep());
        jLabelBank.setText("Treasury:" + "  " + valueOf(VikingRaiders.getBank()));
        jLabelIncome.setText("Income:" + "  " +valueOf(VikingRaiders.getIncomeTick()));
        jLabelFarmers.setText("Number of farmers:" + "  " + valueOf(VikingRaiders.getFarmers()));
        jLabelSmiths.setText("Number of smiths:" + "  " + valueOf(VikingRaiders.getSmiths()));
       
        
    }
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
            java.util.logging.Logger.getLogger(mainWindowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindowGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyFarmer;
    private javax.swing.JButton btnBuyFarmhouse;
    private javax.swing.JButton btnBuyForge;
    private javax.swing.JButton btnBuySmith;
    private javax.swing.JButton btnBuyWoodshop;
    private javax.swing.JButton btnBuyWoodsman;
    private javax.swing.JButton btnMissions;
    private javax.swing.JLabel jLabelBank;
    private javax.swing.JLabel jLabelFarmers;
    private javax.swing.JLabel jLabelFarmhouses;
    private javax.swing.JLabel jLabelFood;
    private javax.swing.JLabel jLabelForges;
    private javax.swing.JLabel jLabelIncome;
    private javax.swing.JLabel jLabelIron;
    private javax.swing.JLabel jLabelIronIncome;
    private javax.swing.JLabel jLabelSmiths;
    private javax.swing.JLabel jLabelUpkeep;
    private javax.swing.JLabel jLabelWood;
    private javax.swing.JLabel jLabelWoodIncome;
    private javax.swing.JLabel jLabelWoodshops;
    private javax.swing.JLabel jLabelWoodsmen;
    // End of variables declaration//GEN-END:variables
}
