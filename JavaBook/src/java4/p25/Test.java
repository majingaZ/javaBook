package java4.p25;

import java.util.Properties;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("UserName");
		String userHome = System.getProperty("userHome");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		
		System.out.println("-----------------------------");
		System.out.println(" [key] value");
		System.out.println("-----------------------------");
		
		Properties props = System.getProperties();
		Set Keys = props.keySet();
		for (Object objKey : Keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println(" [ " + key + " ] " + value);
		}
	}

}
