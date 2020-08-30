import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class IssueBook extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public IssueBook() {
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
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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
        jLabel6.setText("Issue Book");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 70, 320, 60);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT_ID *");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 340, 150, 40);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STUDENT_NAME*");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 410, 160, 30);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S_CONTACT *");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 470, 130, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATE (Y-M-D)*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 540, 140, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CALL_NO*");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 280, 130, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(430, 350, 280, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(430, 470, 280, 22);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(430, 540, 280, 22);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(430, 290, 280, 22);

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Auto Fill");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(720, 540, 130, 25);

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
        jCheckBox2.setBounds(200, 650, 530, 29);

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

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(430, 410, 280, 22);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1004, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LSession.obj.setEnabled(true);
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
        jTextField3.setText(null);
        jTextField5.setText(null);
        jTextField7.setText(null);
        jTextField1.setText(null);
        jCheckBox1.setSelected(false);                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if( jTextField1.getText().length() == 0 || jTextField2.getText().length() == 0 || jTextField3.getText().length() == 0 || jTextField5.getText().length() == 0 || jTextField7.getText().length() == 0 ){
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError("All fields are Mandatory");        
        } else{ 
        try {
        String sql = "select * from book where call_no = '"+jTextField7.getText()+"' ";
        rs = stmt.executeQuery(sql);
        int i = 0,q=0,issued=0;    
         while(rs.next())
          {
             q = Integer.parseInt(rs.getString("quantity"));
             issued =  Integer.parseInt(rs.getString("issued"));      
             i++;
          }  
          if( i == 1 && issued == q )
          {
                Wrong w = new Wrong();
                w.setSize(650,360);
                w.setVisible(true);   
                w.SetError("Sorry!! Book isn't available for this time.");
          } 
          else if(jTextField3.getText().length() < 10 )
           {
                Wrong w = new Wrong();
                w.setSize(650,360);
                w.setVisible(true);   
                w.SetError(" Contact not Valid.");
           }
          else if( i == 1 )
          {
             String data = "insert into student values( '"+jTextField7.getText()+"',"+jTextField2.getText()+",'"+jTextField1.getText()+"',"+jTextField3.getText()+",'"+jTextField5.getText()+"')";
             int n = stmt.executeUpdate(data);
             if( n == 1 )
             {
                String usql = " update book set issued = "+(issued+1)+" where call_no = '"+jTextField7.getText()+"' "; 
                stmt.executeUpdate(usql);        
                Done d = new Done();
                d.setSize(650,360);
                d.setVisible(true);
                jTextField2.setText(null);
                jTextField3.setText(null);
                jTextField5.setText(null);
                jTextField7.setText(null);
                jTextField1.setText(null);
                jCheckBox1.setSelected(false);
             }else{
                Wrong w = new Wrong();
                w.setSize(650,360);
                w.setVisible(true);   
                w.SetError("Falied to update operation.");
             }
          }
         else
          {
                Wrong w = new Wrong();
                w.setSize(650,360);
                w.setVisible(true);   
                w.SetError("Dear User, Check your call_no.");
         
          }
        } catch (Exception ex) {
            Wrong w = new Wrong();
            w.setSize(650,360);
            w.setVisible(true);
            w.SetError(ex.getMessage());       }}
    }//GEN-LAST:event_jButton1ActionPerformed
     
    
    static int xx,yy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xx = evt.getX();
         yy = evt.getY();        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-xx, evt.getYOnScreen()-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
          jTextField5.setText(java.time.LocalDate.now().toString());
        else
          jTextField5.setText(null);  
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IssueBook ib = new IssueBook();
                ib.setSize(1000,830);
                ib.setVisible(true); 
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
