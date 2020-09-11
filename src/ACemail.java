import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ACemail extends javax.swing.JFrame {
    static ACemail dialog;
    Connection con;
    Statement stmt;
    ResultSet rs;
    static String admin = ASession.admin;
    public ACemail() {
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
        jPasswordField1.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StrikkInnov:PUSSGRC( ADMIN LOGIN)");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(72, 72, 72));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("StrikInnov:PUSSGRC ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 150, 30);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CHANGE EMAIL");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 50, 390, 70);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEW EMAIL:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 190, 120, 30);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CURRENT PASSWORD:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 150, 170, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.setToolTipText("Enter Username");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(390, 190, 180, 22);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setToolTipText("Enter Password");
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(390, 150, 180, 23);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 290, 90, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.jpg"))); // NOI18N
        jLabel4.setToolTipText("StrikInnov");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 110, 190, 190);

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
        jCheckBox1.setBounds(280, 270, 130, 25);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("-------------------------------------------------------------------------------------");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 100, 440, 16);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-PASSWORD:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 230, 170, 30);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField2.setToolTipText("Enter Password");
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(390, 230, 180, 23);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(644, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ASession.obj.enable(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void ok(){
              if( jTextField1.getText().trim().length() !=0 && jPasswordField2.getText().trim().length() != 0)
         { 
        try {
            String q = "select * from admin where name = '"+admin+"' and password = '"+jPasswordField1.getText()+"' ";
            rs = stmt.executeQuery(q);int count = 0;
            String email="sdflkfjk";
            String pass ="fdsazxcvb";
            while(rs.next()){
               count++;
               email = rs.getString("email"); 
               pass =  rs.getString("epassword");      
            }   
            if( email.equalsIgnoreCase(jTextField1.getText()) && pass.equals(jPasswordField2.getText())){
               Wrong w = new Wrong();
               w.setSize(650,360);
               w.setVisible(true);
               w.SetError("Error : You have Already Registered with this Email.\n\tTry Again with an another one.");
            }
            else if(count == 1){
               Sendmail.MyAccount = jTextField1.getText();
               Sendmail.Password =  jPasswordField2.getText();
               String sub = "StrikInnov:PUSSGRC, Your Google Account has registered.";
               String message = "Dear User,\nUnder Admin Session(StrikInnov:PUSSGRC),someone registered with your Google Account. If that weren't you please immediately change your login credentials.";
               this.setCursor(Cursor.WAIT_CURSOR);
               int n = Sendmail.smail(jTextField1.getText(), sub, message);
               this.setCursor(Cursor.DEFAULT_CURSOR);
               if( n == 1)
                {
                  String sql = "update admin set email = '"+jTextField1.getText()+"', epassword = '"+jPasswordField2.getText()+"' where name = '"+admin+"' ";                   
                  int c = stmt.executeUpdate(sql);
                  if( c == 1 ){
                    ASession.obj.enable(true);  
                    Done d = new Done();
                    d.setSize(650,360);
                    dialog.dispose();
                    d.setVisible(true);
                  }else{
                    Wrong w = new Wrong();
                    w.setSize(650,360);
                    w.setVisible(true);
                    w.SetError("Error : Failed to done Operation.");
                  }    
                } 
            }
            else{
                  Wrong w = new Wrong();
                  w.setSize(650,360);
                  w.setVisible(true);
                  w.SetError("ERROR: Wrong Password.");                      
            }
        } catch (Exception ex) {
                  Wrong w = new Wrong();
                  w.setSize(650,360);
                  w.setVisible(true);
                  w.SetError("ERROR: "+ex.getMessage());
        }}else{
                  Wrong w = new Wrong();
                  w.setSize(650,360);
                  w.setVisible(true);
                  w.SetError("ERROR:  All fields are Mandatory " );
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ok();
    }//GEN-LAST:event_jButton1ActionPerformed
    private static int xx,yy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-xx,evt.getYOnScreen()-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
            jPasswordField2.setEchoChar((char)0);
        }else
        {
            jPasswordField1.setEchoChar((char)8226);
            jPasswordField2.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ASession.obj.enable(true);
    }//GEN-LAST:event_formWindowClosing

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
         if( evt.getKeyChar() == KeyEvent.VK_ENTER){
            jTextField1.requestFocus();
         }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if( evt.getKeyChar() == KeyEvent.VK_ENTER){
            jPasswordField2.requestFocus();
         }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if( evt.getKeyChar() == KeyEvent.VK_ENTER){
            ok();
         }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog = new ACemail();
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
