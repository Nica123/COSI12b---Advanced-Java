
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Actions{
	public static void main(String[] args){

    JFrame window = new JFrame("Square Root Demo");
		JPanel content = new JPanel();
		JButton goB = new JButton("go");
		JTextField enterTF = new JTextField("25");
		JTextField guessTF = new JTextField("1");
		JLabel functionL = new JLabel("g = (g+x/g)/2");
    JLabel enterL = new JLabel("Enter x:");
    JLabel guessL = new JLabel("Current guess g:");


		content.setLayout(new GridLayout(0,2));
    content.add(enterL);
    content.add(enterTF);
    content.add(guessL);
    content.add(guessTF);
    content.add(goB);
    content.add(functionL);


		content.add(answerL,BorderLayout.PAGE_END);

		// add functionality
		clearB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				mealCostTF.setText("");
				taxRateTF.setText("");
				tipRateTF.setText("");
			}
		});

    calculateB.addActionListener(new ActionListener(){
    			public void actionPerformed(ActionEvent event){
    				String mealCostText = mealCostTF.getText();
    				String taxRateText = taxRateTF.getText();
    				String tipRateText = tipRateTF.getText();
    				double mealCost = Double.parseDouble(mealCostText);
    				double taxRate = Double.parseDouble(taxRateText);
    				double tipRate = Double.parseDouble(tipRateText);
    				double tip = mealCost*(tipRate/100);
    				double tax = mealCost*(taxRate/100);
    				double total = mealCost+tip+tax;
    				String response = "Your tip is "+tip+" and your tax is "+tax+" and your meal cost is "+mealCost+" and your total is "+total;
    				answerL.setText(response);
    			}
    		});


		window.setContentPane(content);
		window.pack();
		//window.setSize(250,300);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
