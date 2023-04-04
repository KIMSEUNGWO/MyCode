package anonymous2;

public class AnonymousEx {

	public static void main(String[] args) {
		
		Anonymous am = new Anonymous();
		
		am.rc.turnOn(); // 익명 객체 필드 사용
		
		am.method1(); // 익명 객체 로컬 변수 사용
		
		am.method2( // 익명 개채 매개값 사용
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("스마트티비를 켭니다");
						
					}
					
					@Override
					public void turnOff() {
						System.out.println("스마트티비를 끕니다");
						
					}
				}
				
		);
		
	}
}
