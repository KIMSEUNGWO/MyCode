package scanner;

import java.io.IOException;

public class WhileEx {
	
	/**
	 * 키보드로부터 입려된 키코드를 출력합니다.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {	
		
		System.out.println("키보드 입력을 기다리는 중입니다.");
		while(true) {
			int input = System.in.read();
//			System.out.println((char)input);
//			System.out.println("========");
			System.out.println("keyCode : " + input);
			
			// Q가 입력되면 반복을 종료
			// || : 또는, && : 그리고
			if (input == 81 || input == 113) {
				break;
			}
		}
		System.out.println("종료합니다.");
	
	}

}
