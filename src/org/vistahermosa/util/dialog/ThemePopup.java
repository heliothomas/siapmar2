package org.vistahermosa.util.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ThemePopup extends javax.swing.JDialog {

    private Timer timer;
    Thread theme, progress;
    int i = 0;
    
    public ThemePopup() {
        super();
        initComponents();
        this.setLocationRelativeTo(null);
        theme = new Thread("theme");
        theme.start();
        changing();
    }

    private void changing() {
        if (theme.isAlive()) {
            this.setVisible(true);
            timer = new Timer(50, new progreso());
            timer.start();
            JOptionPane.showMessageDialog(null, "skmfdfs jhdsijfghdsfijgh");
        }
    }

    public class progreso implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int i = pbTheme.getValue();
            if (i < 100) {
                i++;
                pbTheme.setValue(i);
            } else {
                timer.stop();
                ThemePopup.this.dispose();
            }
        }
    }

    public static void main(String args[]) {
        ThemePopup tp = new ThemePopup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbTheme = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Titulo"); // NOI18N
        setName("Form"); // NOI18N

        pbTheme.setName("pbTheme"); // NOI18N
        pbTheme.setStringPainted(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel1.setText("resultado"); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(pbTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pbTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pbTheme;
    // End of variables declaration//GEN-END:variables
}