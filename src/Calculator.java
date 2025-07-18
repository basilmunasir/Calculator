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
    JLabel displayLabel;
    JButton clearButton,backspaceButton,percentageButton,divisionButton;
    JButton sevenButton,eightButton,nineButton,multiplicationButton;
    JButton fourButton,fiveButton,sixButton,additionButton;
    JButton oneButton,twoButton,threeButton,substractButton;
    JButton doublezeroButton,zeroButton,dotButton,equalButton;
    
    String oldValue="";
    float oldValueF=0;
    float newValueF=0;
    String actionClicked;
    boolean isOperatorClicked=false;
    String flag="";
    public Calculator()
    {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500,650);
        jf.setLocation(400, 100);

        displayLabel = new JLabel();
        displayLabel.setBounds(50, 50, 400, 80);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 40));
        jf.add(displayLabel);


    
        clearButton = new JButton("C");
        clearButton.setBounds(50, 150, 85, 64);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Serif",Font.BOLD,25));
        clearButton.setBackground(Color.lightGray);
        clearButton.setForeground(Color.red);
        jf.add(clearButton);

        backspaceButton = new JButton("BS");
        backspaceButton.setBounds(155, 150, 85, 64);
        backspaceButton.addActionListener(this);
        backspaceButton.setFont(new Font("Serif",Font.BOLD,25));
        backspaceButton.setBackground(Color.lightGray);
        backspaceButton.setForeground(Color.red);
        jf.add(backspaceButton);

        percentageButton = new JButton("%");
        percentageButton.setBounds(260, 150, 85, 64);
        percentageButton.addActionListener(this);
        percentageButton.setFont(new Font("Serif",Font.BOLD,25));
        percentageButton.setBackground(Color.lightGray);
        percentageButton.setForeground(Color.red);
        jf.add(percentageButton);

        divisionButton = new JButton("/");
        divisionButton.setBounds(365, 150, 85, 64);
        divisionButton.addActionListener(this);
        divisionButton.setFont(new Font("Serif",Font.BOLD,25));
        divisionButton.setBackground(Color.lightGray);
        divisionButton.setForeground(Color.red);
        jf.add(divisionButton);



        sevenButton = new JButton("7");
        sevenButton.setBounds(50, 234, 85, 64);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Serif",Font.BOLD,25));
        sevenButton.setBackground(Color.lightGray);
        sevenButton.setForeground(Color.black);
        jf.add(sevenButton);

        eightButton = new  JButton("8");
        eightButton.setBounds(155, 234, 85, 64);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Serif",Font.BOLD,25));
        eightButton.setBackground(Color.lightGray);
        eightButton.setForeground(Color.black);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(260, 234, 85, 64);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Serif",Font.BOLD,25));
        nineButton.setBackground(Color.lightGray);
        nineButton.setForeground(Color.black);
        jf.add(nineButton);

        multiplicationButton = new JButton("x");
        multiplicationButton.setBounds(365, 234, 85, 64);
        multiplicationButton.addActionListener(this);
        multiplicationButton.setFont(new Font("Serif",Font.BOLD,25));
        multiplicationButton.setBackground(Color.lightGray);
        multiplicationButton.setForeground(Color.red);
        jf.add(multiplicationButton);



        fourButton = new JButton("4");
        fourButton.setBounds(50, 318, 85, 64);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Serif",Font.BOLD,25));
        fourButton.setBackground(Color.lightGray);
        fourButton.setForeground(Color.black);
        jf.add(fourButton);

        fiveButton = new  JButton("5");
        fiveButton.setBounds(155, 318, 85, 64);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Serif",Font.BOLD,25));
        fiveButton.setBackground(Color.lightGray);
        fiveButton.setForeground(Color.black);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(260, 318, 85, 64);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Serif",Font.BOLD,25));
        sixButton.setBackground(Color.lightGray);
        sixButton.setForeground(Color.black);
        jf.add(sixButton);

        additionButton = new JButton("+");
        additionButton.setBounds(365, 318, 85, 64);
        additionButton.addActionListener(this);
        additionButton.setFont(new Font("Serif",Font.BOLD,25));
        additionButton.setBackground(Color.lightGray);
        additionButton.setForeground(Color.red);
        jf.add(additionButton);



        oneButton = new JButton("1");
        oneButton.setBounds(50, 402, 85, 64);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Serif",Font.BOLD,25));
        oneButton.setBackground(Color.lightGray);
        oneButton.setForeground(Color.black);
        jf.add(oneButton);

        twoButton = new  JButton("2");
        twoButton.setBounds(155, 402, 85, 64);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Serif",Font.BOLD,25));
        twoButton.setBackground(Color.lightGray);
        twoButton.setForeground(Color.black);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(260, 402, 85, 64);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Serif",Font.BOLD,25));
        threeButton.setBackground(Color.lightGray);
        threeButton.setForeground(Color.black);
        jf.add(threeButton);

        substractButton = new JButton("-");
        substractButton.setBounds(365, 402, 85, 64);
        substractButton.addActionListener(this);
        substractButton.setFont(new Font("Serif",Font.BOLD,25));
        substractButton.setBackground(Color.lightGray);
        substractButton.setForeground(Color.red);
        jf.add(substractButton);



        doublezeroButton = new JButton("00");
        doublezeroButton.setBounds(50, 486, 85, 64);
        doublezeroButton.addActionListener(this);
        doublezeroButton.setFont(new Font("Serif",Font.BOLD,25));
        doublezeroButton.setBackground(Color.lightGray);
        doublezeroButton.setForeground(Color.black);
        jf.add(doublezeroButton);

        zeroButton = new  JButton("0");
        zeroButton.setBounds(155, 486, 85, 64);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Serif",Font.BOLD,25));
        zeroButton.setBackground(Color.lightGray);
        zeroButton.setForeground(Color.black);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(260, 486, 85, 64);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Serif",Font.BOLD,25));
        dotButton.setBackground(Color.lightGray);
        dotButton.setForeground(Color.black);
        jf.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(365, 486, 85, 64);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Serif",Font.BOLD,25));
        equalButton.setBackground(Color.lightGray);
        equalButton.setForeground(Color.red);
        jf.add(equalButton);


        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == sevenButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }
        else if(e.getSource() == eightButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"8");
            }        
        }
        else if(e.getSource() == nineButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource() == fourButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource() == fiveButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource() == sixButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource() == oneButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource() == twoButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource() == threeButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource() == doublezeroButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("00");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"00");
            }
        }
        else if(e.getSource() == zeroButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }
        else if(e.getSource() == dotButton)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("0.");
                isOperatorClicked=false;
            }
            else if (displayLabel.getText()=="") {
                displayLabel.setText("0.");
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+".");
            }
        }
        else if(e.getSource() == clearButton)
        {
            displayLabel.setText("");
            oldValue="";
            oldValueF=0;
            newValueF=0;
            actionClicked="";
            flag="";
        }
        else if(e.getSource() == backspaceButton)
        {

        }
        else if(e.getSource() == percentageButton)
        {
            
        }
        else if(e.getSource() == divisionButton)
        {
            isOperatorClicked=true;
            if (oldValue=="") 
            {
                oldValue=displayLabel.getText(); 
                oldValueF=Float.parseFloat(oldValue);  
            }
            else
            {
                oldValue=displayLabel.getText();
                oldValueF/=Float.parseFloat(oldValue);
            }
            flag="division";
            displayLabel.setText("");
        }
        else if(e.getSource() == multiplicationButton)
        {
            isOperatorClicked=true;
            if(oldValue=="")
            {
                oldValue=displayLabel.getText();
                oldValueF=Float.parseFloat(oldValue);
            }
            else
            {
                oldValue=displayLabel.getText();
                oldValueF*=Float.parseFloat(oldValue);
            }
            flag="multiply";
            displayLabel.setText("");
        }
        else if(e.getSource() == additionButton)
        {
            isOperatorClicked=true;
            if (oldValue=="") 
            {
                oldValue=displayLabel.getText(); 
                oldValueF=Float.parseFloat(oldValue);  
            }
            else
            {
                oldValue=displayLabel.getText();
                oldValueF+=Float.parseFloat(oldValue);
            }
            flag="add";
            displayLabel.setText("");
        }
        else if(e.getSource() == substractButton)
        {
            isOperatorClicked=true;
            if (oldValue=="") 
            {
                oldValue=displayLabel.getText(); 
                oldValueF=Float.parseFloat(oldValue);  
            }
            else
            {
                oldValue=displayLabel.getText();
                oldValueF-=Float.parseFloat(oldValue);
            }
            flag="subtract";
            displayLabel.setText("");
        }
        else if(e.getSource() == equalButton)
        {
            String newValue=displayLabel.getText();
            newValueF=Float.parseFloat(newValue);

            switch (flag) {
                case "percentage":
                    break;
                case "division":
                    newValueF=oldValueF/newValueF;
                    displayLabel.setText(newValueF+" ");
                    break;
                case "multiply":
                    newValueF*=oldValueF;
                    displayLabel.setText(newValueF+" ");
                    break;
                case "add":
                    newValueF+=oldValueF;
                    displayLabel.setText(newValueF+" ");
                    break;
                case "subtract":
                    newValueF=oldValueF-newValueF;
                    displayLabel.setText(newValueF+" ");
                    break;
                default:
                    displayLabel.setText("0");
                    break;
            }
        }
         
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}