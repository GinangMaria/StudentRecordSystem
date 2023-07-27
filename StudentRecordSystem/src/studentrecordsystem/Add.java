
package studentrecordsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


class Add implements ActionListener {
    JFrame frame;
    JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16;
    JTextField T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12;
    JButton B1, B2, viewButton;
    
            


    Add() {
        frame = new JFrame("Add Student");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        L1 = new JLabel();
        L1.setBounds(0, 0, 900, 700);
        L1.setLayout(null);

        L2 = new JLabel("STUDENT INFORMATION");
        L2.setBounds(235, 40, 500, 50);
        L2.setFont(new Font("serif", Font.BOLD, 35));
        L2.setForeground(Color.WHITE);
        L1.add(L2);
        frame.add(L1);

        L3 = new JLabel("Name:");
        L3.setBounds(50, 150, 100, 30);
        L3.setFont(new Font("serif", Font.BOLD, 20));
        L3.setForeground(Color.WHITE);
        L1.add(L3);

        T1 = new JTextField();
        T1.setBounds(200, 150, 150, 30);
        L1.add(T1);

        L4 = new JLabel("Gender:");
        L4.setBounds(400, 150, 200, 30);
        L4.setFont(new Font("serif", Font.BOLD, 20));
        L4.setForeground(Color.WHITE);
        L1.add(L4);

        T2 = new JTextField();
        T2.setBounds(600, 150, 150, 30);
        L1.add(T2);

        L5 = new JLabel("Age:");
        L5.setBounds(50, 200, 100, 30);
        L5.setFont(new Font("serif", Font.BOLD, 20));
        L5.setForeground(Color.WHITE);
        L1.add(L5);

        T3 = new JTextField();
        T3.setBounds(200, 200, 150, 30);
        L1.add(T3);

        L6 = new JLabel("Religion:");
        L6.setBounds(400, 200, 200, 30);
        L6.setFont(new Font("serif", Font.BOLD, 20));
        L6.setForeground(Color.WHITE);
        L1.add(L6);

        T4 = new JTextField();
        T4.setBounds(600, 200, 150, 30);
        L1.add(T4);

        L7 = new JLabel("Address");
        L7.setBounds(50, 250, 100, 30);
        L7.setFont(new Font("serif", Font.BOLD, 20));
        L7.setForeground(Color.WHITE);
        L1.add(L7);

        T5 = new JTextField();
        T5.setBounds(200, 250, 150, 30);
        L1.add(T5);

        L8 = new JLabel("Civil Status:");
        L8.setBounds(400, 250, 300, 30);
        L8.setFont(new Font("serif", Font.BOLD, 20));
        L8.setForeground(Color.WHITE);
        L1.add(L8);

        T6 = new JTextField();
        T6.setBounds(600, 250, 150, 30);
        L1.add(T6);

        L9 = new JLabel("Birth Date:");
        L9.setBounds(50, 300, 200, 30);
        L9.setFont(new Font("serif", Font.BOLD, 20));
        L9.setForeground(Color.WHITE);
        L1.add(L9);

        T7 = new JTextField();
        T7.setBounds(200, 300, 150, 30);
        L1.add(T7);

        L10 = new JLabel("Father's Name:");
        L10.setBounds(400, 300, 400, 30);
        L10.setFont(new Font("serif", Font.BOLD, 20));
        L10.setForeground(Color.WHITE);
        L1.add(L10);

        T8 = new JTextField();
        T8.setBounds(600, 300, 150, 30);
        L1.add(T8);

        L11 = new JLabel("Course:");
        L11.setBounds(50, 350, 100, 30);
        L11.setFont(new Font("serif", Font.BOLD, 20));
        L11.setForeground(Color.WHITE);
        L1.add(L11);

        T9 = new JTextField();
        T9.setBounds(200, 350, 150, 30);
        L1.add(T9);

        L12 = new JLabel("Mother's Name:");
        L12.setBounds(400, 350, 400, 30);
        L12.setFont(new Font("serif", Font.BOLD, 20));
        L12.setForeground(Color.WHITE);
        L1.add(L12);

        T10 = new JTextField();
        T10.setBounds(600, 350, 150, 30);
        L1.add(T10);

        L13 = new JLabel("Student No.:");
        L13.setBounds(50, 400, 400, 30);
        L13.setFont(new Font("serif", Font.BOLD, 20));
        L13.setForeground(Color.WHITE);
        L1.add(L13);
        
        T11 = new JTextField();
        T11.setBounds(200, 400, 150, 30);
        L1.add(T11);
        
        L16 = new JLabel("Mobile No.:");
        L16.setBounds(400, 400, 400, 30);
        L16.setFont(new Font("serif", Font.BOLD, 20));
        L16.setForeground(Color.WHITE);
        L1.add(L16);
        

        T12 = new JTextField();
        T12.setBounds(600, 400, 150, 30);
        L1.add(T12);

        L14 = new JLabel();
        L14.setBounds(200, 450, 250, 200);
        L1.add(L14);

        L15 = new JLabel("");
        L15.setBounds(600, 450, 250, 200);
        L1.add(L15);
       
        B1 = new JButton("Submit");
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLACK);
        B1.setBounds(250, 500, 150, 40);
        L1.add(B1);
        
        B2 = new JButton("Cancel");
        B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLACK);
        B2.setBounds(450, 500, 150, 40);
        L1.add(B2);

        B1.addActionListener(this);
        B2.addActionListener(this);

        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(L1);
        frame.setVisible(true);
        frame.setSize(900, 700);
        frame.setLocation(400, 100);
    }

    @Override
public void actionPerformed(ActionEvent ae) {
    
    String name = T1.getText();
    String gender = T2.getText();
    String age = T3.getText();
    String religion = T4.getText();
    String address = T5.getText();
    String civilstatus = T6.getText();
    String birthdate = T7.getText();
    String fathersname = T8.getText();
    String course = T9.getText();
    String mothersname = T10.getText();
    String studentno = T11.getText();
    String mobileno = T12.getText();

    if(ae.getSource()== B1){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jazzy", "root", "jazzy");
            String query = "INSERT INTO addstudent (name, gender, age, religion, address, civilstatus, birthdate, fathersname, course, mothersname, studentno, mobileno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name) ;
            preparedStatement.setString(2, gender);
            preparedStatement.setString(3, age);
            preparedStatement.setString(4, religion);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, civilstatus);
            preparedStatement.setString(7, birthdate);
            preparedStatement.setString(8, fathersname);
            preparedStatement.setString(9, course);
            preparedStatement.setString(10, mothersname);
            preparedStatement.setString(11, studentno);
            preparedStatement.setString(12, mobileno);


            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Personal Data added successfully!");
            T1.setText("");
            T2.setText("");
            T3.setText("");
            T4.setText("");
            T5.setText("");
            T6.setText("");
            T7.setText("");
            T8.setText("");
            T9.setText("");
            T10.setText("");
            T11.setText("");
            T12.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add data.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
        
    
      
    }else if (ae.getSource() == B2) {
        frame.setVisible(false);
        new Home();
    }
}
        
   

    public static void main(String[] arg) {
        new Add();
    }
}