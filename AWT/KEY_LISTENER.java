
/* date -> 22/02/23 */

import java.awt.event.*;
import java.awt.*;
public class ExList implements KeyListener{
    Frame fr;
    Label L;
    TextArea ta;
    ExList()
    {
        fr = new Frame();
        L =  new Label();
        ta = new TextArea();
        fr.setVisible(true);
        fr.setSize(600,600);
        fr.add(L);
        fr.add(ta);
        ta.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ob)
    {
        ta.setText("key pressed");
    }
    public void keyTyped(KeyEvent ob)
    {
        ta.setText("key typed");
    }
    public void keyReleased(KeyEvent ob)
    {
        ta.setText("key released");
    }
    public static void main(String[] args) {
        new ExList();
    }
}
