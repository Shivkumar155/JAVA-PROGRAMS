
/* date -> 22/02/23 */

import java.awt.*;
public class ExCheckBox extends Frame{
    public static void main(String[] args) {
        ExCheckBox obj = new ExCheckBox();
        obj.setSize(400,400);
        obj.setVisible(true);
        obj.setTitle("this is project");
        Panel p = new Panel();
        obj.add(p);
        p.setLayout(new GridLayout(3,2));
        Checkbox ch1 = new Checkbox("windows");
        Checkbox ch2 = new Checkbox("mac");
        Checkbox ch3 = new Checkbox("android");
        p.add(ch1);
        p.add(ch2);
        p.add(ch3);
    }
}
