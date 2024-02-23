package university.management.system;
import java.awt.*;
import javax.swing.*; 
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ExaminationDetails extends JFrame implements ActionListener {
    
    JTextField search;
    JButton submit, cancel;
    JTable table;
    
    ExaminationDetails() {
        setSize(1100, 475);
        setLocation(150, 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
         //Heading
        JLabel heading = new JLabel("CHECK RESULT");
        heading.setBounds(80, 3, 400, 50);
        heading.setFont(new Font("Bodoni MT Black", Font.BOLD, 30));
        heading.setForeground(Color.CYAN);
        add(heading);
         
        search = new JTextField();
        search.setBounds(80, 80, 200, 25);
        search.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(search);
        
        submit = new JButton("Submit");
        submit.setBounds(330, 80, 150, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(490, 80, 150, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/examdetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 128, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1100, 128);
        add(image);
        
        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 130, 1100, 310);
        add(jsp);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 2).toString());
            }
        });
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            setVisible(false);
            new Marks(search.getText());
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new  ExaminationDetails();
    }
            
}
