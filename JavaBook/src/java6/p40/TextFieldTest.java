package java6.p40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
	// implements로 ActionListener 인터페이스 상속 받음
	// 버튼, 텍스트필드 생성을 위한 멤버변수 선언
	private Button b;
	private Button tfMsg;
	private TextField id;
	private TextField pwd;
	
	// 로그인 창 구현 메서드
	public TextFieldTest() {
		Frame f = new Frame("Login"); // 프레임 생성
		f.setSize(330, 150); // 프레임 사이즈
		f.setLayout(null); // 레이아웃을 직접 설정하도록 만듦 (setBounds() 메서드로 직접 설정)
		
		// 라벨 구현
		Label lid = new Label("ID : ", Label.RIGHT); // 새 라벨 생성 ("보여줄 내용", 오른쪽 정렬)
		lid.setBounds(20, 20, 50, 50); // x 20, y 20 위치에 50x50 사이즈
		Label lpwd = new Label("PWD : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);
		
		// 텍스트 필드 (입력창) 구현
		id = new TextField(10); // 초기 필드 사이즈
		id.setBounds(80, 35, 120, 20); // 필드 x, y, 가로, 세로 사이즈 변경
		pwd = new TextField(10);
		pwd.setEchoChar('*'); // 비밀번호 입력 시 대신 보여줄 텍스트 설정
		pwd.setBounds(80, 60, 120, 20);
		
		// 로그인 버튼 구현
		b = new Button("로그인"); // 버튼 생성
		b.setBounds(210, 30, 50, 50); // 버튼의 좌표, 사이즈 설정
		
		b.addActionListener(this); // 이 버튼 클릭 시 this 메서드 호출
		
		tfMsg = new Button("로그인하시겠습니까?"); // 하단 버튼 생성
		tfMsg.setBounds(80, 95, 120, 20);
		
		// 프레임에 컴포넌트 (버튼, 라벨) 추가
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(tfMsg);
		f.setVisible(true); // 프레임이 화면에 보이게 함 (숨기려면 false)
	}
	@Override // 이벤트 발생 시 실행할 동작 메서드
	public void actionPerformed(ActionEvent e) {
		String name = id.getText(); // 입력된 id를 name에 저장
		String pass = pwd.getText(); // 입력된 pwd를 pass에 저장
		
		String name1 = "abcd"; // 기본 저장된 id
		String pass1 = "1234"; // 기본 저장된 pwd
		if (name.equals(name1) && pass.equals(pass1)) { // 저장된 내용과 입력된 내용 비교
			tfMsg.setLabel("로그인되었습니다."); // 하단 버튼의 내용 변경
		}
		
	}
	
	public static void main(String[] args) {
		TextFieldTest tft = new TextFieldTest(); // 실행을 위한 객체 생성
	}

}
