package java5.p61;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
//		Stack<Coin> coinBox = new Stack<Coin>();
		JStack coinBox = new JStack();
		
		// 스택에 값을 넣는다
		coinBox.push(new Coin(20));
		coinBox.push(new Coin(70));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(130));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // 스택에서 값을 꺼내온다
			System.out.println("꺼내온 동전 : " + coin.getValue() + " 원");
		}
	}
}