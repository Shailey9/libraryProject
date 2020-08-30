public class LSession extends javax.swing.JFrame {
   
    static LSession obj;
    static String lib = Dialog2.lib;
    public LSession() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
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
        jMenuItem5.setText("Change Name");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem5);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem2.setText("Change Email.");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem6.setText("Change Contact");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem6);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem3.setText("Change Address");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jMenuItem1.setText("Change Password");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

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
        jLabel6.setBounds(100, 80, 530, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        jButton1.setToolTipText("Back");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 20, 50, 40);

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
        jButton4.setBounds(190, 0, 330, 60);

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
        jButton3.setBounds(189, 100, 330, 60);

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
        jButton5.setBounds(190, 200, 330, 60);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 102));
        jButton6.setText("VIEW ISSUED BOOKS");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jButton6);
        jButton6.setBounds(190, 400, 330, 60);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 102));
        jButton7.setText("VIEW BOOKS");
        jPanel3.add(jButton7);
        jButton7.setBounds(190, 300, 330, 60);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 102, 102));
        jButton8.setText("VIEW BOOKS");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jButton8);
        jButton8.setBounds(190, 300, 330, 60);

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
         AddBooks ab = new AddBooks();
         ab.setSize(1000,830);
         ab.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.setEnabled(false);
         IssueBook ib = new IssueBook();
         ib.setSize(1000,830);
         ib.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            this.setEnabled(false);
            ReturnBook rb = new ReturnBook();
            rb.setSize(1000,650);
            rb.setVisible(true);         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jPopupMenu1.show(obj, evt.getX()+130, evt.getY()+80);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        LSession.obj.setEnabled(false); 
        VLib.dialog = new VLib();
        VLib.dialog.setSize(600,720);
        VLib.dialog.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ACname.dialog = new ACname();
        ACname.dialog.setSize(650,360);
        ASession.obj.setEnabled(false);
        ACname.dialog.setVisible(true);
        ACname.dialog.setCursor();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ACemail.dialog = new ACemail();
        ACemail.dialog.setSize(650,360);
        ASession.obj.setEnabled(false);
        ACemail.dialog.setVisible(true);
        ACemail.dialog.setCursor();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ACcontact.dialog = new ACcontact();
        ACcontact.dialog.setSize(650,360);
        ASession.obj.setEnabled(false);
        ACcontact.dialog.setVisible(true);
        ACcontact.dialog.setCursor();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ACpswd.dialog = new ACpswd();
        ACpswd.dialog.setSize(700,420);
        ASession.obj.setEnabled(false);
        ACpswd.dialog.setVisible(true);
        ACpswd.dialog.setCursor();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed
 
        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
