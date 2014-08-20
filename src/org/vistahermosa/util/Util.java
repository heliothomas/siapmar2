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
import java.awt.event.KeyEvent;
import java.io.File;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author thomas
 */
public class Util {
    //System.getProperty("user.dir") +
//    public static final String IMG = "\\org\\vistahermosa\\resources\\img\\";
    public static final String IMG = "org/vistahermosa/resources/img/";
    public static final String OS = System.getProperty("os.name").toLowerCase();
    private static final Logger logger = LogManager.getLogger(Util.class);
    
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
            logger.log(Level.ERROR, e.getMessage());
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
    
    public static URL getURL(final String fileName) {
        Util u = new Util();
        ClassLoader cl = u.getClass().getClassLoader();
        return cl.getResource(IMG + fileName);
    }
    
    public static String getHostNameIP() {
        try {
            return InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            logger.log(Level.FATAL, e.getMessage());
            return null;
        }
    }
    public static Long[] getFreeTotalSpace(final String unit) {
        final Long[] size = {};
        final File file = new File("c:");
    	final Long totalSpace = file.getTotalSpace(); //total disk space in bytes.
    	final Long freeSpace = file.getFreeSpace();
        if (unit.equalsIgnoreCase("mb")) {
            size[0] = freeSpace / 1048576L;
            size[1] = totalSpace / 1048576L;
        }
        if (unit.equalsIgnoreCase("gb")) {
            size[0] = freeSpace / 1073741824L;
            size[1] = totalSpace / 1073741824L;
        }
        return size;
    }

    public static BigDecimal getBigDec(final String number) {
        BigDecimal bd = new BigDecimal(number);
        return bd.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static String senalarMayus(){
        if (Toolkit.getDefaultToolkit().getLockingKeyState(
                KeyEvent.VK_CAPS_LOCK) == true) {
            return "La tecla Bloq Mayus está activada";
        } else {
            return "La tecla Bloq Mayus ahora está desactivada";
        }
    }
}