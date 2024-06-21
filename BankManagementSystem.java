import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BankManagementSystem implements ActionListener{
    
    String name="Hamza Shahzad",cnic="61101-123456-7",phone="03095534267",address="G-11/1 Islamabad",username="hamza",pin="1234",income="10000",user,password;
    double balance=10000,amount;
JLabel label;
JTextField namefield,pinfield,usernamefield,cnicfield,phonefield,addressfield,incomefield,balancefield,userfield,passwordfield,withdrawfield,sendfield,addfield;
JFrame signupframe,loginframe,welcomeframe,sendframe,withdrawframe,addframe,detailframe,balanceframe,cardframe,workframe,backframe;    
JButton signupbutton,loginbutton,welcomesignupbutton,welcomeloginbutton,sendbutton,addbutton,withdrawbutton,cardbutton,detailbutton,balancebutton,backbutton,withdrawmoneybutton,sendmoneybutton,back,addmoneybutton;;

    public void welcome()
        {
            JLabel lab = new JLabel("WELCOME TO SHAZYBANK ");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            lab.setBounds(0, 10, 500, 50);
            lab.setForeground(Color.white);
            //SIGNUP BUTTON
            welcomesignupbutton = new JButton("SIGNUP");
            welcomesignupbutton.setBounds(0, 150, 600, 100);
            welcomesignupbutton.setBackground(Color.pink);
            welcomesignupbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            welcomesignupbutton.addActionListener(this);
            welcomesignupbutton.setFocusable(false);
            welcomesignupbutton.setBorder(BorderFactory.createEtchedBorder());
            welcomesignupbutton.setBorder(BorderFactory.createEtchedBorder());
            welcomesignupbutton.addActionListener(this);
            //LOGIN BUTTON
            welcomeloginbutton = new JButton("LOGIN");
            welcomeloginbutton.setBounds(0, 300, 600, 100);
            welcomeloginbutton.setBackground(Color.pink);
            welcomeloginbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            welcomeloginbutton.addActionListener(this);
            welcomeloginbutton.setFocusable(false);
            //PANEL
            JPanel welcomepanel = new JPanel();
            welcomepanel.setBounds(0,0, 600,600);
            welcomepanel.setBackground(Color.black);
            welcomepanel.add(lab);
            //FRAME
            welcomeframe= new JFrame("BANK MANAGEMENT SYSTEM");
            welcomeframe.setVisible(true);
            welcomeframe.setSize(600,600);
            welcomeframe.setLayout(null);
            welcomeframe.setFocusable(false);
            welcomeframe.add(welcomepanel);
            welcomeframe.add(welcomesignupbutton);
            welcomeframe.add(welcomeloginbutton);
             
        }

    public void signup()
        {
            //LABEL1
            label=new JLabel("HELLO");
            label.setBounds(0, 400, 100,100);
            label.setVisible(false);
            
            //LABEL2
            JLabel lab = new JLabel("BANK MANAGEMENT SYSTEM");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            lab.setBounds(0, 10, 500, 50);
            //name
            namefield = new JTextField();
            namefield.setBounds(250, 70, 300, 50);
            JLabel namelabel = new JLabel("NAME");
            namelabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            namelabel.setBounds(10, 70, 250, 50);
            //pin
            pinfield = new JTextField();
            pinfield.setBounds(250, 120, 300, 50);
            JLabel pinlabel = new JLabel("PIN");
            pinlabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            pinlabel.setBounds(10, 120, 250, 50);
            //cnic
            cnicfield = new JTextField();
            cnicfield.setBounds(250, 170, 300, 50);
            JLabel cniclabel = new JLabel("CNIC(without dashes)");
            cniclabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 19));
            cniclabel.setBounds(10, 170, 250, 50);
            //phone
            phonefield = new JTextField();
            phonefield.setBounds(250, 220, 300, 50);
            JLabel phonelabel = new JLabel("MOBILE NO");
            phonelabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            phonelabel.setBounds(10, 220, 250, 50);
            //balance
            balancefield = new JTextField();
            balancefield.setBounds(250, 270, 300, 50);
            JLabel balancelabel = new JLabel("DEPOSITED AMOUNT");
            balancelabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            balancelabel.setBounds(10, 270, 250, 50);
            //address
            addressfield = new JTextField();
            addressfield.setBounds(250, 320, 300, 50);
            JLabel addresslabel = new JLabel("ADDRESS");
            addresslabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            addresslabel.setBounds(10, 320, 250, 50);
            //income
            incomefield = new JTextField();
            incomefield.setBounds(250, 370, 300, 50);
            JLabel incomelabel = new JLabel("INCOME");
            incomelabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            incomelabel.setBounds(10, 370, 250, 50);
            //username
            usernamefield = new JTextField();
            usernamefield.setBounds(250, 420, 300, 50);
            JLabel usernamelabel = new JLabel("USERNAME");
            usernamelabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 20));
            usernamelabel.setBounds(10, 420, 250, 50);            
            //SIGNUP BUTTON
            signupbutton = new JButton("SIGNUP");
            signupbutton.setBounds(170, 480, 200, 70);
            signupbutton.setBackground(Color.pink);
            signupbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            signupbutton.addActionListener(this);
            signupbutton.setFocusable(false);
            signupbutton.addActionListener(this);
            signupbutton.setBorder(BorderFactory.createEtchedBorder());
            //FRAME
            signupframe = new JFrame("BANK MANAGEMENT SYSTEM");
            signupframe.setBackground(Color.pink);
            signupframe.setVisible(true);
            signupframe.setSize(600,600);
            signupframe.setLayout(null);
            signupframe.setFocusable(false);
            
            signupframe.add(lab);
            signupframe.add(namefield);
            signupframe.add(namelabel);
            signupframe.add(usernamefield);
            signupframe.add(usernamelabel);
            signupframe.add(pinfield);
            signupframe.add(pinlabel);
            signupframe.add(cniclabel);
            signupframe.add(cnicfield);
            signupframe.add(addresslabel);
            signupframe.add(addressfield);
            signupframe.add(phonelabel);
            signupframe.add(phonefield);
            signupframe.add(balancelabel);
            signupframe.add(balancefield);
            signupframe.add(incomelabel);
            signupframe.add(incomefield);
            signupframe.add(signupbutton);
            signupframe.add(label);
           
        }        

    public void back()
        {
        //PANEL1
        JPanel panel1 = new JPanel();
            panel1.setBounds(0,0, 600,600);
            panel1.setBackground(Color.black);
        //LABEL1
        JLabel label = new JLabel("CONGRATULATIONS");
            label.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            label.setBounds(0, 150, 500, 50);
            label.setForeground(Color.white);
        //LABEL2
        JLabel lab = new JLabel("YOUR ACCOUNT HAS BEEN CREATED");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            lab.setBounds(0, 150, 500, 50);
            lab.setForeground(Color.white);
        //LABEL3
        JLabel labe = new JLabel("SUCCESSFULLY");
            labe.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            labe.setBounds(0, 150, 500, 50);
            labe.setForeground(Color.white);
        //BACK BUTTON
        backbutton = new JButton("BACK TO MAIN MENU");
            backbutton.setBounds(0, 300, 600, 100);
            backbutton.setBackground(Color.pink);
            backbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            backbutton.addActionListener(this);
            backbutton.setFocusable(false);
            panel1.add(label);
            panel1.add(lab);
            panel1.add(labe);
            
        //FRAME
        backframe= new JFrame("BANK MANAGEMENT SYSTEM");
            backframe.setVisible(true);
            backframe.setSize(600,600);
            backframe.setLayout(null);
            backframe.setFocusable(true);
            backframe.add(backbutton);
            backframe.add(panel1);             
       
        }    

    
    public void login()
    {
            //LABEL1         
            JLabel lab = new JLabel("BANK MANAGEMENT SYSTEM");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 32));
            lab.setBounds(0, 10, 500, 40);
            //LABEL2
            JLabel log = new JLabel("LOGIN INTERFACE");
            log.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            log.setBounds(150, 100, 500, 50);
            //username
            userfield = new JTextField();
            userfield.setBounds(220, 200, 250, 50);
            JLabel userlabel = new JLabel("USERNAME");
            userlabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 35));
            userlabel.setBounds(10, 200, 250, 50);
            //pin
            passwordfield = new JTextField();
            passwordfield.setBounds(220, 280, 250, 50);
            JLabel passwordlabel = new JLabel("PIN");
            passwordlabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            passwordlabel.setBounds(10, 280, 250, 50);
            
            //LOGIN BUTTON
            loginbutton = new JButton("LOGIN");
            loginbutton.setBounds(170, 400, 200, 70);
            loginbutton.setBackground(Color.pink);
            loginbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            loginbutton.addActionListener(this);
            loginbutton.setFocusable(false);    
            loginbutton.setBorder(BorderFactory.createEtchedBorder());
            
            //FRAME
            loginframe = new JFrame("BANK MANAGEMENT SYSTEM");
            loginframe.setBackground(Color.pink);
            loginframe.setVisible(true);
            loginframe.setSize(600,600);
            loginframe.setLayout(null);
            loginframe.setFocusable(true);
            
            loginframe.add(log);
            loginframe.add(lab);
            loginframe.add(userfield);
            loginframe.add(userlabel);
            loginframe.add(passwordfield);
            loginframe.add(passwordlabel);
            loginframe.add(loginbutton);
   
    } 
    public void invalidLogin(){
        //PANEL
        JPanel balancepanel = new JPanel();
            balancepanel.setBounds(0,0,600,600);
            balancepanel.setBackground(Color.BLACK);
            balancepanel.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        //LABEL
        JLabel lab = new JLabel("LOGIN INTERFACE");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            lab.setForeground(Color.white);
      
        //LABEL
        JLabel l2 = new JLabel("INVALID USERNAME OR PASSWORD");
            l2.setFont(new Font("COMIC SANS MS", Font.BOLD, 25));
            l2.setForeground(Color.white);
        
            this.backbutton();
            
            balancepanel.add(lab);
            balancepanel.add(l2);
            balancepanel.add(back);
            
        //FRAME    
        balanceframe = new JFrame("BANK MANAGEMENT SYSTEM");
            balanceframe.setBackground(Color.pink);
            balanceframe.setVisible(true);
            balanceframe.setSize(600,600);
            balanceframe.setLayout(null);
            balanceframe.setFocusable(true);
            balanceframe.add(balancepanel);
    }
    
    
    public void work(){

        //PANEL1
        JPanel panel1 = new JPanel();
            panel1.setBounds(0,0, 600,100);
            panel1.setBackground(Color.black);
        //LABEL1
        JLabel lab = new JLabel("BANK MANAGEMENT SYSTEM");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 36));
            lab.setForeground(Color.white);
        panel1.add(lab);
    
        //SEND MONEY BUTTON
            sendbutton = new JButton("SEND MONEY");
            sendbutton.setBounds(0, 100, 100, 100);
            sendbutton.setBackground(Color.pink);
            sendbutton.addActionListener(this);
            sendbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            sendbutton.setFocusable(false);
            sendbutton.setBorder(BorderFactory.createEtchedBorder());
        //ADD MONEY BUTTON
            addbutton = new JButton("ADD MONEY");
            addbutton.addActionListener(this);
            addbutton.setBackground(Color.pink);
            addbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            addbutton.setFocusable(false);
            addbutton.setBorder(BorderFactory.createEtchedBorder());
        //WITHDRAW MONEY BUTTON
            withdrawbutton = new JButton("WITHDRAW MONEY");
            withdrawbutton.addActionListener(this);
            withdrawbutton.setBackground(Color.pink);
            withdrawbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            withdrawbutton.setFocusable(false);
            withdrawbutton.setBorder(BorderFactory.createEtchedBorder());
        //ORDER CARD BUTTON
            cardbutton = new JButton("ORDER CARD");
            cardbutton.setBackground(Color.pink);
            cardbutton.addActionListener(this);
            cardbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            cardbutton.setFocusable(false);
            cardbutton.setBorder(BorderFactory.createEtchedBorder());
        //MY DETAILS BUTTON
            detailbutton = new JButton("MY DETAILS");
            detailbutton.setBackground(Color.pink);
            detailbutton.addActionListener(this);
            detailbutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            detailbutton.setFocusable(false);
            detailbutton.setBorder(BorderFactory.createEtchedBorder());
        //MY BALANCE BUTTON
            balancebutton = new JButton("MY BALANCE");
            balancebutton.setBackground(Color.pink);
            balancebutton.addActionListener(this);
            balancebutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            balancebutton.setFocusable(false);
            balancebutton.setBorder(BorderFactory.createEtchedBorder());
       

     //PANEL2
     JPanel panel = new JPanel();
        panel.setBounds(0, 100, 600, 500);
        panel.setLayout(new GridLayout(3,2,5,5));
        panel.setBackground(Color.black);
        panel.add(sendbutton);
        panel.add(addbutton);
        panel.add(withdrawbutton);
        panel.add(cardbutton);
        panel.add(detailbutton);
        panel.add(balancebutton);

    //FRAME
        workframe=new JFrame();
        workframe.setVisible(true);
        workframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        workframe.setLayout(null);
        workframe.setTitle("BANK MANAGEMENT");
        workframe.setSize(600,600);
      workframe.add(panel);
      workframe.add(panel1);
    }
    
    public void send()
    {
        //PANEL
        JPanel sendpanel = new JPanel();
            sendpanel.setBounds(0,0,600,600);
            sendpanel.setBackground(Color.BLACK);
            sendpanel.setLayout(null);
        
        //LABEL    
        JLabel lab = new JLabel("     SEND MONEY");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            lab.setBounds(0, 10, 600, 100);
            lab.setForeground(Color.white);
        //TEXTFIELD
        sendfield = new JTextField();
            sendfield.setBounds(220, 280, 350, 70);
            JLabel moneylabel = new JLabel("ENTER AMOUNT");
            moneylabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            moneylabel.setBounds(0, 200, 600, 50);
            moneylabel.setForeground(Color.white);
           
        //SEND MONEY BUTTON
        sendmoneybutton = new JButton("SEND MONEY");
            sendmoneybutton.setBounds(00, 380, 600, 100);
            sendmoneybutton.setBackground(Color.pink);
            sendmoneybutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            sendmoneybutton.addActionListener(this);
            sendmoneybutton.setFocusable(false);            
            sendmoneybutton.setBorder(BorderFactory.createEtchedBorder());
            this.backbutton();
            sendframe = new JFrame("BANK MANAGEMENT SYSTEM");
            sendframe.setBackground(Color.pink);
            sendframe.setVisible(true);
            sendframe.setSize(600,600);
            sendframe.setLayout(null);
            sendframe.setFocusable(true);
            
            sendpanel.add(back);
            sendpanel.add(lab);
            sendpanel.add(sendfield);
            sendpanel.add(sendmoneybutton);
            sendpanel.add(moneylabel);
            sendframe.add(sendpanel);
    }
    public void add(){
        //PANEL
        JPanel addpanel = new JPanel();
            addpanel.setBounds(0,0,600,600);
            addpanel.setBackground(Color.BLACK);
            addpanel.setLayout(null);
        //LABEL
        JLabel lab = new JLabel("     ADD MONEY");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            lab.setForeground(Color.white);
            lab.setBounds(0, 10, 600, 100);
        //TEXTFIELD
        addfield = new JTextField();
            addfield.setBounds(220, 280, 350, 70);
            JLabel moneylabel = new JLabel("ENTER AMOUNT");
            moneylabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            moneylabel.setBounds(0, 200, 600, 50);
            moneylabel.setForeground(Color.white);
           
            this.backbutton();
           
        //ADD MONEY BUTTON
        addmoneybutton = new JButton("ADD MONEY");
            addmoneybutton.setBounds(00, 380, 600, 100);
            addmoneybutton.setBackground(Color.pink);
            addmoneybutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            addmoneybutton.addActionListener(this);
            addmoneybutton.setFocusable(false);            
            addmoneybutton.setBorder(BorderFactory.createEtchedBorder());
            addframe = new JFrame("BANK MANAGEMENT SYSTEM");
            addframe.setBackground(Color.pink);
            addframe.setVisible(true);
            addframe.setSize(600,600);
            addframe.setLayout(null);
            addframe.setFocusable(true);
            
            addpanel.add(back);
            addpanel.add(lab);
            addpanel.add(addfield);
            addpanel.add(addmoneybutton);
            addpanel.add(moneylabel);
            addframe.add(addpanel);
    
    }
    public void withdraw(){
        JPanel withdrawpanel = new JPanel();
            withdrawpanel.setBounds(0,0,600,600);
            withdrawpanel.setBackground(Color.BLACK);
            withdrawpanel.setLayout(null);
        //LABEL
        JLabel lab = new JLabel("  WITHDRAW MONEY");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            lab.setForeground(Color.white);
            lab.setBounds(0, 10, 600, 100);
         //TEXTFIELD
        withdrawfield = new JTextField();
            withdrawfield.setBounds(220, 280, 350, 70);
        //LABEL    
        JLabel moneylabel = new JLabel("ENTER AMOUNT");
            moneylabel.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            moneylabel.setBounds(0, 200, 600, 50);
            moneylabel.setForeground(Color.white);
           
        //ADD MONEY BUTTON
        withdrawmoneybutton = new JButton("WITHDRAW MONEY");
            withdrawmoneybutton.setBounds(00, 380, 600, 100);
            withdrawmoneybutton.setBackground(Color.pink);
            withdrawmoneybutton.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            withdrawmoneybutton.addActionListener(this);
            withdrawmoneybutton.setFocusable(false);            
            withdrawmoneybutton.setBorder(BorderFactory.createEtchedBorder());
        
            this.backbutton();
            
        //FRAME    
        withdrawframe = new JFrame("BANK MANAGEMENT SYSTEM");
            withdrawframe.setBackground(Color.pink);
            withdrawframe.setVisible(true);
            withdrawframe.setSize(600,600);
            withdrawframe.setLayout(null);
            withdrawframe.setFocusable(true);
            
            withdrawpanel.add(lab);
            withdrawpanel.add(withdrawfield);
            withdrawpanel.add(back);
            withdrawpanel.add(withdrawmoneybutton);
            withdrawpanel.add(moneylabel);
            withdrawframe.add(withdrawpanel);
    }
    
    public void invalidAmount(){
        //PANEL
        JPanel balancepanel = new JPanel();
            balancepanel.setBounds(0,0,600,600);
            balancepanel.setBackground(Color.BLACK);
            balancepanel.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        //LABEL
        JLabel lab = new JLabel("INVALID AMOUNT");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            lab.setForeground(Color.white);
      
        //LABEL
        JLabel l2 = new JLabel("YOU ENTERED IVALID AMOUNT");
            l2.setFont(new Font("COMIC SANS MS", Font.BOLD, 25));
            l2.setForeground(Color.white);
        
            this.backbutton();
            
            balancepanel.add(lab);
            balancepanel.add(l2);
            balancepanel.add(back);
            
        //FRAME    
        balanceframe = new JFrame("BANK MANAGEMENT SYSTEM");
            balanceframe.setBackground(Color.pink);
            balanceframe.setVisible(true);
            balanceframe.setSize(600,600);
            balanceframe.setLayout(null);
            balanceframe.setFocusable(true);
            balanceframe.add(balancepanel);
    }
    public void ordercard(){
        //PANEL
        JPanel detailpanel = new JPanel();
            detailpanel.setBounds(0,0,600,600);
            detailpanel.setBackground(Color.BLACK);
            detailpanel.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
        //LABEL
        JLabel lab = new JLabel("ORDER YOUR ATM CARD");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 40));
            lab.setForeground(Color.white);
        //LABEL
        JLabel l1 = new JLabel("Hi "+name);
            l1.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l1.setForeground(Color.white);

       this.backbutton();
       
        //LABEL
        JLabel l2 = new JLabel("<html>Thanks for your Order<br/><br/>Your Order is Placed and You will<br/> get a Confirmation Call within <br/> one or two days<html>");
            l2.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l2.setForeground(Color.white);
            
            detailpanel.add(lab);
            detailpanel.add(l1);
            detailpanel.add(l2);
            detailpanel.add(back);
            
        //FRAME
        cardframe = new JFrame("BANK MANAGEMENT SYSTEM");
            cardframe.setBackground(Color.pink);
            cardframe.setVisible(true);
            cardframe.setSize(600,600);
            cardframe.setLayout(null);
            cardframe.setFocusable(true);
          
            cardframe.add(detailpanel);
    }
    public void checkbalance(){
        //PANEL
        JPanel balancepanel = new JPanel();
            balancepanel.setBounds(0,0,600,600);
            balancepanel.setBackground(Color.BLACK);
            balancepanel.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        //LABEL
        JLabel lab = new JLabel("BALANCE DETAILS");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 50));
            lab.setForeground(Color.white);
        //LABEL
        JLabel l1 = new JLabel("Hi "+name);
            l1.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l1.setForeground(Color.white);

            this.backbutton();
        
        //LABEL
        JLabel l2 = new JLabel("Your Current Balance is : "+balance);
            l2.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l2.setForeground(Color.white);
        
            balancepanel.add(lab);
            balancepanel.add(l1);
            balancepanel.add(l2);
            balancepanel.add(back);
            
        //FRAME    
        balanceframe = new JFrame("BANK MANAGEMENT SYSTEM");
            balanceframe.setBackground(Color.pink);
            balanceframe.setVisible(true);
            balanceframe.setSize(600,600);
            balanceframe.setLayout(null);
            balanceframe.setFocusable(true);
            balanceframe.add(balancepanel);
    }
    public void checkdetails(){
        //PANEL
        JPanel detailpanel = new JPanel();
            detailpanel.setBounds(0,0,600,600);
            detailpanel.setBackground(Color.BLACK);
            detailpanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        //LABEL
        JLabel lab = new JLabel("USER DETAILS");
            lab.setFont(new Font("COMIC SANS MS", Font.BOLD, 60));
            lab.setForeground(Color.white);
        //LABEL
        JLabel l1 = new JLabel("your full name is : "+name);
            l1.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l1.setForeground(Color.white);
        //LABEL
        JLabel l2 = new JLabel("your address is : "+address);
            l2.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l2.setForeground(Color.white);
        //LABEL
        JLabel l3 = new JLabel("your pin code is : "+pin);
            l3.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l3.setForeground(Color.white);
        //LABEL
        JLabel l4 = new JLabel("your CNIC is : "+cnic);
            l4.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l4.setForeground(Color.white);
        //LABEL
        JLabel l5 = new JLabel("your contact number is : "+phone);
            l5.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l5.setForeground(Color.white);
        //LABEL
        JLabel l6 = new JLabel("your income is : "+income);
            l6.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l6.setForeground(Color.white);
        //LABEL
        JLabel l7 = new JLabel("your balance is : "+balance);
            l7.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            l7.setForeground(Color.white);
            
            this.backbutton();
            
            detailpanel.add(lab);
            detailpanel.add(l1);
            detailpanel.add(l2);
            detailpanel.add(l3);
            detailpanel.add(l4);
            detailpanel.add(l5);
            detailpanel.add(l6);
            detailpanel.add(l7);
            detailpanel.add(back);
            //detailpanel.pack();
            
        detailframe = new JFrame("BANK MANAGEMENT SYSTEM");
            detailframe.setBackground(Color.pink);
            detailframe.setVisible(true);
            detailframe.setSize(600,600);
            detailframe.setLayout(null);
            detailframe.setFocusable(true);
            detailframe.add(detailpanel);
        
    }
    public void backbutton()
    {
        //BACK BUTTON
            back = new JButton("Back");
            back.addActionListener(this);
            back.setBounds(480, 500,120, 80);
            back.setBackground(Color.pink);
            back.setFont(new Font("COMIC SANS MS", Font.BOLD, 30));
            back.addActionListener(this);
            back.setFocusable(false);            
            back.setBorder(BorderFactory.createEtchedBorder());
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    //SIGNUP BUTTON WORKING
        if(e.getSource()== signupbutton)   
        {
            name=namefield.getText();
            namefield.setEditable(false);
            cnic=cnicfield.getText();
            cnicfield.setEditable(false);
            pin=pinfield.getText();
            pinfield.setEditable(false);
            phone=phonefield.getText();
            phonefield.setEditable(false);
            username=usernamefield.getText();
            usernamefield.setEditable(false);
            address=addressfield.getText();
            addressfield.setEditable(false);
            income=incomefield.getText();
            incomefield.setEditable(false);
            balance=Double.parseDouble(balancefield.getText());
            balancefield.setEditable(false);
            signupbutton.setEnabled(false);
            //displayinfo();
            this.back();
            //this.login();
         }
    
    //BACK TO MAIN MENU BUTTON WORKING    
    if(e.getSource()==backbutton)
        {
            this.welcome();
    }
    
    //LOGIN BUTTON WORKING
        if(e.getSource()==loginbutton)
        {
            user=userfield.getText();
         userfield.setEditable(false);
            password=passwordfield.getText();
         passwordfield.setEditable(false);
         loginbutton.setEnabled(false); 
          if(user.equals(username)){
            if(password.equals(pin)){
                this.work();
            }
            else{this.invalidLogin();}
        }
        else{this.invalidLogin();}        
    }
        
        if(e.getSource()== welcomesignupbutton)   
         {  
        this.signup();
    }
        if(e.getSource()== welcomeloginbutton)   
         {  
        this.login();
    }
        //ACTION BUTTONS WORKING
        if(e.getSource()==sendbutton)
        {
            this.send();
    }
        if(e.getSource()==sendmoneybutton)
        {
            amount=Double.parseDouble(sendfield.getText());
            if(amount<balance)
            {balance=balance-amount;
            this.checkbalance();}
            else{this.invalidAmount();}
    }
        if(e.getSource()==addbutton)
        {
            this.add();
    }
        if(e.getSource()==addmoneybutton)
        {
            amount=Double.parseDouble(addfield.getText());
            balance=balance+amount;
            this.checkbalance();
    }
        if(e.getSource()==withdrawbutton)
        {
            this.withdraw();
    }
        if(e.getSource()==withdrawmoneybutton)
        {
            amount=Double.parseDouble(withdrawfield.getText());
            if(amount<balance)
            {balance=balance-amount;
            this.checkbalance();}
            else{this.invalidAmount();}
    }
        if(e.getSource()==cardbutton)
        {
            this.ordercard();
    }
        if(e.getSource()==balancebutton)
        {
            this.checkbalance();
    }
        if(e.getSource()==detailbutton)
        {
            this.checkdetails();
    }
    //BACK BUTTON WORKING
        if(e.getSource()==back)
        {
            this.work();
    }
    }}
