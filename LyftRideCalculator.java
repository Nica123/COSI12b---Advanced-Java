import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LyftRideCalculator{
	public static void main(String[] args){

    JFrame window = new JFrame("LyftRide");
		JPanel content = new JPanel();

		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>Lyft Ride Calculator</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);

    JPanel sideL = new JPanel();
    sideL.setLayout(new BoxLayout(sideL, BoxLayout.Y_AXIS));
    JLabel pickupfee = new JLabel("pickup fee: $5");
    JLabel distancefee = new JLabel("distance fee: $3/mile");
    JLabel timefee = new JLabel("time fee: $0.20/minute");
    sideL.add(pickupfee);
    sideL.add(distancefee);
    sideL.add(timefee);
    sideL.setBackground(Color.WHITE);
    content.add(sideL,BorderLayout.LINE_START);


		JPanel input = new JPanel();
		input.setLayout(new GridLayout(0,2));
    JLabel distanceL = new JLabel("ride distance in miles:");
		JTextField distanceTF = new JTextField("2");
    JLabel timeL = new JLabel("ride time in minutes:");
		JTextField timeTF = new JTextField("10");
		JLabel payL = new JLabel("pay for the ride:");
    JLabel paynumL = new JLabel("$13.0");
    input.add(distanceL);
    input.add(distanceTF);
    input.add(timeL);
    input.add(timeTF);
    input.add(payL);
    input.add(paynumL);
		input.setBackground(Color.YELLOW);
		content.add(input,BorderLayout.CENTER);


		JButton calculateB = new JButton("<html><h1>calculate pay</h1></html>");
    content.add(calculateB, BorderLayout.LINE_END);


    JLabel function = new JLabel("pay is calculated by 5 + 3*dist +0.2*time");
		content.add(function,BorderLayout.PAGE_END);

		// add functionality
    calculateB.addActionListener(new ActionListener(){
    			public void actionPerformed(ActionEvent event){
    				String distanceText = distanceTF.getText().trim();
    				String timeText = timeTF.getText().trim();
    				double distance = Double.parseDouble(distanceText);
    				double time = Double.parseDouble(timeText);
    				double pay = 5+3*distance+0.2*time;
    				paynumL.setText("$"+pay);
    			}
    		});


		window.setContentPane(content);
		//window.pack();
		window.setSize(950,165);
		window.setLocation(100,100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}
}
