import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewIssuedBooks extends javax.swing.JFrame {
    Connection con;
    Statement stmt,stmt2;
    ResultSet rs,rs2;
    
    static ViewIssuedBooks obj;
    public ViewIssuedBooks() {
        initComponents();
        Connect();
        fetch();
    }

    private void fetch(){
      try {
            jTable1.setRowHeight(25);
            String sql = "select * from student";
            rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while(rs.next())
            { 
                rs2 = stmt2.executeQuery("select * from book where call_no = '"+rs.getString("call_no")+"' ");
                while(rs2.next()){
                   String bname = rs2.getString("name");
                   model.addRow(new Object[]{" "+rs.getString("call_no")," "+bname," "+rs.getString("sId")," "+rs.getString("sname")," "+rs.getString("department")," "+rs.getString("scontact")," "+rs.getString("email")," "+rs.getString("issuedDate") } );
                }
            }
        } catch (Exception ex) {
                Wrong d = new Wrong();
                d.setSize(650,360);
                d.setVisible(true);
                d.SetError("ERROR:  Failed to fetch Details.");
        }
    }
    public void Connect()
    {
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pussgrc,lib.db","root","");
           stmt = (Statement) con.createStatement();
           stmt2 = (Statement) con.createStatement();
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
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
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
        jButton2.setBounds(1050, 10, 40, 40);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Issued Books");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 110, 370, 60);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(190, 180, 840, 16);

        jTable1.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book_ID", "Book_Name", "Student_ID", "Student_Name", "Department", "Contact", "Email", "Issued_Date"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 260, 1010, 320);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book_ID", "Student_ID", "Student_Name", "Issued_Date" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(94, 20));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(420, 630, 140, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sorted_By:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 630, 63, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search_By:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 630, 70, 20);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book_ID", "Book_Name", "Student_ID", "Student_Name", "Issued_Date" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(94, 30));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(680, 630, 150, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(680, 670, 190, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(900, 670, 90, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Search All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 630, 120, 25);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1100, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LSession.obj.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    static int xx,yy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xx = evt.getX();
         yy = evt.getY();        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-xx, evt.getYOnScreen()-yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        LSession.obj.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String sql = null;
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                sql = "select * from student order by call_no ASC";
                break;
            case 1:
                sql = "select * from student order by sId ASC";
                break;
            case 2:
                sql = "select * from student order by sname ASC";
                break;
            case 3:
                sql = "select * from student order by issuedDate ASC";
                break;
            default:
                break;
        }
        try {
            jTable1.setRowHeight(25);
            rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while(rs.next())
             {
                rs2 = stmt2.executeQuery("select * from book where call_no = '"+rs.getString("call_no")+"' ");
                while(rs2.next()){
                   String bname = rs2.getString("name");
                   model.addRow(new Object[]{" "+rs.getString("call_no")," "+bname," "+rs.getString("sId")," "+rs.getString("sname")," "+rs.getString("department")," "+rs.getString("scontact")," "+rs.getString("email")," "+rs.getString("issuedDate") } );
                } }
        } catch (Exception ex) {
                Wrong d = new Wrong();
                d.setSize(650,360);
                d.setVisible(true);
                d.SetError("ERROR:  Failed to fetch Details.");
          }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String data = jTextField1.getText();
        String sql = null;
        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                 sql = "select * from student where call_no = '"+data+"' ";
                 break;
            case 2:
                 sql = "select * from student where  sId = '"+data+"' ";
                 break;
            case 3:
                 sql = "select * from student where  sname like '%"+data+"%' ";
                 break;
            case 4:
                 sql = "select * from student where issuedDate = '"+data+"' ";
                 break;     
        }
        if( jComboBox2.getSelectedIndex() == 1 ){
            try {
                jTable1.setRowHeight(25);
                sql = "select * from student";
                rs = stmt.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);int n=0;
                while(rs.next())
                {
                    n++;
                    jComboBox1.setEnabled(false);
                    rs2 = stmt2.executeQuery("select * from book where call_no = '"+rs.getString("call_no")+"' and name like '%"+data+"%' ");
                    while(rs2.next()){
                    String bname = rs2.getString("name");
                    model.addRow(new Object[]{" "+rs.getString("call_no")," "+bname," "+rs.getString("sId")," "+rs.getString("sname")," "+rs.getString("department")," "+rs.getString("scontact")," "+rs.getString("email")," "+rs.getString("issuedDate") } );
                }  }if(n==0)
                {
                    Wrong d = new Wrong();
                    d.setSize(650,360);
                    d.setVisible(true);
                    d.SetError("ERROR:  Failed to found Results, Either check or try Again.");
                }
            } catch (Exception ex) {
                Wrong d = new Wrong();
                d.setSize(650,360);
                d.setVisible(true);
                d.SetError("ERROR:  Failed to fetch Details.");
            }
        }else{
        try {
                jTable1.setRowHeight(25);
                rs = stmt.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);int n=0;
                while(rs.next())
                {
                    n++;
                    jComboBox1.setEnabled(false);
                    rs2 = stmt2.executeQuery("select * from book where call_no = '"+rs.getString("call_no")+"' ");
                    while(rs2.next()){
                    String bname = rs2.getString("name");
                    model.addRow(new Object[]{" "+rs.getString("call_no")," "+bname," "+rs.getString("sId")," "+rs.getString("sname")," "+rs.getString("department")," "+rs.getString("scontact")," "+rs.getString("email")," "+rs.getString("issuedDate") } );
                }  }if(n==0)
                {
                    Wrong d = new Wrong();
                    d.setSize(650,360);
                    d.setVisible(true);
                    d.SetError("ERROR:  Failed to found Results, Either check or try Again.");
                }
            } catch (Exception ex) {
                Wrong d = new Wrong();
                d.setSize(650,360);
                d.setVisible(true);
                d.SetError("ERROR:  Failed to fetch Details.");
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBox1.setEnabled(true);
         fetch();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            ViewIssuedBooks.obj = new ViewIssuedBooks();
            ViewIssuedBooks.obj.setSize(1100,800);
            ViewIssuedBooks.obj.setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
