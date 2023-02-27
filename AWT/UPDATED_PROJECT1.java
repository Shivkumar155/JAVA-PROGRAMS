/*

                                                        date -> 23/02/23
                                                        taking input from textfield and displaying in textarea

*/


import java.awt.*;
import java.awt.event.*;
public class New_Proj extends Frame implements ActionListener{
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4;
    TextArea t5;
    Frame obj;
    Panel p;
    Button b1,b2,b3;
    New_Proj()
    {
        obj = new Frame();
        obj.setSize(600,600);
        obj.setVisible(true);
        obj.setTitle("REGISTRATION FORM");
        obj.setBackground(Color.YELLOW);
        p = new Panel();
        obj.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(7,2));
        obj.add(p);
        l1 = new Label("Enrollment");
        l2 = new Label("Name");
        l3 = new Label("Branch");
        l4 = new Label("Semester");
        l5 = new Label("Information");
        t1 = new TextField(50);
        t2 = new TextField(50);
        t3 = new TextField(50);
        t4 = new TextField(50);
        t5 = new TextArea(null,5,5,6);
        b1 = new Button("Submit");
        b2 = new Button("refresh");
        b3 = new Button("exit");
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(l4);
        p.add(t4);
        p.add(l5);
        p.add(t5);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            String s4 = t4.getText();
            String s5 = "details entered are : "; 
            t5.setText(s5+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4);
        }    
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        else if(e.getSource()==b3)
        {
            obj.dispose();
        }
    } 
    public static void main(String[] args) {
         New_Proj ob = new New_Proj();
    }
      
}
