/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complaint.Employee;

import DBConnection.connection;
import homepage.Homepage;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logs.loggWriter;

/**
 *
 * @author rishabh kumar
 */
public class ComplaintAction extends javax.swing.JFrame {
    connection c=new connection();
    int Date,MONTH,year;
String month,EID;
    /**
     * Creates new form complaintAction
     */
    public ComplaintAction() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);   //fullscreen mode
        new loggWriter("Employee Menu Opened.",true);
    }

    ComplaintAction(String cuid,String eid) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);   //fullscreen mode
        new loggWriter("Employee Menu Opened.",true);
        try {
            EID=eid;
                c.rs=c.stmt.executeQuery("Select day(dateofservice) as date,month(dateofservice) as month,year(dateofservice) as year,"
                        + "cr.cid,ca.complaint_id,cname,ProblemTitle,description,c_condition,ca.status,TypeOfService,place,cost,ServiceCenter "
                        + "from (complaintregistration cr inner join customer c on c.cid=cr.cid) inner join complaintAction ca on "
                        + "cr.complaint_id=ca.complaint_id where cr.cid='"+cuid+"';");
                if(c.rs.next()){
                    cid.setText(cuid);
                    cname.setText(c.rs.getString("cname"));
                    title.setText(c.rs.getString("ProblemTitle"));
                            coid.setText(c.rs.getString("Complaint_id"));
                            description.setText(c.rs.getString("description"));
                            status.setSelectedItem(c.rs.getString("status"));
                            tos.setText(c.rs.getString("TypeOfService"));
                            place.setText(c.rs.getString("place"));
                            cost.setText(c.rs.getString("cost"));
                            condition.setSelectedItem(c.rs.getString("C_Condition"));
                            serviceCenter.setText(c.rs.getString("ServiceCenter"));
                            DATE.setSelectedItem(c.rs.getString("date"));
                            MON.setSelectedItem(month2(Integer.parseInt(c.rs.getString("month"))));
                            YEAR.setSelectedItem(c.rs.getString("year"));
                }
                else
                    JOptionPane.showMessageDialog(null, "Record Not Found.");
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "An Error Ocurred While Connecting To the Database.\nError Description - "+ex);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        cid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        tos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        condition = new javax.swing.JComboBox();
        ComplaintDate = new javax.swing.JLabel();
        serviceCenter = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        coid = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        title = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        DATE = new javax.swing.JComboBox();
        MON = new javax.swing.JComboBox();
        YEAR = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Complaint Action");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 30, 680, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Customer's Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 260, 50);

        description.setEditable(false);
        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 270, 440, 160);

        cid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cid.setForeground(new java.awt.Color(204, 204, 204));
        cid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cid.setText("Cid-13200axz");
        jPanel1.add(cid);
        cid.setBounds(1020, 130, 220, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CustomerID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(870, 130, 190, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Problem Title :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 200, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Description :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 270, 200, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Type Of Service :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 450, 200, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Place :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 510, 200, 40);
        jPanel1.add(place);
        place.setBounds(220, 510, 440, 40);

        tos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tosActionPerformed(evt);
            }
        });
        jPanel1.add(tos);
        tos.setBounds(220, 450, 440, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Date :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1070, 20, 70, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Condition :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(690, 450, 170, 40);

        condition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select>", "Serious", "Too Bad", "Bad", "Not OK" }));
        condition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conditionMouseEntered(evt);
            }
        });
        jPanel1.add(condition);
        condition.setBounds(900, 450, 340, 40);

        ComplaintDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ComplaintDate.setForeground(new java.awt.Color(204, 204, 204));
        ComplaintDate.setText("01/01/2018");
        jPanel1.add(ComplaintDate);
        ComplaintDate.setBounds(1130, 20, 140, 40);
        jPanel1.add(serviceCenter);
        serviceCenter.setBounds(900, 390, 340, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Service Center :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(690, 390, 180, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Status :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 270, 170, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("ComplaintID :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 200, 370, 50);

        coid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coid.setForeground(new java.awt.Color(204, 204, 204));
        coid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coid.setText("CO-aaa10200");
        jPanel1.add(coid);
        coid.setBounds(860, 200, 390, 50);

        update.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        update.setForeground(new java.awt.Color(204, 204, 204));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(490, 580, 320, 60);

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
        homepage.setBounds(540, 640, 240, 50);

        cname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cname.setForeground(new java.awt.Color(204, 204, 204));
        cname.setText("Abcdefgh ijklmnopq");
        jPanel1.add(cname);
        cname.setBounds(260, 130, 290, 50);

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select>", "Initial Submission", "Pending", "In Process", "Completed", "Cancelled" }));
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statusMouseExited(evt);
            }
        });
        jPanel1.add(status);
        status.setBounds(900, 270, 340, 40);

        title.setEditable(false);
        jPanel1.add(title);
        title.setBounds(220, 210, 440, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Cost :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(690, 330, 200, 40);
        jPanel1.add(cost);
        cost.setBounds(900, 330, 340, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("<<");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 40, 150, 60);

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
        exit.setBounds(1130, 610, 110, 60);

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 130, 550, 50);

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(860, 130, 380, 50);

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(690, 200, 560, 50);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Date of Service :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(690, 510, 180, 40);

        DATE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DATE.setBorder(null);
        DATE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DATEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DATEMouseExited(evt);
            }
        });
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
        DATE.setBounds(900, 510, 90, 40);

        MON.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        MON.setBorder(null);
        MON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MONMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MONMouseExited(evt);
            }
        });
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
        MON.setBounds(1020, 510, 100, 40);

        YEAR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        YEAR.setBorder(null);
        YEAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YEAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YEARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YEARMouseExited(evt);
            }
        });
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
        YEAR.setBounds(1140, 510, 100, 40);

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

    private void tosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tosActionPerformed

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        Homepage home=new Homepage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homepageMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        try {
            initialize();
        c.stmt.executeUpdate("update complaintRegistration set  "
                + "TypeOfService ='"+tos.getText()+"',serviceCenter='"+serviceCenter.getText()
                +"',place='"+place.getText()+"',c_condition='"+condition.getSelectedItem().toString()+"',status='"+status.getSelectedItem().toString()+"' where Complaint_id='"+coid.getText()+"';");
        try{
            System.out.println(YEAR.getSelectedItem().toString()+"-"+(MON.getSelectedIndex()+1)
                +"-"+(DATE.getSelectedItem().toString()));
            System.out.println(cost.getText());
            System.out.println(EID);
            System.out.println(status.getSelectedItem().toString());
            System.out.println(coid.getText());
            
            
            connection db=new connection();
            db.pstmt=db.conn.prepareStatement("update complaintaction set dateofservice='"+YEAR.getSelectedItem().toString()+"-"+(MON.getSelectedIndex()+1)
                +"-"+(DATE.getSelectedItem().toString())+"', cost='"+cost.getText()+"',EID='"+EID+"',status='"+status.getSelectedItem().toString()
                +"' where complaint_id='"+coid.getText()+"';");
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
        JOptionPane.showMessageDialog(null, "Complaint Details Updated Succesfully."+YEAR.getSelectedItem()+"/"+(MON.getSelectedIndex()+1)
                +"/"+(DATE.getSelectedIndex()+1));    
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Error Occurred");
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error while Updating Complaint Details.\nError Description - "+ex);
    }
    }//GEN-LAST:event_updateMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        EmployeeMenu menu=new EmployeeMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

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

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        initialize();
    }//GEN-LAST:event_DATEActionPerformed

    private void DATEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DATEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        condition.grabFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT)
        MON.grabFocus();
    }//GEN-LAST:event_DATEKeyPressed

    private void MONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MONActionPerformed
        initialize();
    }//GEN-LAST:event_MONActionPerformed

    private void MONKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MONKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        DATE.grabFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT)
        YEAR.grabFocus();
    }//GEN-LAST:event_MONKeyPressed

    private void YEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YEARActionPerformed
       initialize();
    }//GEN-LAST:event_YEARActionPerformed

    private void YEARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_YEARKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        MON.grabFocus();
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT)
        update.grabFocus();
    }//GEN-LAST:event_YEARKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_exitMouseEntered

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_updateMouseEntered

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        homepage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_homepageMouseEntered

    private void statusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseEntered
        status.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_statusMouseEntered

    private void DATEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DATEMouseEntered
        DATE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_DATEMouseEntered

    private void MONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MONMouseEntered
       MON.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_MONMouseEntered

    private void YEARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YEARMouseEntered
        YEAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_YEARMouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setBorder(null);
    }//GEN-LAST:event_jLabel16MouseExited

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBorder(null);
    }//GEN-LAST:event_updateMouseExited

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
        homepage.setBorder(null);
    }//GEN-LAST:event_homepageMouseExited

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBorder(null);
    }//GEN-LAST:event_exitMouseExited

    private void DATEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DATEMouseExited
        DATE.setBorder(null);
    }//GEN-LAST:event_DATEMouseExited

    private void MONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MONMouseExited
       MON.setBorder(null);
    }//GEN-LAST:event_MONMouseExited

    private void YEARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YEARMouseExited
       YEAR.setBorder(null);
    }//GEN-LAST:event_YEARMouseExited

    private void statusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseExited
        status.setBorder(null);
    }//GEN-LAST:event_statusMouseExited

    private void conditionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionMouseEntered
        condition.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_conditionMouseEntered
void initialize(){Date=Integer.parseInt((String)DATE.getSelectedItem());

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
        DATE.setSelectedItem(obj.get(Calendar.DATE));          //current date
        MON.setSelectedItem(obj.get(Calendar.MONTH)+1);      //current month
        YEAR.setSelectedItem(obj.get(Calendar.YEAR));          //current year
          }
//////////////////////////////////////////////////////////////////////////////////////////////////////
//calculating month  from month number, returns number from 1-12.
    String month2(int month){
        switch(month){                                          
            case 1:       return "JAN";
            case 2:                return "FEB";
            case 3:                return "MAR";
            case 4:                return "APR";
            case 5:                return "MAY";
            case 6:               return "JUNE";
            case 7:                return "JULY";
            case 8:                return "AUG";
            case 9:                return "SEP";
            case 10:                return "OCT";
            case 11:                return "NOV";
            case 12:                return "DEC";
            }return "";
}

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
            java.util.logging.Logger.getLogger(ComplaintAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintAction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComplaintDate;
    private javax.swing.JComboBox DATE;
    private javax.swing.JComboBox MON;
    private javax.swing.JComboBox YEAR;
    private javax.swing.JLabel cid;
    private javax.swing.JLabel cname;
    private javax.swing.JLabel coid;
    private javax.swing.JComboBox condition;
    private javax.swing.JTextField cost;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField place;
    private javax.swing.JTextField serviceCenter;
    private javax.swing.JComboBox status;
    private javax.swing.JTextField title;
    private javax.swing.JTextField tos;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
