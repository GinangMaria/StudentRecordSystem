
package studentrecordsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import java.util.ArrayList;

class Attendance implements ActionListener {

    JFrame frame;
    JLabel L1, L2, L3, L4, L5, L6;
    JTextField T1, T2, T3;
    JButton B1, B2;

    ArrayList<String[]> attendanceRecords = new ArrayList<>();

    Attendance() {
        frame = new JFrame("Attendance");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        L1 = new JLabel();
        L1.setBounds(0, 0, 900, 700);
        L1.setLayout(null);

        L2 = new JLabel("ATTENDANCE");
        L2.setBounds(260, 50, 500, 50);
        L2.setFont(new Font("serif",Font.BOLD,35));
        L2.setForeground(Color.WHITE);
        L1.add(L2);
        frame.add(L1);
        
        L3 = new JLabel("Student ID:");
        L3.setBounds(80, 150, 300, 30);
        L3.setFont(new Font("serif", Font.BOLD, 20));
        L3.setForeground(Color.WHITE);
        L1.add(L3);

        T1 = new JTextField();
        T1.setBounds(200, 150, 180, 30);
        L1.add(T1);

        L4 = new JLabel("Name:");
        L4.setBounds(430, 150, 180, 30);
        L4.setFont(new Font("serif", Font.BOLD, 20));
        L4.setForeground(Color.WHITE);
        L1.add(L4);

        T2 = new JTextField();
        T2.setBounds(500, 150, 180, 30);
        L1.add(T2);

        L5 = new JLabel("Attendance Date:");
        L5.setBounds(180, 210, 450, 30);
        L5.setFont(new Font("serif", Font.BOLD, 20));
        L5.setForeground(Color.WHITE);
        L1.add(L5);

        T3 = new JTextField();
        T3.setBounds( 350,210, 180, 30);
        L1.add(T3);

        B1 = new JButton("Insert");
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLACK);
        B1.setBounds(210, 280, 150, 40);
        L1.add(B1);

        B2 = new JButton("Cancel");
        B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLACK);
        B2.setBounds(420, 280, 150, 40);
        L1.add(B2);

        

        B1.addActionListener(this);
        B2.addActionListener(this);

      

        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(L1);
        frame.setVisible(true);
        frame.setSize(800, 450);
        frame.setLocation(400, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sid = T1.getText();
        String name = T2.getText();
        String attd = T3.getText();


    if(ae.getSource()== B1){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jazzy", "root", "jazzy");
            String query = "INSERT INTO attendance (studentid, name, attendancedate) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, sid) ;
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, attd);
          


            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Personal Data added successfully!");
            T1.setText("");
            T2.setText("");
            T3.setText("");
           
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add data.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        
    
      
    } else if (ae.getSource() == B2) {
            frame.setVisible(false);
            new Home();
        
        }
    }
   
    public static void main(String[] arg) {
        new Attendance();
    }
}