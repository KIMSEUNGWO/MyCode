package singleton;

public class SingletonTest {

	private static SingletonTest a = new SingletonTest();
	
	private SingletonTest() {}
		
	static SingletonTest getInstance() {
		return a;
	}
}
