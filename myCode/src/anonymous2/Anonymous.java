package anonymous2;

public class Anonymous  {

	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}
	};
	
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
