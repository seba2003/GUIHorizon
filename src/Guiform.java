import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guiform extends JFrame {
    private JButton Set_button;
    private JButton Reset_button;
    private JPanel PanelCanva;
    private JPanel Main;
    private JLabel Label_11;
    private JLabel Label_21;
    private JLabel Label_12;
    private JLabel Label_22;
    private JLabel Label_13;
    private JLabel Label_23;
    private JLabel Label_14;
    private JLabel Label_24;

    public Guiform() {
        setTitle("GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setContentPane(Main);
        setVisible(true);
        Reset_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String args[]){
        Guiform gui = new Guiform();
    }


}
