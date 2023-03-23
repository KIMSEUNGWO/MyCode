package singleton;

public class SingletonTestMain {

	public static void main(String[] args) {
		
		SingletonTest obj1 = SingletonTest.getInstance();
		SingletonTest obj2 = SingletonTest.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은객체");
		} else {
			System.out.println("다른객체");
		}
	}
}
