
/*date -> 21/02/23*/

import java.awt.*;
public class ExLay extends Frame {
    public static void main(String[] args) {
        ExLay fr = new ExLay();
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setTitle("this is project");
        Button b1 = new Button("NORTH");
        Button b2 = new Button("EAST");
        Button b3 = new Button("SOUTH");
        Button b4 = new Button("WEST");
        Button b5 = new Button("CENTER");
        BorderLayout obj = new BorderLayout();
        fr.setLayout(obj);
        fr.add(b1,BorderLayout.NORTH);
        fr.add(b2,BorderLayout.EAST);
        fr.add(b3,BorderLayout.SOUTH);
        fr.add(b4,BorderLayout.WEST);
        fr.add(b5,BorderLayout.CENTER);
    }
}
