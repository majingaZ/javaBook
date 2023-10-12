package java6.p52;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("Memo");
		f.setSize(500, 300);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일");
		MenuItem miNew = new MenuItem("새 탭");
		MenuItem miOpenN = new MenuItem("새 창");
		MenuItem miOpenF = new MenuItem("열기");
		MenuItem miSave = new MenuItem("저장");
		MenuItem miOthersSave = new MenuItem("다른 이름으로 저장");
		MenuItem miAllSave = new MenuItem("모두 저장");

		MenuItem miExit = new MenuItem("종료");

		mFile.add(miNew);
		mFile.add(miOpenN);
		mFile.add(miOpenF);
		mFile.add(miSave);
		mFile.add(miOthersSave);
		mFile.add(miAllSave);
		mFile.addSeparator();
		mFile.add(miExit);

		Menu mEdit = new Menu("편집");
		MenuItem miCancel = new MenuItem("실행 취소");
		MenuItem miCut = new MenuItem("잘라내기");
		MenuItem miCopy = new MenuItem("복사");
		MenuItem miPaste = new MenuItem("붙여넣기");
		Menu mView = new Menu("보기");
		Menu mPlusminus = new Menu("확대/축소");
		
		MenuItem miPlus = new MenuItem("확대");
		MenuItem miMinus = new MenuItem("축소");
		MenuItem miDifault = new MenuItem("기본값 복원");
		mPlusminus.add(miPlus);
		mPlusminus.add(miMinus);
		mPlusminus.add(miDifault);
		
		MenuItem miState = new MenuItem("상태 표시줄");
		CheckboxMenuItem miLineChange = new CheckboxMenuItem("자동 줄 바꿈");
		
		mEdit.add(miCancel);
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
		mView.add(mPlusminus);
		mView.add(miState);
		mView.add(miLineChange);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
