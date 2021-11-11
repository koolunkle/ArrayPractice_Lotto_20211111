package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

//		입력한 숫자 6개를 저장할 배열
		int[] myInputNumbers = new int[6];

		for (int i = 0; i < myInputNumbers.length; i++) {

//			안내 문구 ->  1번째 숫자 입력 : ,  2번째 숫자 입력 : ...
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			int inputNum = myScanner.nextInt();

		}

	}

}
