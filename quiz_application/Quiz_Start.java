package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Quiz_Start extends JFrame implements ActionListener{
    String questions[][]=new String[10][5];//1->Question remaining 4->Options
    String answers[][]=new String[10][1];
    String userAnswers[][]=new String[10][1];
    JButton next,lifeline,submit;
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer=15;//Initially timer is 15 seconds
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
    ButtonGroup optGroup;
    String name;
    Quiz_Start(String name){
        this.name=name;
        setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        Image image=img.getImage().getScaledInstance(1440,350,Image.SCALE_DEFAULT);
        img=new ImageIcon(image);
        JLabel imgL=new JLabel(img);
        imgL.setBounds(0,0,1440,350);
        add(imgL);
        //Question no label
        qno=new JLabel();
        qno.setBounds(50,430,50,30);
        qno.setFont(new Font("Raleway",Font.PLAIN,20));
        add(qno);
        //Question label
        question=new JLabel();
        question.setBounds(80,430,900,30);
        question.setFont(new Font("Raleway",Font.PLAIN,20));
        add(question);
        //Data
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        //Answers data
        answers[0][0] = "JDB";
        answers[1][0] = "int";
        answers[2][0] = "java.util package";
        answers[3][0] = "Marker Interface";
        answers[4][0] = "Heap memory";
        answers[5][0] = "Remote interface";
        answers[6][0] = "import";
        answers[7][0] = "Java Archive";
        answers[8][0] = "java.lang.StringBuilder";
        answers[9][0] = "Bytecode is executed by JVM";
        //Option1
        opt1=new JRadioButton();//Option1
        opt1.setBounds(100,480,700,30);
        opt1.setFont(new Font("Raleway",Font.PLAIN,19));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        //Option2
        opt2=new JRadioButton();
        opt2.setBounds(100,530,700,30);
        opt2.setFont(new Font("Raleway",Font.PLAIN,19));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        //Option3
        opt3=new JRadioButton();
        opt3.setBounds(100,580,700,30);
        opt3.setFont(new Font("Raleway",Font.PLAIN,19));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        //Option 4
        opt4=new JRadioButton();
        opt4.setBounds(100,630,700,30);
        opt4.setFont(new Font("Raleway",Font.PLAIN,19));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        //Button group
        optGroup=new ButtonGroup();
        optGroup.add(opt1);
        optGroup.add(opt2);
        optGroup.add(opt3);
        optGroup.add(opt4);
        //Next button
        next=new JButton("Next");
        next.setBounds(1100,500,200,30);
        next.setFont(new Font("Raleway",Font.PLAIN,22));
        next.setBackground(new Color(30,144,254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        //Life line button
        lifeline=new JButton("50-50 Lifeline");
        lifeline.setBounds(1100,570,200,30);
        lifeline.setFont(new Font("Raleway",Font.PLAIN,22));
        lifeline.setBackground(new Color(30,144,254));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        //Submit button
        submit=new JButton("Submit");
        submit.setBounds(1100,640,200,30);
        submit.setFont(new Font("Raleway",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);//Disables the button
        submit.addActionListener(this);
        add(submit);
        
        start(count);
        
        setBounds(50,0,1440,840);//setBounds directly fits the frame location and size of the frame 
        //Without using setSize() method
        //First two arguments are frame location and remaining two are frame size
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public void paint(Graphics g){//No need to call paint method it is called automatically
        /*=>paint() method gives us access to an object of type Graphics class.
        =>Using the object of the Graphics class,we can call the 'drawString()' method of the Graphics class
        to write a text message
        =>Whenever your applet needs to update the information displayed in its window,it simply calls 'repaint()'*/
        super.paint(g);
        String time="Time left "+timer+" seconds";
        g.setFont(new Font("Raleway",Font.BOLD,20));
        g.setColor(Color.green);
        if(timer>0){
            g.drawString(time,1100,460);//acts like a setText but normally writes the text on the frame
            //1->String need to write,2->distance from x-axis,3->distance from y-axis
            timer--;
            try{
                Thread.sleep(1000);//Stops the execution upto particular time.It takes argument in milli secs
                repaint();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            g.drawString("Time's UP!",1100,460);
        }
        if(ans_given==1){
            ans_given=0;
            timer=15;
        }
        else if(timer==0){
            timer=15;
            
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==9){
                next.setEnabled(false);
                submit.setEnabled(true);
                if(optGroup.getSelection()==null){
                    userAnswers[count][0]="";
                }
                else{
                    userAnswers[count][0]=optGroup.getSelection().getActionCommand();//Return the selected value from group of radio buttons 
                }
                for(int i=0;i<userAnswers.length;i++){
                    if(userAnswers[i][0].equals(answers[i][0])){
                        score++;
                    }
                }
                setVisible(false);
                new Score(name,score);
            }
            else{
                if(optGroup.getSelection()==null){
                    userAnswers[count][0]="";
                }
                else{
                    userAnswers[count][0]=optGroup.getSelection().getActionCommand();//Return the selected value from group of radio buttons 
                }
                count++;
                start(count);
            }
        }
    }
    public void start(int count){
        if(count<10){
            qno.setText(""+(count+1)+".  ");
            question.setText(questions[count][0]);
            opt1.setText(questions[count][1]);
            opt1.setActionCommand(questions[count][1]);//Sets value of option 1 before we access it
            
            opt2.setText(questions[count][2]);
            opt2.setActionCommand(questions[count][2]);//Sets value of option 2 before we access it
            
            opt3.setText(questions[count][3]);
            opt3.setActionCommand(questions[count][3]);//Sets value of option 3 before we access it
            
            opt4.setText(questions[count][4]);
            opt4.setActionCommand(questions[count][4]);//Sets value of option 4 before we access it
            
            optGroup.clearSelection();//clears the selection of a already seleted radio button
        }
    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==next){
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);
                opt4.setEnabled(true);
                repaint();
                ans_given=1;
                if(optGroup.getSelection()==null){
                    userAnswers[count][0]="";
                }
                else{
                    userAnswers[count][0]=optGroup.getSelection().getActionCommand();
                }
                if(count==8){
                    next.setEnabled(false);
                    submit.setEnabled(true);
                    count++;
                    start(count);
                }
                else if(count<8){
                    count++;
                    start(count);
                }
                
            }
            else if(ae.getSource()==lifeline){
                
                if( count==0 || count==2 || count==4 || count==6 || count==8){
                    opt2.setEnabled(false);
                    opt3.setEnabled(false);
                }
                else{
                    opt1.setEnabled(false);
                    opt4.setEnabled(false);
                }
            }
            else if(ae.getSource()==submit){
               if(optGroup.getSelection()==null){
                    userAnswers[count][0]="";
                }
                else{
                    userAnswers[count][0]=optGroup.getSelection().getActionCommand();//Return the selected value from group of radio buttons 
                }
                for(int i=0;i<userAnswers.length;i++){
                    if(userAnswers[i][0].equals(answers[i][0])){
                        score++;
                    }
                }
               setVisible(false);
               new Score(name,score);
            }
        }
    public static void main(String[] args){
        new Quiz_Start("");
    }
}
