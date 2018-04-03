import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* This demo creates a telephone keyboard of buttons.
*/
public class Layout{
	public static void main(String[] args){

    JFrame window = new JFrame("Robotic Boat");
		JPanel content = new JPanel();
		JButton aB = new JButton("NW");
		JButton bB = new JButton("N");
    JButton cB = new JButton("NE");
    JButton dB = new JButton("W");
    JButton eB = new JButton("o");
    JButton fB = new JButton("E");
    JButton gB = new JButton("SW");
    JButton hB = new JButton("S");
    JButton iB = new JButton("SE");
    JButton sideaB = new JButton("Go");
    JButton sidebB = new JButton("Stop");


		JTextField nameTF = new JTextField("...enter your name in this textfield...");
		JLabel nameL = new JLabel("Your name: ");

		content.setLayout(new BorderLayout());

		JLabel label1 = new JLabel("<html><h1>Navigate the robotic boat!</h1></html>");
		label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		content.add(label1,BorderLayout.PAGE_START);


		JPanel input = new JPanel();
		input.setLayout(new GridLayout(0,3));
		input.add(aB);
    input.add(bB);
    input.add(cB);
    input.add(dB);
    input.add(eB);
    input.add(fB);
    input.add(gB);
    input.add(hB);
    input.add(iB);
		content.add(input,BorderLayout.CENTER);

    JPanel sideR = new JPanel();
    sideR.setLayout(new GridLayout(2,0));
    sideR.add(sideaB);
    sideR.add(sidebB);
    content.add(sideR,BorderLayout.LINE_END);

    JPanel end = new JPanel();
    end.add(nameL);
    end.add(nameTF);
    content.add(end,BorderLayout.PAGE_END);

		window.setContentPane(content);
		//window.pack();
		window.setSize(700,400);
		window.setLocation(100,100);
		window.setVisible(true);

	}
}
