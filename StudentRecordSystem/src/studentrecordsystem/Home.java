
package studentrecordsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

class Home  implements ActionListener{

    JFrame frame;
    JLabel L1,L2,L3;
    JButton B1,B2,B3;

    Home(){
        frame = new JFrame("Student Record System");
        frame.setBackground(Color.DARK_GRAY);
        frame.setLayout(null);

        L1 = new JLabel();
        L1.setBounds(0,0,700,500);
        L1.setLayout(null);
        frame.add(L1);

        L2 = new JLabel("STUDENT RECORD SYSTEM");
        L2.setBounds(160,30,500,40);
        L2.setFont(new Font("serif",Font.BOLD,28));
        L2.setForeground(Color.WHITE);
        L1.add(L2);

        L3 = new JLabel("MY UNIVERSITY");
        L3.setBounds(285, 65, 500, 50);
        L3.setFont(new Font("serif",Font.BOLD,17));
        L3.setForeground(Color.WHITE);
        L1.add(L3);
        frame.add(L3);
        
        B1 = new JButton("ADD INFORMATION");
        B1.setBounds(230,160,250,60);
        B1.setFont(new Font("serif",Font.BOLD,15));
        B1.setBackground(Color.WHITE);
        B1.addActionListener(this);
        L1.add(B1);


        B2 = new JButton("SUBMIT ATTENDANCE");
        B2.setBounds(230,250,250,60);
        B2.setFont(new Font("serif",Font.BOLD,15));
        B2.setBackground(Color.WHITE);
        B2.addActionListener(this);
        L1.add(B2);

        B3 = new JButton("SUBMIT GRADES");
        B3.setBounds(230,340,250,60);
        B3.setFont(new Font("serif",Font.BOLD,15));
        B3.setBackground(Color.WHITE);
        B3.addActionListener(this);
        L1.add(B3);

        
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setLocation(450,200);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==B1){
            frame.setVisible(false);
            new Add();
        }   
        if(ae.getSource()==B2){
            frame.setVisible(false);
            new Attendance();
        }   
        if(ae.getSource()==B3){
            frame.setVisible(false);
            new Grades();            
        }
       try {
Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = null;
DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdatabase", "root", "azrielbarcelona00");
} catch (Exception ex){


}
}
    public static void main(String[ ] arg){
        Home h = new Home();
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    