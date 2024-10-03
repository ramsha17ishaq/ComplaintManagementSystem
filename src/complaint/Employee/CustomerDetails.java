
package complaint.Employee;

import DBConnection.connection;
import com.sun.glass.events.KeyEvent;
import customer.CustomerDetail;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logs.loggWriter;

/**
 *
 * @author rishabh kumar
 */
public class CustomerDetails extends javax.swing.JFrame {
connection c=new connection();
    /**
     * Creates new form customerDetails
     */
    public CustomerDetails() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        new loggWriter("Customer Details Opened.",true);
    }

    CustomerDetails(String string) {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        new loggWriter("Customer Detsils Opened.",true);
        CID.setText(string);
                try {
                    c.rs=c.stmt.executeQuery("select cl.cid,user,cname,address,contact,email from customer c inner join customerlogin cl on c.cid=cl.cid where cl.cid='"+string+"';");
                    if(c.rs.next()){
                    CID.setText(c.rs.getString("cl.cid"));
                    user.setText(c.rs.getString("user"));
                    cname.setText(c.rs.getString("cname"));
                    address.setText(c.rs.getString("address"));
                    contact.setText(c.rs.getString("contact"));
                    email.setText(c.rs.getString("email"));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerDetail.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(null);

        CID.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        CID.setForeground(new java.awt.Color(204, 204, 204));
        CID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CID.setText("Cid-");
        jPanel1.add(CID);
        CID.setBounds(900, 40, 350, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("OK");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(460, 580, 290, 90);

        address.setEditable(false);
        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(address);
        address.setBounds(660, 340, 360, 40);

        contact.setEditable(false);
        contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(contact);
        contact.setBounds(660, 410, 360, 40);

        user.setEditable(false);
        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(user);
        user.setBounds(660, 200, 360, 40);

        cname.setEditable(false);
        cname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cname);
        cname.setBounds(660, 270, 360, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Contact :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 410, 370, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 480, 370, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Username :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 200, 370, 40);

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(email);
        email.setBounds(660, 480, 360, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 340, 370, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 270, 370, 40);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 50, 820, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wp2533040.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
       jLabel10.setBorder(null);
    }//GEN-LAST:event_jLabel10MouseExited
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CID;
    private javax.swing.JTextField address;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}