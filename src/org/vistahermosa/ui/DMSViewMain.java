package org.vistahermosa.ui;

import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Thomas Mora
 */
public class DMSViewMain extends javax.swing.JFrame {

    public DMSViewMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnMain = new javax.swing.JPanel();
        pnBanner = new javax.swing.JPanel();
        lbLogoDMS = new javax.swing.JLabel();
        btLogOut = new javax.swing.JButton();
        lbUser = new javax.swing.JLabel();
        lbCompany = new javax.swing.JLabel();
        pnContent = new javax.swing.JPanel();
        pnSideBar = new javax.swing.JPanel();
        pnSideBarButtons = new javax.swing.JPanel();
        btHome = new javax.swing.JButton();
        btInventory = new javax.swing.JButton();
        btDeals = new javax.swing.JButton();
        btBHPH = new javax.swing.JButton();
        btDesking = new javax.swing.JButton();
        btDashboard = new javax.swing.JButton();
        btCRM = new javax.swing.JButton();
        btAccounting = new javax.swing.JButton();
        btService = new javax.swing.JButton();
        btParts = new javax.swing.JButton();
        btTraining = new javax.swing.JButton();
        btReports = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new java.awt.CardLayout());

        pnMain.setBackground(new java.awt.Color(255, 255, 102));
        pnMain.setMinimumSize(new java.awt.Dimension(800, 500));
        pnMain.setName("pnMain"); // NOI18N
        pnMain.setPreferredSize(new java.awt.Dimension(800, 500));
        pnMain.setLayout(new java.awt.GridBagLayout());

        pnBanner.setBackground(new java.awt.Color(241, 241, 241));
        pnBanner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnBanner.setMinimumSize(new java.awt.Dimension(0, 15));
        pnBanner.setName("pnBanner"); // NOI18N
        pnBanner.setPreferredSize(new java.awt.Dimension(800, 50));

        lbLogoDMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/LogoAutoMatrix.png"))); // NOI18N
        lbLogoDMS.setName("lbLogoDMS"); // NOI18N

        btLogOut.setBackground(new java.awt.Color(204, 204, 204));
        btLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iOff.png"))); // NOI18N
        btLogOut.setMinimumSize(new java.awt.Dimension(50, 50));
        btLogOut.setName("btLogOut"); // NOI18N
        btLogOut.setPreferredSize(new java.awt.Dimension(50, 50));

        lbUser.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iUser.png"))); // NOI18N
        lbUser.setText("Thomas Mora"); // NOI18N
        lbUser.setName("lbUser"); // NOI18N

        lbCompany.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbCompany.setText("FLORIDA FINE CARS, INC."); // NOI18N
        lbCompany.setName("lbCompany"); // NOI18N

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogoDMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCompany, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbUser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnBannerLayout.createSequentialGroup()
                                .addComponent(lbCompany)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbUser))))
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbLogoDMS)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 798;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        pnMain.add(pnBanner, gridBagConstraints);

        pnContent.setBackground(new java.awt.Color(255, 255, 255));
        pnContent.setName("pnContent"); // NOI18N

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 694;
        gridBagConstraints.ipady = 394;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pnMain.add(pnContent, gridBagConstraints);

        pnSideBar.setBackground(new java.awt.Color(0, 0, 0));
        pnSideBar.setMinimumSize(new java.awt.Dimension(180, 394));
        pnSideBar.setName("pnSideBar"); // NOI18N
        pnSideBar.setPreferredSize(new java.awt.Dimension(180, 394));
        pnSideBar.setVerifyInputWhenFocusTarget(false);

        pnSideBarButtons.setBackground(new java.awt.Color(0, 0, 0));
        pnSideBarButtons.setName("pnSideBarButtons"); // NOI18N
        pnSideBarButtons.setLayout(new org.jdesktop.swingx.VerticalLayout());

        btHome.setBackground(new java.awt.Color(0, 0, 0));
        btHome.setForeground(new java.awt.Color(255, 255, 255));
        btHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iHome.png"))); // NOI18N
        btHome.setText("HOME"); // NOI18N
        btHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btHome.setName("btHome"); // NOI18N
        pnSideBarButtons.add(btHome);

        btInventory.setBackground(new java.awt.Color(0, 0, 0));
        btInventory.setForeground(new java.awt.Color(255, 255, 255));
        btInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iInventory.png"))); // NOI18N
        btInventory.setText("INVENTORY"); // NOI18N
        btInventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btInventory.setName("btInventory"); // NOI18N
        pnSideBarButtons.add(btInventory);

        btDeals.setBackground(new java.awt.Color(0, 0, 0));
        btDeals.setForeground(new java.awt.Color(255, 255, 255));
        btDeals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iDeals.png"))); // NOI18N
        btDeals.setText("DEALS"); // NOI18N
        btDeals.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeals.setName("btDeals"); // NOI18N
        pnSideBarButtons.add(btDeals);

        btBHPH.setBackground(new java.awt.Color(0, 0, 0));
        btBHPH.setForeground(new java.awt.Color(255, 255, 255));
        btBHPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iBHPH.png"))); // NOI18N
        btBHPH.setText("BHPH"); // NOI18N
        btBHPH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btBHPH.setName("btBHPH"); // NOI18N
        pnSideBarButtons.add(btBHPH);

        btDesking.setBackground(new java.awt.Color(0, 0, 0));
        btDesking.setForeground(new java.awt.Color(255, 255, 255));
        btDesking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iDesking.png"))); // NOI18N
        btDesking.setText("DESKING"); // NOI18N
        btDesking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDesking.setName("btDesking"); // NOI18N
        pnSideBarButtons.add(btDesking);

        btDashboard.setBackground(new java.awt.Color(0, 0, 0));
        btDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iDashboard.png"))); // NOI18N
        btDashboard.setText("DASHBOARD"); // NOI18N
        btDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDashboard.setName("btDashboard"); // NOI18N
        pnSideBarButtons.add(btDashboard);

        btCRM.setBackground(new java.awt.Color(0, 0, 0));
        btCRM.setForeground(new java.awt.Color(255, 255, 255));
        btCRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iCRM.png"))); // NOI18N
        btCRM.setText("CRM"); // NOI18N
        btCRM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCRM.setName("btCRM"); // NOI18N
        pnSideBarButtons.add(btCRM);

        btAccounting.setBackground(new java.awt.Color(0, 0, 0));
        btAccounting.setForeground(new java.awt.Color(255, 255, 255));
        btAccounting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iAccounting.png"))); // NOI18N
        btAccounting.setText("ACCOUNTING"); // NOI18N
        btAccounting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAccounting.setName("btAccounting"); // NOI18N
        pnSideBarButtons.add(btAccounting);

        btService.setBackground(new java.awt.Color(0, 0, 0));
        btService.setForeground(new java.awt.Color(255, 255, 255));
        btService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iService.png"))); // NOI18N
        btService.setText("SERVICE"); // NOI18N
        btService.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btService.setName("btService"); // NOI18N
        pnSideBarButtons.add(btService);

        btParts.setBackground(new java.awt.Color(0, 0, 0));
        btParts.setForeground(new java.awt.Color(255, 255, 255));
        btParts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iParts.png"))); // NOI18N
        btParts.setText("PARTS"); // NOI18N
        btParts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btParts.setName("btParts"); // NOI18N
        pnSideBarButtons.add(btParts);

        btTraining.setBackground(new java.awt.Color(0, 0, 0));
        btTraining.setForeground(new java.awt.Color(255, 255, 255));
        btTraining.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iTraining.png"))); // NOI18N
        btTraining.setText("TRAINING"); // NOI18N
        btTraining.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTraining.setName("btTraining"); // NOI18N
        pnSideBarButtons.add(btTraining);

        btReports.setBackground(new java.awt.Color(0, 0, 0));
        btReports.setForeground(new java.awt.Color(255, 255, 255));
        btReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iReports.png"))); // NOI18N
        btReports.setText("REPORTS"); // NOI18N
        btReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btReports.setName("btReports"); // NOI18N
        pnSideBarButtons.add(btReports);

        javax.swing.GroupLayout pnSideBarLayout = new javax.swing.GroupLayout(pnSideBar);
        pnSideBar.setLayout(pnSideBarLayout);
        pnSideBarLayout.setHorizontalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSideBarButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnSideBarLayout.setVerticalGroup(
            pnSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSideBarLayout.createSequentialGroup()
                .addComponent(pnSideBarButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnMain.add(pnSideBar, gridBagConstraints);

        getContentPane().add(pnMain, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DMSViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DMSViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAccounting;
    private javax.swing.JButton btBHPH;
    private javax.swing.JButton btCRM;
    private javax.swing.JButton btDashboard;
    private javax.swing.JButton btDeals;
    private javax.swing.JButton btDesking;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btInventory;
    private javax.swing.JButton btLogOut;
    private javax.swing.JButton btParts;
    private javax.swing.JButton btReports;
    private javax.swing.JButton btService;
    private javax.swing.JButton btTraining;
    private javax.swing.JLabel lbCompany;
    private javax.swing.JLabel lbLogoDMS;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSideBar;
    private javax.swing.JPanel pnSideBarButtons;
    // End of variables declaration//GEN-END:variables
}
