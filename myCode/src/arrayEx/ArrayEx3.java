package arrayEx;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// new 연산자로 배열을 생성하는방법
		// String 타입의 배열을 길이 10으로 생성
		// String[] names = new String[10];
		
		String[] names = {"",""};
		int[] score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개의 방을 만들까요?");
		int index = scan.nextInt();
		score = new int[index];
		
	}
}
