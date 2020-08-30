
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javafx.scene.Cursor;
import javax.swing.JOptionPane;

public class FogotPass extends javax.swing.JFrame {
    static FogotPass dialog;
    Connection con;
    Statement stmt;
    ResultSet rs;
    private String OTP;
    public FogotPass() {
        initComponents();
        Connect();
        try {
            String sql = "select * from admin where name = '"+Dialog.admin+"' ";
            rs = stmt.executeQuery(sql);
            String id="";
            while(rs.next()){
               id = rs.getString("email");
            }
            jLabel2.setText("\" " + id + " \"");
        } catch (Exception ex) {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError(ex.getMessage());    
        }
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        jLabel1.setBounds(20, 20, 140, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("-");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 130, 360, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.setToolTipText("Enter Username");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(410, 250, 180, 22);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 190, 70, 25);

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

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter OTP:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 250, 100, 20);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("We'll send you an OTP on following ID, click ok to send.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 100, 360, 30);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 190, 100, 25);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton4.setText("Ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(460, 300, 70, 25);

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
            String sql = "select * from admin where name = '"+Dialog.admin+"' ";
            rs = stmt.executeQuery(sql);
            String[] s1 = java.time.LocalTime.now().toString().split(":");
            int t = (int)Float.parseFloat(s1[2]);
            OTP = Dialog.admin.length()+t+(t+""); 
            String id="";
            String pass="";
            while(rs.next()){ 
               id = rs.getString("email");
               pass = rs.getString("epassword");
            }
            Sendmail.MyAccount = id;
            Sendmail.Password = pass;
            String sub = "StrikInnov:PUSSGRC (Admin Login), OTP for change your Password:";
            dialog.setCursor(java.awt.Cursor.WAIT_CURSOR);
            Sendmail.smail(id,sub,"Dear user,\nyour OTP is:"+OTP);
            dialog.setCursor(java.awt.Cursor.getDefaultCursor());
        } catch (Exception ex) {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError(ex.getMessage());    
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    static int xx,yy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        yy = evt.getY();        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-xx,evt.getYOnScreen()-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        home1.obj.enable(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if( jTextField1.getText().equals(OTP) )
        {
             home1.obj.setEnabled(true);
             changepass.obj = new changepass();
             changepass.obj.setSize(650,360);
             changepass.obj.setVisible(true);
             dialog.dispose();
             changepass.obj.setCursor();   
        }else
        {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError("ERROR: OTP doesn't Match.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
