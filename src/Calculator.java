import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
    boolean isOperatorClicked=false;
    String status;
    String oldValue;
    JFrame jf;
    JLabel displayLable;
    JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton;
    JButton clearButton;
    JButton zeroButton,dotButton,equalButton,divButton,mulButton,minusButton,addButton;
    public Calculator(){
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(475,680);
        jf.setLocation(400,40);

        displayLable = new JLabel();
        displayLable.setBounds(25,40,385,40);
        displayLable.setBackground(Color.gray);
        displayLable.setFont(new Font("Arial", Font.PLAIN,20));
        displayLable.setOpaque(true);
        displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLable.setForeground(Color.white);
        jf.add(displayLable);

        sevenButton = new JButton("7");
        sevenButton.setBounds(25,130,80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN,30));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(25,230,80,80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(25,330,80,80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(25,430,80,80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330,130,80,80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(divButton);

        mulButton = new JButton("x");
        mulButton.setBounds(330,230,80,80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330,330,80,80);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(minusButton);

        addButton = new JButton("+");
        addButton.setBounds(330,430,80,80);
        addButton.addActionListener(this);
        addButton.setFont(new Font("Arial", Font.PLAIN,30));
        jf.add(addButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(330,530,80,80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial", Font.PLAIN,15));
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== sevenButton){
            if(isOperatorClicked){
                displayLable.setText("7");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"7");
            }

        } else if (e.getSource()== eightButton) {
            if(isOperatorClicked){
                displayLable.setText("8");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"8");
            }
        } else if (e.getSource()== nineButton) {
            if(isOperatorClicked){
                displayLable.setText("9");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"9");
            }
        } else if (e.getSource()== fourButton) {
            if(isOperatorClicked){
                displayLable.setText("4");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"4");
            }
        } else if (e.getSource()== fiveButton) {
            if(isOperatorClicked){
                displayLable.setText("5");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"5");
            }
        } else if (e.getSource()== sixButton) {
            if(isOperatorClicked){
                displayLable.setText("6");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"6");
            }
        } else if (e.getSource()== oneButton) {
            if(isOperatorClicked){
                displayLable.setText("1");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"1");
            }
        } else if (e.getSource()== twoButton) {
            if(isOperatorClicked){
                displayLable.setText("2");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"2");
            }
        } else if (e.getSource()== threeButton) {
            if(isOperatorClicked){
                displayLable.setText("3");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"3");
            }
        } else if (e.getSource()== zeroButton) {
            if(isOperatorClicked){
                displayLable.setText("0");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+"0");
            }
        } else if (e.getSource()== dotButton) {
            if(isOperatorClicked){
                displayLable.setText(".");
                isOperatorClicked=false;
            }else{
                displayLable.setText(displayLable.getText()+".");
            }
        } else if (e.getSource()== divButton) {
            isOperatorClicked=true;
            status="/";
            oldValue=displayLable.getText();
        } else if (e.getSource()== mulButton) {
            isOperatorClicked=true;
            status="*";
            oldValue=displayLable.getText();
        } else if (e.getSource()== minusButton) {
            isOperatorClicked=true;
            status="-";
            oldValue=displayLable.getText();
        } else if (e.getSource()== addButton) {
            isOperatorClicked=true;
            status="+";
            oldValue=displayLable.getText();
        } else if (e.getSource()== clearButton) {
            displayLable.setText("");
        } else if (e.getSource()== equalButton) {
            String newValue=displayLable.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);
            if(status == "+" ){
                float result = oldValueF+newValueF;
                displayLable.setText(result+"");
            }
            if(status == "-" ){
                float result = oldValueF-newValueF;
                displayLable.setText(result+"");
            }
            if(status == "*" ){
                float result = oldValueF*newValueF;
                displayLable.setText(result+"");
            }
            if(status == "/" ){
                float result = oldValueF/newValueF;
                displayLable.setText(result+"");
            }
        }
    }
}
