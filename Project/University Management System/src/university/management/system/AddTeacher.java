package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener {
  
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii,tfaadhar;
    JLabel labelempId;
    JDateChooser dcdob;
    JComboBox cbedu, cbdepart;
    JButton submit, cancel;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddTeacher() {
        
        setSize(900, 700);
        setLocation(250, 50);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //Heading
        JLabel heading = new JLabel("NEW TEACHERS DETAILS");
        heading.setBounds(220, 30, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 40));
        add(heading);
        
        //Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblname.setForeground(Color.BLACK);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        // Father Name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblfname.setForeground(Color.BLACK);
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        // Employee ID
        JLabel lblempID = new JLabel("Employye ID");
        lblempID.setBounds(50, 200, 200, 30);
        lblempID.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblempID.setForeground(Color.BLACK);
        add(lblempID);
        
        labelempId = new JLabel("EMP_"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        labelempId.setForeground(Color.BLACK);
        add(labelempId);
        
         // Date Of Birth
        JLabel lbldob = new JLabel("Date Of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbldob.setForeground(Color.BLACK);
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);
        
        //Address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbladdress.setForeground(Color.BLACK);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        //Phone
        JLabel lblphone = new JLabel("Contact");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblphone.setForeground(Color.BLACK);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        //Email
        JLabel lblemail = new JLabel("Email ID");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblemail.setForeground(Color.BLACK);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        //Class 10th Percentage
        JLabel lblx = new JLabel("Class Xth (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblx.setForeground(Color.BLACK);
        add(lblx);
        
        tfx = new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);
        
         //Class 12th Percentage
        JLabel lblxii = new JLabel("Class XIIth (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblxii.setForeground(Color.BLACK);
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);
        
        //Addhaar Card Number
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblaadhar.setForeground(Color.BLACK);
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        //Qualification
        JLabel lbleducation = new JLabel("Qualification");
        lbleducation.setBounds(50, 400, 200, 30);
        lbleducation.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbleducation.setForeground(Color.BLACK);
        add(lbleducation);
        
        String course[] = {"BCA", "MCA", "B.Tech","M.Tech", "BSC", "MSC", "BBA", "MBA", "B.Com", "M.Com", "B.Tech", "M.Tech", "BA", "MA" };
        cbedu = new JComboBox(course);
        cbedu.setBounds(200, 400, 150, 30);
        cbedu.setBackground(Color.WHITE);
        add(cbedu);
        
        //Department
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(400, 400, 200, 30);
        lbldepartment.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbldepartment.setForeground(Color.BLACK);
        add(lbldepartment);
        
        String branch[] = {"Computer Science", "Electronics", "Art & Culture", "Machanical", "Civil", "Science & SciFI", "Acadmic Education", "Physical & Sports", "Psychological", "Data Science", "Medical", "Economics", "Research & Evaluation"};
        cbdepart = new JComboBox(branch);
        cbdepart.setBounds(600, 400, 150, 30);
        cbdepart.setBackground(Color.WHITE);
        add(cbdepart);
        
        submit = new JButton("Submit");
        submit.setBounds(250, 500, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        //Note
        JLabel note = new JLabel("NOTE : Verify your details before submiting. It will be not changed or modify in future");
        note.setBounds(150, 550, 600, 50);
        note.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        note.setForeground(Color.RED);
        add(note);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addteacher.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
                                        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String empId = labelempId.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String education = (String)cbedu.getSelectedItem();
            String department = (String) cbdepart.getSelectedItem();
            
            if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Should not be Empty");
            return;
            } if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Father's Name Should not be Empty");
            return;
            } if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Birth Should not be Empty");
            return;
            } if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address Should not be Empty");
            return;
            } if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Phone Number Should not be Empty");
            return;
            } if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Address Should not be Empty");
            return;
            } if (x.equals("")) {
            JOptionPane.showMessageDialog(null, "Class 10th percentage Should not be Empty");
            return;
            } if (xii.equals("")) {
            JOptionPane.showMessageDialog(null, "Class 12th percentage Should not be Empty");
            return;
            } if (aadhar.equals("")) {
            JOptionPane.showMessageDialog(null, "Aadhar Number Should not be Empty");
            return;
            }
            
            try {
                String query ="insert into teacher values('"+name+"', '"+fname+"', '"+empId+"','"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+education+"', '"+department+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddTeacher();
    }
}
