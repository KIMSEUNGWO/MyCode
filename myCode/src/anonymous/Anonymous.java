package anonymous;

public class Anonymous extends Insect {
	// 익명 자식객체 생성 - 방법 3가지
	// 부모클래스 변수 = new 부모클래스(매개값..){};
	// 1. 필드의 초기값
	// 2. 로컬변수의 초기값
	// 3. 매개변수의 매개값
	
	// 1. 필드에 익명자식객체를 생성
	Insect spider1 = new Insect() {
		String name = "무당거미";
		void cobweb() {
			System.out.println("사각형");
		}
		@Override
		void attack() {
			System.out.println(name + " 독 ");
		}
	};
	
	// 2. 로컬변수의 초기값으로 대입
	void method1() {
		Insect spider2 = new Insect() {
			String name = "늑대거미";
					
			void cobweb() {
				System.out.println("육각형");
			}
			
			@Override
			void attack() {
				System.out.println(name + "앞니");
			}
		};
		spider2.attack(); // 로컬변수이기때문에 메소드에서 바로사용가능
		
	}
	
	// 3. 익명객체 매개변수로 대입
	void method2(Insect spider) {
		spider.attack();
	}
}
