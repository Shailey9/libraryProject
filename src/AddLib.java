
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddLib extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public AddLib() {
        initComponents();
        Connect();
        jButton1.setEnabled(false);
    }

    public void Connect()
    {
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pussgrc,lib.db","root","");
           stmt = (Statement) con.createStatement();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StrikkInnov:PUSSGRC( ADMIN LOGIN)");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(72, 72, 72));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("StrikInnov:PUSSGRC ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 240, 30);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.jpg"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(950, 10, 40, 40);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add Librarian");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 70, 430, 60);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME *");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 300, 130, 40);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD *");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 370, 130, 30);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMAIL_ID *");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 440, 130, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CITY *");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 560, 130, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USER_ID *");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 240, 130, 40);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONTACT *");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 620, 130, 30);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADDRESS *");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 500, 130, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(420, 310, 280, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(420, 440, 280, 22);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(420, 500, 280, 22);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(420, 560, 280, 22);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(420, 620, 280, 22);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(420, 250, 280, 22);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(420, 370, 280, 22);

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(420, 400, 130, 25);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOTE:  All fields  *  are mandatory. Fill them carefully.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 180, 330, 16);

        jCheckBox2.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("I am sure to leave this page and want to save these all Details.");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(200, 700, 530, 29);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 150, 840, 16);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 750, 100, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(590, 750, 100, 25);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1004, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ASession.obj.enable(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        jPasswordField1.setEchoChar((char)0);
        else
        jPasswordField1.setEchoChar((char)8226);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected())
        {
           jButton1.setEnabled(true);
        }
        else
            jButton1.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jPasswordField1.setText(null);
                        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            if( jPasswordField1.getText().length() == 0 || jTextField2.getText().length() == 0 || jTextField3.getText().length() == 0 || jTextField4.getText().length() == 0 || jTextField5.getText().length() == 0 || jTextField6.getText().length() == 0 || jTextField7.getText().length() == 0 ){
              Wrong w = new Wrong();
              w.setSize(650,360);
              w.setVisible(true);
              w.SetError("All fields are Mandatory");        
        }
        else{
            
            String sql = "insert into librarian values("+jTextField7.getText()+",'"+jTextField2.getText()+"','"+jPasswordField1.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"',"+jTextField6.getText()+")";
            if( jTextField3.getText().endsWith("@gmail.com") && !(jTextField6.getText().length() < 10) )
            {
             
             try {
             int n = stmt.executeUpdate(sql);
             if( n == 1 )
             {
                Done d = new Done();
                d.setSize(650,360);
                d.setVisible(true);
                jTextField2.setText(null);
                jTextField3.setText(null);
                jTextField4.setText(null);
                jTextField5.setText(null);
                jTextField6.setText(null);
                jTextField7.setText(null);
                jPasswordField1.setText(null);
             }else{
                Wrong w = new Wrong();
                w.setSize(650,360);
                w.setVisible(true);   
                w.SetError("Falied to update operation.");
             }
        } catch (Exception ex) {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);   
            w.SetError(ex.getMessage());
        }
            }
        else{
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);   
            w.SetError("Check entered contact and Email once again"); 
            }}    
    }//GEN-LAST:event_jButton1ActionPerformed
    static int xx,yy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xx = evt.getX();
         yy = evt.getY();        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-xx, evt.getYOnScreen()-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddLib al = new AddLib();
                al.setSize(1000,830);
                al.setVisible(true); 
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
