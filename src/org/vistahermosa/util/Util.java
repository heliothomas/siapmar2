package org.vistahermosa.util;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author thomas
 */
public class Util {
    public static final String src = "org/vistahermosa/resources/img/sys/";
    public static final String os = System.getProperty("os.name").toLowerCase();

    public static String putImage(final String filename) {
        return src + filename;
    }
    
    public static void setSkin(final String skinName, final JFrame frame) {
        try {
            if (skinName.equals("seaGlass")) {
                UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
            } else if (skinName.equals("syntheticaStandard")) {
                UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
            } else if (skinName.equals("syntheticaBlueLight")) {
                UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
            } else if (skinName.equals("syntheticaAluOxide")) {
                UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
            } else if (skinName.equals("syntheticaWhiteVision")) {
                UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
            } else if (skinName.equals("syntheticaBlackEye")) {
                UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            } else if (skinName.equals("syntheticaBlackMoon")) {
                UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
            } else if (skinName.equals("syntheticaBlackStar")) {
                UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
            }
            SwingUtilities.updateComponentTreeUI(frame);
            frame.pack();
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Error with look and feel: " + e.getMessage());
        }
    }
        
    public static int[] getResolution() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int[] res = {screenSize.width, screenSize.height};
        return res;
    }
    
    public static void setClock(final JMenu menuClock) {
        menuClock.addActionListener((ActionEvent e) -> {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
            Date date = new Date();
            String[] days = {"Domingo", "Lunes", "Martes", "Miércoles",
                "Jueves", "Viernes", "Sábado"};
            menuClock.setText(days[date.getDay()] +", "+ format.format(date));
        });
        for (ActionListener al : menuClock.getActionListeners()) {
            Timer t = new Timer(1000, al);
            t.start();
        }
    }
}