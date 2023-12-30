/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.app.java;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author jasse
 */
public final class Signup extends javax.swing.JFrame {
    String firstname;
    String lastname;
    String username;
    String email;
    String password;
    String confirmpassword;
    JFrame frame = new JFrame("Notif");
    Border errorBorder = BorderFactory.createLineBorder(Color.RED, 1);
    Border defaultBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    Border focusBorder = BorderFactory.createLineBorder(new Color(255,204,0));

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        btnHover(jButton1,Color.BLACK,new Color(255,204,0),Color.WHITE,Color.BLACK);
        btnHover(jButton2,new Color(255,204,0),Color.WHITE,Color.WHITE,Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMinimumSize(new java.awt.Dimension(1325, 768));
        getContentPane().setLayout(null);

        jPasswordField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(110, 550, 400, 50);

        jTextField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(110, 150, 190, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setLabel("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 350, 200, 50);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Have an Account ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 240, 510, 57);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/app/java/officiel-bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 0, 630, 720);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Sign Up");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 30, 170, 50);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("First Name");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 110, 130, 40);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Email*");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 310, 130, 40);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton1.setText("Register");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 620, 400, 50);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Last Name");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 110, 130, 40);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Username*");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 210, 170, 40);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Password*");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 410, 130, 40);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setText("Confirm password*");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 510, 220, 40);

        jTextField3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(110, 350, 400, 50);

        jTextField5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(110, 250, 240, 50);

        jTextField7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(320, 150, 190, 50);

        jPasswordField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(110, 450, 400, 50);

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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login x=new Login();
        x.getContentPane().setBackground(Color.WHITE);
        x.setLocationRelativeTo(this);
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    firstname=this.jTextField2.getText();
    lastname=this.jTextField7.getText();
    username=this.jTextField5.getText();
    email=this.jTextField3.getText();
    password=this.jPasswordField2.getText();
    confirmpassword=this.jPasswordField1.getText();

 if (
    (firstname.isEmpty() || lastname.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()) ||
    (!password.equals(confirmpassword)) ||
    (!email.contains("@") || !email.contains("."))
) {
    jLabel4.setForeground(firstname.isEmpty() ? Color.RED : Color.BLACK);
    jTextField2.setBorder(firstname.isEmpty() ? errorBorder : defaultBorder);
    
    jLabel6.setForeground(lastname.isEmpty() ? Color.RED : Color.BLACK);
    jTextField7.setBorder(lastname.isEmpty() ? errorBorder : defaultBorder);
    
    jLabel7.setForeground(username.isEmpty() ? Color.RED : Color.BLACK);
    jTextField5.setBorder(username.isEmpty() ? errorBorder : defaultBorder);
    
    jLabel5.setForeground((!email.contains("@") || !email.contains(".")) ? Color.RED : Color.BLACK);
    jTextField3.setBorder((!email.contains("@") || !email.contains(".")) ? errorBorder : defaultBorder);
    
    jLabel8.setForeground(password.isEmpty() || !password.equals(confirmpassword) ? Color.RED : Color.BLACK);
    jPasswordField2.setBorder((password.isEmpty() || !password.equals(confirmpassword)) ? errorBorder : defaultBorder);
    
    jLabel9.setForeground(confirmpassword.isEmpty() || !password.equals(confirmpassword) ? Color.RED : Color.BLACK);
    jPasswordField1.setBorder((confirmpassword.isEmpty() || !password.equals(confirmpassword)) ? errorBorder : defaultBorder);
    
    JOptionPane.showMessageDialog(frame, "Invalid Signup!");
}
 else {
    
             
        String requete = "INSERT INTO users (firstName, lastName, userName, Email, Password) VALUES ('"+firstname+"','"+lastname+"','"+username+"','"+email+"','"+password+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/quiz-app-java?useSSL=false","root","admin");  
            Statement st=con.createStatement();  
            st.executeUpdate(requete);
            JOptionPane.showMessageDialog(this, "user added successfully");
            //after created, it teleports to Login Page
            Login x = new Login();
            x.getContentPane().setBackground(Color.WHITE);
            x.setLocationRelativeTo(null);
            x.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println("failed to create");
        }    }//GEN-LAST:event_jButton1ActionPerformed

     }
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
            
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
    jLabel4.setForeground(Color.BLACK);
    jTextField2.setBorder(focusBorder);
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        jLabel6.setForeground(Color.BLACK);
        jTextField7.setBorder(focusBorder);    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        jLabel7.setForeground(Color.BLACK);
        jTextField5.setBorder(focusBorder);    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        jLabel5.setForeground(Color.BLACK);
        jTextField3.setBorder(focusBorder);/*
    jTextField3.setBorder(defaultBorder);    }//GEN-LAST:event_jTextField3FocusGained
*/}
    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
    jLabel4.setForeground(Color.BLACK);
    jTextField2.setBorder(defaultBorder);
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        jLabel6.setForeground(Color.BLACK);
        jTextField7.setBorder(defaultBorder);
    }//GEN-LAST:event_jTextField7FocusLost

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jLabel9.setForeground(Color.BLACK);
    jPasswordField1.setBorder(focusBorder);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        jLabel8.setForeground(Color.BLACK);
    jPasswordField2.setBorder(focusBorder);
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
    jLabel8.setForeground(Color.BLACK);
    jPasswordField2.setBorder(defaultBorder);
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        jLabel7.setForeground(Color.BLACK);
        jTextField5.setBorder(defaultBorder);    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        jLabel5.setForeground(Color.BLACK);
    jTextField3.setBorder(defaultBorder);    }//GEN-LAST:event_jTextField3FocusLost

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
jLabel8.setForeground(Color.BLACK);
    jPasswordField1.setBorder(defaultBorder);
    }//GEN-LAST:event_jPasswordField1FocusLost

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Signup signup = new Signup();
                signup.setVisible(true);
                signup.setLocationRelativeTo(null);
                signup.getContentPane().setBackground(Color.WHITE);
                        }
        });
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}