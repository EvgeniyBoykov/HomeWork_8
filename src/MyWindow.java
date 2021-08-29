import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setLocation(350, 400);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton btn1 = new JButton("Push the button");
        JButton btn2 = new JButton("Exit");
        panel.add(btn1);
        panel.add(btn2);

        ActionListener actionListener = new CloseActionListener();
        btn2.addActionListener(actionListener);

        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
