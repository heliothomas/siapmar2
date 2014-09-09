/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package org.vistahermosa.util.dialog;

/**
 *
 * @author user
 */
public class DUser extends javax.swing.JDialog {

    /**
     * Creates new form DUser
     * @param parent
     * @param modal
     */
    public DUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfSeePass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        lbNombreUsuario = new javax.swing.JLabel();
        lbPassw = new javax.swing.JLabel();
        tfUN = new javax.swing.JTextField();
        pfPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox();
        cbActivar = new javax.swing.JCheckBox();
        pbPass = new javax.swing.JProgressBar();
        lbStrenghtPass = new javax.swing.JLabel();
        cbVer = new javax.swing.JCheckBox();
        tfSeePass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de Cuentas de Usuario");

        lbNombreUsuario.setText("*Nombre de usuario");

        lbPassw.setText("*Contraseña");

        tfUN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUNKeyReleased(evt);
            }
        });

        pfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfPassKeyReleased(evt);
            }
        });

        jLabel4.setText("Cargo");

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Docente", "Director", "Secretario" }));

        cbActivar.setBackground(new java.awt.Color(255, 255, 255));
        cbActivar.setSelected(true);
        cbActivar.setText("*Poner activo / inactivo");

        pbPass.setStringPainted(true);

        cbVer.setText("Ver");
        cbVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVerActionPerformed(evt);
            }
        });

        tfSeePass.setEditable(false);

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(72, 72, 72)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(pfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbActivar)
                            .addComponent(lbStrenghtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addComponent(cbVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSeePass, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnMainLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNombreUsuario)
                        .addComponent(lbPassw))
                    .addContainerGap(349, Short.MAX_VALUE)))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVer)
                    .addComponent(tfSeePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStrenghtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbActivar))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnMainLayout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(lbNombreUsuario)
                    .addGap(28, 28, 28)
                    .addComponent(lbPassw)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUNKeyReleased
        Character d = new Character(evt.getKeyChar());

        if (!tfUN.getText().equals("") && d == 10){
        }
    }//GEN-LAST:event_tfUNKeyReleased

    private void pfPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyReleased
        strenghtPass();
    }//GEN-LAST:event_pfPassKeyReleased

    private void cbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVerActionPerformed
        if (cbVer.isSelected()) {
            tfSeePass.setVisible(true);
        } else {
            tfSeePass.setVisible(false);
        }
    }//GEN-LAST:event_cbVerActionPerformed

    //Vacio,1 uppercase,1 lowercase,1 number,>= 6 chars
    private void strenghtPass() {
        tfSeePass.setText("");
        final String pw = pfPass.getText().trim();
        int percent = 0;
        boolean thereis = false;

        if (!pw.isEmpty()) {
            tfSeePass.setText(pw);
            percent += 20;

            for (int i = pw.length()-1; i >= 0; i--) {
                if (Character.isUpperCase(pw.charAt(i))) {
                    thereis = true;
                }
            }
            if (thereis) {
                percent += 20;
            }
            //minus
            thereis = false;
            for (int i = pw.length()-1; i >= 0; i--) {
                if (Character.isLowerCase(pw.charAt(i))) {
                    thereis = true;
                }
            }
            if (thereis) {
                percent += 20;
            }
            //digit
            thereis = false;
            for (int i = pw.length()-1; i >= 0; i--) {
                if (Character.isDigit(pw.charAt(i))) {
                    thereis = true;
                }
            }
            if (thereis) {
                percent += 20;
            }
            //lenght
            if (pw.length() >= 6) {
                percent += 20;
            }
        }
        switch (percent) {
            case 0:
                lbStrenghtPass.setText("Contrasena Invalida");
                break;
            case 20:
                lbStrenghtPass.setText("Muy Debil");
                break;
            case 40:
                lbStrenghtPass.setText("Debil");
                break;
            case 60:
                lbStrenghtPass.setText("Debil Aun");
                break;
            case 80:
                lbStrenghtPass.setText("Ya Casi");
                break;
            case 100:
                lbStrenghtPass.setText("Buena Contrasena");
                break;
        }
        pbPass.setValue(percent);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DUser dialog = new DUser(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox cbActivar;
    private javax.swing.JCheckBox cbVer;
    public javax.swing.JComboBox cbxCargo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lbPassw;
    private javax.swing.JLabel lbStrenghtPass;
    private javax.swing.JProgressBar pbPass;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTextField tfSeePass;
    private javax.swing.JTextField tfUN;
    // End of variables declaration//GEN-END:variables
}
