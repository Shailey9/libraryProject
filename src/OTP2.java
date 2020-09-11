import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

    
public class OTP2 extends javax.swing.JFrame {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    static OTP2 obj;
    public OTP2() {
        initComponents();
        jTextField1.requestFocus();
        Connect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StrikkInnov:PUSSGRC( ADMIN LOGIN)");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));
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
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("StrikInnov:PUSSGRC ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 260, 30);

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

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(330, 280, 130, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter OTP :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 270, 100, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OTP.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 50, 270, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("An OTP has sent to the Entered Email, Please check and fill here for Authentication.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 230, 590, 20);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Continue");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 320, 90, 24);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 280, 130, 20);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(661, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Connect()
    {
        try{
           con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pussgrc,lib.db","root","");
           stmt = (com.mysql.jdbc.Statement) con.createStatement();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
   
    public void setCursor(){
        jTextField1.requestFocus();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ReturnBook.obj.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
 
    public void setlabel(String s){
       jLabel6.setText(s);
    }
    
    private void cont(){
                if(ReturnBook.OTP.equals(jTextField1.getText()))
         {
            try {
                String fetchStudent = "select * from student where call_no ='"+ReturnBook.call_no+"' and sId = "+ReturnBook.sId+"";
                rs = stmt.executeQuery(fetchStudent);
                String sname="",department="",email="",scontact="",issuedate="",Bname="";
                while(rs.next()){
                  sname = rs.getString("sname");
                  department = rs.getString("department");
                  email = rs.getString("email");
                  scontact = rs.getString("scontact");
                  issuedate = rs.getString("issuedDate");
                }
                String data = "Delete from student where call_no ='"+ReturnBook.call_no+"' and sId = "+ReturnBook.sId+" ";            
                int n = stmt.executeUpdate(data);
                int q=0;
                if( n == 1 )
                  {
                    rs = stmt.executeQuery("select * from book where call_no = '"+ReturnBook.call_no+"' ");
                    while(rs.next() ){
                        Bname = rs.getString("name");
                        q = Integer.parseInt(rs.getString("issued"));
                     }
                    int s = stmt.executeUpdate("update book set issued = "+(q-1)+" where call_no = '"+ReturnBook.call_no+"' ");
                    stmt.executeUpdate("insert into issuehistory values ('"+ReturnBook.call_no+"','"+Bname+"',"+ReturnBook.sId+",'"+sname+"','"+department+"','"+email+"',"+scontact+",'"+issuedate+"','"+java.time.LocalDate.now().toString()+"') ");
                    if(s == 1)
                     {
                       this.setCursor(Cursor.WAIT_CURSOR);
                       Sendmail.smail(ReturnBook.email, "StrikInnov:PUSSGRC, Book Returned Successfully.", "\nDear Student,\n\n\t\tBook has returned successfully.\n\nThankyou so much. Visit Again.\n\nRegards:\nPUSSGRC LIBRARY MANAGEMENT., Hoshiarpur.");
                       this.setCursor(Cursor.DEFAULT_CURSOR);
                       ReturnBook.obj.setEnabled(true);
                       obj.dispose();
                       Done d = new Done();
                       d.setSize(650,360);
                       d.setVisible(true);
                     }else{
                       Wrong w = new Wrong();
                       w.setSize(650,360);
                       w.setVisible(true);
                       w.SetError(" ERROR:  Something went wrong, Failed to update database.");
                    }
                }else{
                    Wrong w = new Wrong();
                    w.setSize(650,360);
                    w.setVisible(true);
                    w.SetError(" ERROR:  Check your entered Details ");
                   }
            } catch (SQLException ex) {
                Wrong w = new Wrong();
                w.setSize(650,360);
                w.setVisible(true);
                w.SetError("ERROR: "+ex.getMessage());    
            }
         }else{
            jLabel6.setText("Wrong OTP.");
        }   
    }
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        cont(); 
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if( evt.getKeyChar() == KeyEvent.VK_ENTER){
          cont();
        }else{
        jLabel6.setText(null);}
    }//GEN-LAST:event_jTextField1KeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         ReturnBook.obj.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj = new OTP2();
                obj.setSize(650,370);
                obj.setVisible(true);
                obj.setCursor();
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
