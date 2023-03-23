package singleton;

public class Singleton {

	// 자신의 타입인 정적 필드를 선언하고 객체를 생성해서 초기화
	// 클래스 내부에서 new 연산자로 생성자 호출을 막기위해 정적필드에 private 를 부여
	private static Singleton a = new Singleton();
	
	// 생성자 앞 접근제한자에 private를 사용
	private Singleton() {}
	
	// 외부에서 호출할 수 있도록 정적 메소드인 getInstance()를 선언하여 정적 필드에서 참조하고 있는 자신의 객체를 리턴해준다.
	static Singleton getInstance() {
		return a;
	}
}
