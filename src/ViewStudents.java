import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ViewStudents extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    static ViewStudents obj;
    public ViewStudents() {
        initComponents();
        Connect();
        this.setBackground(new Color(102,102,102,180));
        jPanel1.setBackground(new Color(102,102,102,180));
        fetch();
    }

    private void fetch(){
      try {
            jTable1.setRowHeight(30);
            String sql = "select * from Student_Info order by cast(rollno as int) ASC";
            rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while(rs.next())
            { 
               model.addRow(new Object[]{" "+rs.getString("rollno")," "+rs.getString("sname")," "+rs.getString("fathername")," "+rs.getString("semester")," "+rs.getString("branch")," "+rs.getString("hoselorpg")," "+rs.getString("email")," "+rs.getString("contact")," "+rs.getString("pcontact")," "+rs.getString("Address")," "+rs.getString("Bookissued") } );      
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
              Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
              con = DriverManager.getConnection("jdbc:derby:C:\\Users\\STAR COMPUTER\\.netbeans-derby\\LibraryManagement", "PUSSGRC", "pussgrc@1234");
              stmt = con.createStatement();
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
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StrikkInnov:PUSSGRC( ADMIN LOGIN)");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(72, 72, 72));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setResizable(false);
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

        jLabel1.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("StrikInnov:PUSSGRC ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 170, 30);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.jpg"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1100, 20, 40, 40);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Students Info");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 120, 380, 60);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 180, 960, 20);

        jTable1.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Roll_no", "Name", "Father's Name", "Semester", "Branch", "Hostel/PG", "Email", "Contact", "PContact", "Address", "B_Issued"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 1090, 320);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roll_no", "Student_Name", "Branch" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(94, 20));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(450, 610, 140, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sorted_By:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 610, 63, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search_By:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(630, 610, 70, 20);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roll_no", "Student_Name", "Branch", "B_Issued" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(94, 30));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(710, 610, 150, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(710, 650, 190, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(930, 650, 90, 25);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Search All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(170, 610, 120, 25);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Print.jpg"))); // NOI18N
        jButton5.setToolTipText("Save Excel File.");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(33, 7));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1090, 570, 40, 40);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1219, 731));
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
                sql = "select * from student_info order by rollno ASC";
                break;
            case 1:
                sql = "select * from student_info order by sname ASC";
                break;
            case 2:
                sql = "select * from student_info order by branch ASC";
                break;
            default:
                break;
        }
        try {
            jTable1.setRowHeight(30);
            rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while(rs.next())
             {
                model.addRow(new Object[]{" "+rs.getString("rollno")," "+rs.getString("sname")," "+rs.getString("fathername")," "+rs.getString("semester")," "+rs.getString("branch")," "+rs.getString("hoselorpg")," "+rs.getString("email")," "+rs.getString("contact")," "+rs.getString("pcontact")," "+rs.getString("Address")," "+rs.getString("Bookissued") } );
             }
        } catch (Exception ex) {
                Wrong d = new Wrong();
                d.setSize(650,360);
                d.setVisible(true);
                d.SetError("ERROR:  Failed to fetch Details.");
          }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String data = jTextField1.getText().trim().replaceAll("'", "''");
        String sql = null;
        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                 sql = "select * from student_info where rollno = "+data+" ";
                 break;
            case 1:
                 sql = "select * from student_info where  lower(sname) like lower('%"+data+"%') ";
                 break;
            case 3:
                 sql = "select * from student_info where  bookIssued = "+data+" ";
                 break;
            case 2:
                 sql = "select * from student_info where  lower(branch) like lower('%"+data+"%') ";
                 break;
        }
        try {
                jTable1.setRowHeight(30);
                rs = stmt.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);int n=0;
                while(rs.next())
                {
                 jComboBox1.setEnabled(false);
                 n++;
                 model.addRow(new Object[]{" "+rs.getString("rollno")," "+rs.getString("sname")," "+rs.getString("fathername")," "+rs.getString("semester")," "+rs.getString("branch")," "+rs.getString("hoselorpg")," "+rs.getString("email")," "+rs.getString("contact")," "+rs.getString("pcontact")," "+rs.getString("Address")," "+rs.getString("Bookissued") } );
             }  if(n==0)
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
    }//GEN-LAST:event_jButton1ActionPerformed

       protected void getTable(String file){
        FileWriter excel = null;
        try {
            File f = new File(file);
            TableModel model = jTable1.getModel();
            excel = new FileWriter(f);
            for(int i = 0; i< model.getColumnCount() ; i++){
               excel.write(model.getColumnName(i)+'\t');
            }
            excel.write("\n");
            for( int i=0;i<model.getRowCount();i++){
              for(int j=0;j<model.getColumnCount();j++){
                  excel.write(model.getValueAt(i, j).toString()+'\t');
              }
              excel.write("\n");
            }
            excel.close();
            Done d = new Done();
            d.setSize(650,360);
            d.setVisible(true);
        } catch (Exception ex) {
                Wrong d = new Wrong();
                d.setSize(650,360);
                d.setVisible(true);
                d.SetError("ERROR:  "+ex.getMessage());
        } 
    }
 
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBox1.setEnabled(true);
         fetch();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FileSave fileSave = new FileSave();
        fileSave.setSize(650,360);
        ViewStudents.obj.setEnabled(false);
        fileSave.obj = ViewStudents.obj;
        fileSave.setVisible(true);
        fileSave.setCursor();
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            ViewStudents.obj = new ViewStudents();
            ViewStudents.obj.setSize(1170,740);
            ViewStudents.obj.setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
