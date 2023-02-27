
/* date -> 21/02/23 */

import java.awt.*;

public class ExLabel extends Frame{
    public static void main(String[] args) {
        ExLabel obj = new ExLabel();
        obj.setTitle("hello title");
        obj.setSize(400,400);
        obj.setVisible(true);
        Panel p = new Panel();
        obj.add(p);
        Label lb = new Label("hello label");
        p.add(lb);
        TextField tf = new TextField(20);
        p.add(tf);
        TextArea ta = new TextArea(null,25,25,30);
        p.add(ta);
    }
}
