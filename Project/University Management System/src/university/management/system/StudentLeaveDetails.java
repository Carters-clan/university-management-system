package university.management.system;

import java.awt.Choice;
import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentLeaveDetails extends JFrame implements ActionListener {
    
    Choice crollno;
    JTable table;
    JButton search, print, cancel;
    
    StudentLeaveDetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(20, 20, 170, 20);
        heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        crollno = new Choice();
        crollno.setBounds(200, 20, 150, 20);
        add(crollno);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from Student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from studentleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Scroll Bar
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 500);
        add(jsp);
        
        //Search Button
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.setBackground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        
        //Print Button
        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.setBackground(Color.WHITE);
        print.addActionListener(this);
        add(print);
                       
        //Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(220, 70, 80, 20);
        cancel.setBackground(Color.WHITE);
        cancel.addActionListener((ActionListener) this);
        add(cancel);
        
        setSize(900, 600);
        setLocation(220, 100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/leavedetail.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 100);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from studentleave where rollno = '"+crollno.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new StudentLeaveDetails();
    }
}
