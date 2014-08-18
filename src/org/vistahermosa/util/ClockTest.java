package org.vistahermosa.util;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.Timer;

public class ClockTest extends JFrame {

  public ClockTest() {
    super("Timer Demo");
    setSize(300, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    ClockLabel clock = new ClockLabel();
    getContentPane().add(clock, BorderLayout.NORTH);
  }

  public static void main(String args[]) {
    ClockTest ct = new ClockTest();
    ct.setVisible(true);
  }
}
class ClockLabel extends JMenu implements ActionListener {

  public ClockLabel() {
    super("" + new Date());
    Timer t = new Timer(1000, this);
    t.start();
  }

  public void actionPerformed(ActionEvent ae) {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    Date date = new Date();
    String[] days = {"Domingo", "Lunes", "Martes", "Miércoles",
        "Jueves", "Viernes", "Sábado"};
    //Fri Aug 15 16:49:30 CST 2014
    setText(days[date.getDay()] +", "+ format.format(date));
  }
}