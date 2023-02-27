/*

                                    date -> 24/02/23                 

*/
String name;
    JFrame fr;
    J_OptionEx()
    {
        fr = new JFrame();
        fr.setTitle("this is project");
        fr.setSize(400,400);
        fr.setVisible(true);
        name = JOptionPane.showInputDialog(fr, "enter your name : ");
        JOptionPane.showMessageDialog(fr, "your name is : "+name);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new J_OptionEx();   
    }
}
