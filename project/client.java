/////////////////////////////////////////////////////////////////
////////////// program for Sign up Page /////////////////////////
////////////// Contains main function ///////////////////////////

import java.awt.*;
import java.awt.event.*;

///////////////// signup class ///////////////////////////////
class signup extends Frame implements ActionListener {

    ///////////////// characteristics of signup class //////////////////
    public Label l1, l2, s1, nam, mid, sir, phone, id, pass, re;
    public TextField nam1, mid1, sir1, phone1, id1, pass1, re1;
    public Button b;
    public String g1, g2, g3;
    public Panel p1, p2;

    ////////////////// constructor of signup class /////////////////////
    public signup(String str, int x, int y) {

        setTitle(str);
        setSize(x, y);
        setLayout(null);
        setVisible(true);
        ////////////////// function for closing window ///////////////////////
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });

        //////////////// Label, Textfield, button, Checkbox /////////////////////
        String head = "Email: admin@marvellousinfosystem.com        Phone: +91 7020713938";
        Label header = new Label(head);
        header.setBounds(450, 32, 400, 15);
        header.setForeground(Color.gray);
        add(header);

        l1 = new Label("\"Aamhi Technical Sanskar Karto\"");
        l1.setBounds(400, 60, 310, 30);
        Font f1 = new Font("Georgia", Font.ITALIC, 20);
        l1.setFont(f1);
        l1.setBackground(new Color(51, 150, 209));
        l1.setForeground(Color.white);

        l2 = new Label("-Piyush Khairnar");
        l2.setBounds(650, 90, 200, 30);
        Font f2 = new Font("Georgia", Font.PLAIN, 20);
        l2.setFont(f2);
        l2.setBackground(new Color(51, 150, 209));
        l2.setForeground(Color.white);

        p1 = new Panel();
        p1.setBounds(0, 120, 1000, 50);
        p1.setBackground(new Color(0, 98, 204));

        s1 = new Label("Sign Up");
        s1.setBounds(400, 120, 100, 50);
        s1.setFont(new Font("Georgia", Font.BOLD, 25));
        s1.setBackground(new Color(0, 98, 204));
        s1.setForeground(Color.white);

        Font f = new Font("Georgia", Font.PLAIN, 15);

        nam = new Label("First Name:");
        nam.setBounds(50, 180, 100, 20);
        nam.setFont(f);

        nam1 = new TextField();
        nam1.setBounds(150, 180, 130, 20);

        mid = new Label("Middle Name:");
        mid.setBounds(350, 180, 100, 20);
        mid.setFont(f);

        mid1 = new TextField();
        mid1.setBounds(470, 180, 130, 20);

        sir = new Label("Last Name:");
        sir.setBounds(650, 180, 100, 20);
        sir.setFont(f);

        sir1 = new TextField();
        sir1.setBounds(750, 180, 130, 20);

        Label gen = new Label("Gender:");
        gen.setBounds(50, 220, 100, 20);
        gen.setFont(f);
        add(gen);

        CheckboxGroup rad = new CheckboxGroup();
        Checkbox m = new Checkbox("Male", rad, false);
        m.setBounds(150, 220, 100, 20);
        m.setFont(f);
        add(m);

        Checkbox fe = new Checkbox("Female", rad, false);
        fe.setBounds(250, 220, 100, 20);
        fe.setFont(f);
        add(fe);

        phone = new Label("Phone Number:");
        phone.setBounds(50, 260, 120, 20);
        phone.setFont(f);
        add(phone);

        phone1 = new TextField();
        phone1.setBounds(200, 260, 200, 20);
        add(phone1);

        id = new Label("Email Id:");
        id.setBounds(50, 300, 100, 20);
        id.setFont(f);
        add(id);

        Label ad1 = new Label("Address:");
        ad1.setBounds(500, 280, 100, 20);
        ad1.setFont(f);
        add(ad1);

        TextArea area = new TextArea();
        area.setBounds(500, 300, 350, 80);
        add(area);

        id1 = new TextField();
        id1.setBounds(200, 300, 200, 20);
        add(id1);

        pass = new Label("Password:");
        pass.setBounds(50, 340, 100, 20);
        pass.setFont(f);
        add(pass);

        pass1 = new TextField();
        pass1.setBounds(200, 340, 200, 20);
        add(pass1);

        re = new Label("Re-Password:");
        re.setBounds(50, 380, 100, 20);
        re.setFont(f);
        add(re);

        re1 = new TextField();
        re1.setBounds(200, 380, 200, 20);
        add(re1);

        Checkbox t = new Checkbox("I accept Terms & Conditions.");
        t.setBounds(50, 420, 300, 20);
        add(t);

        b = new Button("Sign Up");
        b.setBounds(100, 450, 100, 30);
        b.setBackground(new Color(0, 98, 204));
        b.setForeground(Color.white);
        b.addActionListener(this);
        add(b);

        Panel p2 = new Panel();
        p2.setBounds(0, 490, 1000, 5);
        p2.setBackground(Color.black);
        add(p2);

        Font f3 = new Font("Georgia", Font.BOLD, 10);

        Label marv = new Label("MARVELLOUS INFOSYSTEMS");
        marv.setBounds(15, 540, 170, 15);
        marv.setFont(f3);
        add(marv);

        Label cont = new Label("CONTACT US");
        cont.setBounds(370, 500, 100, 20);
        cont.setFont(f);
        add(cont);

        Label dash = new Label();
        dash.setBounds(375, 522, 40, 5);
        dash.setBackground(new Color(51, 150, 209));
        add(dash);

        Label ad = new Label("ADDRESS:");
        ad.setBounds(380, 530, 150, 10);
        ad.setFont(f3);
        add(ad);

        Label ad2 = new Label("Shanti sadan,opp SNDT college, behind");
        ad2.setBounds(380, 538, 250, 15);
        add(ad2);

        Label ad3 = new Label("SBI,2nd lane from, Joshi sweets, opposite");
        ad3.setBounds(380, 550, 250, 15);
        add(ad3);

        Label ad4 = new Label("Silver wood, Karve road, Pune");
        ad4.setBounds(380, 562, 250, 15);
        add(ad4);

        Label ph = new Label("PHONE:");
        ph.setBounds(680, 528, 200, 12);
        ph.setFont(f3);
        add(ph);

        Label ph1 = new Label("7020713938");
        ph1.setBounds(682, 540, 100, 15);
        add(ph1);

        Panel p3 = new Panel();
        p3.setBounds(0, 578, 1000, 50);
        p3.setBackground(Color.black);
        add(p3);

        add(l1);
        add(l2);
        add(s1);
        add(p1);
        add(nam);
        add(nam1);
        add(mid);
        add(mid1);
        add(sir);
        add(sir1);
    }

    ///////////// method implementing actionListerner ////////////////
    public void actionPerformed(ActionEvent obj) {

        Label er1 = new Label("Enter First name");
        er1.setBounds(60, 202, 100, 10);
        er1.setForeground(Color.red);

        Label er2 = new Label("Enter Last Name");
        er2.setBounds(660, 202, 100, 10);
        er2.setForeground(Color.red);

        Label er3 = new Label("Invalid mobile number");
        er3.setBounds(60, 282, 120, 10);
        er3.setForeground(Color.red);

        Label er4 = new Label("Invalid Email id");
        er4.setBounds(60, 322, 120, 10);
        er4.setForeground(Color.red);

        Label er5 = new Label("Enter Password");
        er5.setBounds(60, 362, 120, 10);
        er5.setForeground(Color.red);

        Label er6 = new Label("Password does not match");
        er6.setBounds(60, 402, 150, 10);
        er6.setForeground(Color.red);

        //////////// condition given through nested if-else ////////////////////
        if (nam1.getText().isEmpty() == false) {
            if (sir1.getText().isEmpty() == false) {
                if (phone1.getText().length() == 10) {
                    if (id1.getText().isEmpty() == false) {
                        if (pass1.getText().isEmpty() == false) {
                            if (pass1.getText().equals(re1.getText())) {
                                g1 = id1.getText();
                                g2 = pass1.getText();
                                g3 = nam1.getText();
                                dispose();
                                login obj1 = new login(g1, g2, g3);
                            } else {
                                add(er6);
                            }
                        } else {
                            add(er5);
                        }
                    } else {
                        add(er4);
                    }
                } else {
                    add(er3);
                }
            } else {
                add(er2);
            }
        } else {
            add(er1);
        }
    }

    //////////////// method for adding image /////////////////////////
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        g.setColor(new Color(51, 150, 209));
        g.fillRect(0, 50, 1000, 80);
        Image i = t.getImage("logo1.png");
        Image i2 = t.getImage("logo2.png");
        g.drawImage(i, 10, 45, this);
        g.drawImage(i2, 10, 500, this);
    }

}

////////////////// entry gate function //////////////////////////////
public class client {
    public static void main(String[] args) {
        signup obj = new signup("Sign Up", 900, 600);
    }
}