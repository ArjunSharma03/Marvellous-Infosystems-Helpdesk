/////////////////////////////////////////////////////////////////
////////////// program for Login Page ///////////////////////////
////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

////////////// login class ////////////////////////////////////
public class login extends Frame implements ActionListener {

    ////////////////// charactericts of login class ////////////////
    public Button sub, ex;
    public Label nam, pass, log, re;
    public TextField t1, t2;
    public String max, max1, max2;

    /////////////////// Login Class Constructor ///////////////////
    public login(String str1, String str2, String str3) {
        max = str1;
        max1 = str2;
        max2 = str3;
        setTitle("login page");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        //////////// function for closing window ////////////////////////////////
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
        ////////////////// Label, textfield and buttons /////////////////
        log = new Label("Sign In");
        log.setBounds(110, 90, 100, 30);
        Font p1 = new Font("Georgia", Font.PLAIN, 15);
        log.setFont(p1);
        log.setForeground(Color.black);

        re = new Label("* incorrect id or password.");
        re.setBounds(20, 190, 135, 30);
        Font p2 = new Font("Georgia", Font.BOLD, 10);
        re.setFont(p2);
        re.setForeground(Color.red);

        nam = new Label("Login Id:");
        nam.setBounds(20, 130, 60, 30);
        nam.setForeground(Color.black);

        pass = new Label("Password:");
        pass.setBounds(20, 160, 60, 30);
        pass.setForeground(Color.black);

        t1 = new TextField();
        t1.setBounds(100, 132, 150, 20);

        t2 = new TextField();
        t2.setBounds(100, 162, 150, 20);
        t2.setEchoChar('*');

        sub = new Button("Login");
        sub.setBounds(20, 220, 100, 30);
        sub.setBackground(Color.BLUE);
        sub.setForeground(Color.WHITE);
        sub.addActionListener(this);

        ex = new Button("Exit");
        ex.setBounds(160, 220, 100, 30);
        ex.setBackground(Color.RED);
        ex.setForeground(Color.white);
        ex.addActionListener(this);

        add(sub);
        add(log);
        add(ex);
        add(nam);
        add(pass);
        add(t1);
        add(t2);
    }

    //////// method for inserting images////////////////////
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("logo2.png");
        g.drawImage(i, 10, 40, this);
    }

    ///////////// method which implements actionListener//////////
    public void actionPerformed(ActionEvent obj) {
        if (obj.getSource() == sub) {
            String a = t1.getText();
            String b = t2.getText();

            if (a.equals(max) && b.equals(max1)) {
                dispose();
                assist object = new assist(max2, max, max1);
            } else {
                add(re);
            }
        } else if (obj.getSource() == ex) {
            dispose();

        }
    }
}
