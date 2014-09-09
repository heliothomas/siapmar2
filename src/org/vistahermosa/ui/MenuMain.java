package org.vistahermosa.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
//import modelo.D_Grupo;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
//import sc.Archivo;
//import sc.Conexion;
import org.vistahermosa.util.Util;
import org.vistahermosa.util.dialog.DAbout;
import org.vistahermosa.util.dialog.DAditional;
import org.vistahermosa.util.dialog.DTest;
import org.vistahermosa.util.dialog.DUser;

public class MenuMain extends JFrame {

//File file = null;
//private FileNameExtensionFilter filter = new FileNameExtensionFilter("backup");
Connection conx;
Statement stm;       //Sirve para consultar
PreparedStatement ps;//Sirve para insertar, eliminar y actualizar
ResultSet rs;

    public MenuMain() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(Util.getURL("controlpanel.png")));
        setLocationRelativeTo(null);
        
        Util.setClock(menuClock);
//        lbFondo.setIcon(null);
//        lbFondo.setSize(2, 1);
//        lbFondo.removeAll();
//        lbFondo.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filecRespaldo = new javax.swing.JFileChooser();
        dskp = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuSetup = new javax.swing.JMenu();
        miUserAccount = new javax.swing.JMenuItem();
        miPatrocinador = new javax.swing.JMenuItem();
        miGrupo = new javax.swing.JMenuItem();
        miAlumno = new javax.swing.JMenuItem();
        menuAppearance = new javax.swing.JMenu();
        menuSkin = new javax.swing.JMenu();
        miSeaGlass = new javax.swing.JMenuItem();
        miStandard = new javax.swing.JMenuItem();
        miBlueLight = new javax.swing.JMenuItem();
        miAluOxide = new javax.swing.JMenuItem();
        miWhiteVision = new javax.swing.JMenuItem();
        miBlackEye = new javax.swing.JMenuItem();
        miBlackMoon = new javax.swing.JMenuItem();
        miBlackStar = new javax.swing.JMenuItem();
        menuInformation = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();
        miAditional = new javax.swing.JMenuItem();
        menuClock = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIAPMAR");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        dskp.setBackground(new java.awt.Color(240, 240, 240));

        menuSetup.setText("Configurar");

        miUserAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        miUserAccount.setText("Cuenta de Usuario");
        miUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUserAccountActionPerformed(evt);
            }
        });
        menuSetup.add(miUserAccount);

        miPatrocinador.setText("Patrocinador");
        menuSetup.add(miPatrocinador);

        miGrupo.setText("Grupo");
        menuSetup.add(miGrupo);

        miAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        miAlumno.setText("Alumno");
        miAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlumnoActionPerformed(evt);
            }
        });
        menuSetup.add(miAlumno);

        menuBar.add(menuSetup);

        menuAppearance.setText("Apariencia");

        menuSkin.setText("Piel");

        miSeaGlass.setText("Sea Glass");
        miSeaGlass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSeaGlassActionPerformed(evt);
            }
        });
        menuSkin.add(miSeaGlass);

        miStandard.setText("Standard");
        miStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStandardActionPerformed(evt);
            }
        });
        menuSkin.add(miStandard);

        miBlueLight.setText("Blue Light");
        miBlueLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueLightActionPerformed(evt);
            }
        });
        menuSkin.add(miBlueLight);

        miAluOxide.setText("Alu Oxide");
        miAluOxide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAluOxideActionPerformed(evt);
            }
        });
        menuSkin.add(miAluOxide);

        miWhiteVision.setText("White Vision");
        miWhiteVision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWhiteVisionActionPerformed(evt);
            }
        });
        menuSkin.add(miWhiteVision);

        miBlackEye.setText("Black Eye");
        miBlackEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackEyeActionPerformed(evt);
            }
        });
        menuSkin.add(miBlackEye);

        miBlackMoon.setText("Black Moon");
        miBlackMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackMoonActionPerformed(evt);
            }
        });
        menuSkin.add(miBlackMoon);

        miBlackStar.setText("Black Star");
        miBlackStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackStarActionPerformed(evt);
            }
        });
        menuSkin.add(miBlackStar);

        menuAppearance.add(menuSkin);

        menuBar.add(menuAppearance);

        menuInformation.setText("Información");

        miAbout.setText("Acerca de");
        miAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAboutActionPerformed(evt);
            }
        });
        menuInformation.add(miAbout);

        miAditional.setText("Adicional");
        miAditional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAditionalActionPerformed(evt);
            }
        });
        menuInformation.add(miAditional);

        menuBar.add(menuInformation);

        menuClock.setText("Reloj");

        menuBar.add(Box.createHorizontalGlue());

        menuBar.add(menuClock);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskp, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskp, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(966, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    public static IFondoMedicoComp fonmed = null;
//    public static IFichaSocioEcon fichaSE = null;
//    public static IHistory hist = null;
//    public static IVisitas vis = null;
//    public static IRegNecSpe regNecSpe = null;
//    public static IRegCorrespondencia regCorres = null;
//    public static IInformeRefDiagTrat infRefDiagTrat = null;
//    public static ITipoProgEdu tipoProgEdu = null;
//    public static IActualizacionPerfiles actperf = null;
//    public static IPerfilAdministrativo perfAdm = null;
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
//        if (DBackImage.fot != null) {
//            MenuMain.lbFondo.setSize(MenuMain.dskp.getWidth()-50,MenuMain.dskp.getHeight()-50);
//            ImageIcon imgRes = new ImageIcon(DBackImage.fot.getImage().getScaledInstance(MenuMain.lbFondo.getWidth(),MenuMain.lbFondo.getHeight(), Image.SCALE_SMOOTH));
//            MenuMain.lbFondo.setIcon(imgRes);
//            this.repaint();
//        }
    }//GEN-LAST:event_formComponentResized

    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed
        DAbout about = new DAbout(this, true);
        about.setVisible(true);
    }//GEN-LAST:event_miAboutActionPerformed

    private void miAditionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAditionalActionPerformed
        DAditional aditional = new DAditional(this, true);
        aditional.setVisible(true);
    }//GEN-LAST:event_miAditionalActionPerformed

    private void miAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlumnoActionPerformed
        Object[] options = {"Nuevo Alumno","Actualizar Alumno"};
        int i = JOptionPane.showOptionDialog(null, "¿Desea crear un nuevo alumno o actualizar?", "Elija una opción", 
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (i == 0) {
            JOptionPane.showMessageDialog(null, "Has elegido crear un nuevo alumno.");
        } else if (i == 1) {
            JOptionPane.showMessageDialog(null, "Has elegido actualizar un alumno.");
        }
    }//GEN-LAST:event_miAlumnoActionPerformed

    private void miUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUserAccountActionPerformed
//        DTest test = new DTest(this, true);
//        test.setVisible(true);
        DUser user = new DUser(this, true);
        user.setVisible(true);
    }//GEN-LAST:event_miUserAccountActionPerformed

    private void miSeaGlassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSeaGlassActionPerformed
        Util.setSkin("seaGlass", this);
    }//GEN-LAST:event_miSeaGlassActionPerformed

    private void miStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStandardActionPerformed
        Util.setSkin("syntheticaStandard", this);
    }//GEN-LAST:event_miStandardActionPerformed

    private void miBlueLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueLightActionPerformed
        Util.setSkin("syntheticaBlueLight", this);
    }//GEN-LAST:event_miBlueLightActionPerformed

    private void miAluOxideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAluOxideActionPerformed
        Util.setSkin("syntheticaAluOxide", this);
    }//GEN-LAST:event_miAluOxideActionPerformed

    private void miWhiteVisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWhiteVisionActionPerformed
        Util.setSkin("syntheticaWhiteVision", this);
    }//GEN-LAST:event_miWhiteVisionActionPerformed

    private void miBlackEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackEyeActionPerformed
        Util.setSkin("syntheticaBlackEye", this);
    }//GEN-LAST:event_miBlackEyeActionPerformed

    private void miBlackMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackMoonActionPerformed
        Util.setSkin("syntheticaBlackMoon", this);
    }//GEN-LAST:event_miBlackMoonActionPerformed

    private void miBlackStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackStarActionPerformed
        Util.setSkin("syntheticaBlackStar", this);
    }//GEN-LAST:event_miBlackStarActionPerformed
    
//    public static IPediatrica pedt = null;
//    public static IRevExp rev = null;// String servidor, String puerto, String usuario, String password, String basedatos, String path 

//    @Override
//    public Image getIconImage(){
//        //ClassLoader.getSystemResource(Util.putImage("controlpanel.png"))
//        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(Util.putImage("controlpanel.png")));
//        return retValue;
//    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuMain frame = new MenuMain();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dskp;
    private javax.swing.JFileChooser filecRespaldo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAppearance;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuClock;
    private javax.swing.JMenu menuInformation;
    private javax.swing.JMenu menuSetup;
    private javax.swing.JMenu menuSkin;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miAditional;
    private javax.swing.JMenuItem miAluOxide;
    private javax.swing.JMenuItem miAlumno;
    private javax.swing.JMenuItem miBlackEye;
    private javax.swing.JMenuItem miBlackMoon;
    private javax.swing.JMenuItem miBlackStar;
    private javax.swing.JMenuItem miBlueLight;
    private javax.swing.JMenuItem miGrupo;
    private javax.swing.JMenuItem miPatrocinador;
    private javax.swing.JMenuItem miSeaGlass;
    private javax.swing.JMenuItem miStandard;
    private javax.swing.JMenuItem miUserAccount;
    private javax.swing.JMenuItem miWhiteVision;
    // End of variables declaration//GEN-END:variables
}