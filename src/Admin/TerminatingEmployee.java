/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import DBConnection.connection;
import homepage.Homepage;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabh kumar
 */
public class TerminatingEmployee extends javax.swing.JFrame {
int date,MONTH,year,curdate,curmonth,curyear;
String month;
boolean bool;
connection c=new connection();

        DefaultTableModel dtm;
    /**
     * Creates new form TerminatingEngineer
     */
    public TerminatingEmployee() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);       //Fullscreen mode
        dtm=(DefaultTableModel)edetails.getModel();
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
        jLabel5 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        homepage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DATE = new javax.swing.JComboBox();
        MON = new javax.swing.JComboBox();
        YEAR = new javax.swing.JComboBox();
        AGE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edetails = new javax.swing.JTable();
        Search_ = new javax.swing.JLabel();
        Remove_ = new javax.swing.JLabel();
        Reset_ = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Terminate or Accept Resignation");
        setMinimumSize(new java.awt.Dimension(1280, 760));

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Engineer's Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 290, 270, 40);

        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });
        ename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enameKeyPressed(evt);
            }
        });
        jPanel1.add(ename);
        ename.setBounds(650, 290, 340, 40);

        back.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        back.setForeground(new java.awt.Color(204, 204, 204));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<<");
        back.setToolTipText("Admin Menu");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 620, 150, 60);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Terminating or Accepting Resignation");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 1260, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Enter Engineer's ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 180, 270, 40);

        eid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eidKeyPressed(evt);
            }
        });
        jPanel1.add(eid);
        eid.setBounds(650, 180, 340, 40);

        homepage.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        homepage.setForeground(new java.awt.Color(204, 204, 204));
        homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepage.setText("Homepage");
        homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homepageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homepageMouseExited(evt);
            }
        });
        jPanel1.add(homepage);
        homepage.setBounds(170, 620, 200, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Date of Birth :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 360, 270, 40);

        DATE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DATE.setBorder(null);
        DATE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATEActionPerformed(evt);
            }
        });
        DATE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DATEKeyPressed(evt);
            }
        });
        jPanel1.add(DATE);
        DATE.setBounds(650, 350, 70, 40);

        MON.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        MON.setBorder(null);
        MON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MONActionPerformed(evt);
            }
        });
        MON.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MONKeyPressed(evt);
            }
        });
        jPanel1.add(MON);
        MON.setBounds(730, 350, 80, 40);

        YEAR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        YEAR.setBorder(null);
        YEAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YEARActionPerformed(evt);
            }
        });
        YEAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                YEARKeyPressed(evt);
            }
        });
        jPanel1.add(YEAR);
        YEAR.setBounds(820, 350, 80, 40);

        AGE.setEditable(false);
        AGE.setText("16");
        AGE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(AGE);
        AGE.setBounds(920, 350, 70, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("OR");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(540, 240, 130, 40);

        edetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Engineer's ID", "Engineer's Name", "DOB", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(edetails);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 490, 1180, 90);

        Search_.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Search_.setForeground(new java.awt.Color(204, 204, 204));
        Search_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search_.setText("Search");
        Search_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_MouseExited(evt);
            }
        });
        jPanel1.add(Search_);
        Search_.setBounds(530, 420, 200, 50);

        Remove_.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Remove_.setForeground(new java.awt.Color(204, 204, 204));
        Remove_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Remove_.setText("Set Terminated");
        Remove_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Remove_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Remove_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Remove_MouseExited(evt);
            }
        });
        jPanel1.add(Remove_);
        Remove_.setBounds(490, 620, 300, 60);

        Reset_.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Reset_.setForeground(new java.awt.Color(204, 204, 204));
        Reset_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reset_.setText("Reset");
        Reset_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reset_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Reset_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Reset_MouseExited(evt);
            }
        });
        jPanel1.add(Reset_);
        Reset_.setBounds(870, 620, 200, 60);

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit(2).png"))); // NOI18N
        exit.setToolTipText("Feeling bored? Exit !");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(1130, 640, 110, 60);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enameActionPerformed

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        years();
    }//GEN-LAST:event_DATEActionPerformed

    private void DATEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DATEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        ename.grabFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT)
        MON.grabFocus();
    }//GEN-LAST:event_DATEKeyPressed

    private void MONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MONActionPerformed
        years();
    }//GEN-LAST:event_MONActionPerformed

    private void MONKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MONKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        DATE.grabFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT)
        YEAR.grabFocus();
    }//GEN-LAST:event_MONKeyPressed

    private void YEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YEARActionPerformed
        years();
    }//GEN-LAST:event_YEARActionPerformed

    private void YEARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YEARKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        MON.grabFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT)
        Search_.grabFocus();
    }//GEN-LAST:event_YEARKeyPressed

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        Homepage home=new Homepage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homepageMouseClicked

    private void Search_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MouseClicked
    try {int count=0;
    dtm.setRowCount(0);
    edetails.setModel(dtm);
        if(bool==true)
        c.rs=c.stmt.executeQuery("select eid,ename,dob,designation,status from employee where eid='"+eid.getText()+"';");
        else
            c.rs=c.stmt.executeQuery("select eid,ename,dob,designation,status from employee where ename='"+ename.getText()+"' and '"
                +  YEAR.getSelectedItem()   +     "/" +  month1(String.valueOf(MON.getSelectedItem()))+    "/"   +       DATE.getSelectedItem()+"';");
        if(c.rs.isBeforeFirst())
        while(c.rs.next()){
            if(c.rs.getString("status").equals("Working")){
            count++;
            String col[]=new String[5];
                col[0]=""+count;
                col[1]=c.rs.getString("eid");
                col[2]=c.rs.getString("ename");
                col[3]=c.rs.getString("dob");
                col[4]=c.rs.getString("designation");
            dtm.addRow(col);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No Such Record Found.\nCheck if Search Details are Correct.");
        edetails.setModel(dtm);
        
    } catch (SQLException ex) {
        Logger.getLogger(TerminatingEmployee.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_Search_MouseClicked

    private void eidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eidKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
            ename.grabFocus();
        bool=true;
        ename.setText("");
        DATE.setSelectedIndex(0);
        MON.setSelectedIndex(0);
        YEAR.setSelectedIndex(0);
        DATE.setEnabled(false);
        MON.setEnabled(false);
        YEAR.setEnabled(false);
    }//GEN-LAST:event_eidKeyPressed

    private void enameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enameKeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_UP)
            eid.grabFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
            DATE.grabFocus();
        bool=false;
        eid.setText("");
        DATE.setEnabled(true);
        MON.setEnabled(true);
        YEAR.setEnabled(true);
    }//GEN-LAST:event_enameKeyPressed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int a;
        a = JOptionPane.showConfirmDialog(null,"Feeling Bored?? Wanna Exit?","Please Don't Leave.",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0){
            JOptionPane.showMessageDialog(null, "I'll Miss YOU!!", "Miss You.", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else if(a==1||a==2){
            JOptionPane.showMessageDialog(null,"I Love You Tooo!!!!","hehe.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void Remove_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_MouseClicked
            String eid;
        if(edetails.getSelectedRow()==-1){
                JOptionPane.showMessageDialog(null, "Select a Row First in the Employee Details Table.");
            }
            else
            {
                DefaultTableModel dtm=(DefaultTableModel)edetails.getModel();
                eid=(String) dtm.getValueAt(edetails.getSelectedRow(), 1);
                try {
                    c.stmt.executeUpdate("update employee set status='Terminated' where eid='"+eid+"';");
                    JOptionPane.showMessageDialog(null, "Employee set to Terminated Succesfully.");
                } catch (SQLException ex) {
                    Logger.getLogger(TerminatingEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_Remove_MouseClicked

    private void Reset_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_MouseClicked
       eid.setText("");
       ename.setText("");
        DATE.setSelectedIndex(0);
        MON.setSelectedIndex(0);
        YEAR.setSelectedIndex(0);
    dtm.setRowCount(0);
    edetails.setModel(dtm);
    }//GEN-LAST:event_Reset_MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminMenu amenu=new AdminMenu();
        amenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
         back.setBorder(null);
    }//GEN-LAST:event_backMouseExited

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        homepage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_homepageMouseEntered

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
         homepage.setBorder(null);
    }//GEN-LAST:event_homepageMouseExited

    private void Remove_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_MouseEntered
         Remove_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_Remove_MouseEntered

    private void Remove_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Remove_MouseExited
        Remove_.setBorder(null);
    }//GEN-LAST:event_Remove_MouseExited

    private void Reset_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_MouseEntered
        Reset_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_Reset_MouseEntered

    private void Reset_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_MouseExited
         Reset_.setBorder(null);
    }//GEN-LAST:event_Reset_MouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
         exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
         exit.setBorder(null);
    }//GEN-LAST:event_exitMouseExited

    private void Search_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MouseEntered
         Search_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_Search_MouseEntered

    private void Search_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MouseExited
        Search_.setBorder(null);
    }//GEN-LAST:event_Search_MouseExited
void initialize(){date=Integer.parseInt((String)DATE.getSelectedItem());
        month=(String)MON.getSelectedItem();
        MONTH=month1(month);
        year=Integer.parseInt((String)YEAR.getSelectedItem());}
//////////////////////////////////////////////////////////////////////////////////////////////////////
//calculating month number from month combobox, returns number from 1-12.
    int month1(String month){
        switch(month){                                          
            case "JAN":       return 1;
            case "FEB":                return 2;
            case "MAR":                return 3;
            case "APR":                return 4;
            case "MAY":                return 5;
            case "JUNE":               return 6;
            case "JULY":                return 7;
            case "AUG":                return 8;
            case "SEP":                return 9;
            case "OCT":                return 10;
            case "NOV":                return 11;
            case "DEC":                return 12;
            }return 0;
}
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    //calculates current date,month,year.
void curdate(){                                     
    Calendar obj=Calendar.getInstance();
        curdate=obj.get(Calendar.DATE);          //current date
        curmonth=obj.get(Calendar.MONTH)+1;      //current month
        curyear=obj.get(Calendar.YEAR);          //current year
          }
//////////////////////////////////////////////////////////////////////////////////////////////////////
public void years(){
        initialize();
        curdate();
        LocalDate birth = LocalDate.of(year, MONTH, date);
        LocalDate now = LocalDate.of(curyear, curmonth, curdate);
        Period period=Period.between(birth,now);
        AGE.setText(""+period.getYears());
}
//////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(TerminatingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminatingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminatingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminatingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminatingEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JComboBox DATE;
    private javax.swing.JComboBox MON;
    private javax.swing.JLabel Remove_;
    private javax.swing.JLabel Reset_;
    private javax.swing.JLabel Search_;
    private javax.swing.JComboBox YEAR;
    private javax.swing.JLabel back;
    private javax.swing.JTable edetails;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField ename;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
