package java6.p36;

import java.awt.Frame;
import java.awt.Label;

public class LabelTset {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Label id = new Label("ID: ");
		id.setBounds(50, 50, 30, 10); // 50, 50 위치에 30, 10 크기
		
		Label pwd = new Label("Password: ");
		pwd.setBounds(50, 65, 100, 10);
		
		f.add(id);
		f.add(pwd);
		f.setVisible(true);

	}

}
