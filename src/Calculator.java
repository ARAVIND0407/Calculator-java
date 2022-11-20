import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isOperatorPressed = false,flagAdd = false,flagSub =false,flagDiv =false,flagMul =false;
	String oldValue,newValue;
	float result,oldValueFloat,newValueFloat;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton divButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton mulButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton subButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton addButton,clsButton;

	public Calculator() {
		jf = new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(600,600);
		
		displayLabel = new JLabel();
		displayLabel.setBounds(30,50,540,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		divButton = new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		clsButton = new JButton("C");
		clsButton.setBounds(430, 130, 80, 80);
		clsButton.setFont(new Font("Arial",Font.PLAIN,40));
		clsButton.addActionListener(this);
		jf.add(clsButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30, 240, 80, 80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 240, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 240, 80, 80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		mulButton = new JButton("X");
		mulButton.setBounds(330, 240, 80, 80);
		mulButton.setFont(new Font("Arial",Font.PLAIN,40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(30, 340, 80, 80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 340, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230, 340, 80, 80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		subButton = new JButton("-");
		subButton.setBounds(330, 340, 80, 80);
		subButton.setFont(new Font("Arial",Font.PLAIN,40));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(30, 440, 80, 80);
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 440, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(230, 440, 80, 80);
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		addButton = new JButton("+");
		addButton.setBounds(330, 440, 80, 80);
		addButton.setFont(new Font("Arial",Font.PLAIN,40));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== sevenButton) {	
			
			if(isOperatorPressed == true) {
				
				displayLabel.setText("7");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()== eightButton){
			if(isOperatorPressed == true) {
				
				displayLabel.setText("8");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
				
			}
			
		}else if(e.getSource()== nineButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("9");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
				
			}
			
		}else if(e.getSource()== fourButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("4");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
				
			}
			
		}else if(e.getSource()== fiveButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("5");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
				
			}
			
		}else if(e.getSource()== sixButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("6");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
				
			}
			
		}else if(e.getSource()== oneButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("1");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
	
			}
			
		}else if(e.getSource()== twoButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("2");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
				
			}
			
		}else if(e.getSource()== threeButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("3");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
				
			}
			
		}else if(e.getSource()== dotButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText(".");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
				
			}
			
		}else if(e.getSource()== zeroButton) {
			if(isOperatorPressed == true) {
				
				displayLabel.setText("0");
				isOperatorPressed = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
	
			}
			
		}else if(e.getSource()== divButton) {
			isOperatorPressed = true;
			flagDiv = true;
			oldValue = displayLabel.getText();
			oldValueFloat = Float.parseFloat(oldValue);
			
		}else if(e.getSource()== mulButton) {
			isOperatorPressed = true;
			flagMul = true;
			oldValue = displayLabel.getText();
			oldValueFloat = Float.parseFloat(oldValue);
			
		}else if(e.getSource()== subButton) {
			isOperatorPressed = true;
			flagSub = true;
			oldValue = displayLabel.getText();
			oldValueFloat = Float.parseFloat(oldValue);
			
			
		}else if(e.getSource()== equalButton) {
			newValue = displayLabel.getText();
			newValueFloat = Float.parseFloat(newValue);
			if(flagAdd == true) {
				result =oldValueFloat+newValueFloat;
				flagAdd =false;
			}else if(flagSub ==true) {
				result =oldValueFloat-newValueFloat;
				flagSub =false;
			}else if(flagMul ==true) {
				result =oldValueFloat*newValueFloat;
				flagMul =false;
			}else if(flagDiv ==true) {
				result =oldValueFloat/newValueFloat;
				flagDiv = false;
			}
			displayLabel.setText(result+"");
			
			
			
		}else if(e.getSource()== addButton) {
			isOperatorPressed = true;
			flagAdd = true;
			oldValue = displayLabel.getText();
			oldValueFloat = Float.parseFloat(oldValue);
			
			
		}else if(e.getSource()==clsButton) {
			displayLabel.setText("");
		}
		
	}
	
}



