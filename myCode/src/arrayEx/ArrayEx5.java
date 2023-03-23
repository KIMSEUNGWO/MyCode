package arrayEx;

public class ArrayEx5 {
	// 접근제어자 static 반환타입 메서드명(매개변수){}
	// void : 반환 타입이 없다는 의미
	// int, String
	// 매개변수 : (타입 변수명) -- 매개변수는 필수가 아니다 없어도된다
	// 매개변수가 있다면 타입을 명시 해줘야 한다.
	public static void main(String[] args) {
		// 메인메서드 (String[] args의 활용)
		// Run Configurations - arguments 값 변경으로 설정할 수 있음.
		System.out.println(args.length);
				
		int mode = Integer.parseInt(args[0]); // 1:로컬, 2:테스트, 3:운영
		if (mode == 1) {
			System.out.println("로컬환경입니다.");
			// 로컬 DB 접속
		} else if (mode == 2) {
			System.out.println("테스트환경입니다.");
			// 테스트 DB접속
		} else if (mode == 3) {
			System.out.println("운영환경입니다.");
		}
		
		for (int i = 0;i<args.length;i++) {
			
			System.out.println(args[i]);
		}
	}
}
