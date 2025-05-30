import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame 
{
    public Frame()
    {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(400, 100);

        JLabel displayJLabel = new JLabel("Munasir");
        displayJLabel.setBounds(50, 50, 500, 50);
        displayJLabel.setBackground(Color.gray);
        displayJLabel.setOpaque(true);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayJLabel.setForeground(Color.white);
        jf.add(displayJLabel);
    

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}