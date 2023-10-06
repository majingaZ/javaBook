package java5.p22;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// 사이즈를 지정하지 않은 리스트 생성
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 인덱스에 저장 (다른 인덱스는 자동으로 뒤로 밀려 정렬됨)
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수 : " + size);

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2);
		list.remove("iBATIS");
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}

}
