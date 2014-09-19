/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package org.vistahermosa.ui;

import java.io.File;
import java.net.MalformedURLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.vistahermosa.util.WebBrowserUtil;

/**
 *
 * @author thomas
 */
public class Browser extends javax.swing.JFrame {

    public Browser() {
        initComponents();
        final boolean isLocal = false;
        if (isLocal) {
            final File archivo = new File("es_242_01_03_02.html");
            String url = "";
            try {
                url = archivo.toURI().toURL().toString();
            } catch (MalformedURLException e) {
            }
            new WebBrowserUtil().getNewBrowser(url, pnBrowser);
        } else {
            final String site = "https://www.google.com";
            new WebBrowserUtil().getNewBrowser(site, pnBrowser);
        }
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnData = new javax.swing.JPanel();
        tbURL = new javax.swing.JTextField();
        btGO = new javax.swing.JButton();
        pnBrowser = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navegador Java Swing");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 650));

        pnData.setBackground(new java.awt.Color(204, 204, 255));
        pnData.setMinimumSize(new java.awt.Dimension(1366, 50));
        pnData.setPreferredSize(new java.awt.Dimension(1366, 50));

        tbURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbURLKeyReleased(evt);
            }
        });

        btGO.setText("GO");
        btGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDataLayout = new javax.swing.GroupLayout(pnData);
        pnData.setLayout(pnDataLayout);
        pnDataLayout.setHorizontalGroup(
            pnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tbURL, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGO)
                .addContainerGap(720, Short.MAX_VALUE))
        );
        pnDataLayout.setVerticalGroup(
            pnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGO))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnBrowser.setBackground(new java.awt.Color(255, 255, 255));
        pnBrowser.setMinimumSize(new java.awt.Dimension(1366, 600));
        pnBrowser.setPreferredSize(new java.awt.Dimension(1366, 600));

        javax.swing.GroupLayout pnBrowserLayout = new javax.swing.GroupLayout(pnBrowser);
        pnBrowser.setLayout(pnBrowserLayout);
        pnBrowserLayout.setHorizontalGroup(
            pnBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        pnBrowserLayout.setVerticalGroup(
            pnBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbURLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbURLKeyReleased
        Character c = evt.getKeyChar();
        if (c == 10) {
            browse();
        }
    }//GEN-LAST:event_tbURLKeyReleased

    private void btGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGOActionPerformed
        browse();
    }//GEN-LAST:event_btGOActionPerformed

    private void browse() {
        String url = tbURL.getText().trim();
        if (!url.isEmpty()) {
            if (!url.startsWith("https://")) {
                url = "https://"  + url;
            }
            tbURL.setText(url);
            new WebBrowserUtil().getNewBrowser(url, pnBrowser);
        }
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Browser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGO;
    private javax.swing.JPanel pnBrowser;
    private javax.swing.JPanel pnData;
    private javax.swing.JTextField tbURL;
    // End of variables declaration//GEN-END:variables
}
