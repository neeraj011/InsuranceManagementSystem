/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RENU
 */
public class Agent extends javax.swing.JFrame {
    static Connection conn=null;
    /**
     * Creates new form Agent
     */
    public Agent() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        a_id = new javax.swing.JTextField();
        a_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        a_add = new javax.swing.JTextField();
        choose = new javax.swing.JComboBox<>();
        a_gen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        a_mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ch_aid = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        a_dob = new javax.swing.JTextField();
        a_pan = new javax.swing.JTextField();
        a_mob = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Gender");

        delete.setText("Delete");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        a_id.setAlignmentX(60.0F);
        a_id.setEnabled(false);
        a_id.setName(""); // NOI18N
        a_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_idActionPerformed(evt);
            }
        });

        a_name.setEnabled(false);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Agent_id", "Agent_name", "Address", "Gender", "Email", "DOB", "Pan_no", "Mobilel"
            }
        ));
        jScrollPane1.setViewportView(tab);

        a_add.setEnabled(false);

        choose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insert", "Update", "Delete" }));
        choose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseMouseClicked(evt);
            }
        });
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });

        a_gen.setEnabled(false);

        jLabel2.setText("Choose:");

        a_mail.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Agent_id");

        ch_aid.setEnabled(false);
        ch_aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_aidActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Choose Agent_id");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Agent_name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        insert.setText("Insert");
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("AGENT");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("DOB");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Pan_no");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Mobile");

        a_dob.setEnabled(false);
        a_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_dobActionPerformed(evt);
            }
        });

        a_pan.setEnabled(false);

        a_mob.setEnabled(false);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_id, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ch_aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_add, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_mob, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(insert)
                        .addGap(32, 32, 32)
                        .addComponent(update)
                        .addGap(26, 26, 26)
                        .addComponent(delete)))
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(a_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(a_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(a_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(a_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       String aname,add,gen,mail,dob;
        int aid,pan;
        long mob;
        
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-H547RQN";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Juhi_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
                
                 int selected=Integer.parseInt(ch_aid.getSelectedItem().toString());
                try
                {
                    Statement st = conn.createStatement();
                    st.executeUpdate("delete from agent where agent_id="+selected+"");
                    st.close();
                    JOptionPane.showMessageDialog(null,"Deleted!","Successful",JOptionPane.PLAIN_MESSAGE);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                dis();
                clear();
    }//GEN-LAST:event_deleteActionPerformed

    private void a_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_idActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        String aname,add,gen,mail,dob;
        int aid,pan;
        long mob;
        DefaultTableModel d2= (DefaultTableModel)tab.getModel();
            
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-H547RQN";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Juhi_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
        switch(choose.getSelectedIndex())
        {
            case 0: 
                en();
                clear();
                insert.setEnabled(true);
                update.setEnabled(false);
                delete.setEnabled(false);
                ch_aid.setEnabled(false);
                ch_aid.removeAllItems();
                break;
            case 1: 
            case 2:
                ch_aid.setEnabled(true);
                ch_aid.removeAllItems();
                try
                {
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("Select agent_id from agent");
                    int i=0;
                    while(rs.next())
                    {
                        ch_aid.addItem(String.valueOf(rs.getInt(1)));
                         i++;
                    }
                    if(i<1)
                    {
                        JOptionPane.showMessageDialog(null,"No record found","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    rs.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                
                en();
                if(choose.getSelectedIndex()==1){
                    update.setEnabled(true);
                    delete.setEnabled(false);
                    insert.setEnabled(false);
                }
                else if(choose.getSelectedIndex()==2){
                    delete.setEnabled(true);
                insert.setEnabled(false);
                update.setEnabled(false);}
                break;
                           
        }
    }//GEN-LAST:event_chooseActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       String aname,add,gen,mail,dob;
        int aid,pan;
        long mob;
        
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-H547RQN";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Juhi_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
                
                aid=Integer.parseInt(a_id.getText());
                aname=a_name.getText();
                add=a_add.getText();
                gen=a_gen.getText();
                dob=a_dob.getText();
                mail=a_mail.getText();
                pan=Integer.parseInt(a_pan.getText());
                mob=Long.parseLong(a_mob.getText());
                int selected=Integer.parseInt(ch_aid.getSelectedItem().toString());
                try
                {
                    Statement st = conn.createStatement();
                    st.executeUpdate("Update agent set agent_id="+aid+",agent_name='"+aname+"',address='"+add+"',gender='"+gen+"',email='"+mail+"',dob='"+dob+"',pan_no="+pan+",mobile="+mob+" where agent_id="+selected+"");
                    st.close();
                    JOptionPane.showMessageDialog(null,"Updated!","Successful",JOptionPane.PLAIN_MESSAGE);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                dis();
                clear();
    }//GEN-LAST:event_updateActionPerformed

    private void a_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_dobActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
       
        
    }//GEN-LAST:event_formWindowOpened

    private void chooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseMouseClicked
     
    }//GEN-LAST:event_chooseMouseClicked

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        String aname,add,gen,mail,dob;
        int aid,pan;
        long mob;
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-H547RQN";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Juhi_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }        
        aid=Integer.parseInt(a_id.getText());
                aname=a_name.getText();
                add=a_add.getText();
                gen=a_gen.getText();
                dob=a_dob.getText();
                mail=a_mail.getText();
                pan=Integer.parseInt(a_pan.getText());
                mob=Long.parseLong(a_mob.getText());
                try
                {
                    Statement st = conn.createStatement();
                    st.executeUpdate("Insert into agent values("+aid+",'"+aname+"','"+add+"','"+gen+"','"+mail+"','"+dob+"',"+pan+","+mob+")");
                    st.close();
                    JOptionPane.showMessageDialog(null,"Record Inserted!","Successful",JOptionPane.PLAIN_MESSAGE);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                dis();
                clear();
    }//GEN-LAST:event_insertActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        String aname,add,gen,mail,dob;
        int aid,pan;
        long mob;
        DefaultTableModel d2= (DefaultTableModel)tab.getModel();
            d2.setRowCount(0);
            tab.setModel(d2);
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-H547RQN";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Juhi_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from agent");
            int i=0;
            while(rs.next())
            {
                  aid = rs.getInt(1);
                aname =rs.getString(2);
                add =rs.getString(3);
                gen =rs.getString(4);
                mail =rs.getString(5);
                dob =rs.getString(6);
                    pan = rs.getInt(7);
                    mob = rs.getLong(8);
                d2.addRow(new Object[]{aid,aname,add,gen,mail,dob,pan,mob});
                tab.setModel(d2);
                System.out.println(aname);
                i++;
            }
            if(i<1)
            {
                JOptionPane.showMessageDialog(null,"No record found","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            rs.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void ch_aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_aidActionPerformed
      
        try
        {
            String driverName= "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-H547RQN";
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username = "Juhi_XE";
            String password = "oracle";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("System successfully connected to database");
            
        }
        catch(ClassNotFoundException e)
                {
                    System.out.println("Error 1");
                }
        catch(SQLException e)
                {
                    System.out.println("Error 2");
                }
        
         if(ch_aid.getItemCount()!=0)  { 
             int selected=Integer.parseInt(String.valueOf(ch_aid.getSelectedItem()));
                System.out.println(selected);
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from agent where agent_id="+selected+"");
            int i=0;
            if(rs.next())
            {
                a_id.setText(String.valueOf(rs.getInt(1)));
                a_name.setText(rs.getString(2));
                a_add.setText(rs.getString(3));
                a_gen.setText(rs.getString(4));
                a_mail.setText(rs.getString(5));
                a_dob.setText(rs.getString(6));
                a_pan.setText(String.valueOf(rs.getInt(7)));
                a_mob.setText(String.valueOf(rs.getLong(8)));
                i++;
            }
            if(i<1)
            {
                JOptionPane.showMessageDialog(null,"No record found","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            rs.close();
        }
            catch(Exception e)
            {
            e.printStackTrace();
        }
         }
    }//GEN-LAST:event_ch_aidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Insert_form l=new Insert_form();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void en()
    {
        a_id.setEnabled(true);
                a_name.setEnabled(true);
                a_add.setEnabled(true);
                a_gen.setEnabled(true);
                a_dob.setEnabled(true);
                a_mob.setEnabled(true);
                a_mail.setEnabled(true);
                a_pan.setEnabled(true);

    }
    public void dis()
    {
                ch_aid.setEnabled(false);
                a_id.setEnabled(false);
                a_name.setEnabled(false);
                a_add.setEnabled(false);
                a_dob.setEnabled(false);
                a_mob.setEnabled(false);
                a_mail.setEnabled(false);
                a_pan.setEnabled(false);
                a_gen.setEnabled(false);
                insert.setEnabled(false);
                update.setEnabled(false);
                delete.setEnabled(false);
    }
    public void clear()
    {
       a_id.setText("");
                a_name.setText("");
                a_add.setText("");
                a_gen.setText("");
                a_dob.setText("");
                a_mob.setText("");
                a_mail.setText("");
                a_pan.setText(""); 
                ch_aid.removeAllItems();
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
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agent().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_add;
    private javax.swing.JTextField a_dob;
    private javax.swing.JTextField a_gen;
    private javax.swing.JTextField a_id;
    private javax.swing.JTextField a_mail;
    private javax.swing.JTextField a_mob;
    private javax.swing.JTextField a_name;
    private javax.swing.JTextField a_pan;
    private javax.swing.JComboBox<String> ch_aid;
    private javax.swing.JComboBox<String> choose;
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
