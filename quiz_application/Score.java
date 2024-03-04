
package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
    JButton again;
    Score(String name,int score){
        setLayout(null);
        //For image
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image image=img.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        img=new ImageIcon(image);
        JLabel imgL=new JLabel(img);
        imgL.setBounds(0,100,300,250);
        add(imgL);
        //Heading
        JLabel heading=new JLabel("Thank you "+name+" for taking the quiz.Visit Again....");
        heading.setBounds(60,30,700,30);
        heading.setFont(new Font("Raleway",Font.BOLD,20));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        //Score 
        JLabel scoreL=new JLabel("Your score is "+score);
        scoreL.setBounds(400,200,300,30);
        scoreL.setFont(new Font("Raleway",Font.BOLD,25));
        scoreL.setForeground(Color.GREEN);
        add(scoreL);
        //Try again button
        again=new JButton("Try again");
        again.setBounds(420,270,160,30);
        again.setFont(new Font("Raleway",Font.PLAIN,22));
        again.setForeground(Color.WHITE);
        again.setBackground(new Color(30,144,254));
        again.addActionListener(this);
        add(again);
        if(score==10){
            again.setVisible(false);
            JLabel aT=new JLabel("Nice performance Keep it up!!!");
            aT.setBounds(400,250,300,30);
            aT.setFont(new Font("Raleway",Font.BOLD,16));
            aT.setForeground(new Color(30,144,254));
            add(aT);
        }
        else{
            
            again.setVisible(true);
        }
        setBounds(300,150,750,550);//setBounds directly fits the frame location and size of the frame 
        
        //Without using setSize() method
        //First two arguments are frame location and remaining two are frame size
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==again){
            setVisible(false);
            new Login();
        }
    }
    /*public static void main(String[] args){
        new Score("Jayanthi",6);
    }*/
}
