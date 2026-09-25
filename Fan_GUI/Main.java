
import java.awt.*;
import javax.swing.*; 

class Remote {
    void turnon() {
        System.out.println("Fan is turn on");
    }

    void turnoff() {
        System.out.println("Fan is turn off");
    }

    void exit() {
        System.out.println("Exit");
    }
}
public class Main {
    public static void main(String[] args) {
        Remote obj = new Remote();
        
        JFrame frame = new JFrame("Remote");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("ON");
        JButton b2 = new JButton("OFF");
        JButton exit = new JButton("EXIT");

        JLabel label = new JLabel("Fan is OFF");

        b1.addActionListener(e ->{
            obj.turnon();
            label.setText("Fan is ON");
        });

        b2.addActionListener(e ->{
            obj.turnoff();
            label.setText("Fan is OFF");
        });

        exit.addActionListener(e ->{
            obj.exit();
            frame.dispose();
        });

        frame.add(b1);
        frame.add(b2);
        frame.add(exit);
        frame.add(label);


        frame.setVisible(true);
    }
}