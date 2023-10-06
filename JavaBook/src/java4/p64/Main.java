package java4.p64;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ball = 0;
		int strike = 0;
		int[] num = new int[3];

		Random random = new Random();

		while (true) {
			num[0] = random.nextInt(9) + 1;
			num[1] = random.nextInt(9) + 1;
			num[2] = random.nextInt(9) + 1;

			if (num[0] != num[1] && num[0] != num[2] && num[1] != num[2]) {
//				System.out.println(num[0] + " " + num[1] + " " + num[2]);
				break;
			}
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 1~9 중 3개를 입력하세요.");
			int inp1 = sc.nextInt();
			int inp2 = sc.nextInt();
			int inp3 = sc.nextInt();

			if (inp1 == num[0]) {
				strike++;
			} else if (inp1 == num[1] || inp1 == num[2]) {
				ball++;
			}
			if (inp2 == num[1]) {
				strike++;
			} else if (inp2 == num[0] || inp2 == num[1]) {
				ball++;
			}
			if (inp3 == num[2]) {
				strike++;
			} else if (inp3 == num[0] || inp3 == num[1]) {
				ball++;
			}
			System.out.println("strike : " + strike + ", ball : " + ball);

			if (strike == 3) {
				System.out.println("Game Over!");
				sc.close();
				break;
			}
		}
	}
}