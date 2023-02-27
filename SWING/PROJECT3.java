/*

                                            date -> 24/02/23
                                            displaying result using action listener and tabs

*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewProject implements ActionListener{
    JFrame fr;
    JPanel p1,p2,p3,p4,p5,p6;
    JTabbedPane t1;
    JLabel l1,l2,l3,l4;
    JTextField tf1,tf2,tf3;
    JTextArea ta1;
    JButton b1,b2;
    NewProject()
    {
        fr = new JFrame();
        fr.setTitle("this is project");
        fr.setSize(400,400);
        fr.setVisible(true);


        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();


        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        p4.setLayout(new GridLayout(2,1,5,5));
        p4.add(p5);
        p4.add(p6);

        t1 = new JTabbedPane();
        t1.addTab("name", p1);
        t1.addTab("branch", p2);
        t1.addTab("semester", p3);
        t1.addTab("result", p4);


        fr.add(t1);

        l1 = new JLabel("Name : ");
        l2 = new JLabel("Branch : ");
        l3 = new JLabel("Semeste : ");
        l4 = new JLabel("details are : ");


        tf1 = new JTextField(30);
        tf2 = new JTextField(30);
        tf3 = new JTextField(30);


        ta1 = new JTextArea(25,25);


        b1 = new JButton("show");
        b2 = new JButton("exit");


        p1.add(l1);
        p1.add(tf1);

        p2.add(l2);
        p2.add(tf2);

        p3.add(l3);
        p3.add(tf3);

        p5.add(l4);
        p5.add(ta1);

        p6.add(b1);
        p6.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);


         fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
    public void actionPerformed(ActionEvent e) {
        String s1,s2,s3;
        if(e.getSource()==b1)
        {
            s1 = tf1.getText();
            s2 = tf2.getText();
            s3 = tf3.getText();
            ta1.setText(s1+"\n"+s2+"\n"+s3);
        }
        else if (e.getSource()==b2)
        {
            fr.dispose();
        }
    }
    public static void main(String[] args) {
         new NewProject();   
    }

    
}
