package RemoteSystemsTempFiles;
import java.awt.*;
import java.awt.event.*;
public class Frame01 {
	public class app18 extends Frame implements ActionListener
	{	static app18 frm=new app18();
	
		static Button btn=new Button("click me");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btn.addActionListener(frm);
		frm.setLayout(new FlowLayout());
		frm.setTitle("Action Event");
		frm.setSize(200,150);
		frm.add(btn);
		frm.setvisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		frm.setBackground(Color.yellow);
	}
}
