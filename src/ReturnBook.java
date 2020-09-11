import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Cursor;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

public class ReturnBook extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    static ReturnBook obj;
    static String OTP;
    static String Data="";
    static String call_no,sId;
    static String email = "";
    public ReturnBook() {
        initComponents();
        Connect();
        jButton1.setEnabled(false);
    }

    public void Connect()
    {
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pussgrc,lib.db","root","");
           stmt = (Statement) con.createStatement();
        } catch(Exception ex){
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
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
        jLabel6.setText("Return Book");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 70, 410, 60);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT_ID*");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 370, 130, 40);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BOOK_ID *");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 310, 130, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(430, 380, 280, 22);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(430, 320, 280, 22);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOTE:  All fields  *  are mandatory. Fill them carefully.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 180, 330, 16);

        jCheckBox2.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("I am sure to Done this operation.");
        jCheckBox2.setFocusPainted(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(220, 480, 280, 28);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 150, 840, 16);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 540, 100, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(560, 540, 100, 25);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1004, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LSession.obj.enable(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected())
           jButton1.setEnabled(true);
        else
            jButton1.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField2.setText(null);
        jTextField7.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        call_no = jTextField7.getText();
        sId = jTextField2.getText();
        if( jTextField7.getText().trim().length() == 0 || jTextField2.getText().trim().length() == 0 ){
              Wrong w = new Wrong();
              w.setSize(650,360);
              w.setVisible(true);
              w.SetError("All fields are Mandatory");
        }
        else{
          try {            
               Integer.parseInt(sId);
               try{ 
                  String sql = "select * from student where call_no ='"+jTextField7.getText()+"' and sId = "+jTextField2.getText()+" ";
                  rs=stmt.executeQuery(sql);int count=0;
                   while(rs.next()){
                       email = rs.getString("email") ;
                       count++;
                   } if(count==1)
                     {
                         String usql = " select * from admin ";
                         rs=stmt.executeQuery(usql);int c=0;
                         String MyAcc="";
                         String pass="";
                          while(rs.next()){
                              MyAcc = rs.getString("email");
                              pass =  rs.getString("epassword");      
                              c++;
                          }
                          if(c==1){
                              String[] s1 = java.time.LocalTime.now().toString().split(":");
                              int t = (int)Float.parseFloat(s1[2]);
                              OTP = new Random().nextInt(50)+t+(t+"");
                              Sendmail.MyAccount = MyAcc ;
                              Sendmail.Password = pass ;
                              this.setCursor(Cursor.WAIT_CURSOR);
                              int x = Sendmail.smail(email, "StrikInnov:PUSSGRC, Book Returned Authentication.", "Dear Student,\n\n\t\tHere is your OTP  :  "+OTP+""+"\n\nBook_ID : "+jTextField7.getText()+" is under returned process.\n\n");
                              this.setCursor(Cursor.DEFAULT_CURSOR);
                              if(x == 1){
                              this.setEnabled(false);
                              OTP2.obj = new OTP2();
                              OTP2.obj.setSize(650,370);
                              OTP2.obj.setVisible(true);
                              OTP2.obj.setCursor();
                              }
                          }else{
                              Wrong w = new Wrong();
                              w.setSize(650,360);
                              w.setVisible(true);
                              w.SetError("ERROR:  Something went wrong."); 
                          }
                     }else{
                         Wrong w = new Wrong();
                         w.setSize(650,360);
                         w.setVisible(true);
                         w.SetError("ERROR:  This Book_ID and Student_ID dosen't have any Record.");
                     }
               }catch(Exception ex){
                    Wrong w = new Wrong();
                    w.setSize(650,360);
                    w.setVisible(true);
                    w.SetError(ex.getMessage());
             }                 
        }catch (Exception ex) {
             Wrong w = new Wrong();
             w.setSize(650,360);
             w.setVisible(true);
             w.SetError("ERROR:  Student_ID must be Integer.");
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        LSession.obj.enable(true);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            obj = new ReturnBook();
            obj.setSize(1000,650);
            obj.setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
