/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import DBConnection.connection;
import homepage.Homepage;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rishabh kumar
 */
public class NewEmployee extends javax.swing.JFrame {
int date,MONTH,year,curdate,curmonth,curyear;
String month;
connection c=new connection();
    /**
     * Creates new form NewEngineers
     */
    public NewEmployee() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ButtonGroup btn=new ButtonGroup();
        btn.add(working);
        btn.add(terminated);
        
    try {
        c.rs=c.stmt.executeQuery("select eid from employee order by eid desc limit 1;");
        if(c.rs.next())
        eid.setText(engineerid(c.rs.getString("eid")));
        else
            eid.setText("En-aaa00000");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Employee Id Loading Error.\nError Description - "+ex);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eid = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DATE = new javax.swing.JComboBox();
        AGE = new javax.swing.JTextField();
        MON = new javax.swing.JComboBox();
        YEAR = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        add_ = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        working = new javax.swing.JRadioButton();
        terminated = new javax.swing.JRadioButton();
        back = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Employee");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adding New Employee");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 30, 620, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Engineer's Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 130, 270, 40);

        eid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eid.setForeground(new java.awt.Color(204, 204, 204));
        eid.setText("En-aaa12009");
        eid.setToolTipText("New Engineer ID");
        jPanel1.add(eid);
        eid.setBounds(1050, 70, 190, 40);

        ename.setToolTipText("Engineer's Name");
        jPanel1.add(ename);
        ename.setBounds(630, 130, 340, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 200, 270, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Date of Birth :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 270, 270, 40);

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
        DATE.setBounds(630, 270, 60, 30);

        AGE.setEditable(false);
        AGE.setText("16");
        AGE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(AGE);
        AGE.setBounds(900, 260, 70, 40);

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
        MON.setBounds(700, 270, 80, 30);

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
        YEAR.setBounds(800, 270, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Contact no. :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 330, 270, 40);
        jPanel1.add(contact);
        contact.setBounds(630, 330, 340, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Designation :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 400, 270, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Email :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 470, 270, 40);
        jPanel1.add(designation);
        designation.setBounds(630, 400, 340, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Status :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(300, 540, 270, 40);
        jPanel1.add(email);
        email.setBounds(630, 470, 340, 40);

        add_.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        add_.setForeground(new java.awt.Color(204, 204, 204));
        add_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_.setText("Add");
        add_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_MouseExited(evt);
            }
        });
        jPanel1.add(add_);
        add_.setBounds(510, 630, 290, 60);

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
        exit.setBounds(1130, 630, 110, 60);
        jPanel1.add(address);
        address.setBounds(630, 200, 340, 40);

        working.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        working.setForeground(new java.awt.Color(204, 204, 204));
        working.setText("Working");
        jPanel1.add(working);
        working.setBounds(630, 540, 91, 29);

        terminated.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        terminated.setForeground(new java.awt.Color(204, 204, 204));
        terminated.setText("Terminated");
        jPanel1.add(terminated);
        terminated.setBounds(820, 540, 111, 29);

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
        back.setBounds(60, 50, 150, 60);

        reset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        reset.setForeground(new java.awt.Color(204, 204, 204));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(850, 630, 220, 60);

        homepage.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        homepage.setForeground(new java.awt.Color(204, 204, 204));
        homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/homepage.png"))); // NOI18N
        homepage.setToolTipText("Back to Homepage");
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
        homepage.setBounds(90, 600, 80, 60);

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

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        years();
    }//GEN-LAST:event_DATEActionPerformed

    private void DATEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DATEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT)
        address.grabFocus();
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
        contact.grabFocus();
    }//GEN-LAST:event_YEARKeyPressed

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

    private void add_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_MouseClicked
    try {
        String status=null;
        if(terminated.isSelected())
            status="Terminated";
        else
            status="Working";
        c.stmt.executeUpdate("insert into Employee value('"    +   eid.getText()    +   "','"  +     ename.getText()    
                +       "','"      +     address.getText()  +   "','"  
                  +  YEAR.getSelectedItem()   +     "/" +  month1(String.valueOf(MON.getSelectedItem()))+    "/"   +       DATE.getSelectedItem()+   "',"  
                +    Double.parseDouble(contact.getText())  +   ",'"  +   designation.getText() +   "','"  
                +   email.getText()   +  "','"+status+"');");
        JOptionPane.showMessageDialog(null, "Successfully Added New Engineer Details.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error adding Engineer.\n Error Description - "+ex);
        new logs.loggWriter().write2("Error adding Engineer.\n Error Description - "+ex);
    }
    catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
    }//GEN-LAST:event_add_MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminMenu amenu=new AdminMenu();
        amenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
       ename.setText("");
       address.setText("");
       DATE.setSelectedIndex(0);
       MON.setSelectedIndex(0);
       YEAR.setSelectedIndex(0);
       contact.setText("");
       email.setText("");
       designation.setText("");
       working.setSelected(false);
       terminated.setSelected(false);
    }//GEN-LAST:event_resetMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
         back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setBorder(null);
    }//GEN-LAST:event_backMouseExited

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        Homepage home=new Homepage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homepageMouseClicked

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        homepage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_homepageMouseEntered

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
        homepage.setBorder(null);
    }//GEN-LAST:event_homepageMouseExited

    private void add_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_MouseEntered
        add_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_add_MouseEntered

    private void add_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_MouseExited
            add_.setBorder(null);
    }//GEN-LAST:event_add_MouseExited

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
       reset.setBorder(null);
    }//GEN-LAST:event_resetMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBorder(null);
    }//GEN-LAST:event_exitMouseExited
void initialize(){          //initializes all Date of Birth variables
    date=Integer.parseInt((String)DATE.getSelectedItem());
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
    public String engineerid(String id){    //Engineer Id Generator
        String N;
        char ch[]=id.toCharArray();
        int n=Integer.parseInt(new StringBuilder().append(ch[6]).append(ch[7]).append(ch[8]).append(ch[9]).append(ch[10]).toString());
        
        if(n==99999){
            N="00000";
            int temp;
            if(ch[5]=='z'){
                if(ch[4]=='z'){
                    temp=ch[3];
                    ch[3]=(char) ++temp;
                }
                else{
                        temp=ch[4];
                        ch[4]=(char)++temp;
                }
            }
            else{
                temp=ch[5];
                ch[5]=(char)++temp;
                if(temp==123){
                    temp=65;
                    ch[5]=(char)temp; 
                }
                
            }
        return "En-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+N;
        }
        else{
        n++;
        }
         if(count(n)<2) 
             return "En-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"0000"+n;
        if(count(n)<3) 
             return "En-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"000"+n;
        if(count(n)<4) 
             return "En-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"00"+n;
        if(count(n)<5) 
             return "En-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"0"+n;
        else {
                return "En-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+n;
                
                }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int count(int no){   //counts Number of digits in Engineer Id
    int count=0;
        while(no>0){
        no=no/10;
        count++;
        }
        return count;
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
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
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JComboBox DATE;
    private javax.swing.JComboBox MON;
    private javax.swing.JComboBox YEAR;
    private javax.swing.JLabel add_;
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel eid;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ename;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel reset;
    private javax.swing.JRadioButton terminated;
    private javax.swing.JRadioButton working;
    // End of variables declaration//GEN-END:variables
}
