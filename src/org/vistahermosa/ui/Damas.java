package org.vistahermosa.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author thomas
 */
public class Damas extends javax.swing.JFrame {

    public Damas() {
        initComponents();
        for (int i = 1; i <= 64; i++) {
            bt = new JButton("button" + i);
            if (i < 9 || (i > 16 && i < 25)|| (i > 32 && i < 41)|| (i > 48 && i < 57) ) {
                if (i % 2 == 0) {
                    bt.setBackground(Color.white);
                } else {
                    bt.setBackground(new Color(64, 0, 0));
                }
            } else {
                if (i % 2 == 0) {
                    bt.setBackground(new Color(64, 0, 0));
                } else {
                    bt.setBackground(Color.white);
                }
            }
            bt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("hola: " + e.getActionCommand());
                }
            });
            this.add(bt);
        }
        setExtendedState(MAXIMIZED_BOTH);
    }
private JButton bt;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Damas");
        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(1300, 768));
        getContentPane().setLayout(new java.awt.GridLayout(8, 8));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Damas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
