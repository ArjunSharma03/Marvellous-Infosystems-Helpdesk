/////////////////////////////////////////////////////////////////
////////////// program for assistant Page ///////////////////////
////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import java.io.*;

/////////////////// class assist ////////////////////////////////
public class assist extends Frame implements ActionListener {

    //////////////////// characteristics of assist ///////////////////
    public String name, id, pass;
    public Label text, teacher, register, time, date;
    public String s1, s2;
    public int icnt;
    public TextField input;
    public Button search, log, exit;

    /////////////////////// constructor of assist ///////////////////
    public assist(String name, String id, String pass) {

        this.name = name;
        this.id = id;
        this.pass = pass;
        icnt = 0;

        setTitle("Marvellous Assistant");
        setSize(1200, 800);
        setLayout(null);
        setVisible(true);

        ////////////////// function for closing window ///////////////////////
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
        //////////////// Label, Textfield, button, Checkbox /////////////////////
        Font f1 = new Font("Georgia", Font.BOLD, 13);
        Font f2 = new Font("Georgia", Font.BOLD, 20);
        Font f3 = new Font("Georgia", Font.BOLD, 30);

        Label hid = new Label(id);
        hid.setBounds(990, 55, 180, 15);
        hid.setFont(f1);
        hid.setForeground(new Color(111, 66, 192));
        add(hid);

        Label title = new Label("Welcome to marvellous Assistant");
        title.setBounds(450, 90, 350, 20);
        title.setFont(f2);
        title.setForeground(new Color(51, 150, 209));
        add(title);

        log = new Button("Logout");
        log.setBounds(1070, 90, 72, 30);
        log.setBackground(Color.red);
        log.setForeground(Color.white);
        log.addActionListener(this);
        add(log);

        input = new TextField();
        input.setBounds(450, 580, 300, 20);
        add(input);

        search = new Button("ASSIST");
        search.setBounds(460, 610, 120, 25);
        search.setFont(f1);
        search.setBackground(new Color(111, 66, 192));
        search.setForeground(Color.white);
        search.addActionListener(this);
        add(search);

        exit = new Button("EXIT");
        exit.setBounds(610, 610, 120, 25);
        exit.setFont(f1);
        exit.setForeground(new Color(111, 66, 192));
        exit.addActionListener(this);
        add(exit);

        date = new Label();
        date.setBounds(530, 290, 500, 30);
        date.setFont(f1);

        time = new Label();
        time.setBounds(530, 310, 800, 30);
        time.setFont(f1);

        teacher = new Label("Teacher                     Piyush Khairnar");
        teacher.setBounds(530, 330, 500, 30);
        teacher.setFont(f1);

        register = new Label("Registration             Active");
        register.setBounds(530, 350, 500, 30);
        register.setFont(f1);

        text = new Label("Hello " + name + ". How can I help you?");
        text.setBounds(400, 400, 700, 50);
        text.setFont(f3);
        text.setForeground(new Color(111, 66, 192));
        add(text);

    }

    ///////////// method implementing actionListerner ////////////////
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            s1 = input.getText();
            Runtime rs = Runtime.getRuntime();
            if (s1.contains("c#")) {
                text.setText("Microsoft C# .NET");
                date.setText("Start Date                 10th July");
                time.setText("Timimng                   Sat Sun[5:30-8:30pm] 3 months");
                add(teacher);
                add(register);
                add(date);
                add(time);
                text.setBounds(500, 400, 700, 50);
                icnt = 1;
            } 
            else if (s1.contains("PPA") || s1.contains("pre placement")) {
                text.setText("Pre Placement Activity");
                date.setText("Start Date                 january 2022");
                time.setText("Timimng                   Sat Sun[7:30-11:30pm] 3 months");
                add(teacher);
                add(register);
                add(date);
                add(time);
                text.setBounds(500, 400, 700, 50);
                icnt = 2;
            } 
            else if (s1.contains("logic building") || s1.contains("LB")) {
                text.setText("Logic Buiding with Project Development");
                date.setText("Start Date                 23rd August");
                time.setText("Timimng                   Tue,Wed,Thu[6:30-9:30pm] 3 months");
                add(teacher);
                add(register);
                add(date);
                add(time);
                text.setBounds(400, 400, 700, 50);
                icnt = 3;
            } 
            else if (s1.contains("Python")) {
                text.setText("Python Machine Learning");
                date.setText("Start Date                 27 November");
                time.setText("Timimng                   Sat Sun[5:30-8:30pm] 3 months");
                add(teacher);
                add(register);
                add(date);
                add(time);
                text.setBounds(500, 400, 700, 50);
                icnt = 4;
            } 
            else if (s1.contains("Angular")) {
                text.setText("Angular Web Devlopment");
                date.setText("Start Date                 10th July");
                time.setText("Timimng                   Sat Sun[5:30-8:30pm] 3 months");
                add(teacher);
                add(register);
                add(date);
                add(time);
                text.setBounds(500, 400, 700, 50);
                icnt = 5;
            } 
            else if (s1.contains("notepad")) {
                try {
                    rs.exec("notepad");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else if (s1.contains("calculator")) {
                try {
                    rs.exec("calc.exe");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else if (s1.contains("computer")) {
                try {
                    rs.exec("cmd /c start explorer");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else if (s1.contains("control panel")) {
                try {
                    rs.exec("cmd /c start control");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else if (s1.contains("chrome")) {
                try {
                    rs.exec("cmd /c start chrome.exe");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else if (s1.contains("zoom")) {
                try {
                    rs.exec("C:/Users/91951/AppData/Roaming/Zoom/bin/Zoom.exe");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else if (s1.isEmpty() == true) {
                remove(date);
                remove(time);
                remove(teacher);
                remove(register);
                icnt = 7;
                text.setText("Please write your query in textField");
                text.setBounds(400, 400, 700, 50);
            } 
            else if (s1.contains("socket") || s1.contains("help")) {
                try {
                    rs.exec("cmd /c java helpdesk");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
            else {
                icnt = 7;
                text.setText("I didn't get it. Please try again");
                text.setBounds(400, 400, 700, 50);
            }
        } 
        else if (e.getSource() == exit) {
            dispose();
        } 
        else if (e.getSource() == log) {
            dispose();
            login obj = new login(id, pass, name);
        }

    }

    //////// method for inserting images////////////////////
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("logo2.png");
        Image i1 = t.getImage("gif.gif");
        Image i2 = t.getImage("c#.png");
        Image i3 = t.getImage("PPA.jpeg");
        Image i4 = t.getImage("LB.jpeg");
        Image i5 = t.getImage("Python.jpeg");
        Image i6 = t.getImage("Angular.png");
        Image i7 = t.getImage("white.jpg");
        g.setColor(new Color(111, 66, 192));
        g.fillRect(0, 39, 1200, 40);
        g.drawImage(i, 10, 40, this);
        g.drawImage(i1, 500, 400, this);

        ///////////////// conditions for adding images ////////////////
        if (icnt == 1) {
            g.drawImage(i2, 450, 150, this);
        }
         else if (icnt == 2) {
            g.drawImage(i3, 450, 150, this);
        } 
        else if (icnt == 3) {
            g.drawImage(i4, 450, 150, this);
        } 
        else if (icnt == 4) {
            g.drawImage(i5, 450, 150, this);
        } 
        else if (icnt == 5) {
            g.drawImage(i6, 450, 150, this);
        } 
        else if (icnt == 7) {
            g.drawImage(i7, 440, 145, this);
        } 
        else {
            g.drawImage(i7, 440, 145, this);
        }
    }
}