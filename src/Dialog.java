import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dialog extends javax.swing.JFrame {
    static Dialog dialog;
    Connection con;
    Statement stmt;
    ResultSet rs;
    static String admin;
    public Dialog() {
        initComponents();
        Connect();
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
    public void setCursor()
    {
       jTextField1.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel1.setText("StrikInnov:PUSSGRC ( ADMIN LOGIN )");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 240, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 170, 90, 30);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 220, 90, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.setToolTipText("Enter Username");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(390, 170, 180, 22);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setToolTipText("Enter Password");
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(390, 220, 180, 23);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 290, 79, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.jpg"))); // NOI18N
        jLabel4.setToolTipText("StrikInnov");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 100, 190, 190);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.jpg"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(600, 10, 40, 40);

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(390, 250, 130, 25);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Forgot Password.?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 290, 120, 20);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(644, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home1.obj.enable(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
          String sql =" select * from admin where name = '"+jTextField1.getText()+"' and password = '"+jPasswordField1.getText()+"' ";
          String s="",p="";
          String s1=jTextField1.getText(),p1=jPasswordField1.getText();
          rs = stmt.executeQuery(sql);
          int i = 0;
          while(rs.next())
           {
             i++;  
             s = rs.getString("name");
             p = rs.getString("password");
           }
          if( s.equals(s1) && p.equals(p1) && i==1 )
          {    
                 admin = jTextField1.getText();  
                 ASession.obj = new ASession();
                 ASession.obj.setBounds(home1.obj.getBounds());
                 ASession.obj.setVisible(true);
                 LDone d = new LDone();
                 d.setSize(650,360);
                 d.setVisible(true);
                 this.dispose();
                 home1.obj.dispose();
          }
          else{
            PWrong w = new PWrong();
            w.setSize(650,360);
            w.setVisible(true);
          }
        } catch (SQLException ex) {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        if(jCheckBox1.isSelected())
           jPasswordField1.setEchoChar((char)0);
        else
          jPasswordField1.setEchoChar((char)8226);
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    static int xx,yy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-xx,evt.getYOnScreen()-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       admin = jTextField1.getText();
       try {
            String sql = "select * from admin where name = '"+Dialog.admin+"' ";
            rs = stmt.executeQuery(sql);
            int n =0 ;
            while(rs.next()){
               n++; 
            }
            if(n==1){ 
               home1.obj.enable(true);
               FogotPass.dialog = new FogotPass();
               FogotPass.dialog.setSize(650,360);
               this.dispose();
               FogotPass.dialog.setVisible(true); 
               home1.obj.enable(false);
            }else{
              Wrong w = new Wrong();
              w.setSize(650,360);
              w.setVisible(true);
              w.SetError("ERROR : Admin name not found. ");
            }
        } catch (Exception ex) {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError(ex.getMessage());    
        }
    }//GEN-LAST:event_jLabel5MouseClicked
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog = new Dialog();
                dialog.setSize(650,360);
                dialog.setVisible(true);
                dialog.setCursor();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
