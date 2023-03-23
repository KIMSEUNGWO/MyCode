package scanner;

import java.io.IOException;

public class KeyCodeEx {

	public static void main(String[] args) throws IOException {
		// System.in.read() 메서드는 오류가 발생할 수 있다
		// 오류를 처리하는 2가지 방법중 throws 하는 방법을 선택하여 해결
		// 다른 방법으로는 try {} catch(){} 문으로 감싸서 해결할 수 있다.
		
		System.out.println("키코드 ========");
		
		// System.in.read()는 사용자의 입력을 기다린다
		// 엔터키를 입력하는 순간 실행이 됨.
		int code1 = System.in.read();
		int code2 = System.in.read();
		int code3 = System.in.read();
		int code4 = System.in.read();
		int code5 = System.in.read();
		System.out.println((char)code1);
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5);
	}

}
