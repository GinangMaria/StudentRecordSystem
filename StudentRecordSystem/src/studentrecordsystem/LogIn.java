
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrecordsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


 



class LogIn  implements ActionListener{

    JFrame frame;
    JLabel j1,j2,j3;
    JTextField text1;
    JPasswordField text2;
    JButton jb1,jb2;
   
    LogIn(){

      
        frame = new JFrame("Login");
        frame.setBackground(Color.GRAY);
        frame.setLayout(null);
               
        j1 = new JLabel("Username:");
        j1.setBounds(120,90,200,30);
        j1.setForeground(Color.WHITE);
        frame.add(j1);
        
        j2 = new JLabel("Password:");
        j2.setBounds(123,140,200,30);
        j2.setForeground(Color.WHITE);
        frame.add(j2);
        
        j3 = new JLabel("Student Record System");
        j3.setBounds(200, 40, 200, 30);
        j3.setFont(new Font("serif", Font.BOLD, 20));
        j3.setForeground(Color.WHITE); 
        frame.add(j3);

        frame.setSize(500, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        
        text1=new JTextField();
        text1.setBounds(200,90,200,30);
        frame.add(text1);

        text2 = new JPasswordField();
        text2.setBounds(200,140,200,30);
        frame.add(text2);
        

        jb1 = new JButton("Login");
        jb1.setBounds(150,190,120,30);
        jb1.setFont(new Font("serif",Font.BOLD,15));
        jb1.addActionListener(this);
        jb1.setBackground(Color.WHITE);
        jb1.setForeground(Color.BLACK);
        frame.add(jb1);

        jb2 = new JButton("Cancel");
        jb2.setBounds(320,190,120,30);
        jb2.setFont(new Font("serif",Font.BOLD,15));
        jb2.setBackground(Color.WHITE);
        jb2.setForeground(Color.BLACK);
        frame.add(jb2);
        
        

        jb2.addActionListener(this);
        
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setSize(600,300);
        frame.setLocation(400,300);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String username = text1.getText();
        String password = text2.getText();
        
        
        
        if(e.getSource()== jb1){
            
 
            try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jazzy", "root", "jazzy");

          
            String query = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);


            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
           
                JOptionPane.showMessageDialog(null, "Login Success!");
                
                Home h = new Home();
                h.setVisible(true);
            } else {
       
                JOptionPane.showMessageDialog(null, "Invalid username or password!");
            }


            resultSet.close();
            statement.close();
            conn.close();

        } catch (Exception ex) {
      
            ex.printStackTrace();
        
        }
    
        }
      
    }
        private ResultSet executeQuery(String q) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }   


   
