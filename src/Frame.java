import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame 
{
    public Frame()
    {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500,650);
        jf.setLocation(400, 100);

        JLabel displayJLabel = new JLabel();
        displayJLabel.setBounds(50, 50, 400, 50);
        displayJLabel.setBackground(Color.gray);
        displayJLabel.setOpaque(true);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayJLabel.setForeground(Color.white);
        jf.add(displayJLabel);


    
        JButton clearButton = new JButton("C");
        clearButton.setBounds(50, 150, 85, 64);
        jf.add(clearButton);

        JButton backspaceButton = new JButton("BS");
        backspaceButton.setBounds(155, 150, 85, 64);
        jf.add(backspaceButton);

        JButton percentageButton = new JButton("%");
        percentageButton.setBounds(260, 150, 85, 64);
        jf.add(percentageButton);

        JButton divisionButton = new JButton("/");
        divisionButton.setBounds(365, 150, 85, 64);
        jf.add(divisionButton);



        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(50, 234, 85, 64);
        jf.add(sevenButton);

        JButton eightButton = new  JButton("8");
        eightButton.setBounds(155, 234, 85, 64);
        jf.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(260, 234, 85, 64);
        jf.add(nineButton);

        JButton multiplicationButton = new JButton("x");
        multiplicationButton.setBounds(365, 234, 85, 64);
        jf.add(multiplicationButton);



        JButton fourButton = new JButton("4");
        fourButton.setBounds(50, 318, 85, 64);
        jf.add(fourButton);

        JButton fiveButton = new  JButton("5");
        fiveButton.setBounds(155, 318, 85, 64);
        jf.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(260, 318, 85, 64);
        jf.add(sixButton);

        JButton additionButton = new JButton("+");
        additionButton.setBounds(365, 318, 85, 64);
        jf.add(additionButton);



        JButton oneButton = new JButton("1");
        oneButton.setBounds(50, 402, 85, 64);
        jf.add(oneButton);

        JButton twoButton = new  JButton("2");
        twoButton.setBounds(155, 402, 85, 64);
        jf.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBounds(260, 402, 85, 64);
        jf.add(threeButton);

        JButton substractButton = new JButton("-");
        substractButton.setBounds(365, 402, 85, 64);
        jf.add(substractButton);



        JButton doublezeroButton = new JButton("00");
        doublezeroButton.setBounds(50, 486, 85, 64);
        jf.add(doublezeroButton);

        JButton zeroButton = new  JButton("0");
        zeroButton.setBounds(155, 486, 85, 64);
        jf.add(zeroButton);

        JButton dotButton = new JButton(".");
        dotButton.setBounds(260, 486, 85, 64);
        jf.add(dotButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(365, 486, 85, 64);
        jf.add(equalButton);


        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}