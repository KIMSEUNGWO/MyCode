package finalEx;

public class FinalEx {

	final String nation = "Korea";
	final String ssn;
	String name;
	
	// final 필드의 nation은 고정값이 있기때문에 생성자에서 지정하지않았지만
	// ssn은 FinalEx 객체가 생성될 때 부여되므로 FinalEx 클래스 설계시 초기값을 미리 줄 수 없다.
	// 그래서 생성자 매개값으로 ssn을 받아서 초기값을 지정해주었다.
	public FinalEx(String name, String ssn) {
		// this.nation = nation; 필요없음. final로 고정값이 있기 때문에
		this.ssn = ssn; // name은 고정값이 없어서 객체가 생성될때 부여되므로 생성자에서 초기값을 지정.
		this.name = name;
	}


}
