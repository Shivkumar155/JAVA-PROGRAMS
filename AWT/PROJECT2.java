
/* date -> 22/02/23 */

import java.awt.*;
import java.awt.event.*;
public class avg_project extends Frame implements ActionListener{
    Label l1 , l2 , l3 , l4 , l5;
    TextField t1 , t2 , t3;
    Button b1 , b2 , b3;
    Frame obj;
   avg_project()
   {
        obj = new Frame();
        obj.setTitle("this is project");
        obj.setSize(800,800);
        obj.setVisible(true);
        Panel p;
        p = new Panel();
        obj.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(6,2,10,10));
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
        l4 = new Label("#####AVERAGE#####");
        p.add(l4);
        l5 = new Label("display the result here");
        p.add(l5);
        b1 = new Button("COMPUTE");
        b2 = new Button("REFRESH");
        b3 = new Button("EXIT");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e) {
        float d = 0;
        if(e.getSource()==b1)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = Integer.parseInt(t3.getText().toString());
            d = (a+b+c)/3f;
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            l5.setText("display the result here");
        }
        else if(e.getSource()==b3)
        {          
            obj.dispose();  
            // System.exit(0);
        }
        
        String res = String.valueOf(d);
        l5.setText(res);
   }
    public static void main(String[] args) {
        avg_project ob = new avg_project();
    }

}
