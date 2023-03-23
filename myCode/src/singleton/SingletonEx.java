package singleton;

public class SingletonEx {

	private static SingletonEx a = new SingletonEx();
	
	private SingletonEx() {}
	
	static SingletonEx getInstance() {
		return a;
	}
}
