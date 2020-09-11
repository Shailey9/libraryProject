
import java.awt.Toolkit;


public class home1 extends javax.swing.JFrame {
   
    public static home1 obj; 
    public home1() {
        initComponents(); 
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\STAR COMPUTER\\Documents\\NetBeansProjects\\Practice\\src\\img\\StrikInnovLogo.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StrikInnov.:PUSSGRC");
        setBounds(new java.awt.Rectangle(150, 100, 0, 0));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PUSSGRC");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 170, 360, 90);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 65)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LIBRARY");
        jLabel4.setToolTipText("PUSSGRC LIBRARY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 230, 310, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Have that energy which can fuel your Imaginations and Innovations.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 320, 420, 20);

        getContentPane().add(jPanel1);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.jpg"))); // NOI18N
        jLabel6.setToolTipText("StrikInnov");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(160, 210, 280, 230);

        getContentPane().add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/final.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(140, -40, 470, 410);

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(230, 320, 260, 50);

        jRadioButton1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText(" ADMIN");
        jRadioButton1.setToolTipText("Login as Admin");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(260, 180, 97, 33);

        jRadioButton2.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText(" LIBRARIAN");
        jRadioButton2.setToolTipText("Login as Librarian");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(260, 230, 140, 33);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER LOGIN AS:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(250, 40, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpg"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(170, 10, 80, 70);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("----------------------------------------------------------------------------------------------");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(180, 90, 380, 20);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(jRadioButton1.isSelected())
        {
            Dialog.dialog = new Dialog();
            Dialog.dialog.setSize(650,360);
            this.enable(false);
            Dialog.dialog.setVisible(true);
            Dialog.dialog.setCursor();
        }
        if(jRadioButton2.isSelected())
        {
            Dialog2.dialog = new Dialog2();
            Dialog2.dialog.setSize(650,360);
            this.enable(false);
            Dialog2.dialog.setVisible(true);
            Dialog2.dialog.setCursor();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
               obj = new home1();
               obj.setBounds(0,0,1920,1080);
               obj.setVisible(true);
               StrikInnov.obj = new StrikInnov();
               StrikInnov.obj.setBounds(0,0,1920,1080);
               StrikInnov.obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
