import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main{

    public static void main(String[] args){

        ImageIcon title = new ImageIcon("title.png");

        JLabel label = new JLabel();
        label.setIcon(title);

        //Inch
        JLabel Cm = new JLabel();
        Cm.setText("++Centimeter to Inch++");
        Cm.setFont(new Font("Century",Font.PLAIN,18));
        Cm.setBounds(10, -100, 300, 250);
  
        //But1

        JLabel lab1 = new JLabel("Input Cm");
        lab1.setBounds(20, 40, 70, 30);
        lab1.setFont(new Font("Century",Font.PLAIN,14));
        JTextField numb =  new JTextField(20);
        numb.setBounds(20, 70, 70, 30);
  
       
        JLabel re = new JLabel("");
        re.setBounds(20, 120, 300, 30);
        re.setFont(new Font("Century",Font.PLAIN,14));

        JButton button1 = new JButton("=");
        button1.setBounds(20, 100, 70, 30);
        button1.setBackground(new Color(255, 255, 204));
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button1){
                    double a = Double.valueOf(numb.getText());
                    double Ans = 0;
                    Ans = 0.393700787 * a;
                    re.setText(a+" cm equal "+Ans+" inch");
                }
            }

        });



        //Foot
        JLabel Cm2 = new JLabel();
        Cm2.setText("++Centimeter to Foot++");
        Cm2.setFont(new Font("Century",Font.PLAIN,18));
        Cm2.setBounds(10, 80, 600, 250);

        //But2

        JLabel lab2 = new JLabel("Input Cm");
        lab2.setBounds(20, 220, 70, 30);
        lab2.setFont(new Font("Century",Font.PLAIN,14));
        JTextField numb2 =  new JTextField(20);
        numb2.setBounds(20, 250, 70, 30);
       
        JLabel re2 = new JLabel("");
        re2.setBounds(20, 300, 300, 30);
        re2.setFont(new Font("Century",Font.PLAIN,14));

        JButton button2 = new JButton("=");
        button2.setBounds(20, 280, 70, 30);
        button2.setBackground(new Color(255, 255, 204));
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button2){
                    double b = Double.valueOf(numb2.getText());
                    double Ans2 = 0;
                    Ans2 = 0.032808399 * b;
                    re2.setText(b+" cm equal "+Ans2 +" foot");
                }
            }

        });


          //Yard
          JLabel Cm3 = new JLabel();
        Cm3.setText("++Centimeter to Yard++");
        Cm3.setFont(new Font("Century",Font.PLAIN,18));
        Cm3.setBounds(300, -100, 300, 250);
  
        //But3

        JLabel lab3 = new JLabel("Input Cm");
        lab3.setBounds(300, 40, 70, 30);
        lab3.setFont(new Font("Century",Font.PLAIN,14));
        JTextField numb3 =  new JTextField(20);
        numb3.setBounds(300, 70, 70, 30);
  
       
        JLabel re3 = new JLabel("");
        re3.setBounds(300, 120, 300, 30);
        re3.setFont(new Font("Century",Font.PLAIN,14));

        JButton button3 = new JButton("=");
        button3.setBounds(300, 100, 70, 30);
        button3.setBackground(new Color(255, 255, 204));
        button3.setBorder(BorderFactory.createEtchedBorder());
        button3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button3){
                    double c = Double.valueOf(numb.getText());
                    double Ans3 = 0;
                    Ans3 = 0.010936133 * c;
                    re3.setText(c+" cm equal "+Ans3+" yard");
                }
            }

        });

        
        //Mile
        JLabel Cm4 = new JLabel();
        Cm4.setText("++Centimeter to Mile++");
        Cm4.setFont(new Font("Century",Font.PLAIN,18));
        Cm4.setBounds(300, 80, 600, 250);

        //But4

        JLabel lab4 = new JLabel("Input Cm");
        lab4.setBounds(300, 220, 70, 30);
        lab4.setFont(new Font("Century",Font.PLAIN,14));
        JTextField numb4 =  new JTextField(20);
        numb4.setBounds(300, 250, 70, 30);
       
        JLabel re4 = new JLabel("");
        re4.setBounds(300, 300, 300, 30);
        re4.setFont(new Font("Century",Font.PLAIN,14));

        JButton button4 = new JButton("=");
        button4.setBounds(300, 280, 70, 30);
        button4.setBackground(new Color(255, 255, 204));
        button4.setBorder(BorderFactory.createEtchedBorder());
        button4.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button4){
                    double d = Double.valueOf(numb2.getText());
                    double Ans4 = 0;
                    Ans4 = 0.0000062137 * d;
                    re4.setText(d+" cm equal "+Ans4 +" Mile");
                }
            }

        });


        JPanel blue = new JPanel(); 
        blue.setBackground(new Color(204, 229, 255)); 
        blue.setBounds(0, 0, 600, 200);
        

        JPanel pink = new JPanel();
        pink.setBackground(new Color(255, 204, 255)); 
        pink.setBounds(0, 200, 600, 400);
        pink.setLayout(null);

      
        
        JFrame frame = new JFrame();
        frame.setTitle("U&L");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);


    
        blue.add(label);

        pink.add(Cm);
        pink.add(button1);
        pink.add(lab1);
        pink.add(numb);
        pink.add(re);

        pink.add(Cm2);
        pink.add(button2);
        pink.add(lab2);
        pink.add(numb2);
        pink.add(re2);

        pink.add(Cm3);
        pink.add(button3);
        pink.add(lab3);
        pink.add(numb3);
        pink.add(re3);

        pink.add(Cm4);
        pink.add(button4);
        pink.add(lab4);
        pink.add(numb4);
        pink.add(re4);


        frame.add(blue);
        frame.add(pink);
        


       //logo
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        

        

        
       
    }
    
}