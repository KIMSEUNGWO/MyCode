package anonymous;

public class AnonymousEx {

	public static void main(String[] args) {
		
		Anonymous a = new Anonymous();
		
		a.spider1.attack(); // 1. 익명객체 필드사용
		
		a.method1(); // 2. 익명객체 로컬변수사용
		
		a.method2(new Insect() {
			String name = "타란튤라";
			
			void cobweb() {
				System.out.println("랜덤");
			}
			
			@Override
			void attack() {
				System.out.println(name + "공격 x");
			}
		}); // 3. 매개변수로 익명객체 사용
		
		// 익명개체 내부에서 새롭게 정의된 필드, 메소드는
		// 부모객체로 생성된 spider1에서 접근할 수 없습니다
//		a.spider1.name = "왕거미"; // 익명객체에서 새롭게 정의된 필드(접근불가)
//		a.spider1.cobweb(); // 익명객체에서 새롭게 정의된 메소드(접근불가)
//		a.spider1.attack(); // 부모클래스 Insect에서 오버라이딩한 메소드(접근가능)
	}
}
