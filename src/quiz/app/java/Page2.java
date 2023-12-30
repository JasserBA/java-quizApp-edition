/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.app.java;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author jasse
 */
public class Page2 extends javax.swing.JFrame {

    /**
     * Creates new form Page2
     */
    public Page2() {
        initComponents();
        btnHover(jButton1,new Color(255,204,0),Color.WHITE,Color.WHITE,Color.BLACK);  
        btnHover(jButton2,new Color(255,204,0),Color.WHITE,Color.WHITE,Color.BLACK);  
        btnHover(jButton3,new Color(255,204,0),Color.WHITE,Color.WHITE,Color.BLACK);  
        btnHover(jButton4,new Color(255,204,0),Color.WHITE,Color.WHITE,Color.BLACK);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1325, 768));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Bright White Stadium");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton2MouseDragged(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(242, 353, 800, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Real Madrid Stadium");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(242, 423, 800, 50);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Real Star Stadium");
        jButton4.setActionCommand("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(242, 493, 800, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Santiago Bernabéu");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(242, 563, 800, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("2. What is the home stadium of Real Madrid? ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 203, 829, 98);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/app/java/bgRotatedOpacity035.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 13, 1280, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void btnHover(JButton btn, Color clr, Color backClr,Color txt, Color backTxt) {
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn.setBackground(clr);
            btn.setForeground(txt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn.setBackground(backClr);
            btn.setForeground(backTxt);
        }
    });
    }
    private void jButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseDragged

    }//GEN-LAST:event_jButton2MouseDragged

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        //jButton2.setBorder(BorderFactory.createLineBorder(Color.black));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jButton2.setBackground(Color.RED);
            jButton2.setForeground(Color.WHITE);

            btnHover(jButton3,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton2,Color.RED,Color.RED,Color.WHITE,Color.WHITE);  
            btnHover(jButton1,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton4,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            Page3 x = new Page3();
                            x.getContentPane().setBackground(Color.WHITE);
                            x.setLocationRelativeTo(null);
                            x.setVisible(true);
                            Page2.this.setVisible(false);
                        }
                    });
                }
            }).start();    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jButton3.setBackground(Color.RED);
            jButton3.setForeground(Color.WHITE);

            btnHover(jButton3,Color.RED,Color.RED,Color.WHITE,Color.WHITE);  
            btnHover(jButton2,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton1,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton4,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            Page3 x = new Page3();
                            x.getContentPane().setBackground(Color.WHITE);
                            x.setLocationRelativeTo(null);
                            x.setVisible(true);
                            Page2.this.setVisible(false);
                        }
                    });
                }
            }).start();    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jButton4.setBackground(Color.RED);
            jButton4.setForeground(Color.WHITE);

            btnHover(jButton3,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton2,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton1,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton4,Color.RED,Color.RED,Color.WHITE,Color.WHITE);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            Page3 x = new Page3();
                            x.getContentPane().setBackground(Color.WHITE);
                            x.setLocationRelativeTo(null);
                            x.setVisible(true);
                            Page2.this.setVisible(false);
                        }
                    });
                }
            }).start();    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            jButton1.setBackground(Color.GREEN);
            jButton1.setForeground(Color.WHITE);
            btnHover(jButton3,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton2,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            btnHover(jButton1,Color.GREEN,Color.GREEN,Color.WHITE,Color.WHITE);  
            btnHover(jButton4,Color.WHITE,Color.WHITE,Color.BLACK,Color.BLACK);  
            Home.nb++;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            Page3 x = new Page3();
                            x.getContentPane().setBackground(Color.WHITE);
                            x.setLocationRelativeTo(null);
                            x.setVisible(true);
                            Page2.this.setVisible(false);
                        }
                    });
                }
            }).start();  
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Page2 page2 = new Page2();
                page2.setVisible(true);
                page2.setLocationRelativeTo(null);
                page2.getContentPane().setBackground(Color.WHITE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
