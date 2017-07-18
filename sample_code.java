import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ex7_35 extends Applet implements ActionListener {
	TextField str;
		Label qstn = new Label("Enter String: "),title = new Label("Excercise 7.35 String Reversed Recursive method"),ans = new Label("Output:                                      ");
	Button but = new Button("OK");
	public void init() {
		str = new TextField(20);
		add(title);
		add(qstn);
		add(str);
		add(but);
		add(ans);
		but.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == but)
			{
				ans.setText(testPalindrome(str.getText()));
			}
	}
	public static String testPalindrome(String s) { 
	   	String n = "";
       	int num = 0;
    	for(int ctr =s.length()-1; ctr >=0;ctr--)
			{	
			n = n + s.charAt(ctr);
			}
		return "Output: " + n;
		}
	}