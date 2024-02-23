package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateTeacher extends JFrame implements ActionListener {
  
    JTextField tfeducation,  tfaddress, tfphone, tfemail, tfdepartment;
    JLabel labelempId;
    JButton Update, cancel;
    Choice cEmpId;
    
    UpdateTeacher() {
        
        setSize(900, 650);
        setLocation(250, 50);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
                
        //Heading
        JLabel heading = new JLabel("UPDATE TEACHER DETAILS");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Employee ID");
        lblrollnumber.setBounds(50, 100, 200, 20);
        lblrollnumber.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(lblrollnumber);
        
        cEmpId = new Choice();
        cEmpId.setBounds(250, 100, 200, 20);
        add(cEmpId);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()) {
                cEmpId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelname);
        
        // Father Name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblfname);
        
        JLabel labelfname = new JLabel();
        labelfname.setBounds(600, 150, 150, 30);
        labelfname.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelfname);
        
        // Employee Id
        JLabel lblempid = new JLabel("Employee Id");
        lblempid.setBounds(50, 200, 200, 30);
        lblempid.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblempid);
        
        labelempId = new JLabel();
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelempId);
        
         // Date Of Birth
        JLabel lbldob = new JLabel("Date Of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldob);
        
        JLabel labeldob = new JLabel();
        labeldob.setBounds(600, 200, 150, 30);
        labeldob.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labeldob);
        
        //Address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        //Phone
        JLabel lblphone = new JLabel("Contact");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        //Email
        JLabel lblemail = new JLabel("Email I'D");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        //Class 10th Percentage
        JLabel lblx = new JLabel("Class Xth (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblx);
        
        JLabel labelx = new JLabel();
        labelx.setBounds(600, 300, 150, 30);
        labelx.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelx);
        
         //Class 12th Percentage
        JLabel lblxii = new JLabel("Class XIIth (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblxii);
        
        JLabel labelxii = new JLabel();
        labelxii.setBounds(200, 350, 150, 30);
        labelxii.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelxii);
        
        //Addhaar Card Number
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblaadhar);
        
        JLabel labelaadhar = new JLabel();
        labelaadhar.setBounds(600, 350, 150, 30);
        labelaadhar.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelaadhar);
        
        //Course
        JLabel lblcourse = new JLabel("Education");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblcourse);
      
        tfeducation = new JTextField();
        tfeducation.setBounds(200, 400, 150, 30);
        add(tfeducation);
        
        //Branch
        JLabel lblbranch = new JLabel("Department");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblbranch);
        
        tfdepartment = new JTextField();
        tfdepartment.setBounds(600, 400, 150, 30);
        add(tfdepartment);
        
        try{
            Conn c = new Conn();
            String query = "select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelempId.setText(rs.getString("empId"));
                tfeducation.setText(rs.getString("education"));
                tfdepartment.setText(rs.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try{
            Conn c = new Conn();
            String query = "select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelempId.setText(rs.getString("empId"));
                tfeducation.setText(rs.getString("education"));
                tfdepartment.setText(rs.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            }
        });
        
        Update = new JButton("Update");
        Update.setBounds(250, 500, 120, 30);
        Update.setBackground(Color.BLACK);
        Update.setForeground(Color.WHITE);
        Update.addActionListener(this);
        Update.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(Update);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 650);
        add(image);
        
                                        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == Update) {
            String empId = labelempId.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String department = tfdepartment.getText();
            
            try {
                String query ="update teacher set address='"+address+"', phone='"+phone+"', email='"+email+"', education='"+education+"', department='"+department+"' where empId='"+empId+"'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Updated Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new UpdateTeacher();
    }
}
