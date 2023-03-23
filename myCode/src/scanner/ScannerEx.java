package scanner;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		scan.close();
		// 한줄을 읽어온다.
//		String input = scan.nextLine();
		
		// 공백으로 구분해서 하나씩 읽어온다
		String input = scan.next();
		System.out.println(input);
		System.out.println(Integer.parseInt(input)*10);
		
		// 숫자로 받아온다.
		int i = scan.nextInt();
		System.out.println(i*i);
	}
}
