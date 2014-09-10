package org.vistahermosa.ui;

/**
 *
 * @author user
 */


public class DMSViewMain extends javax.swing.JFrame {

    /**
     * Creates new form DMSViewMain
     */
    public DMSViewMain() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnMain1 = new javax.swing.JPanel();
        pnBanner1 = new javax.swing.JPanel();
        pnContent1 = new javax.swing.JPanel();
        pnSideBar1 = new javax.swing.JPanel();
        pnMain = new javax.swing.JPanel();
        pnBanner = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        pnSideBar = new javax.swing.JPanel();

        pnMain1.setBackground(new java.awt.Color(255, 255, 102));
        pnMain1.setName("pnMain1"); // NOI18N

        pnBanner1.setBackground(new java.awt.Color(153, 0, 0));
        pnBanner1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnBanner1.setName("pnBanner1"); // NOI18N
        pnBanner1.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout pnBanner1Layout = new javax.swing.GroupLayout(pnBanner1);
        pnBanner1.setLayout(pnBanner1Layout);
        pnBanner1Layout.setHorizontalGroup(
            pnBanner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBanner1Layout.setVerticalGroup(
            pnBanner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        pnContent1.setBackground(new java.awt.Color(255, 255, 255));
        pnContent1.setName("pnContent1"); // NOI18N

        javax.swing.GroupLayout pnContent1Layout = new javax.swing.GroupLayout(pnContent1);
        pnContent1.setLayout(pnContent1Layout);
        pnContent1Layout.setHorizontalGroup(
            pnContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        pnContent1Layout.setVerticalGroup(
            pnContent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnSideBar1.setBackground(new java.awt.Color(0, 0, 0));
        pnSideBar1.setMinimumSize(new java.awt.Dimension(100, 394));
        pnSideBar1.setName("pnSideBar1"); // NOI18N

        javax.swing.GroupLayout pnSideBar1Layout = new javax.swing.GroupLayout(pnSideBar1);
        pnSideBar1.setLayout(pnSideBar1Layout);
        pnSideBar1Layout.setHorizontalGroup(
            pnSideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnSideBar1Layout.setVerticalGroup(
            pnSideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnMain1Layout = new javax.swing.GroupLayout(pnMain1);
        pnMain1.setLayout(pnMain1Layout);
        pnMain1Layout.setHorizontalGroup(
            pnMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBanner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnMain1Layout.createSequentialGroup()
                .addComponent(pnSideBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnContent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMain1Layout.setVerticalGroup(
            pnMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMain1Layout.createSequentialGroup()
                .addComponent(pnBanner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSideBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnContent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        pnMain.setBackground(new java.awt.Color(255, 255, 102));
        pnMain.setName("pnMain"); // NOI18N
        pnMain.setLayout(new java.awt.GridBagLayout());

        pnBanner.setBackground(new java.awt.Color(153, 0, 0));
        pnBanner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnBanner.setName("pnBanner"); // NOI18N
        pnBanner.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 798;
        gridBagConstraints.ipady = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnMain.add(pnBanner, gridBagConstraints);

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setName("pnContent"); // NOI18N

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 694;
        gridBagConstraints.ipady = 394;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnMain.add(pnContent, gridBagConstraints);

        pnSideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnSideBar.setMinimumSize(new java.awt.Dimension(100, 394));
        pnSideBar.setName("pnSideBar"); // NOI18N
        pnSideBar.setPreferredSize(new java.awt.Dimension(100, 394));

        javax.swing.GroupLayout pnSideBarLayout = new javax.swing.GroupLayout(pnSideBar);
        pnSideBar.setLayout(pnSideBarLayout);
        pnSideBarLayout.setHorizontalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnSideBarLayout.setVerticalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnMain.add(pnSideBar, gridBagConstraints);

        getContentPane().add(pnMain, "card2");

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(DMSViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DMSViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DMSViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DMSViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DMSViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnBanner1;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnContent1;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMain1;
    private javax.swing.JPanel pnSideBar;
    private javax.swing.JPanel pnSideBar1;
    // End of variables declaration//GEN-END:variables
}
