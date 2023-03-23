package staticEx;

public class Static {

	// 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	// 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	// 정적 메소드
	static void method3() {
		Static obj = new Static(); // 정적 메소드 내에 인스턴스멤버를 사용하기 위해 new 연산자 사용
		obj.field1 = 10; // 객체를 생성하여 인스턴스멤버를 사용
		obj.method1(); // 객체를 생성하여 인스턴스멤버를 사용
		
		field2 = 20; // 정적멤버내에서 정적 필드와 메소드는 객체생성없이 사용
		method2();
	}
	
	public static void main(String[] args) {
//		field1 = 20; // 메인메소드에서 인스턴스멤버는 사용 불가. new 연산자로 객체를생성하고 사용해야함.
	}
	
	
}
