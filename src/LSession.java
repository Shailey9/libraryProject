import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class LSession extends javax.swing.JFrame {
   
    static LSession obj;
    static String lib ;
    public LSession() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\STAR COMPUTER\\Documents\\NetBeansProjects\\Practice\\src\\img\\StrikInnovLogo.png"));
        new Alert();
        if( Alert.interval != 0 )
        jMenuItem7.setIcon(new ImageIcon("C:\\Users\\STAR COMPUTER\\Documents\\NetBeansProjects\\Practice\\src\\img\\red dot.jpg"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPopupMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jPopupMenu1.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(270, 220));

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem5.setText(" Change Name");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem5);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem2.setText(" Change Email.");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem6.setText(" Change Contact");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem6);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem3.setText(" Change Address");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem1.setText(" Change Password");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jPopupMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jPopupMenu2.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jPopupMenu2.setPreferredSize(new java.awt.Dimension(270, 180));

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem7.setText(" Alert on Issue");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem8.setText(" Returned History");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem8);

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem9.setText(" Send EBooks ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem9);

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem4.setText(" Send Question Paper");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StrikkInnov.:PUSSGRC");
        setBounds(new java.awt.Rectangle(150, 100, 0, 0));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setToolTipText("StrikInnov");
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Librarian Session:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 240, 530, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        jButton1.setToolTipText("Back");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 20, 40, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Setting");
        jLabel1.setToolTipText("Setting");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 30, 60, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("View Librarian");
        jLabel10.setToolTipText("View Librarian");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 30, 110, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Luser2.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 150, 170, 180);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Others");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 30, 60, 20);

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 400));
        jPanel3.setLayout(null);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setText("ADD BOOKS");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(290, 0, 330, 60);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("ISSUE BOOK");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(290, 100, 330, 60);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 102));
        jButton5.setText("RETURN BOOK");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(290, 200, 330, 60);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 102));
        jButton6.setText("VIEW ISSUED BOOKS");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(290, 400, 330, 60);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 102));
        jButton7.setText("VIEW BOOKS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(290, 300, 330, 60);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PUSSGRC");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(270, 170, 360, 90);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LIBRARY");
        jLabel4.setToolTipText("PUSSGRC LIBRARY");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(400, 230, 310, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Have that energy which can fuel your Imaginations and Innovations.");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(340, 320, 420, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/final.jpg"))); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(60, 0, 470, 390);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        home1.obj = new home1();
        home1.obj.setEnabled(true);
        home1.obj.setBounds(this.getBounds());
        home1.obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.setEnabled(false);
         AddBooks.obj = new AddBooks();
         AddBooks.obj.setSize(1000,830);
         AddBooks.obj.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.setEnabled(false);
         IssueBook.obj = new IssueBook();
         IssueBook.obj.setSize(1000,880);
         IssueBook.obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            this.setEnabled(false);
            ReturnBook.obj = new ReturnBook();
            ReturnBook.obj.setSize(1000,650);
            ReturnBook.obj.setVisible(true);         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jPopupMenu1.show(obj, evt.getX()+130, evt.getY()+80);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        LSession.obj.setEnabled(false);
        VLib.lib = LSession.lib;
        VLib.dialog = new VLib();
        VLib.dialog.setSize(600,720);
        VLib.dialog.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
                LCname.dialog = new LCname();
                LCname.dialog.setSize(650,360);
                LSession.obj.setEnabled(false);
                LCname.dialog.setVisible(true);
                LCname.dialog.setCursor();
                LCname.lib = lib;
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                LCemail.dialog = new LCemail();
                LCemail.dialog.setSize(650,360);
                LSession.obj.setEnabled(false);
                LCemail.dialog.setVisible(true);
                LCemail.dialog.setCursor();
                LCemail.lib = lib;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        LCcontact.dialog = new LCcontact();
        LCcontact.dialog.setSize(650,360);
        LSession.obj.setEnabled(false);
        LCcontact.dialog.setVisible(true);
        LCcontact.dialog.setCursor();
        LCcontact.lib = lib;
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LCpswd.dialog = new LCpswd();
        LCpswd.dialog.setSize(700,420);
        LSession.obj.setEnabled(false);
        LCpswd.dialog.setVisible(true);
        LCpswd.lib = lib;
        LCpswd.dialog.setCursor();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        LCaddress.dialog = new LCaddress();
        LCaddress.dialog.setSize(650,360);
        LSession.obj.setEnabled(false);
        LCaddress.dialog.setVisible(true);
        LCaddress.dialog.setCursor();
        LCaddress.lib = lib;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            ViewBooks.obj = new ViewBooks();
            ViewBooks.obj.setSize(1000,800);
            ViewBooks.obj.setVisible(true);
            ViewBooks.jobj = LSession.obj;
            LSession.obj.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
            Alert.obj = new Alert();
            Alert.obj.setSize(1100,840);
            LSession.obj.setEnabled(false);
            Alert.obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
             JFileChooser jf = new JFileChooser();
             jf.setMultiSelectionEnabled(true);
             jf.setPreferredSize(new Dimension(800,500));
             jf.setDialogTitle("StrikInnov : PUSSGRC");
             jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
             ArrayList<String> files = new ArrayList();
             int a = jf.showOpenDialog(this);
             File[] f = jf.getSelectedFiles();
             for( File fp : f )
             files.add(fp.toString());
             if( a == JFileChooser.APPROVE_OPTION ){
             this.setEnabled(false);
             SendQuesPaper.obj = new SendQuesPaper();
             SendQuesPaper.obj.setSize(1000,650);
             SendQuesPaper.obj.setVisible(true);
             SendQuesPaper.obj.setList(files);
             }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jPopupMenu2.show(obj, evt.getX()+350, evt.getY()+80);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            ViewIssuedBooks.obj = new ViewIssuedBooks();
            ViewIssuedBooks.obj.setSize(1100,800);
            LSession.obj.setEnabled(false);
            ViewIssuedBooks.obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
            ViewIssuedHistory.obj = new ViewIssuedHistory();
            ViewIssuedHistory.obj.setSize(1100,800);
            LSession.obj.setEnabled(false);
            ViewIssuedHistory.obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
             JFileChooser jf = new JFileChooser();
             jf.setMultiSelectionEnabled(true);
             jf.setPreferredSize(new Dimension(800,500));
             jf.setDialogTitle("StrikInnov : PUSSGRC");
             jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
             ArrayList<String> files = new ArrayList();
             int a = jf.showOpenDialog(this);
             File[] f = jf.getSelectedFiles();
             for( File fp : f )
             files.add(fp.toString());
             if( a == JFileChooser.APPROVE_OPTION ){
             this.setEnabled(false);
             SendEBooks.obj = new SendEBooks();
             SendEBooks.obj.setSize(1000,650);
             SendEBooks.obj.setVisible(true);
             SendEBooks.obj.setList(files);
             }
    }//GEN-LAST:event_jMenuItem9ActionPerformed
 
        public static void main(String args[]) {
                  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
