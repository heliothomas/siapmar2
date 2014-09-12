package org.vistahermosa.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.Box;
import javax.swing.JButton;
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
        lbUser = new javax.swing.JLabel();
        lbCompany = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btLogOut = new javax.swing.JButton();
        pnContent = new javax.swing.JPanel();
        pnSideBar = new javax.swing.JPanel();
        pnButtons = new javax.swing.JPanel();
        btHome = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btInventory = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 1), new java.awt.Dimension(50, 1), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btDeals = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btBHPH = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btDesking = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btDashboard = new javax.swing.JButton();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btCRM = new javax.swing.JButton();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btAccounting = new javax.swing.JButton();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btService = new javax.swing.JButton();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btParts = new javax.swing.JButton();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btTraining = new javax.swing.JButton();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        btReports = new javax.swing.JButton();
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1), new java.awt.Dimension(0, 1));
        fillerHome = new javax.swing.Box.Filler(new java.awt.Dimension(5, 30), new java.awt.Dimension(5, 30), new java.awt.Dimension(0, 32767));
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerInventory = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerDeals = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerBHPH = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerDesking = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerDashboard = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerCRM = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerAccounting = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerService = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerParts = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler33 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerTraining = new javax.swing.Box.Filler(new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20), new java.awt.Dimension(10, 20));
        filler34 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        fillerReports = new javax.swing.Box.Filler(new java.awt.Dimension(5, 20), new java.awt.Dimension(5, 20), new java.awt.Dimension(5, 20));
        filler35 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setName("Form"); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        pnMain.setBackground(new java.awt.Color(255, 255, 102));
        pnMain.setMinimumSize(new java.awt.Dimension(800, 500));
        pnMain.setName("pnMain"); // NOI18N
        pnMain.setPreferredSize(new java.awt.Dimension(800, 500));
        pnMain.setLayout(new java.awt.GridBagLayout());

        pnBanner.setBackground(new java.awt.Color(225, 225, 225));
        pnBanner.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnBanner.setMinimumSize(new java.awt.Dimension(0, 15));
        pnBanner.setName("pnBanner"); // NOI18N
        pnBanner.setPreferredSize(new java.awt.Dimension(800, 50));

        lbLogoDMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/LogoAutoMatrix.png"))); // NOI18N
        lbLogoDMS.setName("lbLogoDMS"); // NOI18N

        lbUser.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iUser.png"))); // NOI18N
        lbUser.setText("Thomas Mora"); // NOI18N
        lbUser.setName("lbUser"); // NOI18N

        lbCompany.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbCompany.setText("FLORIDA FINE CARS, INC."); // NOI18N
        lbCompany.setName("lbCompany"); // NOI18N

        jPanel2.setName("jPanel2"); // NOI18N

        btLogOut.setBackground(new java.awt.Color(225, 225, 225));
        btLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iOff.png"))); // NOI18N
        btLogOut.setContentAreaFilled(false);
        btLogOut.setMaximumSize(new java.awt.Dimension(50, 50));
        btLogOut.setMinimumSize(new java.awt.Dimension(50, 50));
        btLogOut.setName("btLogOut"); // NOI18N
        btLogOut.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBannerLayout = new javax.swing.GroupLayout(pnBanner);
        pnBanner.setLayout(pnBannerLayout);
        pnBannerLayout.setHorizontalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogoDMS)
                .addGap(241, 241, 241)
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCompany, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbUser, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnBannerLayout.setVerticalGroup(
            pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBannerLayout.createSequentialGroup()
                .addGroup(pnBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbLogoDMS))
                    .addGroup(pnBannerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCompany)
                        .addGap(7, 7, 7)
                        .addComponent(lbUser))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 435, Short.MAX_VALUE)
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

        pnSideBar.setBackground(new java.awt.Color(35, 35, 35));
        pnSideBar.setMinimumSize(new java.awt.Dimension(180, 394));
        pnSideBar.setName("pnSideBar"); // NOI18N
        pnSideBar.setPreferredSize(new java.awt.Dimension(180, 394));
        pnSideBar.setVerifyInputWhenFocusTarget(false);
        pnSideBar.setLayout(new org.jdesktop.swingx.VerticalLayout());

        pnButtons.setBackground(new java.awt.Color(35, 35, 35));
        pnButtons.setMinimumSize(new java.awt.Dimension(180, 425));
        pnButtons.setName("pnButtons"); // NOI18N
        pnButtons.setPreferredSize(new java.awt.Dimension(180, 383));
        pnButtons.setVerifyInputWhenFocusTarget(false);
        java.awt.GridBagLayout pnBottonsLayout = new java.awt.GridBagLayout();
        pnBottonsLayout.columnWidths = new int[] {0, 5, 0};
        pnBottonsLayout.rowHeights = new int[] {0};
        pnButtons.setLayout(pnBottonsLayout);

        btHome.setBackground(new java.awt.Color(35, 35, 35));
        btHome.setForeground(new java.awt.Color(139, 139, 139));
        btHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iHome.png"))); // NOI18N
        btHome.setText("HOME"); // NOI18N
        btHome.setContentAreaFilled(false);
        btHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btHome.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btHome.setMaximumSize(new java.awt.Dimension(220, 30));
        btHome.setMinimumSize(new java.awt.Dimension(220, 30));
        btHome.setName("btHome"); // NOI18N
        btHome.setPreferredSize(new java.awt.Dimension(220, 30));
        btHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btHomeMouseExited(evt);
            }
        });
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pnButtons.add(btHome, gridBagConstraints);

        filler1.setBackground(new java.awt.Color(10, 10, 10));
        filler1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler1.setForeground(new java.awt.Color(255, 255, 255));
        filler1.setName("filler1"); // NOI18N
        filler1.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pnButtons.add(filler1, gridBagConstraints);

        filler2.setBackground(new java.awt.Color(61, 61, 61));
        filler2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler2.setName("filler2"); // NOI18N
        filler2.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler2, gridBagConstraints);

        btInventory.setBackground(new java.awt.Color(0, 0, 0));
        btInventory.setForeground(new java.awt.Color(139, 139, 139));
        btInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iInventory.png"))); // NOI18N
        btInventory.setText("INVENTORY"); // NOI18N
        btInventory.setContentAreaFilled(false);
        btInventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btInventory.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btInventory.setMaximumSize(new java.awt.Dimension(220, 30));
        btInventory.setMinimumSize(new java.awt.Dimension(220, 30));
        btInventory.setName("btInventory"); // NOI18N
        btInventory.setPreferredSize(new java.awt.Dimension(220, 30));
        btInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btInventoryMouseExited(evt);
            }
        });
        btInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInventoryActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        pnButtons.add(btInventory, gridBagConstraints);

        filler3.setBackground(new java.awt.Color(10, 10, 10));
        filler3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler3.setForeground(new java.awt.Color(255, 255, 255));
        filler3.setName("filler3"); // NOI18N
        filler3.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler3, gridBagConstraints);

        filler4.setBackground(new java.awt.Color(61, 61, 61));
        filler4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler4.setName("filler4"); // NOI18N
        filler4.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler4, gridBagConstraints);

        btDeals.setBackground(new java.awt.Color(0, 0, 0));
        btDeals.setForeground(new java.awt.Color(139, 139, 139));
        btDeals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iDeals.png"))); // NOI18N
        btDeals.setText("DEALS"); // NOI18N
        btDeals.setContentAreaFilled(false);
        btDeals.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeals.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btDeals.setMaximumSize(new java.awt.Dimension(220, 30));
        btDeals.setMinimumSize(new java.awt.Dimension(220, 30));
        btDeals.setName("btDeals"); // NOI18N
        btDeals.setPreferredSize(new java.awt.Dimension(220, 30));
        btDeals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDealsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDealsMouseExited(evt);
            }
        });
        btDeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDealsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        pnButtons.add(btDeals, gridBagConstraints);

        filler5.setBackground(new java.awt.Color(10, 10, 10));
        filler5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler5.setForeground(new java.awt.Color(255, 255, 255));
        filler5.setName("filler5"); // NOI18N
        filler5.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler5, gridBagConstraints);

        filler6.setBackground(new java.awt.Color(61, 61, 61));
        filler6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler6.setName("filler6"); // NOI18N
        filler6.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler6, gridBagConstraints);

        btBHPH.setBackground(new java.awt.Color(0, 0, 0));
        btBHPH.setForeground(new java.awt.Color(139, 139, 139));
        btBHPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iBHPH.png"))); // NOI18N
        btBHPH.setText("BHPH"); // NOI18N
        btBHPH.setContentAreaFilled(false);
        btBHPH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btBHPH.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btBHPH.setMaximumSize(new java.awt.Dimension(220, 30));
        btBHPH.setMinimumSize(new java.awt.Dimension(220, 30));
        btBHPH.setName("btBHPH"); // NOI18N
        btBHPH.setPreferredSize(new java.awt.Dimension(220, 30));
        btBHPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btBHPHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btBHPHMouseExited(evt);
            }
        });
        btBHPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBHPHActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        pnButtons.add(btBHPH, gridBagConstraints);

        filler7.setBackground(new java.awt.Color(10, 10, 10));
        filler7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler7.setForeground(new java.awt.Color(255, 255, 255));
        filler7.setName("filler7"); // NOI18N
        filler7.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler7, gridBagConstraints);

        filler8.setBackground(new java.awt.Color(61, 61, 61));
        filler8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler8.setName("filler8"); // NOI18N
        filler8.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler8, gridBagConstraints);

        btDesking.setBackground(new java.awt.Color(0, 0, 0));
        btDesking.setForeground(new java.awt.Color(139, 139, 139));
        btDesking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iDesking.png"))); // NOI18N
        btDesking.setText("DESKING"); // NOI18N
        btDesking.setContentAreaFilled(false);
        btDesking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDesking.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btDesking.setMaximumSize(new java.awt.Dimension(220, 30));
        btDesking.setMinimumSize(new java.awt.Dimension(220, 30));
        btDesking.setName("btDesking"); // NOI18N
        btDesking.setPreferredSize(new java.awt.Dimension(220, 30));
        btDesking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDeskingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDeskingMouseExited(evt);
            }
        });
        btDesking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeskingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        pnButtons.add(btDesking, gridBagConstraints);

        filler9.setBackground(new java.awt.Color(10, 10, 10));
        filler9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler9.setForeground(new java.awt.Color(255, 255, 255));
        filler9.setName("filler9"); // NOI18N
        filler9.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler9, gridBagConstraints);

        filler10.setBackground(new java.awt.Color(61, 61, 61));
        filler10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler10.setName("filler10"); // NOI18N
        filler10.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler10, gridBagConstraints);

        btDashboard.setBackground(new java.awt.Color(0, 0, 0));
        btDashboard.setForeground(new java.awt.Color(139, 139, 139));
        btDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iDashboard.png"))); // NOI18N
        btDashboard.setText("DASHBOARD"); // NOI18N
        btDashboard.setContentAreaFilled(false);
        btDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDashboard.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btDashboard.setMaximumSize(new java.awt.Dimension(220, 30));
        btDashboard.setMinimumSize(new java.awt.Dimension(220, 30));
        btDashboard.setName("btDashboard"); // NOI18N
        btDashboard.setPreferredSize(new java.awt.Dimension(220, 30));
        btDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDashboardMouseExited(evt);
            }
        });
        btDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDashboardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        pnButtons.add(btDashboard, gridBagConstraints);

        filler11.setBackground(new java.awt.Color(10, 10, 10));
        filler11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler11.setForeground(new java.awt.Color(255, 255, 255));
        filler11.setName("filler11"); // NOI18N
        filler11.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler11, gridBagConstraints);

        filler12.setBackground(new java.awt.Color(61, 61, 61));
        filler12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler12.setName("filler12"); // NOI18N
        filler12.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler12, gridBagConstraints);

        btCRM.setBackground(new java.awt.Color(0, 0, 0));
        btCRM.setForeground(new java.awt.Color(139, 139, 139));
        btCRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iCRM.png"))); // NOI18N
        btCRM.setText("CRM"); // NOI18N
        btCRM.setContentAreaFilled(false);
        btCRM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCRM.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btCRM.setMaximumSize(new java.awt.Dimension(220, 30));
        btCRM.setMinimumSize(new java.awt.Dimension(220, 30));
        btCRM.setName("btCRM"); // NOI18N
        btCRM.setPreferredSize(new java.awt.Dimension(220, 30));
        btCRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCRMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCRMMouseExited(evt);
            }
        });
        btCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCRMActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        pnButtons.add(btCRM, gridBagConstraints);

        filler13.setBackground(new java.awt.Color(10, 10, 10));
        filler13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler13.setForeground(new java.awt.Color(255, 255, 255));
        filler13.setName("filler13"); // NOI18N
        filler13.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler13, gridBagConstraints);

        filler14.setBackground(new java.awt.Color(61, 61, 61));
        filler14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler14.setName("filler14"); // NOI18N
        filler14.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler14, gridBagConstraints);

        btAccounting.setBackground(new java.awt.Color(0, 0, 0));
        btAccounting.setForeground(new java.awt.Color(139, 139, 139));
        btAccounting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iAccounting.png"))); // NOI18N
        btAccounting.setText("ACCOUNTING"); // NOI18N
        btAccounting.setContentAreaFilled(false);
        btAccounting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAccounting.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btAccounting.setMaximumSize(new java.awt.Dimension(220, 30));
        btAccounting.setMinimumSize(new java.awt.Dimension(220, 30));
        btAccounting.setName("btAccounting"); // NOI18N
        btAccounting.setPreferredSize(new java.awt.Dimension(220, 30));
        btAccounting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAccountingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAccountingMouseExited(evt);
            }
        });
        btAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAccountingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 21;
        pnButtons.add(btAccounting, gridBagConstraints);

        filler15.setBackground(new java.awt.Color(10, 10, 10));
        filler15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler15.setForeground(new java.awt.Color(255, 255, 255));
        filler15.setName("filler15"); // NOI18N
        filler15.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler15, gridBagConstraints);

        filler16.setBackground(new java.awt.Color(61, 61, 61));
        filler16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler16.setName("filler16"); // NOI18N
        filler16.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler16, gridBagConstraints);

        btService.setBackground(new java.awt.Color(0, 0, 0));
        btService.setForeground(new java.awt.Color(139, 139, 139));
        btService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iService.png"))); // NOI18N
        btService.setText("SERVICE"); // NOI18N
        btService.setContentAreaFilled(false);
        btService.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btService.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btService.setMaximumSize(new java.awt.Dimension(220, 30));
        btService.setMinimumSize(new java.awt.Dimension(220, 30));
        btService.setName("btService"); // NOI18N
        btService.setPreferredSize(new java.awt.Dimension(220, 30));
        btService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btServiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btServiceMouseExited(evt);
            }
        });
        btService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServiceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        pnButtons.add(btService, gridBagConstraints);

        filler17.setBackground(new java.awt.Color(10, 10, 10));
        filler17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler17.setForeground(new java.awt.Color(255, 255, 255));
        filler17.setName("filler17"); // NOI18N
        filler17.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler17, gridBagConstraints);

        filler18.setBackground(new java.awt.Color(61, 61, 61));
        filler18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler18.setName("filler18"); // NOI18N
        filler18.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler18, gridBagConstraints);

        btParts.setBackground(new java.awt.Color(0, 0, 0));
        btParts.setForeground(new java.awt.Color(139, 139, 139));
        btParts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iParts.png"))); // NOI18N
        btParts.setText("PARTS"); // NOI18N
        btParts.setContentAreaFilled(false);
        btParts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btParts.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btParts.setMaximumSize(new java.awt.Dimension(220, 30));
        btParts.setMinimumSize(new java.awt.Dimension(220, 30));
        btParts.setName("btParts"); // NOI18N
        btParts.setPreferredSize(new java.awt.Dimension(220, 30));
        btParts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPartsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPartsMouseExited(evt);
            }
        });
        btParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPartsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 27;
        pnButtons.add(btParts, gridBagConstraints);

        filler19.setBackground(new java.awt.Color(10, 10, 10));
        filler19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler19.setForeground(new java.awt.Color(255, 255, 255));
        filler19.setName("filler19"); // NOI18N
        filler19.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler19, gridBagConstraints);

        filler20.setBackground(new java.awt.Color(61, 61, 61));
        filler20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler20.setName("filler20"); // NOI18N
        filler20.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler20, gridBagConstraints);

        btTraining.setBackground(new java.awt.Color(0, 0, 0));
        btTraining.setForeground(new java.awt.Color(139, 139, 139));
        btTraining.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iTraining.png"))); // NOI18N
        btTraining.setText("TRAINING"); // NOI18N
        btTraining.setContentAreaFilled(false);
        btTraining.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTraining.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btTraining.setMaximumSize(new java.awt.Dimension(220, 30));
        btTraining.setMinimumSize(new java.awt.Dimension(220, 30));
        btTraining.setName("btTraining"); // NOI18N
        btTraining.setPreferredSize(new java.awt.Dimension(220, 30));
        btTraining.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTrainingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTrainingMouseExited(evt);
            }
        });
        btTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrainingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        pnButtons.add(btTraining, gridBagConstraints);

        filler21.setBackground(new java.awt.Color(10, 10, 10));
        filler21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler21.setForeground(new java.awt.Color(255, 255, 255));
        filler21.setName("filler21"); // NOI18N
        filler21.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 31;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler21, gridBagConstraints);

        filler22.setBackground(new java.awt.Color(61, 61, 61));
        filler22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler22.setName("filler22"); // NOI18N
        filler22.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler22, gridBagConstraints);

        btReports.setBackground(new java.awt.Color(0, 0, 0));
        btReports.setForeground(new java.awt.Color(139, 139, 139));
        btReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/Iconos/iReports.png"))); // NOI18N
        btReports.setText("REPORTS"); // NOI18N
        btReports.setContentAreaFilled(false);
        btReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btReports.setMargin(new java.awt.Insets(0, -15, 0, 0));
        btReports.setMaximumSize(new java.awt.Dimension(220, 30));
        btReports.setMinimumSize(new java.awt.Dimension(220, 30));
        btReports.setName("btReports"); // NOI18N
        btReports.setPreferredSize(new java.awt.Dimension(220, 30));
        btReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btReportsMouseExited(evt);
            }
        });
        btReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReportsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 33;
        pnButtons.add(btReports, gridBagConstraints);

        filler23.setBackground(new java.awt.Color(10, 10, 10));
        filler23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filler23.setForeground(new java.awt.Color(255, 255, 255));
        filler23.setName("filler23"); // NOI18N
        filler23.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pnButtons.add(filler23, gridBagConstraints);

        fillerHome.setBackground(new java.awt.Color(35, 35, 35));
        fillerHome.setName("fillerHome"); // NOI18N
        fillerHome.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerHome, gridBagConstraints);

        filler24.setBackground(new java.awt.Color(31, 31, 31));
        filler24.setName("filler24"); // NOI18N
        filler24.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnButtons.add(filler24, gridBagConstraints);

        fillerInventory.setBackground(new java.awt.Color(35, 35, 35));
        fillerInventory.setName("fillerInventory"); // NOI18N
        fillerInventory.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerInventory, gridBagConstraints);

        filler25.setBackground(new java.awt.Color(31, 31, 31));
        filler25.setName("filler25"); // NOI18N
        filler25.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler25, gridBagConstraints);

        fillerDeals.setBackground(new java.awt.Color(35, 35, 35));
        fillerDeals.setName("fillerDeals"); // NOI18N
        fillerDeals.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerDeals, gridBagConstraints);

        filler26.setBackground(new java.awt.Color(31, 31, 31));
        filler26.setName("filler26"); // NOI18N
        filler26.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler26, gridBagConstraints);

        fillerBHPH.setBackground(new java.awt.Color(35, 35, 35));
        fillerBHPH.setName("fillerBHPH"); // NOI18N
        fillerBHPH.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerBHPH, gridBagConstraints);

        filler27.setBackground(new java.awt.Color(31, 31, 31));
        filler27.setName("filler27"); // NOI18N
        filler27.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler27, gridBagConstraints);

        fillerDesking.setBackground(new java.awt.Color(35, 35, 35));
        fillerDesking.setName("fillerDesking"); // NOI18N
        fillerDesking.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerDesking, gridBagConstraints);

        filler28.setBackground(new java.awt.Color(31, 31, 31));
        filler28.setName("filler28"); // NOI18N
        filler28.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler28, gridBagConstraints);

        fillerDashboard.setBackground(new java.awt.Color(35, 35, 35));
        fillerDashboard.setName("fillerDashboard"); // NOI18N
        fillerDashboard.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerDashboard, gridBagConstraints);

        filler29.setBackground(new java.awt.Color(31, 31, 31));
        filler29.setName("filler29"); // NOI18N
        filler29.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler29, gridBagConstraints);

        fillerCRM.setBackground(new java.awt.Color(35, 35, 35));
        fillerCRM.setName("fillerCRM"); // NOI18N
        fillerCRM.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerCRM, gridBagConstraints);

        filler30.setBackground(new java.awt.Color(31, 31, 31));
        filler30.setName("filler30"); // NOI18N
        filler30.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler30, gridBagConstraints);

        fillerAccounting.setBackground(new java.awt.Color(35, 35, 35));
        fillerAccounting.setName("fillerAccounting"); // NOI18N
        fillerAccounting.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerAccounting, gridBagConstraints);

        filler31.setBackground(new java.awt.Color(31, 31, 31));
        filler31.setName("filler31"); // NOI18N
        filler31.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler31, gridBagConstraints);

        fillerService.setBackground(new java.awt.Color(35, 35, 35));
        fillerService.setName("fillerService"); // NOI18N
        fillerService.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerService, gridBagConstraints);

        filler32.setBackground(new java.awt.Color(31, 31, 31));
        filler32.setName("filler32"); // NOI18N
        filler32.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler32, gridBagConstraints);

        fillerParts.setBackground(new java.awt.Color(35, 35, 35));
        fillerParts.setName("fillerParts"); // NOI18N
        fillerParts.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerParts, gridBagConstraints);

        filler33.setBackground(new java.awt.Color(31, 31, 31));
        filler33.setName("filler33"); // NOI18N
        filler33.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler33, gridBagConstraints);

        fillerTraining.setBackground(new java.awt.Color(35, 35, 35));
        fillerTraining.setName("fillerTraining"); // NOI18N
        fillerTraining.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerTraining, gridBagConstraints);

        filler34.setBackground(new java.awt.Color(31, 31, 31));
        filler34.setName("filler34"); // NOI18N
        filler34.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pnButtons.add(filler34, gridBagConstraints);

        fillerReports.setBackground(new java.awt.Color(35, 35, 35));
        fillerReports.setName("fillerReports"); // NOI18N
        fillerReports.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        pnButtons.add(fillerReports, gridBagConstraints);

        filler35.setBackground(new java.awt.Color(31, 31, 31));
        filler35.setName("filler35"); // NOI18N
        filler35.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnButtons.add(filler35, gridBagConstraints);

        pnSideBar.add(pnButtons);

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

    private void btHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseEntered
        btHome.setForeground(Color.white);
        btHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btHomeMouseEntered

    private void btHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btHomeMouseExited

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        showFillerSelected(fillerHome);
        buttonClicked = "home";
    }//GEN-LAST:event_btHomeActionPerformed

    private void btInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInventoryMouseEntered
        btInventory.setForeground(Color.white);
        btInventory.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btInventoryMouseEntered

    private void btInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInventoryMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btInventoryMouseExited

    private void btInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInventoryActionPerformed
        showFillerSelected(fillerInventory);
        buttonClicked = "inventory";
    }//GEN-LAST:event_btInventoryActionPerformed

    private void btDealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDealsActionPerformed
        showFillerSelected(fillerDeals);
        buttonClicked = "deals";
    }//GEN-LAST:event_btDealsActionPerformed

    private void btBHPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBHPHActionPerformed
        showFillerSelected(fillerBHPH);
        buttonClicked = "bhph";
    }//GEN-LAST:event_btBHPHActionPerformed

    private void btDeskingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeskingActionPerformed
        showFillerSelected(fillerDesking);
        buttonClicked = "desking";
    }//GEN-LAST:event_btDeskingActionPerformed

    private void btDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDashboardActionPerformed
        showFillerSelected(fillerDashboard);
        buttonClicked = "dashboard";
    }//GEN-LAST:event_btDashboardActionPerformed

    private void btCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCRMActionPerformed
        showFillerSelected(fillerCRM);
        buttonClicked = "crm";
    }//GEN-LAST:event_btCRMActionPerformed

    private void btAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAccountingActionPerformed
        showFillerSelected(fillerAccounting);
        buttonClicked = "accounting";
    }//GEN-LAST:event_btAccountingActionPerformed

    private void btServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServiceActionPerformed
        showFillerSelected(fillerService);
        buttonClicked = "service";
    }//GEN-LAST:event_btServiceActionPerformed

    private void btPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPartsActionPerformed
        showFillerSelected(fillerParts);
        buttonClicked = "parts";
    }//GEN-LAST:event_btPartsActionPerformed

    private void btTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrainingActionPerformed
        showFillerSelected(fillerTraining);
        buttonClicked = "training";
    }//GEN-LAST:event_btTrainingActionPerformed

    private void btReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReportsActionPerformed
        showFillerSelected(fillerReports);
        buttonClicked = "reports";
    }//GEN-LAST:event_btReportsActionPerformed

    private void btDealsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDealsMouseEntered
        btDeals.setForeground(Color.white);
    }//GEN-LAST:event_btDealsMouseEntered

    private void btDealsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDealsMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btDealsMouseExited

    private void btBHPHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBHPHMouseEntered
        btBHPH.setForeground(Color.white);
    }//GEN-LAST:event_btBHPHMouseEntered

    private void btBHPHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBHPHMouseExited
        if (!buttonClicked.equals("bhph")) {
            btBHPH.setForeground(new Color(139, 139, 139));
        }
    }//GEN-LAST:event_btBHPHMouseExited

    private void btDeskingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeskingMouseEntered
        btDesking.setForeground(Color.white);
    }//GEN-LAST:event_btDeskingMouseEntered

    private void btDeskingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeskingMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btDeskingMouseExited

    private void btDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDashboardMouseEntered
        btDashboard.setForeground(Color.white);
    }//GEN-LAST:event_btDashboardMouseEntered

    private void btDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDashboardMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btDashboardMouseExited

    private void btCRMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCRMMouseEntered
        btCRM.setForeground(Color.white);
    }//GEN-LAST:event_btCRMMouseEntered

    private void btCRMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCRMMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btCRMMouseExited

    private void btAccountingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAccountingMouseEntered
        btAccounting.setForeground(Color.white);
    }//GEN-LAST:event_btAccountingMouseEntered

    private void btAccountingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAccountingMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btAccountingMouseExited

    private void btServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btServiceMouseEntered
        btService.setForeground(Color.white);
    }//GEN-LAST:event_btServiceMouseEntered

    private void btServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btServiceMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btServiceMouseExited

    private void btPartsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPartsMouseEntered
        btParts.setForeground(Color.white);
    }//GEN-LAST:event_btPartsMouseEntered

    private void btPartsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPartsMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btPartsMouseExited

    private void btTrainingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrainingMouseEntered
        btTraining.setForeground(Color.white);
    }//GEN-LAST:event_btTrainingMouseEntered

    private void btTrainingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTrainingMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btTrainingMouseExited

    private void btReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReportsMouseEntered
        btReports.setForeground(Color.white);
    }//GEN-LAST:event_btReportsMouseEntered

    private void btReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReportsMouseExited
        fixForeground(buttonClicked);
    }//GEN-LAST:event_btReportsMouseExited

    private void fixForeground(final String buttonClicked) {
        for (Component comp : pnButtons.getComponents()) {
            if (comp instanceof JButton) {
                ((JButton)comp).setForeground(new Color(139, 139, 139));
                if (!buttonClicked.isEmpty()) {
                    if (((JButton)comp).getName().toLowerCase().contains(buttonClicked)) {
                        ((JButton)comp).setForeground(Color.white);
                    }
                }
            }
        }
    }

    private void showFillerSelected(final Box.Filler filler) {
        for (Component comp : pnButtons.getComponents()) {
            if (comp instanceof Box.Filler) {
                try {
                    Integer.valueOf(comp.getName().substring(6));
                } catch (NumberFormatException e) {
                    if (comp != filler) {
                        ((Box.Filler)comp).setBackground(new Color(35,35,35));
                    } else {
                        ((Box.Filler)comp).setBackground(new Color(247,62,62));
                    }
                }
                
            }
        }
    }

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
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler33;
    private javax.swing.Box.Filler filler34;
    private javax.swing.Box.Filler filler35;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.Box.Filler fillerAccounting;
    private javax.swing.Box.Filler fillerBHPH;
    private javax.swing.Box.Filler fillerCRM;
    private javax.swing.Box.Filler fillerDashboard;
    private javax.swing.Box.Filler fillerDeals;
    private javax.swing.Box.Filler fillerDesking;
    private javax.swing.Box.Filler fillerHome;
    private javax.swing.Box.Filler fillerInventory;
    private javax.swing.Box.Filler fillerParts;
    private javax.swing.Box.Filler fillerReports;
    private javax.swing.Box.Filler fillerService;
    private javax.swing.Box.Filler fillerTraining;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCompany;
    private javax.swing.JLabel lbLogoDMS;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pnBanner;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSideBar;
    // End of variables declaration//GEN-END:variables
    private String buttonClicked = "";
}