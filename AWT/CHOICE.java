/*

                                                date -> 23/02/23
                                                displaing checkbox , list , choice in different panels

*/
import java.awt.*;
import java.awt.event.*;
public class Check_box implements ItemListener , ActionListener {
    Frame frm;
    Panel p1,p2,p3,p4;
    Button b1;
    Checkbox c1,c2;
    CheckboxGroup cbg;
    Choice ch;
    List l;
    Label l1 = new Label();
    Label l2 = new Label();
    Label l3 = new Label();
    Check_box()
    {
        frm = new Frame();
        frm.setTitle("this is project");
        frm.setSize(600,600);
        frm.setVisible(true);
        frm.setLayout(new FlowLayout());
        frm.setLayout(new GridLayout(4,1));
        p1= new Panel();
        frm.add(p1);
        p1.setBackground(Color.GREEN);
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Male",cbg,false);
        c2 = new Checkbox("Female",cbg,false);
        p1.add(c1);
        p1.add(c2);
        p1.add(l1);
        p2 = new Panel();
        frm.add(p2);
        p2.setBackground(Color.YELLOW);
        ch = new Choice();
        ch.addItem("choice item 1");
        ch.addItem("choice item 2");
        ch.addItem("choice item 3");
        p2.add(ch);
        p2.add(l2);
        p3 = new Panel();
        frm.add(p3);
        p3.setBackground(Color.ORANGE);
        l = new List();
        l.add("list item 1");
        l.add("list item 2");
        l.add("list item 3");
        p3.add(l);
        p3.add(l3);
        p4 = new Panel();
        frm.add(p4);
        p4.setBackground(Color.BLUE);
        b1 = new Button("Exit");
        p4.add(b1);
        b1.addActionListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        ch.addItemListener(this);
        l.addItemListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            frm.dispose();
        }
    }
    
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==c1)
        {
            l1.setText(c1.getLabel());
        }
        else if(e.getSource()==c2)
        {
            l1.setText(c2.getLabel());
        }
        else if(e.getSource()==ch)
        {
            l2.setText(ch.getSelectedItem());
        }
        else if(e.getSource()==l)
        {
            l3.setText(l.getSelectedItem());
        }
    }
    public static void main(String[] args) {
        new Check_box();
    }
    
   
}
