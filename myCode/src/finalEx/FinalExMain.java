package finalEx;

public class FinalExMain {

	public static void main(String[] args) {
		
		FinalEx a = new FinalEx("123456-1234567", "홍길동");
		
		System.out.println(a.nation);
		System.out.println(a.name);
		System.out.println(a.ssn);
		
//		a.nation = "USA"; // Final은 수정불가!
//		a.ssn = "654321-7654321"; // Final은 수정불가!
		a.name = "홍삼원";
	}
}
