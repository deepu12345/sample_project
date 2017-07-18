import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ex6_29 extends Applet implements ActionListener {
	TextField Num;
	Button but = new Button("OK");
	public void init() {
		Num = new TextField(3);
		Label qstn = new Label("Enter Average: (1-100)"),title = new Label("Excercise 6.29 qualityPoints method");
		add(title);
		add(qstn);
		add(Num);
		add(but);
		but.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == but)
			{
				qualityPoints();
			}
	}
	public void qualityPoints() { 
		int num = Integer.parseInt(Num.getText()),ans = 1;
		String msg="";
		if (num >= 1 && num <= 59)
			{ans = 0;
			showStatus("Result: " + ans);}
		else if (num >= 60 && num <= 69)
			{ans = 1;
			showStatus("Result: " + ans);}
		else if (num >= 70 && num <= 79)
			{ans = 2;
			showStatus("Result: " + ans);}
		else if (num >= 80 && num <= 89)
			{ans = 3;
			showStatus("Result: " + ans);}
		else if (num >= 90 && num <= 100)
			{ans = 4;
			showStatus("Result: " + ans);}
		else 
			{msg = "Error! Your average is too low/high.";
			showStatus("Result: " + msg);}
	}
}