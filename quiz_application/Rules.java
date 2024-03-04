package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton Back,start;
    Rules(String name){
        this.name=name;
        setLayout(null);
        //Heading
        JLabel heading=new JLabel("Hello "+name+"! Welcome to Simple Minds");
        heading.setBounds(20,20,700,40);
        heading.setFont(new Font("Algerian",Font.BOLD,25));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        //Rules
        JLabel rules=new JLabel();
        rules.setBounds(20,80,700,400);
        rules.setFont(new Font("Algerian",Font.PLAIN,16));
        rules.setForeground(Color.BLACK);
        rules.setText( "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>");
        add(rules);
        //Back button
        Back=new JButton("Back");
        Back.setFont(new Font("Raleway",Font.BOLD,20));
        Back.setBounds(20,480,140,30);
        Back.setBackground(new Color(30,144,254));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
        //Start button
        start=new JButton("Start");
        start.setFont(new Font("Raleway",Font.BOLD,20));
        start.setBounds(640,480,140,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Back){
            setVisible(false);
            new Login();
        }
        else if(ae.getSource()==start){
            setVisible(false);
            new Quiz_Start(name);
        }
    }
    public static void main(String[] args){
        new Rules("Jayanthi");
    }
}
