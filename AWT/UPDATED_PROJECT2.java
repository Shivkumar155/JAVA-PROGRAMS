
/*
                                                    date->22/02/23
                                                    printing sum and average from three textfield
*/

import java.awt.*;
import java.awt.event.*;
public class Sum_Avg_Proj extends Frame implements ActionListener , ItemListener{
    Label l1 , l2 , l3 , l4 , l5 , l6;
    TextField t1 , t2 , t3 , t4;
    Button b1 , b2 , b3;
    Frame obj;
    Checkbox c1;
    Sum_Avg_Proj()
    {
        obj = new Frame();
        obj.setTitle("this is project");
        obj.setSize(800,800);
        obj.setVisible(true);
        Panel p;
        p = new Panel();
        obj.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(7,2,10,10));
        obj.add(p);
        l1 = new Label("Enter First Number : ");
        p.add(l1);
        t1 = new TextField(30);
        p.add(t1);
        l2 = new Label("Enter Second Number : ");
        p.add(l2);
        t2 = new TextField(30);
        p.add(t2);
        l3 = new Label("Enter Third Number : ");
        p.add(l3);
        t3 = new TextField(30);
        p.add(t3);
        l6 = new Label("Sum of three numbers are ");
        p.add(l6);
        t4 = new TextField(30);
        p.add(t4);
        l4 = new Label("#####AVERAGE#####");
        p.add(l4);
        l5 = new Label("display the result here");
        p.add(l5);
        b3 = new Button("EXIT");
        b1 = new Button("SHOW RESULT");
        b2 = new Button("REFRESH");
        p.add(b3);
        c1 = new Checkbox("click to enable result button",false);
        p.add(c1);
        p.add(b1);
        b1.setVisible(false);
        p.add(b2);
        b1.addActionListener(this);
        b3.addActionListener(this);
        c1.addItemListener(this);
        b2.addActionListener(this);
    }
   public void actionPerformed(ActionEvent e) {
        float d=0;
        int s=0;
        if(e.getSource()==b1)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = Integer.parseInt(t3.getText().toString());
            s=(a+b+c);
            d = (a+b+c)/3f;
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
        else if(e.getSource()==b3)
        {          
            obj.dispose();  
            // System.exit(0);
        }
        String res = String.valueOf(d);
        String ref = String.valueOf(s);
        t4.setText(ref);
        l5.setText(res);
   }
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==c1)
        {
            if(c1.getState()==true)
            {
                b1.setVisible(true);
            }
            else
            {
                b1.setVisible(false);
            }
        }
    }
    public static void main(String[] args) {
         new Sum_Avg_Proj();
    }
}
