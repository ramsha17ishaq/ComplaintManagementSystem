/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeedbackAndComments;

import DBConnection.connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabh kumar
 */
public class CommentDisplay extends javax.swing.JFrame {
connection c= new connection();
    /**
     * Creates new form CommentDisplay
     */
    public CommentDisplay() {
        initComponents();
        try {
            c.rs=c.stmt.executeQuery("Select * from Comments;");
            DefaultTableModel dtm=(DefaultTableModel) comments.getModel();
            dtm.setRowCount(0);
            String cols[]=new String[2];
            if(c.rs.isBeforeFirst())
                while(true)
                    if(c.rs.next()){
                        cols[0]=(c.rs.getString("SNo"));
                        cols[1]=c.rs.getString("Comment");
                        dtm.addRow(cols);
                    }
                    else
                        break;
            comments.setModel(dtm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Something went Wrong.\nError Description - "+ex
                +"\nContact Developer for further Support.");
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
        jLabel2 = new javax.swing.JLabel();
        ok_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comments");

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Comments");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 40, 660, 110);

        ok_.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ok_.setForeground(new java.awt.Color(204, 204, 204));
        ok_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ok_.setText("Ok");
        ok_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ok_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ok_MouseExited(evt);
            }
        });
        jPanel1.add(ok_);
        ok_.setBounds(550, 610, 220, 60);

        comments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(comments);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 170, 1140, 402);

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
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_ok_MouseClicked

    private void ok_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_MouseEntered
         ok_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_ok_MouseEntered

    private void ok_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_MouseExited
        ok_.setBorder(null);
    }//GEN-LAST:event_ok_MouseExited

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
            java.util.logging.Logger.getLogger(CommentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommentDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommentDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable comments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ok_;
    // End of variables declaration//GEN-END:variables
}
