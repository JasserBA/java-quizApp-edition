/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.app.java;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jasse
 */
public class leaderBoardViewer extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form leaderBoardViewer
     */
    public leaderBoardViewer() {
        initComponents();
        customizeTableHeader();
        fetchAndDisplayData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1325, 768));
        setPreferredSize(new java.awt.Dimension(1325, 768));
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/app/java/back.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(25, 39, 50, 50);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "SCORE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(50);
        jTable1.setRowMargin(0);
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(255, 204, 0));
        jTable1.setShowHorizontalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 150, 740, 580);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("~ LEADERBOARD ~");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 50, 500, 58);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/app/java/bgRotatedOpacity035.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void customizeTableHeader() {
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 30));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(255,204,0));
        jTable1.getTableHeader().setForeground(Color.BLACK);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRenderer);
        jTable1.setDefaultRenderer(Integer.class, centerRenderer);
}
private void fetchAndDisplayData() {
     model = (DefaultTableModel) jTable1.getModel();
    
    String requete = "SELECT userName, Score FROM users ORDER BY Score DESC";

    try {
            Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/quiz-app-java", "root", "admin");
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(requete);

         while (res.next()) {
            String userName = res.getString("userName");
            int score = res.getInt("Score");
            model.addRow(new Object[]{userName, score});
        }

        // Close the connection and statement after use
        st.close();
        con.close();
    } catch (Exception e) {
        System.out.println("error d'afficher");
    }
             
    }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Home x = new Home();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        x.getContentPane().setBackground(Color.WHITE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(leaderBoardViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leaderBoardViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leaderBoardViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leaderBoardViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            leaderBoardViewer x = new leaderBoardViewer();
            x.getContentPane().setBackground(Color.WHITE);
            x.setLocationRelativeTo(null);
            x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
