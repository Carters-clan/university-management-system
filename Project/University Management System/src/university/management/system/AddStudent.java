package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener {
  
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii,tfaadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddStudent() {
        
        setSize(900, 700);
        setLocation(250, 50);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //Heading
        JLabel heading = new JLabel("NEW STUDENT DETAILS");
        heading.setBounds(220, 30, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 40));
        add(heading);
        
        //Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        // Father Name
        JLabel lblfname = new JLabel(" Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        // Roll Number
        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblrollno);
        
        labelrollno = new JLabel("STU_"+first4);
        labelrollno.setBounds(200, 200, 200, 30);
        labelrollno.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
        add(labelrollno);
        
         // Date Of Birth
        JLabel lbldob = new JLabel("Date Of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);
        
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
        
        tfx = new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);
        
         //Class 12th Percentage
        JLabel lblxii = new JLabel("Class XIIth (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);
        
        //Addhaar Card Number
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        //Course
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblcourse);
        
        String course[] = {"BCA", "MCA", "B.Tech","M.Tech", "BSC", "MSC", "BBA", "MBA", "B.Com", "M.Com", "B.Tech", "M.Tech", "BA", "MA" };
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200, 400, 150, 30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        //Branch
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblbranch);
        
        String branch[] = {"Computer Science", "Electronics", "Art & Culture", "Machanical", "Civil", "Science & SciFI", "Acadmic Education", "Physical & Sports", "Psychological", "Data Science", "Medical", "Economics", "Research & Evaluation"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
                        
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
        note.setForeground(Color.WHITE);
        add(note);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addstudent.jpg"));
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
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String)cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            
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
                String query ="insert into student values('"+name+"', '"+fname+"', '"+rollno+"','"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddStudent();
    }
}
