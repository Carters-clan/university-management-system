package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FeeStructure extends JFrame {
    
    FeeStructure() {
        setSize(1000, 700);
        setLocation(200, 50);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Fee Struture");
        heading.setBounds(50, 10, 400, 30);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/feeStructure.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 370, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 290, 1000, 370);
        add(image);
        
        
        JTable table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
          e.printStackTrace(); 
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 60, 1000, 700);
        add(jsp);
                
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FeeStructure();
    }
    
}
