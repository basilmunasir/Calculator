import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener
{
    JFrame jf;
    JLabel displayJLabel;
    JButton clearButton,backspaceButton,percentageButton,divisionButton;
    JButton sevenButton,eightButton,nineButton,multiplicationButton;
    JButton fourButton,fiveButton,sixButton,additionButton;
    JButton oneButton,twoButton,threeButton,substractButton;
    JButton doublezeroButton,zeroButton,dotButton,equalButton;
    public Calculator()
    {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500,650);
        jf.setLocation(400, 100);

        displayJLabel = new JLabel("Munasir");
        displayJLabel.setBounds(50, 50, 400, 80);
        displayJLabel.setBackground(Color.gray);
        displayJLabel.setOpaque(true);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayJLabel.setForeground(Color.white);
        displayJLabel.setFont(new Font("Serif", Font.PLAIN, 40));
        jf.add(displayJLabel);


    
        clearButton = new JButton("C");
        clearButton.setBounds(50, 150, 85, 64);
        clearButton.setFont(new Font("Serif",Font.BOLD,25));
        clearButton.setBackground(Color.lightGray);
        clearButton.setForeground(Color.red);
        jf.add(clearButton);

        backspaceButton = new JButton("BS");
        backspaceButton.setBounds(155, 150, 85, 64);
        backspaceButton.setFont(new Font("Serif",Font.BOLD,25));
        backspaceButton.setBackground(Color.lightGray);
        backspaceButton.setForeground(Color.red);
        jf.add(backspaceButton);

        percentageButton = new JButton("%");
        percentageButton.setBounds(260, 150, 85, 64);
        percentageButton.setFont(new Font("Serif",Font.BOLD,25));
        percentageButton.setBackground(Color.lightGray);
        percentageButton.setForeground(Color.red);
        jf.add(percentageButton);

        divisionButton = new JButton("/");
        divisionButton.setBounds(365, 150, 85, 64);
        divisionButton.setFont(new Font("Serif",Font.BOLD,25));
        divisionButton.setBackground(Color.lightGray);
        divisionButton.setForeground(Color.red);
        jf.add(divisionButton);



        sevenButton = new JButton("7");
        sevenButton.setBounds(50, 234, 85, 64);
        sevenButton.setFont(new Font("Serif",Font.BOLD,25));
        sevenButton.setBackground(Color.lightGray);
        sevenButton.setForeground(Color.black);
        jf.add(sevenButton);

        eightButton = new  JButton("8");
        eightButton.setBounds(155, 234, 85, 64);
        eightButton.setFont(new Font("Serif",Font.BOLD,25));
        eightButton.setBackground(Color.lightGray);
        eightButton.setForeground(Color.black);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(260, 234, 85, 64);
        nineButton.setFont(new Font("Serif",Font.BOLD,25));
        nineButton.setBackground(Color.lightGray);
        nineButton.setForeground(Color.black);
        jf.add(nineButton);

        multiplicationButton = new JButton("x");
        multiplicationButton.setBounds(365, 234, 85, 64);
        multiplicationButton.setFont(new Font("Serif",Font.BOLD,25));
        multiplicationButton.setBackground(Color.lightGray);
        multiplicationButton.setForeground(Color.red);
        jf.add(multiplicationButton);



        fourButton = new JButton("4");
        fourButton.setBounds(50, 318, 85, 64);
        fourButton.setFont(new Font("Serif",Font.BOLD,25));
        fourButton.setBackground(Color.lightGray);
        fourButton.setForeground(Color.black);
        jf.add(fourButton);

        fiveButton = new  JButton("5");
        fiveButton.setBounds(155, 318, 85, 64);
        fiveButton.setFont(new Font("Serif",Font.BOLD,25));
        fiveButton.setBackground(Color.lightGray);
        fiveButton.setForeground(Color.black);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(260, 318, 85, 64);
        sixButton.setFont(new Font("Serif",Font.BOLD,25));
        sixButton.setBackground(Color.lightGray);
        sixButton.setForeground(Color.black);
        jf.add(sixButton);

        additionButton = new JButton("+");
        additionButton.setBounds(365, 318, 85, 64);
        additionButton.setFont(new Font("Serif",Font.BOLD,25));
        additionButton.setBackground(Color.lightGray);
        additionButton.setForeground(Color.red);
        jf.add(additionButton);



        oneButton = new JButton("1");
        oneButton.setBounds(50, 402, 85, 64);
        oneButton.setFont(new Font("Serif",Font.BOLD,25));
        oneButton.setBackground(Color.lightGray);
        oneButton.setForeground(Color.black);
        jf.add(oneButton);

        twoButton = new  JButton("2");
        twoButton.setBounds(155, 402, 85, 64);
        twoButton.setFont(new Font("Serif",Font.BOLD,25));
        twoButton.setBackground(Color.lightGray);
        twoButton.setForeground(Color.black);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(260, 402, 85, 64);
        threeButton.setFont(new Font("Serif",Font.BOLD,25));
        threeButton.setBackground(Color.lightGray);
        threeButton.setForeground(Color.black);
        jf.add(threeButton);

        substractButton = new JButton("-");
        substractButton.setBounds(365, 402, 85, 64);
        substractButton.setFont(new Font("Serif",Font.BOLD,25));
        substractButton.setBackground(Color.lightGray);
        substractButton.setForeground(Color.red);
        jf.add(substractButton);



        doublezeroButton = new JButton("00");
        doublezeroButton.setBounds(50, 486, 85, 64);
        doublezeroButton.setFont(new Font("Serif",Font.BOLD,25));
        doublezeroButton.setBackground(Color.lightGray);
        doublezeroButton.setForeground(Color.black);
        jf.add(doublezeroButton);

        zeroButton = new  JButton("0");
        zeroButton.setBounds(155, 486, 85, 64);
        zeroButton.setFont(new Font("Serif",Font.BOLD,25));
        zeroButton.setBackground(Color.lightGray);
        zeroButton.setForeground(Color.black);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(260, 486, 85, 64);
        dotButton.setFont(new Font("Serif",Font.BOLD,25));
        dotButton.setBackground(Color.lightGray);
        dotButton.setForeground(Color.black);
        jf.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(365, 486, 85, 64);
        equalButton.setFont(new Font("Serif",Font.BOLD,25));
        equalButton.setBackground(Color.lightGray);
        equalButton.setForeground(Color.red);
        jf.add(equalButton);


        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}