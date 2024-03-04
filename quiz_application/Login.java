package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JTextField nameTextField;
    JButton Start,back;
    Login(){
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icons/login2.png"));//From JFrame class
        Image image1=img1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(image1);
        JLabel imageL=new JLabel(imageIcon);
        imageL.setBounds(0,0,600,500);
        add(imageL);
        //Heading
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(735,60,400,40);
        heading.setFont(new Font("Algerian",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        //Name label
        JLabel name=new JLabel("Enter Your Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(790,140,300,30);
        name.setForeground(new Color(30,144,254));
        add(name);
        //Name textfield
        nameTextField=new JTextField();
        nameTextField.setBounds(750,200,300,30);
        nameTextField.setFont(new Font("Raleway",Font.BOLD,15));
        add(nameTextField);
        //Rules Button
        Start=new JButton("Start");
        Start.setFont(new Font("Raleway",Font.BOLD,20));
        Start.setBounds(750,300,120,30);
        Start.setBackground(new Color(30,144,254));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);
        //Back button
        back=new JButton("Back");
        back.setFont(new Font("Raleway",Font.BOLD,20));
        back.setBounds(950,300,120,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);//length and breadth
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setLocation(100,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Start){
            String tname=nameTextField.getText();
            setVisible(false);
            new Quiz_Start(tname);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String[] arg){
        new Login();
    }
}
