package university.management.system;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Marks extends JFrame implements ActionListener {
    
    String rollno;
    JButton cancel;
    
    Marks (String rollno) {
        this.rollno = rollno;
        
        setSize(500, 600);
        setLocation(400, 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
         //Heading
        JLabel heading = new JLabel("INDIAN INSTITUTE OF COMPUTE SCIENCE");
        heading.setBounds(35, 20, 500, 30);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(heading);
        
         //Sub Heading
        JLabel subheading = new JLabel("Result of Examination 2023");
        subheading.setBounds(130, 50, 500, 20);
        subheading.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(subheading);
        
        JLabel underline = new JLabel("_____________________________________________________________________");
        underline.setBounds(0, 55, 1000, 30);
        add(underline);
        
         //Roll Number
        JLabel lblrollno = new JLabel("Roll Number  :   " + rollno);
        lblrollno.setBounds(20, 120, 500, 20);
        lblrollno.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        lblrollno.setForeground(Color.WHITE);
        add(lblrollno);
        
         //Semester
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(20, 155, 500, 20);
        lblsemester.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        lblsemester.setForeground(Color.WHITE);
        add(lblsemester);
        
          //Subject 1
        JLabel sub1 = new JLabel();
        sub1.setBounds(30, 220, 500, 25);
        sub1.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        sub1.setForeground(Color.WHITE);
        add(sub1);
        
         //Subject 2
        JLabel sub2 = new JLabel();
        sub2.setBounds(30, 250, 500, 25);
        sub2.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        sub2.setForeground(Color.WHITE);
        add(sub2);
        
         //Subject 3
        JLabel sub3 = new JLabel();
        sub3.setBounds(30, 280, 500, 25);
        sub3.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        sub3.setForeground(Color.WHITE);
        add(sub3);
        
         //Subject 4
        JLabel sub4 = new JLabel();
        sub4.setBounds(30, 310, 500, 25);
        sub4.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        sub4.setForeground(Color.WHITE);
        add(sub4);
        
         //Subject 5
        JLabel sub5 = new JLabel();
        sub5.setBounds(30, 340, 500, 25);
        sub5.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        sub5.setForeground(Color.WHITE);
        add(sub5);
        
        try {
            Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from  subject where rollno = '"+rollno+"'");
            while(rs1.next()) {
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from  marks where rollno = '"+rollno+"'");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "   -----   " + rs2.getString("marks1"));
                sub2.setText(sub2.getText() + "   -----   " + rs2.getString("marks2"));
                sub3.setText(sub3.getText() + "   -----   " + rs2.getString("marks3"));
                sub4.setText(sub4.getText() + "   -----   " + rs2.getString("marks4"));
                sub5.setText(sub5.getText() + "   -----   " + rs2.getString("marks5"));
                lblsemester.setText("Semester   :   " + rs2.getString("semester"));
            }
        } catch (Exception e) {
            e.printStackTrace();
         }
        
        cancel = new JButton("BACK");
        cancel.setBounds(60, 450, 150, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/result.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 75, 500, 500);
        add(image);
        
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new Marks("");
    }
    
}
