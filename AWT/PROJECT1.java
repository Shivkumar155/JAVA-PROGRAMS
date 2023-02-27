import java.awt.*;
public class NewProj extends Frame {
    public static void main(String[] args) {
        NewProj obj = new NewProj();
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setTitle("REGISTRATION FORM");
        obj.setBackground(Color.YELLOW);
        Panel p = new Panel();
        obj.add(p);
        obj.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(6,2));
        Label l1 = new Label("Enrollment");
        Label l2 = new Label("Name");
        Label l3 = new Label("Branch");
        Label l4 = new Label("Semester");
        Label l5 = new Label("Information");
        TextField t1 = new TextField(50);
        TextField t2 = new TextField(50);
        TextField t3 = new TextField(50);
        TextField t4 = new TextField(50);
        TextArea t5 = new TextArea(null,5,5,6);
        Button b1 = new Button("Submit");
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
    }   
}
