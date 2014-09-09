package org.vistahermosa.ui;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.*;
import org.vistahermosa.util.Util;
import org.vistahermosa.util.dialog.DConfConxBD;
//import modelo.D_Login;
//import sc.MultiThreading;
//import sc.OSDetector;
//import sc.TextLimiter;

public class Login extends JFrame {
private final Util util = new Util();
    //Este cadena de caracteres se usará para validar
String letras = "[a-zA-Z]*";

    public Login() {
        initComponents();
//        AWTUtilities.setWindowOpacity(this, 0.65f);//Apply transparency
//        tfUN.setDocument(new TextLimiter(20));
//        pfPass.setDocument(new TextLimiter(20));
        
        tfUN.setColumns(3);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(Util.getURL("controlpanel.png")));
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        cbOlvido = new javax.swing.JCheckBox();
        btLogin = new javax.swing.JButton();
        lbImg = new javax.swing.JLabel();
        lbResult = new javax.swing.JLabel();
        tfUN = new javax.swing.JTextField();
        btConfConx = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 450));
        setName("frmLogin"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jLabel1.setText("Nombre de Usuario");

        jLabel2.setText("Contraseña");

        pfPass.setNextFocusableComponent(btLogin);
        pfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassFocusGained(evt);
            }
        });
        pfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfPassKeyReleased(evt);
            }
        });

        cbOlvido.setText("Se me olvidó el nombre de usuario y/o contraseña");
        cbOlvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOlvidoActionPerformed(evt);
            }
        });

        btLogin.setBackground(new java.awt.Color(0, 153, 51));
        btLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/btInicio.png"))); // NOI18N
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        lbImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/vistahermosa/resources/img/users.png"))); // NOI18N

        lbResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResult.setText("       ");

        tfUN.setNextFocusableComponent(pfPass);

        btConfConx.setText("Configurar Conexión");
        btConfConx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfConxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbResult)
                    .addComponent(cbOlvido)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbImg)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfUN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pfPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btConfConx)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(lbImg)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbOlvido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btConfConx)
                .addGap(7, 7, 7))
        );

        setSize(new java.awt.Dimension(380, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        login();
        hide();
        MenuMain jfMain = new MenuMain();
        jfMain.setVisible(true);
    }//GEN-LAST:event_btLoginActionPerformed

    private void pfPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyReleased
        
        lbResult.setText(util.senalarMayus());
        
        Character d = evt.getKeyChar();
        //Si pulsa la tecla Enter se dirige a la función login()
        //La tecla Enter o 'Salto de línea' en código ASCII es el número 10
        if (d == 10) {
            login();
        }
    }//GEN-LAST:event_pfPassKeyReleased

    private void cbOlvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOlvidoActionPerformed
        if (cbOlvido.isSelected()) {
//            DAccesoPerdido acclost = new DAccesoPerdido(JOptionPane.getFrameForComponent(this), true);
//            acclost.setLocationRelativeTo(null);
//            acclost.setVisible(true);
        }
    }//GEN-LAST:event_cbOlvidoActionPerformed

    private void pfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusGained
        lbResult.setText(util.senalarMayus());
    }//GEN-LAST:event_pfPassFocusGained

    private void btConfConxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfConxActionPerformed
        DConfConxBD confConx = new DConfConxBD(JOptionPane.getFrameForComponent(this), true);
        confConx.setLocationRelativeTo(null);
        confConx.setVisible(true);
    }//GEN-LAST:event_btConfConxActionPerformed

    public void login(){
/*
        D_Login log = new D_Login();
        if (log.ingresar(tfUN.getText(), pfPass.getText())) {
            lbResult.setText("Iniciando sesión ...");
            String[] args = {"Hola"};
            MultiThreading.main(args);
            
            try {
                UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                JOptionPane.showMessageDialog(null, "Error with look and feel: " + e.getMessage());
            }
            SwingUtilities.updateComponentTreeUI(this);
            
            hide();
        }else{
            lbResult.setText("Los datos ingresados son inválidos");
        }
*/
    }

    //Función donde se invoca y se ejecuta el formulario
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Error with look and feel: " + e.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            try {
                Thread.sleep(0);
            } catch (Exception e) { }
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfConx;
    public javax.swing.JButton btLogin;
    private javax.swing.JCheckBox cbOlvido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbImg;
    public javax.swing.JLabel lbResult;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextField tfUN;
    // End of variables declaration//GEN-END:variables
}