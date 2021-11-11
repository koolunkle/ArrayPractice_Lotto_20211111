package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

//		입력한 숫자 6개를 저장할 배열
		int[] myInputNumbers = new int[6];

		for (int i = 0; i < myInputNumbers.length; i++) {

//			각 자리에 맞는 숫자를 -> 올바른 숫자를 넣을때 까지 다시 입력.

			while (true) {

//				안내 문구 ->  1번째 숫자 입력 : ,  2번째 숫자 입력 : ...
				System.out.print(i + 1 + "번째 숫자 입력 : ");
				int inputNum = myScanner.nextInt();

//				제약조건 통과했는지? 검사.

//				임시로 무조건 조건 통과라고 명시.
				if (true) {

//					써도 되는 숫자를 입력 했다.
					myInputNumbers[i] = inputNum;

//					다음 숫자 받으러 가자. -> while 무한반복 종료.
					break;

				}

			}

		}

	}

}
